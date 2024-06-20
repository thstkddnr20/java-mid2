package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objectMethod(i);
        Integer result = GenericMethod.<Integer>genericMethod(10);
        System.out.println("result = " + result);

        Integer integer2 = GenericMethod.<Integer>numberMethod(10);

    }
}
