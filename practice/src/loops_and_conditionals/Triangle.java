package loops_and_conditionals;

public class Triangle {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){


        for (int i = 1; i<=n; i++){
            int space = n-i;

            for (int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
