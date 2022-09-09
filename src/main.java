import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int numbers = 0;
        int length = Integer.parseInt(input.nextLine());

        if (length>0){
            int[] arr =new int[length];
            for(int i=0;i<length;i++)
            {
                System.out.printf("%d. elemani giriniz:",i+1);
                arr[i]= input.nextInt();
            }


            for(int i=0;i<length;i++)
            {
                for(int j=i+1;j<length;j++)
                {
                    if(arr[i] > arr[j])
                    {
                        numbers = arr[i];
                        arr[i] = arr[j];
                        arr[j] = numbers;
                    }
                }
            }

            System.out.println("Dizi: "+Arrays.toString(arr));
        }
        }
    }

