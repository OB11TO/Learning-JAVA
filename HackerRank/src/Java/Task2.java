package Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Task2 {
        public static void main(String[] args) {
            try{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int N=Integer.parseInt(br.readLine().trim());
                if(N<1||N>100)
                    throw new Exception();
                if((N&1)==1)
                {
                    System.out.println("Weird");
                }
                else
                {
                    if(N>=2&&N<=5)
                    {
                        System.out.println("Not Weird");
                    }
                    else if(N>=6&&N<=20)
                    {
                        System.out.println("Weird");
                    }
                    else
                    {
                        System.out.println("Not Weird");
                    }
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }