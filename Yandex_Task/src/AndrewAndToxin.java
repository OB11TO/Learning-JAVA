import java.util.Arrays;
import java.util.Scanner;

public class AndrewAndToxin {
    public static void main(String[] args) {

        System.out.println("Введите число резервуаров: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        System.out.println("Введите количество литров аi: ");
        int[] reserv = new int[n];
        for (int i = 0; i < n; i++) {
            reserv[i] = scanner.nextInt();
        }
        
        int l = 0;
        int max = reserv[0];
        int min = reserv[0];

        for(int i = 1; i < n; i++){ //min max
            if(reserv[i] > max){
                max = reserv[i];
                l = i;
            }
            if(reserv[i] < min){
                min = reserv[i];
            }
        }

        for (int i = 0; i < n - 1; i++) { //упорядочный
            if (reserv[i] > reserv[i + 1]) {
                System.out.println("-1");
                break;
            }
            else{
                int[] mass = new int[l];
                for(int j = 0; j < n; j++){
                    if(reserv[j] != max){
                        mass[j] = reserv[j];
                    }
                    else {
                        leet(min,max,mass);
                        break;
                    }

                }
            }
        }

        //

      /*  for(int i = 1; i < n; i++){ //min max
            if(reserv[i] > max){
                max = reserv[i];
            }
            if(reserv[i] < min){
                min = reserv[i];
            }
        }

        int s = max - min;

        if(s % 2 != 0){
            System.out.println("2222222222 ");

        }
        else{
            int k = 1;
            leet(k);
        }



    }

    public static void leet(int k){

    }*/
    }
    public static void leet(int min, int max, int[] mass){
        System.out.println(max + " " + min+ " "+ Arrays.toString(mass));
    }
}
