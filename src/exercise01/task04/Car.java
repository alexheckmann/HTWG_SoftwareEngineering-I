package exercise01.task04;

public class Car {

    private String manufacturer;
    private String model;
    private String modelVersion;

    public Car(String manufacturer, String model, String modelVersion) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.modelVersion = modelVersion;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelVersion() {
        return modelVersion;
    }

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    public static class CarBuilder {

        private String manufacturer = "";
        private String model = "";
        private String modelVersion = "";

        public CarBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }


        public CarBuilder setModelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }

        public Car build() {
            return new Car(manufacturer, model, modelVersion);
        }

    }
}
