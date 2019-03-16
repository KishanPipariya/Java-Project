import java.util.Scanner;
public class Desktop
{
    static String processor=" -",graphicCard=" -",ram=" -",socketTypeP="",socketTypeM="",motherboard="-";
    static int cost[]=new int[4];//It stores the prices of items purchased by the user
    static String spec[][]=new String[4][2];//It stores the name and category of item purchased by the user
    Processor pr=new Processor();
    GraphicCard gc=new GraphicCard();
    RAM ra=new RAM();
    Motherboard mo=new Motherboard();
    Scanner sc=new Scanner(System.in);
    
    public static void main()
    {        
        spec[0][0]="Processor:";
        spec[0][1]=processor;
        spec[1][0]="Graphic Card:";
        spec[1][1]=graphicCard;
        spec[2][0]="RAM:";
        spec[2][1]=ram;
        spec[3][0]="Motherboard:";
        spec[3][1]=motherboard;
        Desktop de=new Desktop();
        de.entry();
    }

    public void entry()
    {
        Desktop d= new Desktop();
        System.out.println("Press 1 to view processor section");
        System.out.println("Press 2 to view graphic card section");
        System.out.println("Press 3 to view RAM section");
        System.out.println("Press 4 to view Motherboard section");
        System.out.println("Press 0 to exit and print the bill");
        int a=sc.nextInt();
        switch(a)
        {
            case 0:
            d.specs();
            break;
            case 1:
            d.pr.ma();
            break;
            case 2:
            d.gc.ma();
            break;
            case 3:
            d.ra.ma();
            break;
            case 4:
            d.mo.ma();
            break;
            default:
            d.wrongChoice();
            main();
        }
    }
    
    public class Processor
    {
        Processor()
        {
        }
        String manufacturer,name,socketType;
        int noOfCores,cache,price,pr;
        double frequency;
        Processor(String m,String na,double f,int n,int c,String s,int p)
        //This consturctor is used to create various processors,each with its own unique specifications
        {
            manufacturer=m;
            name=na;
            frequency=f;
            noOfCores=n;
            cache=c;
            socketType=s;
            price=p;
        }

        public void display()//This function is used to display the specifications of a processor
        {
            System.out.println("Name:"+name);
            System.out.println("Manufacturer:"+manufacturer);
            System.out.println("Frequency:"+frequency+"Ghz");
            System.out.println("No of cores:"+noOfCores);
            System.out.println("Cache:"+cache+"MB");
            System.out.println("Socket Type:"+socketType);
            System.out.println("Price:"+price);
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
                i3_8100.info();                
                break;
                case 2:
                i5_8400.info();
                break;
                case 3:
                i7_8700.info();
                break;
                case 4:
                Ryzen_3_1200.info();
                break;
                case 5:
                Ryzen_5_1600.info();
                break;
                case 6:
                Ryzen_7_1700.info();
                break;
                default:
                wrongChoice();
                ma();
            }
        }
        
        public void info()
        {
            this.display();
            processor=this.name;
            pr=this.price;
            socketTypeP=this.socketType;
            purchase();
        }

