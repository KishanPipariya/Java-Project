import java.util.Scanner;
public class Controller
{
    public static void main()
    {
        System.out.println("Welcome to electronics");
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to build a PC ");
        System.out.println("Press 2 to purchase laptop");
        System.out.println("Press 0 to print the bill");
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
            Desktop de=new Desktop("","");
            de.main();
            break;
            case 2:
            Laptop la =new Laptop();
            la.main();
            break;
        }
    }
    public void space(int l)
    {
        int a=60-l;
        while(a>0)
        {
            System.out.print(" ");
            a--;
        }
    }
}