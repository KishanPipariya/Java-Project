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
        System.out.println("You are viewing the laptop section");
        System.out.println("Press 0 To Exit And Print The Bill");
        System.out.println("We sell laptops made by following manufactures:");
        System.out.println("1.Dell");
        comp=sc.nextInt();
        switch(comp)
        {
            case 1:
            Dell();
            break;
            case 0:
            bill();
            break;
            default:
            wrongChoice();
            laptop();
        }
    }

    public void Dell()
    {
        System.out.println("We sell the following series of Dell");
        System.out.println("1.Alienware");
        System.out.println("2.Inspiron");
        System.out.println("Press 0 To Exit To Laptops Section");
        mode=sc.nextInt();
        switch(mode)
        {
            case 1:
            Alienware();
            break;
            case 2:
            Inspiron();
            break;
            case 0:
            laptop();
            break;
            default:
            wrongChoice();
            Dell();
        }
    }

    public void Alienware()
    {
        System.out.println("We possess the following models of Alienware");
        System.out.println("1.Alienware 13");
        System.out.println("2.Alienware 15");
        System.out.println("3.Alienware 17");
        System.out.println("Press 0 To Go Back To Dell Section");
        mode=sc.nextInt();
        switch(mode)
        {
            case 1:
            Alienware_13();
            break;
            case 2:
            Alienware_15();
            case 3:
            Alienware_17();
            break;
            case 0:
            Dell();
            break;
            default:
            wrongChoice();
            Alienware();
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
            System.out.println("You purchased "+q+" Alienware 13(1) laptop each costing Rs 75000");
            price[k]=75000;
            quantity[k]=q;
            name[k]="Alienware 13(1)";
            k++;
            break;
            case 2:
            System.out.println("You purchased"+q+"Alienware 13(2) laptop each costing Rs 98000");
            price[k]=98000;
            quantity[k]=q;
            name[k]="Alienware 13(2)";
            k++;
            break;
            default:
            wrongChoice();
            Alienware_13();
        }
        Alienware();
    }

    public void Alienware_15()
    {
        System.out.println("We have the folowing 2 variants");
        System.out.println("             Variant 1                                           Variant 2");
        System.out.println("Price:       Rs 93500                                            Rs 100000");
        System.out.println("Processor:   8th Generation Intel® Core™ i5-8300H                8th Generation Intel® Core™ i7-8750H ");
        System.out.println("             (Quad-Core, 8MB Cache, up to 4.0GHz w/ Turbo Boost) (6-Core, 9MB Cache, up to 4.1GHz w/ Turbo Boost)  ");
        System.out.println("Memory:      8GB, DDR4, 2400MHz; up to 32GB                      16GB, DDR4, 2400MHz; up to 32GB  ");
        System.out.println("Hard Drive:  1TB 7200RPM HDD                                     128GB M.2 SATA SSD + 1TB 7200RPM SATA HDD");
        System.out.println("Video Card:  NVIDIA® GeForce® GTX 1060 with 6GB GDDR5            NVIDIA® GeForce® GTX 1060 with 6GB GDDR5");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        System.out.println("Enter the number of laptops you wish to purchase");
        q=sc.nextInt();
        switch(var)
        {
            case 0:
            Alienware();
            case 1:
            System.out.println("You purchased "+q+" Alienware 15(1) laptop each costing Rs 93500");
            price[k]=93500;
            quantity[k]=q;
            name[k]="Alienware 15(1)";
            k++;
            break;
            case 2:
            System.out.println("You purchased "+q+" Alienware 15(2) laptop each costing Rs 100000");
            price[k]=100000;
            quantity[k]=q;
            name[k]="Alienware 15(2)";
            k++;
            break;
            default:
            wrongChoice();
            Alienware_15();
        }
        Alienware();
    }

    public void Alienware_17()
    {
        System.out.println("We have the folowing 2 variants");
        System.out.println("             Variant 1                                                  Variant 2");
        System.out.println("Price:       Rs 104000                                                  125000");
        System.out.println("Processor:   8th Generation Intel® Core™ i7-8750H                       8th Generation Intel® Core™ i7-8750H ");
        System.out.println("             (6-Core, 9MB Cache, up to 4.1GHz w/ Turbo Boost)           (6-Core, 9MB Cache, up to 4.1GHz w/ Turbo Boost)");
        System.out.println("Memory:      16GB, DDR4, 2400MHz; up to 32GB                            16GB, DDR4, 2400MHz; up to 32GB ");
        System.out.println("Hard Drive:  128GB M.2 SATA SSD + 1TB 7200RPM SATA HDD                  256GB M.2 PCIe SSD + 1TB 7200RPM SATA HDD");
        System.out.println("Video Card:  NVIDIA® GeForce® GTX 1060 with 6GB GDDR5                   NVIDIA® GeForce® GTX 1070 OC with 8GB GDDR5");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        System.out.println("Enter the number of laptops you wish to purchase");
        q=sc.nextInt();
        switch(var)
        {
            case 0:
            Alienware();
            case 1:
            System.out.println("You purchased "+q+" Alienware 17(1) laptop each costing Rs 104000");
            price[k]=104000;
            quantity[k]=q;
            name[k]="Alienware 17(1)";
            k++;
            break;
            case 2:
            System.out.println("You purchased "+q+" Alienware 17(2) laptop each costing Rs 125000");
            price[k]=100000;
            quantity[k]=q;
            name[k]="Alienware 17(2)";
            k++;
            break;
            default:
            wrongChoice();
            Alienware_17();
        }
        Alienware();
    } 

    public void Inspiron()
    {
        System.out.println("Inspiron has the following sub-series:");
        System.out.println("1.3000 series");
        System.out.println("2.5000 series");
        System.out.println("Press 0 To Go Back To Dell Section");
        mode =sc.nextInt();
        switch(mode)
        {
            case 1:
            Inspiron_3000();
            break;
            case 0:
            Dell();
            break;
            default:
            wrongChoice();
            Inspiron();
        }
    }

    public void Inspiron_3000()
    {
        System.out.println("We possess the following models of Inspiron 3000 series:");
        System.out.println("1.Inspiron 15 3573");
        System.out.println("2.Inspiron 15 3565");
        System.out.println("3.Inspiron 15 3552");
        System.out.println("4.Inspiron 15 3567");
        System.out.println("5.Inspiron 15 3576");
        System.out.println("Press 0 To Go Back To Inspiron Series");
        mode=sc.nextInt();
        switch(mode)
        {
            case 1:
            Inspiron_15_3573();
            break;
            case 2:
            Inspiron_15_3565();
            break;
            case 3:
            Inspiron_15_3552();
            break;
            case 4:
            Inspiron_15_3567();
            break;
            case 5:
            Inspiron_15_3576();
            break;
            case 0:
            Inspiron();
            break;
            default:
            wrongChoice();
            Inspiron_3000();
        }
    }

    public void Inspiron_15_3573()
    {
        System.out.println("We sell the following variants:");
        System.out.println("             Inspiron 15 3573(1)                 Inspiron 15 3573(2)");
        System.out.println("Price:       24300                               24800");
        System.out.println("Processor:   Intel® Celeron® Processor N4000     Intel® Pentium® Silver Processor N5000");
        System.out.println("             (4M Cache, up to 2.6 GHz)           (4MB Cache, up to 2.7 GHz)");
        System.out.println("Memory:      4GB, DDR4, 2400MHz; up to 8GB       4GB, DDR4, 2400MHz; up to 8GB ");
        System.out.println("Hard Drive:  1TB 5400 rpm Hard Drive             1TB 5400 rpm Hard Drive");
        System.out.println("Video Card:  Intel UHD Graphics 600              Intel UHD Graphics 605");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        System.out.println("Enter the number of laptops you wish to purchase");
        q=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_3000();
            case 1:
            System.out.println("You purchased "+q+" Inspiron 15 3573(1) laptop priced Rs 24300");
            price[k]=24300;
            quantity[k]=q;
            name[k]="Inspiron 15 3573(1)";
            k++;
            break;
            case 2:
            System.out.println("You purchased "+q+" Inspiron 15 3573(2) laptop each priced Rs 24800");
            price[k]=24800;
            quantity[k]=q;
            name[k]="Inspiron 15 3573(2)";
            k++;
            break;
            default:
            wrongChoice();
            Inspiron_15_3573();
        }
        Inspiron_3000();
    }

    public void Inspiron_15_3565()
    {
        System.out.println("We sell the following variants:"); 
        System.out.println("             Inspiron 15 3565(1)                    Inspiron 15 3565(2)");
        System.out.println("Price:       23800                                  24900                ");
        System.out.println("Processor:   7th Generation AMD E2-9000 Processor   7th Generation AMD A6-9225 Processor");
        System.out.println("             with Radeon™ R2 Graphics               with Radeon™ R4 Graphics ");
        System.out.println("Memory:      4GB, DDR4, 2400MHz ; up to 16GB        4GB, DDR4, 2400MHz ; up to 16GB ");
        System.out.println("Hard Drive:  1TB 5400 rpm Hard Drive                1TB 5400 rpm Hard Drive");
        System.out.println("Video Card:  Integrated graphics with AMD APU       Integrated graphics with AMD APU");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        System.out.println("Enter the number of laptops you wish to purchase");
        q=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_3000();
            case 1:
            System.out.println("You purchased "+q+" Inspiron 15 3565(1) laptop priced Rs 23800");
            price[k]=23800;
            quantity[k]=q;
            name[k]="Inspiron 15 3565(1)";
            k++;
            break;
            case 2:
            System.out.println("You purchased "+q+" Inspiron 15 3565(2) laptop each priced Rs 24900");
            price[k]=24900;
            quantity[k]=q;
            name[k]="Inspiron 15 3565(2)";
            k++;
            break;
            default:
            wrongChoice();
            Inspiron_15_3565();
        }
        Inspiron_3000();
    }

    public void Inspiron_15_3552()
    {
        System.out.println("We sell the following variants:"); 
        System.out.println("             Inspiron 15 3552(1)                Inspiron 15 3552(2)");
        System.out.println("Price:       Rs 25200                           Rs 26300");
        System.out.println("Processor:   Intel® Celeron® Processor N3060    Intel® Pentium® Processor N3710");
        System.out.println("             (2M Cache, up to 2.48 GHz)         (2M Cache, up to 2.56 GHz)");
        System.out.println("Memory:      4GB Single Channel DDR3L 1600MHz   4GB Single Channel DDR3L 1600MHz");
        System.out.println("Hard Drive:  1TB 5400 rpm Hard Drive            1TB 5400 rpm Hard Drive");
        System.out.println("Video Card:  Intel® HD Graphics 400             Intel® HD Graphics 405 with shared graphics memory");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        System.out.println("Enter the number of laptops you wish to purchase");
        q=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_3000();
            case 1:
            System.out.println("You purchased "+q+" Inspiron 15 3552(1) laptop priced Rs 25200");
            price[k]=25200;
            quantity[k]=q;
            name[k]="Inspiron 15 3552(1)";
            k++;
            break;
            case 2:
            System.out.println("You purchased "+q+" Inspiron 15 3552(2) laptop each priced Rs 26300");
            price[k]=26300;
            quantity[k]=q;
            name[k]="Inspiron 15 3552(2)";
            k++;
            break;
            default:
            wrongChoice();
            Inspiron_15_3552();
        }
        Inspiron_3000();
    }
    
    public void Inspiron_15_3567()
    {
        System.out.println("We sell the following variants:");
        System.out.println("             Inspiron 15 3567(1)");
        System.out.println("Price:       Rs 33200                                 Rs 34000");
        System.out.println("Processor:   6th Generation Intel® Core™ i3-6006U    7th Generation Intel® Core™ i3-7020U");
        System.out.println("             (3MB Cache, 2.00 GHz)                    (3MB Cache, 2.30 GHz)");
        System.out.println("Memory:      4GB, 2400MHz, DDR4; up to 16GB           4GB, 2400MHz, DDR4; up to 16GB ");
        System.out.println("Hard Drive:  1TB 5400 rpm Hard Drive                  1TB 5400 rpm Hard Drive");
        System.out.println("Video Card:  Intel® HD Graphics 520                   Intel® HD Graphics 620 ");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        System.out.println("Enter the number of laptops you wish to purchase");
        q=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_3000();
            case 1:
            System.out.println("You purchased "+q+" Inspiron 15 3567(1) laptop priced Rs 33200");
            price[k]=33200;
            quantity[k]=q;
            name[k]="Inspiron 15 3567(1)";
            k++;
            break;
            case 2:
            System.out.println("You purchased "+q+" Inspiron 15 3567(2) laptop each priced Rs 34000");
            price[k]=34000;
            quantity[k]=q;
            name[k]="Inspiron 15 3567(2)";
            k++;
            break;
            default:
            wrongChoice();
            Inspiron_15_3567();
        }
        Inspiron_3000();
    }

    public void Inspiron_15_3576()
    {
        System.out.println("We sell the following variants:");
        System.out.println("             Inspiron 15 3576(1)                       Inspiron 15 3576(2)");
        System.out.println("Price:       Rs 34000                                  Rs 44000");
        System.out.println("Processor:   7th Generation Intel® Core™ i3-7020U      8th Generation Intel® Core™ i5-8250U");
        System.out.println("             (3MB Cache, 2.30 GHz)                     (6MB Cache, up to 3.4GHz)");
        System.out.println("Memory:      4GB, DDR4, 2400MHz; up to 16GB            4GB, DDR4, 2400MHz; up to 16GB ");
        System.out.println("Hard Drive:  1TB 5400 rpm Hard Drive                   1TB 5400 rpm Hard Drive");
        System.out.println("Video Card:  AMD Radeon™ 520 Graphics with 2GB GDDR5   Intel® UHD Graphics 620");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        System.out.println("Enter the number of laptops you wish to purchase");
        q=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_3000();
            case 1:
            System.out.println("You purchased "+q+" Inspiron 15 3576(1) laptop priced Rs 33200");
            price[k]=34000;
            quantity[k]=q;
            name[k]="Inspiron 15 3576(1)";
            k++;
            break;
            case 2:
            System.out.println("You purchased "+q+" Inspiron 15 3576(2) laptop each priced Rs 34000");
            price[k]=44000;
            quantity[k]=q;
            name[k]="Inspiron 15 3576(2)";
            k++;
            break;
            default:
            wrongChoice();
            Inspiron_15_3576();
        }
        Inspiron_3000();
    }
    
    public void bill()
    {
        Controller c=new Controller();
        int i,l1,l2,l3,tc=0;
        String s1,s2;
        System.out.print("Name");
        c.space(4);
        System.out.print("Price per unit");
        c.space(14);
        System.out.print("Quantity");
        c.space(8);
        System.out.println("Total Cost");
        for(i=0;i<k;i++)
        {
            System.out.print(name[i]);
            l1=name[i].length();
            c.space(l1);
            System.out.print(c.rupee(price[i]));
            s1=Integer.toString(price[i]);
            l2=s1.length();
            c.space(l2);
            System.out.print(quantity[i]);
            s2=Integer.toString(quantity[i]);
            l3=s2.length();
            c.space(l3);
            System.out.println(c.rupee(price[i]*quantity[i]));
            tc=tc+(price[i]*quantity[i]);
        }
        System.out.print("Total Cost:");
        c.space(10);
        System.out.println(c.rupee(tc));
        System.out.println("*************Thanks for shopping with us*************");
        c.main();
    }

    public void wrongChoice()
    {
        System.out.println("Wrong Choice");
        System.out.println("Please Try Again");
    }
}