import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] nums;
        nums = new int[10];
        int x = 0;
    /*    for (int i = 0; i < 10; i++) {
            nums[i] = i;
            x = x + nums[i];
        }
        System.out.println(x);*/


       /* for(int i = 0; i < 10; i++) {
            System.out.println("please enter a number: ");
            int answer = keyboard.nextInt();
            nums[i] = answer;
            x = x + nums[i];
        }
        System.out.println(Arrays.toString(nums));
        int ave =  x/10;
        System.out.println(ave);*/

/*       String[] names;
       names= new String[3];
       names[0] = "Mina";
       names[1] = "Mitra";
       names[2] = "Sahar";
       for(int i = 0; i<3 ; i++){
           int z = i +1;
           System.out.println("name: " + z + " " + names[i]);
       }*/

        /*int[] numbers;
        numbers = new int[9];
        numbers[0]=2;
        numbers[1]=5;
        numbers[2]=9;
        numbers[3]=0;
        numbers[4]=2;
        numbers[5]=1;
        numbers[6]=8;
        numbers[7]=5;
        numbers[8]=4;
        for(int i=0; i < 9; i++){
            if(numbers[i] == 5){
                System.out.println(i);
            }*/

        /*for (int i = 0; i < 10; i++) {
            nums[i] = i+1;
            }
        for(int j=9; j>=0; j--){
            System.out.println(nums[j]);
        }*/
        /*String[] rep = new String[]{"w","t","y","h","k"};
        for(int i = 0; i<5; i++){
            if(rep[i] == "t"){
                rep[i] = "Hello";
            }
        }
        System.out.println(Arrays.toString(rep));*/

        int[] array1 = new int[]{1,7,6,5,9};
        int[] array2 = new int[]{2,7,6,3,4};
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5 ; j++){
                if(array1[i]==array2[j]){
                    System.out.println("(" + array1[i] + "," + array2[j] + ")");
                }

            }
        }

    }

}