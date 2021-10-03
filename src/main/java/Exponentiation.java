import java.util.*;
import java.lang.*;
import java.io.*;
public class Exponentiation {
    public static int getLengthFromConsole(){
        String messageArraySize = "Please, input amount of numbers:";
        printInstruction(messageArraySize);
        return getNumberFromConsole();
    }
    public static void printInstruction(String message){
        System.out.println(message);}
    public static void printInstruction(String message, String messageTwo){
        System.out.println(message);
        System.out.println(messageTwo);
    }
    public static int getNumberFromConsole(){
        int numInt;
        String messageInput = "Please, input integer number:";
        String messageEror = "This is not integer number.";
        Scanner sc = new Scanner(System.in);
        printInstruction(messageInput);
        while(!sc.hasNextInt()){
            sc.nextLine();
            printInstruction(messageEror,messageInput);
        }
        numInt = sc.nextInt();
        return numInt;
    }
    public static boolean isNonNegative(int num){
        return num >= 0;}
    public static int doEvelate(int num){
        return isNonNegative(num) ? (int)Math.pow(num,2) : (int)Math.pow(num,4);}
    public static int[] createArray(int length){
        int[] outArrayInt = new int[length];
        for(int i = 0; i < outArrayInt.length;i++){
            outArrayInt[i] = getNumberFromConsole();
        }
        return outArrayInt;
    }
    public static int[] doEvelateArray(int[] number){
        for(int i = 0; i < number.length; i++){
            number[i] = doEvelate(number[i]);
        }
        return number;
    }
    public static void printArray(int[] array){
        for(int num : array){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] number;
        number = createArray(getLengthFromConsole());
        number = doEvelateArray(number);
        printArray(number);
    }
}


