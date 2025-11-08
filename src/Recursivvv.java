import java.util.Scanner;

public class Recursivvv {
    public int recursive(int[] array,int index) {
        index = 0;
        int count=0;
        if (index != array.length) {
        return 0;}
        if (array[index] % 2 == 0) {
            return 1 + recursive(array,index+1);
        }else{
            return recursive(array,index+1);
        }
    }




    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int size = input.nextInt();
        int[] array=new int[size];
        for(int i = 0; ;){

        }
    }

}
