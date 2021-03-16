package Java;

import java.util.Scanner;


// (a + 2^0 *b)
// ((a + 2^0 *b + 2^1 *b)

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // количеств запросов
        for(int i = 0; i <q; i++){
            int a = scanner.nextInt();  //а
            int b = scanner.nextInt();   //b
            int n = scanner.nextInt();   // число расчетов
            int s0 = a;
            for(int j =0; j< n; j++){
                s0 +=  (Math.pow(2,j) *b);
                System.out.print(s0 + " ");
        }
            System.out.println();

        }
        scanner.close();
    }
}
