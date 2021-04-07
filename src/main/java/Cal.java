import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class Cal {

        public static void main(String[] args) {
            System.out.println("Welcome to DevOps Calculator application");
            int flag=0,ch;
            double num1,num2;
            Scanner reader = new Scanner(System.in);
            System.out.println("Calculator System");
            do
            {
                System.out.println("Option Menu");
                System.out.println("");
                System.out.println("1) Addition");
                System.out.println("2) Subtraction");
                System.out.println("3) Multiplication");
                System.out.println("4) Exit");
                System.out.print("Enter your choice: ");
                ch = reader.nextInt();
                if(ch==4)
                {
                    flag = 1;
                }
                else
                {
                    switch(ch)
                    {
                        case 1:
                            System.out.println("Addition");
                            System.out.println("Enter two numbers");
                            System.out.print("Enter number 1: ");
                            num1 = reader.nextDouble();
                            if(num1<0) {
                                System.out.println("Enter only positive integers");
                                break;
                            }
                            System.out.print("Enter number 2: ");
                            num2 = reader.nextDouble();
                            if(num2<0) {
                                System.out.println("Enter only positive integers");
                                break;
                            }
                            System.out.println(num1+num2);
                            break;
                        case 2:
                            System.out.println("Subtraction");
                            System.out.println("Enter two numbers");
                            System.out.print("Enter number 1: ");
                            num1 = reader.nextDouble();
                            if(num1<0) {
                                System.out.println("Enter only positive integers");
                                break;
                            }
                            System.out.print("Enter number 2: ");
                            num2 = reader.nextDouble();
                            if(num2<0) {
                                System.out.println("Enter only positive integers");
                                break;
                            }
                            System.out.println(num1-num2);
                            break;
                        case 3:
                            System.out.println("Multiplication");
                            System.out.println("Enter two numbers");
                            System.out.print("Enter number 1: ");
                            num1 = reader.nextDouble();
                            if(num1<0) {
                                System.out.println("Enter only positive integers");
                                break;
                            }
                            System.out.print("Enter number 2: ");
                            num2 = reader.nextDouble();
                            if(num2<0) {
                                System.out.println("Enter only positive integers");
                                break;
                            }
                            System.out.println(num1*num2);
                            break;
                        default: System.out.println("Exiting program due to invalid input");
                            flag=1;
                    }
                }
                System.out.println("\n");
            }while(flag==0);
        }
    }


