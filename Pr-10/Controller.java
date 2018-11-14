import java.util.Scanner;
public class Controller
{
    public static void main()
    {
        System.out.println("Welcome to electronics");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Press 1 to build a PC ");
        System.out.println("Press 2 to purchase laptop");
        System.out.println("Press 0 to print the bill");
        switch(a)
        {
            case 1:
            Desktop de=new Desktop("","");
            de.main();
            case 2:
            
        }
    }
}