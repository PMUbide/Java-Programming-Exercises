package exercise_25_06;

public class Exercise_25_06 {

    public static void main(String[] args) {
        Integer[] array = {60, 55, 100, 45, 57, 67, 107, 101, 109, 59};
        BST<Integer> tree = new BST<>(array);
        System.out.println("Number of leaves: " + tree.getNumberOfLeaves());
    }
}
