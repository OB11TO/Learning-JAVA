import java.util.Arrays;
import java.util.Scanner;

public class AndrewAndToxin {
    public static void main(String[] args) {

        System.out.println("Введите число резервуаров: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();



        System.out.println("Введите количество литров аi: ");
        int[] reserv = new int[n];
        for(int i = 0; i < n; i++) {
            reserv[i] = scanner.nextInt();
        }

        int max = reserv[0];
        int min = reserv[0];

        for(int i = 0; i < n -1 ; i++) { //упорядочный
            if (reserv[i] > reserv[i + 1]) {
                System.out.println("-1");
                break;
            }
        }

        for(int i = 1; i < n; i++){ //min max
            if(reserv[i] > max){
                max = reserv[i];
            }
            if(reserv[i] < min){
                min = reserv[i];
            }
        }




//        System.out.println(min + " " + max);

        System.out.println(Arrays.toString(reserv));
    }
}
