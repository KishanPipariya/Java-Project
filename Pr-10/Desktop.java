import java.util.Scanner;
public class Desktop
{
    static String processor=" -",graphicCard=" -",ram=" -",socketTypeP="",socketTypeM="",motherboard="-";
    static int cost[]=new int[4];
    static String spec[][]=new String[4][2];
    Processor pr=new Processor();
    GraphicCard gc=new GraphicCard();
    RAM ra=new RAM();
    Motherboard mo=new Motherboard();
    Scanner sc=new Scanner(System.in);
    public void processor()
    {
        pr.ma();
    }

    public void graphicCard()
    {
        gc.ma();
    }

    public void ram()
    {
        ra.ma();
    }

    public void motherboard()
    {
        mo.ma();
    }

    public static void main()
    {
        Desktop d= new Desktop();
        spec[0][0]="Processor:";
        spec[0][1]=processor;
        spec[1][0]="Graphic Card:";
        spec[1][1]=graphicCard;
        spec[2][0]="RAM:";
        spec[2][1]=ram;
        spec[3][0]="Motherboard:";
        spec[3][1]=motherboard;
        Scanner in=new Scanner(System.in);
        System.out.println("Press 1 to view processor section");
        System.out.println("Press 2 to view graphic card section");
        System.out.println("Press 3 to view RAM section");
        System.out.println("Press 4 to view Motherboard section");
        System.out.println("Press 0 to exit and print the bill");
        int a=in.nextInt();
        switch(a)
        {
            case 0:
            d.specs();
            break;
            case 1:
            d.processor();
            break;
            case 2:
            d.graphicCard();
            break;
            case 3:
            d.ram();
            break;
            case 4:
            d.motherboard();
            break;
            default:
            d.wrongChoice();
            main();
        }
    }

    public class Processor
    {
        int price;
        Processor()
        {
        }
        String s,na,st;
        int n,p,c;
        double f;
        Processor(String manufacturer,String name,double frequency,int noOfCores,int cache,String socketType,int price)
        {
            s=manufacturer;
            na=name;
            f=frequency;
            n=noOfCores;
            c=cache;
            st=socketType;
            p=price;
        }

        public void display()
        {
            System.out.println("Name:"+na);
            System.out.println("Manufacturer:"+s);
            System.out.println("Frequency:"+f+"Ghz");
            System.out.println("No of cores:"+n);
            System.out.println("Cache:"+c+"MB");
            System.out.println("Socket Type:"+st);
            System.out.println("Price:"+p);
        }

        public void ma()
        {
            Processor i3_8100=new Processor("Intel","i3-8100",3.6,4,6,"LGA-1151",12000);
            Processor i5_8400=new Processor("Intel","i5-8400",2.8,6,9,"LGA-1151",25000);
            Processor i7_8700=new Processor("Intel","i7-8700",3.2,6,12,"LGA-1151",34000);
            Processor Ryzen_3_1200=new Processor("AMD","Ryzen 3 1200",3.4,4,10,"AM4",7000);
            Processor Ryzen_5_1600=new Processor("AMD","Ryzen 5 1600",3.2,6,16,"AM4",14000);
            Processor Ryzen_7_1700=new Processor("AMD","Ryzen 7 1700",3.7,8,16,"AM4",23000);
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
                socketTypeP=i3_8100.st;
                purchase();
                break;
                case 2:
                i5_8400.display();
                processor=i5_8400.na;
                price=i5_8400.p;
                socketTypeP=i5_8400.st;
                purchase();
                break;
                case 3:
                i7_8700.display();
                processor=i7_8700.na;
                price=i7_8700.p;
                socketTypeP=i7_8700.st;
                purchase();
                break;
                case 4:
                Ryzen_3_1200.display();
                processor=Ryzen_3_1200.na;
                price=Ryzen_3_1200.p;
                socketTypeP=Ryzen_3_1200.st;
                purchase();
                break;
                case 5:
                Ryzen_5_1600.display();
                processor=Ryzen_5_1600.na;
                price=Ryzen_5_1600.p;
                socketTypeP=Ryzen_5_1600.st;
                purchase();
                break;
                case 6:
                Ryzen_7_1700.display();
                processor=Ryzen_7_1700.na;
                price=Ryzen_7_1700.p;
                socketTypeP=Ryzen_7_1700.st;
                purchase();
                break;
                default:
                wrongChoice();
                ma();
            }
        }

