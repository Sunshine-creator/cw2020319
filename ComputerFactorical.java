import java.util.Scanner;
import  java.awt.*;
import  javax.swing.*;
public class ComputerFactorical {
    public static void main(String[] args) {

    }
}
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入您要计算的数：");
//        int number = scanner.nextInt();
//        System.out.println(" Factorical of " + number + " is "+ factorial(number));
//    }
//    public static long factorial(int n){        //递归调用求阶乘
//        if(n==0){
//            return 1;
//        }
//        return  factorial(n-1)*n;
//        Scanner scanner = new Scanner(System.in);
//          long totalMilliseconds = System.currentTimeMillis();
//          long totalSeconds  = totalMilliseconds / 1000;
//          long currentSecond =  totalSeconds % 60;
//          long totalMinutes = totalSeconds / 60;        //显示当前时间
//          long currentMinutes = totalMinutes % 60;
//          long totalHours = totalMinutes / 60;
//          long currentHour = totalHours % 24;
//        System.out.println("Current time is"+ currentHour+"
//        :"+currentMinutes+":"+currentSecond+"GMT");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of disks:");
//        int num = scanner.nextInt();
//        System.out.println("The moves are :");
//        moveDisks(num, 'A', 'B', 'C');
//    }
//    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
//        if (n == 1) {
//            System.out.println(" Move disk" + n + " from " + fromTower + " to " + toTower);
//        } else {
//            moveDisks(n - 1, fromTower, auxTower, toTower);
//            System.out.println("Move disk" + n + " from " + fromTower + " to " + toTower);
//            moveDisks(n - 1, auxTower, toTower, fromTower);   //汉诺塔问题递归调用
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter yearly interest rate,for example 8.25:");
//        double annualInterestRate = scanner.nextDouble();
//        double monthlyInterestRate =annualInterestRate / 12.00;      //计算贷款支付额
//        System.out.println("Enter number of years as an integer,for example 5 :");
//        int numberOfYears = scanner.nextInt();
//        System.out.println("Enter loan amount,for example 12000.95 :");
//        double loanAmount =  scanner.nextDouble();
//        double monthlyPayment =  loanAmount * monthlyInterestRate /(1-1/Math.pow(1+monthlyInterestRate
//                ,numberOfYears * 12));
//        double totalPayment = monthlyPayment * 12 * numberOfYears;
//        System.out.println("The monthly payment is " + (int)(monthlyPayment * 100)/100.0);
//        System.out.println("The total payment is " + (int)(totalPayment * 100 )/100.0);
//        int number1 = (int)(Math.random() * 100);
//        int number2 = (int)(Math.random() * 100);
//        if(number1 < number2){
//            int temp = number1;
//            number1 = number2   ;
//            number2 = temp;
//        }
//        System.out.println(" What is " + number1 + " - " + number2 + " ? ");
//        Scanner scanner = new Scanner(System.in);
//        int answer = scanner.nextInt();
//        if(number1 - number2 == answer){
////            System.out.println("You are correct!");
////        }else{
////            System.out.println("Your answer is error\n" + number1 +
////                    " - " + number2 + " should be " + ( number1 - number2));
////        }
//   }
//}
////    public static boolean is
////   public   static boolean isPalindrome(String s，int low, int high){
////        if(high <= low){
////            return  true;                              //递归调用判断字符串为回文序列
////        }else if(s.charAt(low)!=s.charAt(high){
////            return false;
////       }else{
//            return ispalindrome(s,low+1,high-1);
//        }


