import java.util.Scanner;

public class Processor
{
    String s;
    int n,p;
    double f;
    Processor(String manufacturer,double frequency,int no_Of_Cores,int price)
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
        System.out.println("Price:"+p);
        Scanner a=new Scanner(System.in);
        System.out.println("Press 1 to purchase it or press 0 to go back");
        int z=a.nextInt();
        switch(z)
        {
            case 0:
            main();
        }
    }
    public static void main()
    {
        Processor i9800k=new Processor("Intel",5.5,8,90000);
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
