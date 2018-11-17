import java.util.Scanner;
class Laptop
{
    static int catg,mode,var,budget,p,comp=1;;
    Scanner sc=new Scanner(System.in);
    static int price[]=new int[21474836];
    static int quantity[]=new int[21474836];
    static String name[]=new String[21474836];
    static int k=0,q;
    public static void main()
    {
        System.out.println("Welcome");
        Laptop obj=new Laptop();
        obj.laptop();
    }

    public void laptop()
    {
        while(comp!=0)
        {
            System.out.println("You are viewing the laptop section");
            System.out.println("Press 0 to exit and print the bill");
            System.out.println("We sell laptops made by following manufactures:");
            System.out.println("1.Alienware");
            System.out.println("2.Dell");
            comp=sc.nextInt();
            switch(comp)
            {
                case 1:
                Alienware();
                break;
                case 2:
                Dell();
                break;
                case 0:
                bill();
                break;
            }
        }
    }

    public void Alienware()
    {
        System.out.println("We possess the following models of Alienware");
        System.out.println("1.Alienware 13");
        System.out.println("2.Alienware 15");
        System.out.println("0.Exit to laptop section");
        mode=sc.nextInt();
        switch(mode)
        {
            case 1:
            Alienware_13();
            break;
            case 2:
            Alienware_15();
            case 0:
            laptop();
            break;
        }
    }

    public void Alienware_13()
    {
        System.out.println("We have the following 2 variants");
        System.out.println("            Variant 1                                                  Variant 2");
        System.out.println("Price        Rs 75000                                                  Rs 98000"                                       );
        System.out.println("Processor   7th Generation Intel® Core™ i5-7300HQ                      7th Generation Intel® Core™ i7-7700HQ  ");                      
        System.out.println("            (Quad-Core, 6MB Cache,up to 3.5GHz w/ Turbo Boost)         (Quad-Core, 6MB Cache, up to 3.8GHz w/ Turbo Boost)"); 
        System.out.println("Memory      8GB DDR4 at 2400MHz (1x8GB)                                 8GB DDR4 at 2400MHz (1x8GB)");
        System.out.println("Hard Drive  256GB PCIe SSD (Boot)                                       256GB PCIe SSD (Boot) ");                                      
        System.out.println("Video Card  NVIDIA® GeForce® GTX 1050Ti with 2GB GDDR5                  NVIDIA® GeForce® GTX 1060 with 6GB GDDR5 ");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        System.out.println("Enter the number of laptops you wish to purchase");
        q=sc.nextInt();
        switch(var)
        {
            case 0:
            Alienware();
            break;
            case 1:
            System.out.println("You purchased "+q+" Alienware 13(1) laptop each priced Rs 75000");
            price[k]=75000;
            quantity[k]=q;
            name[k]="Alienware 13(1)";
            k++;
            break;
            case 2:
            System.out.println("You purchased"+q+"Alienware 13(2) laptop each priced Rs 98000");
            price[k]=98000;
            quantity[k]=q;
            name[k]="Alienware 13(2)";
            k++;
            break;
            default:
            Alienware_13();
        }
        Alienware();
    }

    public void Alienware_15()
    {
        System.out.println("We have the folowing two variants");
        System.out.println("            Variant 1                                           Variant 2");
        System.out.println("Price       Rs 93500                                            Rs 100000");
        System.out.println("Processor   8th Generation Intel® Core™ i5-8300H                8th Generation Intel® Core™ i7-8750H ");
        System.out.println("            (Quad-Core, 8MB Cache, up to 4.0GHz w/ Turbo Boost) (6-Core, 9MB Cache, up to 4.1GHz w/ Turbo Boost)  ");
        System.out.println("Memory      8GB, DDR4, 2400MHz; up to 32GB                      16GB, DDR4, 2400MHz; up to 32GB  ");
        System.out.println("Hard Drive  1TB 7200RPM HDD                                     128GB M.2 SATA SSD + 1TB 7200RPM SATA HDD");
        System.out.println("Video Card  NVIDIA® GeForce® GTX 1060 with 6GB GDDR5            NVIDIA® GeForce® GTX 1060 with 6GB GDDR5");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        System.out.println("Enter the number of laptops you wish to purchase");
        q=sc.nextInt();
        switch(var)
        {
            case 0:
            Alienware();
            case 1:
            System.out.println("You purchased "+q+" Alienware 15(1) laptop priced Rs 93500");
            price[k]=93500;
            quantity[k]=q;
            name[k]="Alienware 15(1)";
            k++;
            break;
            case 2:
            System.out.println("You purchased "+q+" Alienware 15(2) laptop each priced Rs 100000");
            price[k]=100000;
            quantity[k]=q;
            name[k]="Alienware 15(2)";
            k++;
            break;
            default:
            Alienware_15();
        }
    }
    
    public void Alienware_17()
    {
        
    }

    public void Dell()
    {
        System.out.println("We sell the following models of Dell");
        System.out.println("1.Inspiron 3000 Series");
        System.out.println("2.Exit to laptops section");
        mode=sc.nextInt();
        switch(mode)
        {
            case 1:
            Inspiron_3000();
            break;
            case 2:
            laptop();
            break;
        }
    }

    public void Inspiron_3000()
    {
        System.out.println("We sell the following variants");
        System.out.println("             Inspiron 15 3552 Laptop            Inspiron 15 3565 Laptop                   Inspiron 15 3567(1)             Inspiron 15 3567(2)              ");
        System.out.println("Processor    Intel® Pentium® Processor N3710    7th Generation AMD E2-9000 Processor      6th Generation Intel® Core™     7th Generation Intel® Core™ i7 Processor            ");
        System.out.println("             (2M Cache, up to 2.56 GHz)         with Radeon™ R2 Graphics                  i3 processor                    i7 Processor");
        System.out.println("");
        var=sc.nextInt();
        switch(var)
        {
            case 1:
            System.out.println("You purchased a Inspiron 15 3552 Laptop");
            break;
            case 2:
            System.out.println("You purchased a Insspiron ");
        }
        Dell();
    }   

    public void bill()
    {
        int i,l1,l2,l3;
        String s1,s2;
        System.out.print("Name");
        space(4);
        System.out.print("Price per unit");
        space(14);
        System.out.print("Quantity");
        space(8);
        System.out.println("Total Cost");
        for(i=0;i<k;i++)
        {
            System.out.print(name[i]);
            l1=name[i].length();
            space(l1);
            System.out.print(price[i]);
            s1=Integer.toString(price[i]);
            l2=s1.length();
            space(l2);
            System.out.print(quantity[i]);
            s2=Integer.toString(quantity[i]);
            l3=s2.length();
            space(l3);
            System.out.println(price[i]*quantity[i]);
        }
        System.out.println("*************Thanks for shopping with us*************");
        Controller c=new Controller();
        c.main();
    }

    public void space(int l)
    {
        int a=40-l;
        while(a>0)
        {
            System.out.print(" ");
            a--;
        }
    }
}