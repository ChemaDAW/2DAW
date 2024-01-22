public class Arrays_Ej7 {
    public static void main(String[] args) {
        int x = 19, y = 22;
        x = (int) (Math.random() * 10) + 1;
        System.out.println(x);

        long factorial = 1;

        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

    }
}
