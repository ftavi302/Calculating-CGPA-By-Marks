import java.util.Scanner;

public class Calculating_CGPA_By_Marks {
    public static void main(String args []){
        System.out.println("Calculating CGPA By Marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Subject 1");
        int a = sc.nextInt();
        System.out.println("Enter Marks Of Subject 2");
        int b = sc.nextInt();
        System.out.println("Enter Marks Of Subject 3");
        int c = sc.nextInt();
        System.out.println("Enter Marks Of Subject 4");
        int d = sc.nextInt();
        System.out.println("Enter Marks Of Subject 5");
        int e = sc.nextInt();
        int cgpa = (a+b+c+d+e)/50;
        System.out.println(cgpa + " cgpa");

    }
}
