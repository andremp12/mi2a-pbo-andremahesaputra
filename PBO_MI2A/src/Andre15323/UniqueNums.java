/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Andre15323;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class UniqueNums {
    public static void main(String args[]){
        
        int[] numbers= new int[5];
        Scanner in=new Scanner(System.in);
        int num=0, numValues=0;
        boolean valid=true;
        
        while(numValues<numbers.length){
            do{
                valid=true;
                System.out.print("Please enter a unique number : ");
                num=in.nextInt();
                for(int i=0;i<numValues;i++){
                    if(num==numbers[i]){
                        System.out.println("Number already Exist");
                        valid=false;
                        break;
                    }
                }
            }while(!valid);
            
            numbers[numValues]=num;
            numValues++;
            
        }
    }
}
