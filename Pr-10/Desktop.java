import java.util.Scanner;
public class Desktop
{
    static String processor=" -",graphicCard=" -",ram=" -";
    static int cost[]=new int[5];
    static String spec[][]=new String[3][2];
    Processor pr=new Processor();
    GraphicCard gc=new GraphicCard();
    RAM ra=new RAM();
    String po;
    Desktop(String processor,String graphicCards)
    {
        po=processor;
    }

    public void p()
    {
        pr.ma();
    }

    public void g()
    {
        gc.ma();
    }
    
    public void r()
    {
        ra.ma();
    }

    public static void main()
    {
        fill();
        Desktop d= new Desktop("","");
        spec[0][0]="Processor:";
        spec[1][0]="Graphic Card:";
        spec[2][0]="RAM:";
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to view processor section");
        System.out.println("Press 2 to view graphic card section");
        System.out.println("Press 3 to view RAM section");
        System.out.println("Press 0 to print the bill");
        int a=sc.nextInt();
        switch(a)
        {
            case 0:
            d.specs();
            break;
            case 1:
            d.p();
            break;
            case 2:
            d.g();
            break;
            case 3:
            d.r();
            break;
            default:
            main();
        }
    }

    public static void fill()
    {
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<2;j++)
            {
                spec[i][j]=" ";
            }
        }
    }

    public class Processor
    {
        int price;
        Scanner sc=new Scanner(System.in);
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
            System.out.println("Frequency:"+f);
            System.out.println("No of cores:"+n);
            System.out.println("Price:"+p);
        }

        public void ma()
        {
            Processor i9800k=new Processor("Intel","i9800k",5.5,8,90000);
            System.out.println("Processors");
            System.out.println("Press 1 to view i9800k");
            int a=sc.nextInt();
            switch(a)
            {
                case 1:
                i9800k.display();
                processor=i9800k.na;
                price=i9800k.p;
                purchase();
            }
        }

        public void purchase()
        {
            System.out.println("Press 0 to go back or press 1 to purchase it");
            int a=sc.nextInt();
            switch(a)
            {
                case 0:
                processor="-";
                ma();
                case 1:
                cost[0]=price;
                spec[0][1]=processor;
                main();
            }
        }
    }
    public class GraphicCard
    {
        String m,a,na;
        int price,p;
        Scanner sc=new Scanner(System.in);
        GraphicCard()
        {
        }

        GraphicCard(String manufacturer,String architecture,String name,int price)
        {
            m=manufacturer;
            a=architecture;
            na=name;
            p=price;
        }

        public void display()
        {
            System.out.println("Manufacture:"+m);
            System.out.println("Architecture:"+a);
            System.out.println("Price"+p);
        }

        public void ma()
        {
            GraphicCard GeForceRtx_2080=new GraphicCard("Nvidia","Volta","GeForce RTX 2080",86000);
            System.out.println("Graphic Cards");
            System.out.println("Press 1 to view GeForce RTX 2080");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                GeForceRtx_2080.display();
                graphicCard=GeForceRtx_2080.na;
                price=GeForceRtx_2080.p;
                purchase();
            }
        }

        public void purchase()
        {
            System.out.println("Press 0 to go back or press 1 to purchase it");
            int a=sc.nextInt();
            switch(a)
            {
                case 0:
                graphicCard="-";
                ma();
                case 1:
                cost[1]=price;
                spec[1][1]=graphicCard;
                main();
            }
        }
    }
    public class RAM
    {
        String m,na,mt;
        int c,p;
        int price;
        Scanner sc=new Scanner(System.in);
        RAM()
        {
        }

        RAM(String manufacturer,String name,int capacity,String memoryType,int Price)
        {
            m=manufacturer;
            na=name;
            c=capacity;
            mt=memoryType;
            p=price;
        }
        
        public void display()
        {
            System.out.println("Manufacturer:"+m);
            System.out.println("Cpacity:"+c+"GB");
            System.out.println("Memory Type:"+mt);
        }
        
        public void ma()
        {
            RAM Hyperx=new RAM("Kingston","HYPERX",8,"DDR4",5300);
            System.out.println("RAMs");
            System.out.println("Press 1 to view HYPERX");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                Hyperx.display();
                ram=Hyperx.na;
                price=Hyperx.p;
                purchase();
            }
        }
        
        public void purchase()
        {
            System.out.println("Press 0 to go back or Press 1 to purchase it");
            int c=sc.nextInt();
            switch(c)
            {
                case 0:
                ram="-";
                ma();
                case 1:
                cost[2]=price;
                spec[2][1]=ram;
                main();
            }
        }
    }
    public static String reverse(String s)
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

    public void specs()
    {
        System.out.println("Specifications");
        System.out.println("Processor:"+processor);
        System.out.println("Graphic Card:"+graphicCard);
        System.out.println("Ram:"+ram);
        dispalySpecTable();
    }

    public void dispalySpecTable()
    {
        Desktop de=new Desktop("","");
        System.out.println("Bill");
        int i,j,k=0,l=0,c;
        for(i=0;i<3;i++)
        {
            l=0;
            c=0;
            for(j=0;j<2;j++)
            {
                System.out.print(spec[i][j]);
                k=spec[i][j].length();
                l=l+k;
            }
            space(l);
            System.out.print(cost[i]);
            System.out.println();
        }
        de.bill();        
    }

    public String rupee(int a)
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

    public void space(int l)
    {
        int a=60-l;
        while(a>0)
        {
            System.out.print(" ");
            a--;
        }
    }

    public void bill()
    {
        int su=0,i;
        String s1;
        for(i=0;i<5;i++)
        {
            su=su+cost[i];
        }
        s1=rupee(su);
        System.out.print("Total Cost:");
        space(11);
        System.out.println("Rs"+s1);
        System.out.println("********Thanks for shopping with us********");
    }

}

