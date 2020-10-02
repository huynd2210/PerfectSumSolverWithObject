import perfectsum.ObjectWithInteger;
import perfectsum.SubsetSumSolver;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<ObjectWithInteger> test = Arrays.asList(
                new TestObject("1", true, 1),
                new TestObject("2", true, 2),
                new TestObject("3", true, 3),
                new TestObject("4", true, 4),
                new TestObject("5", true, 5));

        ObjectWithInteger[] testArr = new TestObject[]{new TestObject("1", true, 1),
                new TestObject("2", true, 2),
                new TestObject("3", true, 3),
                new TestObject("4", true, 4),
                new TestObject("5", true, 5)};

        SubsetSumSolver sol = new SubsetSumSolver(test, 10);
        System.out.println(sol.getSolution());
    }
}
