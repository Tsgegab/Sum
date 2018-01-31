import java.util.Scanner;



public class Sum {

    public static void main (String [] args) {

        System.out.println("Enter a four numbers ");



        int n1,n2,n3,n4;

        int sum;

        Scanner input = new Scanner(System.in);



            n1 = input.nextInt();

            n2 = input.nextInt();

            n3 = input.nextInt();

            n4 = input.nextInt();



        sum = n1 + n2 + n3 + n4;



        System.out.println("The sum of four numbers is " + sum);

    }

        }






