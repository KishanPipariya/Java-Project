import java.util.Scanner;
public class Desktop
{
    String processor;
    Processor pr=new Processor();
    String po;
    Desktop(String processor)
    {
        po=processor;
    }
    Desktop de= new Desktop("");
    public static void main()
    {
        Desktop d= new Desktop("");
        d.m();
    }

    public void m()
    {
        pr.ma();
    }
    public class Processor
    {
        
        Processor()
        {
        }
        String s,na;
        int n,p;
        double f;
        Processor(String manufacturer,String name,double frequency,int no_Of_Cores,int price)
        {
            s=manufacturer;
            na=name;
            f=frequency;
            n=no_Of_Cores;
            p=price;
        }
        

        public void display()
        {
            System.out.println("Manufacturer:"+s);
            System.out.println("Name:"+na);
            System.out.println("Frequency:"+f);
            System.out.println("No of cores:"+n);
            System.out.println("Price:"+p);
        }

        public void ma()
        {
            Processor i9800k=new Processor("Intel","i9800k",5.5,8,90000);
            System.out.println("Processors");
            System.out.println("Press 1 to view i9800k");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            switch(a)
            {
                case 1:
                i9800k.display();
                System.out.println("Press 1 to purchase it or press 0 to go back");
                int b=sc.nextInt();
                switch(b)
                {
                    case 0:
                    ma();
                    case 1:
                    processor=i9800k.na;
                    exit();
                    
                }
            }
           }
        }
    public void exit()
    {
        System.out.println("Specifications");
        System.out.println("Processor:"+processor);
    }
    }