        public void purchase()
        {
            if(socketTypeP==socketTypeM||socketTypeM=="")
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
                    default:
                    wrongChoice();
                    purchase();
                }
            }
            else
            {
                System.out.println("The processor you chose is not compatible with motherboard chosen by you");
                System.out.println("Enter 1 to go back to processor section or Enter 2 to go back and change the motherboard");
                int c=sc.nextInt();
                switch(c)
                {
                    case 1:
                    ma();
                    break;
                    case 2:
                    cost[0]=price;
                    Motherboard m=new Motherboard();
                    m.ma();
                    break;
                    default:
                    wrongChoice();
                    purchase();
                }
            }
        }
    }
    public class GraphicCard
    {
        String m,a,na,b;
        int price,p,c;
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
            System.out.println("Chip maker:"+m);
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
                wrongChoice();
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
                default:
                wrongChoice();
                purchase();
            }
        }
    }
    public class RAM
    {
        String m,na,mt;
        int c,p,f;
        int price;
        RAM()
        {
        }

        RAM(String manufacturer,String name,int capacity,String memoryType,int memorySpeed,int price)
        {
            m=manufacturer;
            na=name;
            c=capacity;
            mt=memoryType;
            f=memorySpeed;
            p=price;
        }

        public void display()
        {
            System.out.println("Name:"+m+" "+na);
            System.out.println("Manufacturer:"+m);
            System.out.println("Capacity:"+c+"GB");
            System.out.println("Memory Type:"+mt);
            System.out.println("Frequency:"+f);
            System.out.println("Price:"+p);
        }

        public void ma()
        {           
            RAM DLR4GD4_24=new RAM("Dolgix","(DLR4GD4-24)",4,"DDR4",2400,2800);
            RAM Premier=new RAM("ADATA","Premier (AD4U2133W4G15-B)",4,"DDR4",2133,3300);
            RAM Vengeance_LPX=new RAM("Corsair","Vengeance LPX (CMK8GX4M1A2400C16R)",8,"DDR4",2400,5700);
            RAM Aegis=new RAM("G.Skill","AEGIS (F4-2400C15S-8GIS)",8,"DDR4",2133,6500);
            RAM Ripjaws_V=new RAM("G.Skill","Ripjaws V (F4-2400C15S-16GVR)",16,"DDR4",2400,8000);
            System.out.println("RAMs:");
            System.out.println("Press 1 ADATA Premier (AD4U2133W4G15-B)");
            System.out.println("Press 2 Dolgix (DLR4GD4-24)");
            System.out.println("Press 3 Corsair Vengeance LPX (CMK8GX4M1A2400C16R)");
            System.out.println("Press 4 G.Skill AEGIS (F4-2400C15S-8GIS)");
            System.out.println("Press 5 G.Skill Ripjaws V (F4-2400C15S-16GVR)");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                Premier.display();
                ram=Premier.m+" "+Premier.na;
                price=Premier.p;
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
                default:
                wrongChoice();
                ma();
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
                default:
                wrongChoice();
                purchase();
            }
        }
    }
    public class Motherboard
    {
        String m,na,st,ch,rt,f;
        int c,p,price;
        Motherboard(String manufacturer,String name,String socketType,String chipset,String ramType,int capacity,String formFactor,int price)
        {
            m=manufacturer;
            na=name;
            st=socketType;
            ch=chipset;
            rt=ramType;
            c=capacity;
            f=formFactor;
            p=price;
        }

        Motherboard()
        {
        }

        public void display()
        {
            System.out.println("Name:"+m+" "+na);
            System.out.println("Manufacturer:"+m);
            System.out.println("Socket Type:"+st);
            System.out.println("Chipset:"+ch);
            System.out.println("RAM Type:"+rt);
            System.out.println("Memory Capacity:"+c);
            System.out.println("Form Factor:"+f);
            System.out.println("Price:"+p);
        }

        public void ma()
        {
            Motherboard ROG=new Motherboard("Asus","ROG STRIX Z370-F","LGA-1151","Z370","DDR4",64,"ATX",20000);
            Motherboard B150M_D3H=new Motherboard("Gigabyte","(GA-B150M-D3H)","LGA-1151","B150","DDR4",64,"Micro-ATX",9000);
            Motherboard PRO_VH=new Motherboard("MSI","H110M-PRO-VH PLUS","LGA-1151","H110","DDR4",32,"Micro-ATX",3500);
            Motherboard Mortar=new Motherboard("MSI","B350 Mortar","AM4","B350","DDR4",64,"Micro-ATX",9200);
            Motherboard Prime=new Motherboard("Asus","Prime X370-PRO","AM4","X-370","DDR4",64,"ATX",14500);
            Motherboard GamingPro=new Motherboard("MSI","B350M Gaming Pro","AM4","B350","DDR4",32,"Micro-ATX",13000);
            System.out.println("Press 1 to view Asus ROG STRIX Z370-F");
            System.out.println("Press 2 to view Gigabyte (GA-B150M-D3H)");
            System.out.println("Press 3 to view MSI H110M-PRO-VH PLUS");
            System.out.println("Press 4 to view MSI B350 Mortar");
            System.out.println("Press 5 to view Asus Prime X370-PRO");
            System.out.println("Press 6 to view MSI B350M Gaming Pro");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                ROG.display();
                motherboard=ROG.m+" "+ROG.na;
                price=ROG.p;
                socketTypeM=ROG.st;
                purchase();
                break;
                case 2:
                B150M_D3H.display();
                motherboard=B150M_D3H.m+" "+B150M_D3H.na;
                price=B150M_D3H.p;
                socketTypeM=B150M_D3H.st;
                purchase();
                break;
                case 3:
                PRO_VH.display();
                motherboard=PRO_VH.m+" "+PRO_VH.na;
                price=PRO_VH.p;
                socketTypeM=PRO_VH.st;
                purchase();
                break;
                case 4:
                Mortar.display();
                motherboard=Mortar.m+" "+Mortar.na;
                price=Mortar.p;
                socketTypeM=Mortar.st;
                purchase();
                break;
                case 5:
                Prime.display();
                motherboard=Prime.m+" "+Prime.na;
                price=Prime.p;
                socketTypeM=Prime.st;
                purchase();
                break;
                case 6:
                GamingPro.display();
                motherboard=GamingPro.m+" "+GamingPro.na;
                price=GamingPro.p;
                socketTypeM=GamingPro.st;
                purchase();
                break;
                default:
                wrongChoice();
                ma();
            }
        }

        public void purchase()
        {
            if(socketTypeM==socketTypeP||socketTypeP=="")
            {
                System.out.println("Press 0 to go back or Press 1 to purchase it");
                int c=sc.nextInt();
                switch(c)
                {
                    case 0:
                    motherboard="-";
                    ma();
                    break;
                    case 1:
                    cost[3]=price;
                    main();
                    break;
                    default:
                    wrongChoice();
                    purchase();
                }
            }
            else
            {
                System.out.println("The motherboard you chose to view is not compatible with processor chosen by you");
                System.out.println("Enter 1 to go back to motherboard section or Enter 2 to go back and change the processor");
                int c=sc.nextInt();
                switch(c)
                {
                    case 1:
                    ma();
                    break;
                    case 2:
                    cost[3]=price;
                    Processor p=new Processor();
                    p.ma();  
                    break;
                    default:
                    wrongChoice();
                    purchase();
                }
            }
        }
    }

    public void specs()
    {
        System.out.println("Specifications:");
        System.out.println("Processor:"+processor);
        System.out.println("Graphic Card:"+graphicCard);
        System.out.println("Ram:"+ram);
        System.out.println("Motherboard:"+motherboard);
        dispalySpecTable();
    }

    public void dispalySpecTable()
    {
        System.out.println("Bill");
        ElectronicsShop e=new ElectronicsShop();
        System.out.print("Date and Time: ");
        e.date();
        int i,j,k=0,l=0;
        System.out.print("Component");
        e.space(9);
        System.out.println("Cost");
        for(i=0;i<4;i++)
        {
            l=0;
            for(j=0;j<2;j++)
            {
                System.out.print(spec[i][j]);
                k=spec[i][j].length(); 
                l=l+k;
            }
            e.space(l);
            String s=e.rupee(cost[i]);
            System.out.println("Rs"+s);
        }
        bill();        
    }

    public void bill()
    {
        ElectronicsShop e=new ElectronicsShop();        
        int su=0,i;
        String s1;
        for(i=0;i<4;i++)
        {
            su=su+cost[i];
        }
        s1=e.rupee(su);
        System.out.print("Total Cost:");
        e.space(11);
        System.out.println("Rs"+s1);
        System.out.println("********Thanks for shopping with us********");
        e.main();
    }
    
    public void wrongChoice()
    {
        System.out.println("Wrong Choice");
        System.out.println("Please Try Again");
    }
}

