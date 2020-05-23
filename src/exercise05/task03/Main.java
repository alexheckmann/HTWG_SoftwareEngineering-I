package exercise05.task03;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args)
            throws IllegalArgumentException {
//		Student student = new Student(1, "Max", "Mustermann");
//		print(student);
//		
//		Professor professor = new Professor(2, "Peter", "Maier", 10000);
//		print(professor);

        generateSql(Student.class);

    }

    public static void generateSql(Class<?> clazz) {

        Field[] fields = clazz.getDeclaredFields();

        Entity entityAnnotation = clazz.getAnnotation(Entity.class);

        String tableName = "";
        if (entityAnnotation.generatedName().equals(Entity.GeneratedName.LOWER)) {
            tableName = clazz.getSimpleName().toLowerCase();
        } else if (entityAnnotation.generatedName().equals(Entity.GeneratedName.CAPITAL)) {
            tableName = clazz.getSimpleName().toUpperCase();
        } else {
            tableName = clazz.getSimpleName();
        }

        StringBuilder createStatement = new StringBuilder("CREATE TABLE " + tableName + "(");
        for (Field field : fields) {

            if (field.getAnnotation(Column.class) != null) {

                Column columnAnnotation = field.getAnnotation(Column.class);

                createStatement.append(columnAnnotation.value());
                if (field.getType().equals(String.class)) {
                    createStatement.append(" VARCHAR2(255)");
                } else {
                    createStatement.append(" INTEGER");
                }
                if (field.getAnnotation(NotNull.class) != null) {
                    createStatement.append(" NOT NULL");
                }
                if (field.getAnnotation(ID.class) != null) {
                    createStatement.append(" CONSTRAINT PK_").append(tableName).append(" PRIMARY KEY");
                }
                if (field.getAnnotation(Unique.class) != null) {
                    createStatement.append(" CONSTRAINT AK_").append(tableName).append(" UNIQUE");
                }
                createStatement.append(", ");
            }
        }

        createStatement = new StringBuilder(createStatement.toString().trim().replaceAll(",$", ""));
        createStatement.append(");");
        System.out.println(createStatement);

    }

}
