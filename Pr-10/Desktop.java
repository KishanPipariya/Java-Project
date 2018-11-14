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
        spec[0][1]=processor;
        spec[1][0]="Graphic Card:";
        spec[1][1]=graphicCard;
        spec[2][0]="RAM:";
        spec[2][1]=ram;
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
                spec[i][j]="-";
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
            System.out.println("Name:"+na);
            System.out.println("Manufacturer:"+s);
            System.out.println("Frequency:"+f+"Ghz");
            System.out.println("No of cores:"+n);
            System.out.println("Price:"+p);
        }

        public void ma()
        {
            Processor i3_8100=new Processor("Intel","i3-8100",3.6,4,12000);
            Processor i5_8400=new Processor("Intel","i5-8400",2.8,6,25000);
            Processor i7_8700=new Processor("Intel","i7-8700",3.2,6,34000);
            Processor Ryzen_3_1200=new Processor("AMD","Ryzen 3 1200",3.4,4,7000);
            Processor Ryzen_5_1600=new Processor("AMD","Ryzen 5 1600",3.2,6,14000);
            Processor Ryzen_7_1700=new Processor("AMD","Ryzen 7 1700",3.7,8,23000);
            System.out.println("Processors");
            System.out.println("Press 0 to go back to component section");
            System.out.println("Press 1 to view i3-8100");
            System.out.println("Press 2 to view i5-8700");
            System.out.println("Press 3 to view i7-8700");
            System.out.println("Press 4 to view Ryzen 3 1200");
            System.out.println("Press 5 to view Ryzen 5 1600");
            System.out.println("Press 6 to view Ryzen 7 1700");
            int a=sc.nextInt();
            switch(a)
            {
                case 0:
                main();
                break;
                case 1:
                i3_8100.display();
                processor=i3_8100.na;
                price=i3_8100.p;
                purchase();
                break;
                case 2:
                i5_8400.display();
                processor=i5_8400.na;
                price=i5_8400.p;
                purchase();
                break;
                case 3:
                i7_8700.display();
                processor=i7_8700.na;
                price=i7_8700.p;
                purchase();
                break;
                case 4:
                Ryzen_3_1200.display();
                processor=Ryzen_3_1200.na;
                price=Ryzen_3_1200.p;
                purchase();
                break;
                case 5:
                Ryzen_5_1600.display();
                processor=Ryzen_5_1600.na;
                price=Ryzen_5_1600.p;
                purchase();
                break;
                case 6:
                Ryzen_7_1700.display();
                processor=Ryzen_7_1700.na;
                price=Ryzen_7_1700.p;
                purchase();
                break;
                default:
                ma();
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
                break;
                case 1:
                cost[0]=price;
                main();
                break;
            }
        }
    }
    public class GraphicCard
    {
        String m,a,na,b;
        int price,p,c;
        Scanner sc=new Scanner(System.in);
        GraphicCard()
        {
        }

        GraphicCard(String brand,String manufacturer,String architecture,String name,int capacity,int price)
        {
            b=brand;
            m=manufacturer;
            a=architecture;
            na=name;
            c=capacity;
            p=price;
        }

        public void display()
        {
            System.out.println("Name:"+b+" "+na);
            System.out.println("Brand:"+b);
            System.out.println("Manufacture:"+m);
            System.out.println("Architecture:"+a);
            System.out.println("Capacity:"+c+"GB");
            System.out.println("Price"+p);
        }

        public void ma()
        {
            GraphicCard GeForceGtx_950=new GraphicCard("Zotac","Nvidia","Maxwell","GeForce GTX 950",2,13000);
            GraphicCard GeForceGtx_1050 =new GraphicCard("MSI","Nvidia","Pascal","GeForce GTX 1050",4,21000);
            GraphicCard GeForceGtx_1060=new GraphicCard("Asus","Nvidia","Pascal","Strix Geforce GTX 1060",6,28000);
            GraphicCard Radeon_RX_550=new GraphicCard("Gigabyte","AMD","GCN-4","Radeon RX 550",2,10000);
            GraphicCard Radeon_RX_560=new GraphicCard("Asus","AMD","GCN-4","Radeon RX 560",4,16300);
            GraphicCard Radeon_RX_580=new GraphicCard("Gigabyte","AMD","GCN-4","Radeon RX 580",8,23000);
            System.out.println("Graphic Cards");
            System.out.println("Press 1 to view Zotac GeForce GTX 950");
            System.out.println("Press 2 to view MSI GeForce GTX 1050");
            System.out.println("Press 3 to view Asus Strix Geforce GTX 1060");
            System.out.println("Press 4 to view Gigabyte Radeon RX 550");
            System.out.println("Press 5 to view ASUS Radeon RX 560");
            System.out.println("Press 6 to view Gigabyte Radeon RX 580");
            System.out.println("");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                GeForceGtx_950.display();
                graphicCard=GeForceGtx_950.b+" "+GeForceGtx_950.na;
                price=GeForceGtx_950.p;
                purchase();
                break;
                case 2:
                GeForceGtx_1050.display();
                graphicCard=GeForceGtx_1050.b+" "+GeForceGtx_1050.na;
                price=GeForceGtx_1050.p;
                purchase();
                break;
                case 3:
                GeForceGtx_1060.display();
                graphicCard=GeForceGtx_1060.b+" "+GeForceGtx_1060.na;
                price= GeForceGtx_1060.p;
                purchase();
                break;
                case 4:
                Radeon_RX_550.display();
                graphicCard=Radeon_RX_550.b+" "+Radeon_RX_550.na;
                price= Radeon_RX_550.p;
                purchase();
                break;
                case 5:
                Radeon_RX_560.display();
                graphicCard=Radeon_RX_560.b+" "+Radeon_RX_560.na;
                price=Radeon_RX_560.p;
                purchase();
                break;
                case 6:
                Radeon_RX_580.display();
                graphicCard=Radeon_RX_580.b+" "+Radeon_RX_580.na;
                price=Radeon_RX_580.p;
                purchase();
                break;
                default:
                System.out.println("Wrong Choice");
                System.out.println("Plaese Try Again");
                ma();
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
                break;
                case 1:
                cost[1]=price;
                main();
                break;
            }
        }
    }
    public class RAM
    {
        String m,na,mt;
        int c,p,f;
        int price;
        Scanner sc=new Scanner(System.in);
        RAM()
        {
        }

        RAM(String manufacturer,String name,int capacity,String memoryType,int memorySpeed,int price)
        {
            m=manufacturer;
            na=name;
            c=capacity;
            mt=memoryType;
            p=price;
        }

        public void display()
        {
            System.out.println("Name:"+m+" "+na);
            System.out.println("Manufacturer:"+m);
            System.out.println("Capacity:"+c+"GB");
            System.out.println("Memory Type:"+mt);
            System.out.println("Frequency"+f);
            System.out.println("Price:"+p);
        }

        public void ma()
        
        
        
        {
            RAM KVR1333D3N9=new RAM("Kingston","(KVR1333D3N9)",2,"DDR3",1333,1000);
            RAM DLR4GD4_24=new RAM("Dolgix","(DLR4GD4-24)",4,"DDR4",2400,2800);
            RAM Vengeance_LPX=new RAM("Corsair","Vengeance LPX (CMK8GX4M1A2400C16R)",8,"DDR4",2400,5700);
            RAM Aegis=new RAM("G.Skill","AEGIS (F4-2400C15S-8GIS)",8,"DDR4",2133,6500);
            RAM Ripjaws_V=new RAM("G.Skill","Ripjaws V (F4-2400C15S-16GVR)",16,"DDR4",2400,8000);
            System.out.println("RAMs:");
            System.out.println("Press 1 Kingston(KVR1333D3N9)");
            System.out.println("Press 2 Dolgix (DLR4GD4-24)");
            System.out.println("Press 3 Corsair Vengeance LPX (CMK8GX4M1A2400C16R)");
            System.out.println("Press 4 G.Skill AEGIS (F4-2400C15S-8GIS)");
            System.out.println("Press 5 G.Skill Ripjaws V (F4-2400C15S-16GVR)");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                KVR1333D3N9.display();
                ram=KVR1333D3N9.m+" "+KVR1333D3N9.na;
                price=KVR1333D3N9.p;
                purchase();
                break;
                case 2:
                DLR4GD4_24.display();
                ram=DLR4GD4_24.m+" "+DLR4GD4_24.na;
                price=DLR4GD4_24.p;
                purchase();
                break;
                case 3:
                Vengeance_LPX.display();
                ram=Vengeance_LPX.m+" "+Vengeance_LPX.na;
                price=Vengeance_LPX.p;
                purchase();
                break;
                case 4:
                Aegis.display();
                ram=Aegis.m+" "+Aegis.na;
                price=Aegis.p;
                purchase();
                break;
                case 5:
                Ripjaws_V.display();
                ram=Ripjaws_V.m+" "+Ripjaws_V.na;
                price=Ripjaws_V.p;
                purchase();
                break;
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
                break;
                case 1:
                cost[2]=price;
                main();
                break;
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
            String s=rupee(cost[i]);
            System.out.println("Rs"+s);
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

