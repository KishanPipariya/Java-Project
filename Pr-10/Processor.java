import java.util.Scanner;
public class Processor
{
     String s;
     int n;
     double f;
    Processor(String manufacturer,double frequency,int no_Of_Cores)
    {
        s=manufacturer;
        f=frequency;
        n=no_Of_Cores;
    }
    void display()
    {
        System.out.println("Manufacturer:"+s);
        System.out.println("Frequency:"+f);
        System.out.println("No of cores:"+n);
    }
    public static void main()
    {
        Processor i9800k=new Processor("Intel",5.5,8);
        System.out.println("Processors");
        System.out.println("Press 1 to view i9800k");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
            i9800k.display();
        }
    }
}
