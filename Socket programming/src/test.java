
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//            String[] names = new String[6]; 
//            for (int i =0 ; i< 5; i++){
//                names[i] = s.nextLine();
//            }
//            System.out.println("nmes"+names);
//            for ( String name : names)
//                System.out.println(name);

        int[] nums = new int[8];
        for (int i = 0; i < 5; i++) {
            nums[i] = s.nextInt();
        }
        int result = 0;
        for (int i : nums) {
            result += i;
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("sum is " + result);
    }
}
