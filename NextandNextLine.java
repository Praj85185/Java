import java.util.Scanner;

public class NextandNextLine {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter text :");
        String nextLine=in.nextLine();
        String next=in.next();
        System.out.println("Next Line Method prints : "+nextLine);
        System.out.println("Next Method prints : "+next);
    }
}
