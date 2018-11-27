/*This project was done using Git version-control System and the repository is present on github.
The link for repository is as follows:https://github.com/KishanPipariya/Java-Project*/
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
public class ElectronicsShop
{
    public static void main()
    {
        ElectronicsShop e=new ElectronicsShop();
        System.out.println("Welcome");
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to build a PC ");
        System.out.println("Press 2 to purchase laptop");
        System.out.println("Press 0 to exit");
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
            Desktop de=new Desktop();
            de.main();//Takes the user to desktop section
            break;
            case 2:
            Laptop la =new Laptop();
            la.main();//Takes the user to laptop section
            break;
            case 0:
            e.exit();//Takes the user to exit
            break;
            default:
            System.out.println("Wrong Choice");
            System.out.println("Please Try Again");
            main();
        }
    }

    public void space(int size,int l)//This function is used to generate a specific length of  blank space
    {
        int a=size-l;
        while(a>0)
        {
            System.out.print(" ");
            a--;
        }
    }

    public String reverse(String s)//This function is used to reverse a string
    {
        int l=s.length();
        char c;
        String s1="";
        for(int i=l-1;i>=0;i--)
        {
            c=s.charAt(i);
            s1=s1+c;
        }
        return s1;
    }

    public String rupee(int a)//This function adds commas according to the Indian standard to a numerical value 
    {
        String s1="",s2="";
        char c;
        int l,i;
        String s=Integer.toString(a);
        s1=reverse(s);
        l=s1.length();
        for(i=0;i<l;i++)
        {
            c=s1.charAt(i);
            if((i+1)==3)
            {
                s2=s2+c;
                s2=s2+",";
            }
            else if((i+1)%2!=0&&(i+1)<l&&(i+1>3))
            {
                s2=s2+c;
                s2=s2+",";
            }
            else
            {
                s2=s2+c;
            }
        }
        s1=reverse(s2);
        return s1;
    }

    public void date()//This function displays the date and time when bill is printed
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now));  
    }

    public void exit()
    {
        System.out.println("********Thanks for visiting our shop********");
    }
}

























