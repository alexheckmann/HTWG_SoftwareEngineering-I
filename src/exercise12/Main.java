package exercise12;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>(5);
        bst.insert(10);
        bst.insert(3);
        bst.insert(2);
        bst.insert(12);
        bst.insert(15);
        bst.print();
        System.out.println("size: " + bst.size());
        System.out.println("is complete? " + isComplete(bst));
        System.out.println("is full? " + isFull(bst));
        System.out.println("Contains 3? " + bst.contains(3));


    }

    /**
     * Checks whether a given tree is complete.
     *
     * @param root root of the tree to be checked
     * @param <T>
     * @return whether or not the tree is complete
     */
    public static <T extends Comparable<T>> boolean isComplete(BinarySearchTree<T> root) {

        return isComplete(root, 0, root.size());

    }

    /**
     * Internal method overloading the public method. Checks whether a given tree is complete.
     *
     * @param root        root of the tree to be checked
     * @param index       index of the node to start with, default given by the overloading method is 0
     * @param numberNodes number of nodes to check, default given by the overloading method is {@code root.size()}
     * @param <T>
     * @return whether or not the tree is complete
     */
    private static <T extends Comparable<T>> boolean isComplete(BinarySearchTree<T> root, int index, int numberNodes) {

        // An empty tree is complete
        if (root == null)
            return true;

        // If index assigned to current node is bigger than the
        // number of nodes of the tree, then tree is not complete
        if (index >= numberNodes)
            return false;

        // Recur for left and right subtrees
        return (isComplete(root.getLeftSubTree(), 2 * index + 1, numberNodes)
                && isComplete(root.getRightSubTree(), 2 * index + 2, numberNodes));

    }

    public static <T extends Comparable<T>> boolean isFull(BinarySearchTree<T> root) {

        // empty tree is not full
        if (root == null) {
            return false;
        }


        // if any root has only one child the tree isn't full
        if (root.getLeftSubTree() == null && root.getRightSubTree() != null || root.getLeftSubTree() != null && root.getRightSubTree() == null) {
            return false;
        }

        // if both children are null the tree is full
        if (root.getLeftSubTree() == null && root.getRightSubTree() == null) {
            return true;
        }

        // recur for left and right children
        return (isFull(root.getLeftSubTree()) && isFull(root.getRightSubTree()));

    }
}