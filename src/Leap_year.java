import java.util.Scanner;

public class Leap_year {

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter four Digit n for the year=");
            int x=sc.nextInt();

            if(x/400==0)
            {
                System.out.println(x+" is a leap year");
            }
            else {
                System.out.println(x+" is  a Leap Year or not.");
            }
        }

}
