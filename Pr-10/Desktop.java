import java.util.Scanner;
public class Desktop
{
    String processor,graphicCard;
    Processor pr=new Processor();
    GraphicCard gc=new GraphicCard();
    String po;
    Desktop(String processor,String graphicCards)
    {
        po=processor;
    }

    public static void main()
    {
        Desktop d= new Desktop("","");
        d.p();
    }

    public void p()
    {
        pr.ma();
    }
    
    public void g()
    {
        gc.ma();
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
                processor=i9800k.na;
                purchase();
            }
        }
        
        public void purchase()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Press 0 to go back or press 1 to purchase it");
            int a=sc.nextInt();
            switch(a)
            {
                case 0:
                processor="";
                ma();
                case 1:
                g();
            }
        }
    }
    public class GraphicCard
    {
        String m,a,na;

        GraphicCard()
        {
        }

        GraphicCard(String manufacturer,String architecture,String name)
        {
            m=manufacturer;
            a=architecture;
            na=name;
        }

        public void display()
        {
            System.out.println("Manufacture:"+m);
            System.out.println("Architecture:"+a);
        }

        public void ma()
        {
            GraphicCard GeForceRtx_2080=new GraphicCard("Nvidia","Volta","GeForce RTX 2080");
            System.out.println("Graphic Cards");
            System.out.println("Press 1 to view GeForce RTX 2080");
            Scanner sc=new Scanner(System.in);
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                GeForceRtx_2080.display();
                graphicCard=GeForceRtx_2080.na;
                purchase();
            }
        }
        
        public void purchase()
        {
            System.out.println("Press 0 to go back or press 1 to purchase it");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            switch(a)
            {
                case 0:
                graphicCard="";
                ma();
                case 1:
                exit();
            }
        }
    }
    
    public void exit()
    {
        System.out.println("Specifications");
        System.out.println("Processor:"+processor);
        System.out.println("Graphic Card:"+graphicCard);
    }
}