        public void purchase()
        {
            if(socketTypeP==socketTypeM||socketTypeM=="")//This statement is used to ensure compatibility between processor and motherboard
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
                    cost[0]=pr;
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
                    cost[0]=pr;
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
        String manufacturer,architecture,name,brand;
        int price,capacity,pr;
        GraphicCard()
        {
        }

        GraphicCard(String b,String m,String a,String na,int c,int p)
        //This consturctor is used to create various graphic cards,each with its own unique specifications
        {
            brand=b;
            manufacturer=m;
            architecture=a;
            name=na;
            capacity=c;
            price=p;
        }

        public void display()//This function is used to display the specifications of a graphic card
        {
            System.out.println("Name:"+brand+" "+name);
            System.out.println("Brand:"+brand);
            System.out.println("Chip maker:"+manufacturer);
            System.out.println("Architecture:"+architecture);
            System.out.println("Capacity:"+capacity+"GB");
            System.out.println("Price"+price);
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
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                GeForceGtx_950.display();
                graphicCard=GeForceGtx_950.brand+" "+GeForceGtx_950.name;
                pr=GeForceGtx_950.price;
                purchase();
                break;
                case 2:
                GeForceGtx_1050.display();
                graphicCard=GeForceGtx_1050.brand+" "+GeForceGtx_1050.name;
                pr=GeForceGtx_1050.price;
                purchase();
                break;
                case 3:
                GeForceGtx_1060.display();
                graphicCard=GeForceGtx_1060.brand+" "+GeForceGtx_1060.name;
                pr= GeForceGtx_1060.price;
                purchase();
                break;
                case 4:
                Radeon_RX_550.display();
                graphicCard=Radeon_RX_550.brand+" "+Radeon_RX_550.name;
                pr= Radeon_RX_550.price;
                purchase();
                break;
                case 5:
                Radeon_RX_560.display();
                graphicCard=Radeon_RX_560.brand+" "+Radeon_RX_560.name;
                pr=Radeon_RX_560.price;
                purchase();
                break;
                case 6:
                Radeon_RX_580.display();
                graphicCard=Radeon_RX_580.brand+" "+Radeon_RX_580.name;
                pr=Radeon_RX_580.price;
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
                cost[1]=pr;
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
        String manufacturer,name,memoryType;
        int capacity,pr,frequency,price;
        RAM()
        {
        }

        RAM(String m,String na,int c,String mt,int f,int p)
        //This consturctor is used to create various RAMs,each with its own unique specifications
        {
            manufacturer=m;
            name=na;
            capacity=c;
            memoryType=mt;
            frequency=f;
            price=p;
        }

        public void display()
        //This function is used to display the specifications of a RAM stick
        {
            System.out.println("Name:"+manufacturer+" "+name);
            System.out.println("Manufacturer:"+manufacturer);
            System.out.println("Capacity:"+capacity+"GB");
            System.out.println("Memory Type:"+memoryType);
            System.out.println("Frequency:"+frequency);
            System.out.println("Price:"+price);
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
                ram=Premier.manufacturer+" "+Premier.name;
                pr=Premier.price;
                purchase();
                break;
                case 2:
                DLR4GD4_24.display();
                ram=DLR4GD4_24.manufacturer+" "+DLR4GD4_24.name;
                pr=DLR4GD4_24.price;
                purchase();
                break;
                case 3:
                Vengeance_LPX.display();
                ram=Vengeance_LPX.manufacturer+" "+Vengeance_LPX.name;
                pr=Vengeance_LPX.price;
                purchase();
                break;
                case 4:
                Aegis.display();
                ram=Aegis.manufacturer+" "+Aegis.name;
                pr=Aegis.price;
                purchase();
                break;
                case 5:
                Ripjaws_V.display();
                ram=Ripjaws_V.manufacturer+" "+Ripjaws_V.name;
                pr=Ripjaws_V.price;
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
                cost[2]=pr;
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
        String manufacturer,name,socketType,chipset,ramType,formFactor;
        int capacity,pr,price;
        Motherboard(String m,String na,String st,String ch,String rt,int c,String f,int p)
        //This consturctor is used to create various Motherboards,each with its own unique specifications
        {
            manufacturer=m;
            name=na;
            socketType=st;
            chipset=ch;
            ramType=rt;
            capacity=c;
            formFactor=f;
            price=p;
        }

        Motherboard()
        {
        }

        public void display()//This function is used to display the specifications of a motherboard
        {
            System.out.println("Name:"+manufacturer+" "+name);
            System.out.println("Manufacturer:"+manufacturer);
            System.out.println("Socket Type:"+socketType);
            System.out.println("Chipset:"+chipset);
            System.out.println("RAM Type:"+ramType);
            System.out.println("Memory Capacity:"+capacity);
            System.out.println("Form Factor:"+formFactor);
            System.out.println("Price:"+price);
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
                motherboard=ROG.manufacturer+" "+ROG.name;
                pr=ROG.price;
                socketTypeM=ROG.socketType;
                purchase();
                break;
                case 2:
                B150M_D3H.display();
                motherboard=B150M_D3H.manufacturer+" "+B150M_D3H.name;
                pr=B150M_D3H.price;
                socketTypeM=B150M_D3H.socketType;
                purchase();
                break;
                case 3:
                PRO_VH.display();
                motherboard=PRO_VH.manufacturer+" "+PRO_VH.name;
                pr=PRO_VH.price;
                socketTypeM=PRO_VH.socketType;
                purchase();
                break;
                case 4:
                Mortar.display();
                motherboard=Mortar.manufacturer+" "+Mortar.name;
                pr=Mortar.price;
                socketTypeM=Mortar.socketType;
                purchase();
                break;
                case 5:
                Prime.display();
                motherboard=Prime.manufacturer+" "+Prime.name;
                pr=Prime.price;
                socketTypeM=Prime.socketType;
                purchase();
                break;
                case 6:
                GamingPro.display();
                motherboard=GamingPro.manufacturer+" "+GamingPro.name;
                pr=GamingPro.price;
                socketTypeM=GamingPro.socketType;
                purchase();
                break;
                default:
                wrongChoice();
                ma();
            }
        }

        public void purchase()
        {
            if(socketTypeM==socketTypeP||socketTypeP=="")//This statement is used to ensure compatibility between processor and motherboard
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
                    cost[3]=pr;
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
                    cost[3]=pr;
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

    public void specs()//ThisFunction dispalys the specification of desktop built by the user
    {
        System.out.println("Specifications:");
        System.out.println("Processor:"+processor);
        System.out.println("Graphic Card:"+graphicCard);
        System.out.println("Ram:"+ram);
        System.out.println("Motherboard:"+motherboard);
        dispalySpecTable();
    }

    public void dispalySpecTable()//This function prints majority of the bill
    {
        System.out.println("Bill");
        ElectronicsShop e=new ElectronicsShop();
        System.out.print("Date and Time: ");
        e.date();
        int i,j,k=0,l=0;
        System.out.print("Component");
        e.space(60,9);
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
            e.space(60,l);
            String s=e.rupee(cost[i]);
            System.out.println("Rs"+s);
        }
        bill();        
    }

    public void bill()//This function prints the remaining bill
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
        e.space(60,11);
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





