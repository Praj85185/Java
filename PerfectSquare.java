import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number=in.nextInt();in.nextLine();
        System.out.println("Number ::: "+ number);
        int sqrtOfNum=(int)Math.sqrt(number);
        System.out.println("Square root of a number ::: "+sqrtOfNum);
        if(sqrtOfNum*sqrtOfNum==number){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not a Perfect Square");
        }
    }
}
