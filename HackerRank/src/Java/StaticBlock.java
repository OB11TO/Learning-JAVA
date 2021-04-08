package Java;


import java.util.Scanner;

public class StaticBlock {
    private static final int  A;
    private static final int  B;
    private static  boolean flag = true;

    static{
         Scanner sc = new Scanner(System.in);
          A = sc.nextInt();
         B = sc.nextInt();
        if(A <= 0 || B <=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }


    }

    public static void main(String[] args) {
        if(flag){
            int area = A*B;
            System.out.println(area);
        }
    }
}
