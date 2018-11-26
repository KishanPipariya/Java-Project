import java.util.Scanner;
class Laptop
{
    static int catg,model,var,budget,p,comp,subSeries;
    Scanner sc=new Scanner(System.in);
    static int price[]=new int[214748];//It stores the price of laptop purchased by the user
    static int quantity[]=new int[214748];//It stores the quantity of a particular laptop purchased by the user
    static String name[]=new String[214748];//It stores the name of laptops purchased by the user
    static int k=0;//It is number of orders placed by user
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
        System.out.println("Press 9 to exit and print the bill");
        model=sc.nextInt();
        switch(model)
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
            case 9:
            bill();
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
        System.out.println("Press 9 to exit and print the bill");
        model=sc.nextInt();
        switch(model)
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
            case 9:
            bill();
            break;
            default: 
            wrongChoice();
            Alienware();
        }
    }

    public void Alienware_13()
    {
        System.out.println("We have the following 2 variants");
        System.out.println("             Variant 1                                            Variant 2");
        System.out.println("Price:        Rs 75000                                            Rs 98000"                                       );
        System.out.println("Processor:   7th Generation Intel® Core™ i5-7300HQ                7th Generation Intel® Core™ i7-7700HQ  ");            
        System.out.println("             (Quad-Core, 6MB Cache,up to 3.5GHz w/ Turbo Boost)   (Quad-Core, 6MB Cache, up to 3.8GHz w/ Turbo Boost)");
        System.out.println("Memory:      8GB DDR4 at 2400MHz (1x8GB)                          8GB DDR4 at 2400MHz (1x8GB)");
        System.out.println("Hard Drive:  256GB PCIe SSD (Boot)                                256GB PCIe SSD (Boot) ");                              
        System.out.println("Video Card:  NVIDIA® GeForce® GTX 1050Ti with 2GB GDDR5           NVIDIA® GeForce® GTX 1060 with 6GB GDDR5 ");
        System.out.println("Display:     13.3 QHD 2560x1440 OLED Technology,                  13.3 QHD 2560x1440 OLED Technology,");
        System.out.println("             Touch Technology with 400-nits Display               Touch Technology with 400-nits Display"); 
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Alienware();
            break;
            case 1:
            System.out.println("You have choosed Alienware 13(1) laptop priced at Rs 75000");
            price[k]=75000;
            name[k]="Alienware 13(1)";
            break;
            case 2:
            System.out.println("You have choosed Alienware 13(2) priced at Rs 98000");
            price[k]=98000;
            name[k]="Alienware 13(2)";
            break;
            default:
            wrongChoice();
            Alienware_13();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
        Alienware();
    }

    public void Alienware_15()
    {
        System.out.println("We have the folowing 2 variants");
        System.out.println("             Variant 1                                             Variant 2");
        System.out.println("Price:       Rs 93500                                              Rs 100000");
        System.out.println("Processor:   8th Generation Intel® Core™ i5-8300H                  8th Generation Intel® Core™ i7-8750H");
        System.out.println("             (Quad-Core, 8MB Cache, up to 4.0GHz w/ Turbo Boost)   (6-Core, 9MB Cache, up to 4.1GHz w/ Turbo Boost)");
        System.out.println("Memory:      8GB, DDR4, 2400MHz; up to 32GB                        16GB, DDR4, 2400MHz; up to 32GB  ");
        System.out.println("Hard Drive:  1TB 7200RPM HDD                                       128GB M.2 SATA SSD + 1TB 7200RPM SATA HDD");
        System.out.println("Video Card:  NVIDIA® GeForce® GTX 1060 with 6GB GDDR5              NVIDIA® GeForce® GTX 1060 with 6GB GDDR5");
        System.out.println("Display:     15.6 FHD (1920 x 1080) 60Hz IPS Display               15.6 FHD (1920 x 1080) 60Hz IPS Display ");
        System.out.println("                                                                   NVIDIA G-SYNC Enabled");               
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Alienware();
            break;
            case 1:
            System.out.println("You have choosed Alienware 15(1) laptop priced at Rs 93500");
            price[k]=93500;
            name[k]="Alienware 15(1)";
            break;
            case 2:
            System.out.println("You have choosed Alienware 15(2) laptop priced at Rs 100000");
            price[k]=100000;
            name[k]="Alienware 15(2)";
            break;
            default:
            wrongChoice();
            Alienware_15();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
        Alienware();
    }

    public void Alienware_17()
    {
        System.out.println("We have the folowing 2 variants");
        System.out.println("             Variant 1                                          Variant 2");
        System.out.println("Price:       Rs 104000                                          125000");
        System.out.println("Processor:   8th Generation Intel® Core™ i7-8750H               8th Generation Intel® Core™ i7-8750H ");
        System.out.println("             (6-Core, 9MB Cache, up to 4.1GHz w/ Turbo Boost)   6-Core, 9MB Cache, up to 4.1GHz w/ Turbo Boost)");
        System.out.println("Memory:      16GB, DDR4, 2400MHz; up to 32GB                    16GB, DDR4, 2400MHz; up to 32GB ");
        System.out.println("Hard Drive:  128GB M.2 SATA SSD + 1TB 7200RPM SATA HDD          256GB M.2 PCIe SSD + 1TB 7200RPM SATA HDD");
        System.out.println("Video Card:  NVIDIA® GeForce® GTX 1060 with 6GB GDDR5           NVIDIA® GeForce® GTX 1070 OC with 8GB GDDR5");
        System.out.println("Display:     17.3 FHD 1920x1080 60Hz                            7.3 inch FHD (1920 x 1080) 60Hz ");
        System.out.println("                                                                NVIDIA G-SYNC Enabled");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Alienware();
            break;
            case 1:
            System.out.println("You have choosed Alienware 17(1) laptop priced at Rs 104000");
            price[k]=104000;
            name[k]="Alienware 17(1)";
            break;
            case 2:
            System.out.println("You have choosed Alienware 17(2) laptop priced at Rs 125000");
            price[k]=125000;
            name[k]="Alienware 17(2)";
            break;
            default:
            wrongChoice();
            Alienware_17();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
        Alienware();
    } 

    public void Inspiron()
    {
        System.out.println("Inspiron has the following sub-series:");
        System.out.println("1.3000 series");
        System.out.println("2.5000 series");
        System.out.println("3.7000 series");
        System.out.println("Press 0 To Go Back To Dell Section");
        System.out.println("Press 9 to exit and print the bill");
        subSeries=sc.nextInt();
        switch(subSeries)
        {
            case 1:
            Inspiron_3000();
            break;
            case 2:
            Inspiron_5000();
            break;
            case 3:
            Inspiron_7000();
            case 0:
            Dell();
            break;
            case 9:
            bill();
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
        System.out.println("Press 9 to exit and print the bill");
        model=sc.nextInt();
        switch(model)
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
            case 9:
            bill();
            break;
            default:
            wrongChoice();
            Inspiron_3000();
        }
    }

    public void Inspiron_15_3573()
    {
        System.out.println("We sell the following variants:");
        System.out.println("             Inspiron 15 3573(1)               Inspiron 15 3573(2)");
        System.out.println("Price:       24300                             24800");
        System.out.println("Processor:   Intel® Celeron® Processor N4000   Intel® Pentium® Silver Processor N5000");
        System.out.println("             (4M Cache, up to 2.6 GHz)         (4MB Cache, up to 2.7 GHz)");
        System.out.println("Memory:      4GB, DDR4, 2400MHz; up to 8GB     4GB, DDR4, 2400MHz; up to 8GB ");
        System.out.println("Hard Drive:  1TB 5400 rpm Hard Drive           1TB 5400 rpm Hard Drive");
        System.out.println("Video Card:  Intel UHD Graphics 600            Intel UHD Graphics 605");
        System.out.println("Display:     15.6-inch HD (1366 x 768)         15.6-inch HD (1366 x 768) ");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_3000();
            break;
            case 1:
            System.out.println("You have choosed Inspiron 15 3573(1) laptop priced at Rs 24300");
            price[k]=24300;
            name[k]="Inspiron 15 3573(1)";
            break;
            case 2:
            System.out.println("You have choosed Inspiron 15 3573(2) laptop priced at Rs 24800");
            price[k]=24800;
            name[k]="Inspiron 15 3573(2)";
            break;
            default:
            wrongChoice();
            Inspiron_15_3573();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
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
        System.out.println("Display:     15.6-inch HD (1366 x 768)              15.6-inch HD (1366 x 768) Anti-Glare");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_3000();
            break;
            case 1:
            System.out.println("You have choosed Inspiron 15 3565(1) laptop priced at Rs 23800");
            price[k]=23800;
            name[k]="Inspiron 15 3565(1)";
            break;
            case 2:
            System.out.println("You have choosed Inspiron 15 3565(2) laptop priced at Rs 24900");
            price[k]=24900;
            name[k]="Inspiron 15 3565(2)";
            break;
            default:
            wrongChoice();
            Inspiron_15_3565();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
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
        System.out.println("Video Card:  Intel® HD Graphics 400             Intel® HD Graphics 405");
        System.out.println("Display:     15.6-inch HD (1366 x 768)          15.6-inch HD (1366 x 768)");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_3000();
            break;
            case 1:
            System.out.println("You have choosed Inspiron 15 3552(1) laptop priced at Rs 25200");
            price[k]=25200;
            name[k]="Inspiron 15 3552(1)";
            break;
            case 2:
            System.out.println("You have choosed Inspiron 15 3552(2) laptop priced at Rs 26300");
            price[k]=26300;
            name[k]="Inspiron 15 3552(2)";
            break;
            default:
            wrongChoice();
            Inspiron_15_3552();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
        Inspiron_3000();
    }

    public void Inspiron_15_3567()
    {
        System.out.println("We sell the following variants:");
        System.out.println("             Inspiron 15 3567(1)");
        System.out.println("Price:       Rs 33200                                Rs 34000");
        System.out.println("Processor:   6th Generation Intel® Core™ i3-6006U   7th Generation Intel® Core™ i3-7020U");
        System.out.println("             (3MB Cache, 2.00 GHz)                   (3MB Cache, 2.30 GHz)");
        System.out.println("Memory:      4GB, 2400MHz, DDR4; up to 16GB          4GB, 2400MHz, DDR4; up to 16GB ");
        System.out.println("Hard Drive:  1TB 5400 rpm Hard Drive                 1TB 5400 rpm Hard Drive");
        System.out.println("Video Card:  Intel® HD Graphics 520                  Intel® HD Graphics 620 ");
        System.out.println("Display:     15.6-inch FHD (1920 x1080)              15.6-inch FHD (1920 x1080)");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_3000();
            break;
            case 1:
            System.out.println("You have choosed Inspiron 15 3567(1) laptop priced at Rs 33200");
            price[k]=33200;
            name[k]="Inspiron 15 3567(1)";
            break;
            case 2:
            System.out.println("You have choosed Inspiron 15 3567(2) laptop priced at Rs 34000");
            price[k]=34000;
            name[k]="Inspiron 15 3567(2)";
            break;
            default:
            wrongChoice();
            Inspiron_15_3567();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
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
        System.out.println("Display:     15.6-inch FHD (1920 x1080)                15.6-inch FHD (1920 x1080)");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_3000();
            break;
            case 1:
            System.out.println("You have choosed Inspiron 15 3576(1) laptop priced at Rs 33200");
            price[k]=34000;
            name[k]="Inspiron 15 3576(1)";
            break;
            case 2:
            System.out.println("You have choosed Inspiron 15 3576(2) laptop priced at Rs 34000");
            price[k]=44000;
            name[k]="Inspiron 15 3576(2)";
            break;
            default:
            wrongChoice();
            Inspiron_15_3576();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
        Inspiron_3000();
    }

    public void Inspiron_5000()
    {
        System.out.println("We possess the following models of Inspiron 5000 series:");
        System.out.println("1.Inspiron 13 5370");
        System.out.println("2.Inspiron 15 5570");
        System.out.println("3.Inspiron 15 5575");
        System.out.println("4.Inspiron 14 5480");
        System.out.println("5.Inspiron 15 5580");
        System.out.println("Press 0 To Go Back To Inspiron Series");
        System.out.println("Press 9 to exit and print the bill");
        model=sc.nextInt();
        switch(model)
        {
            case 1:
            Inspiron_13_5370();
            break;
            case 2:
            Inspiron_15_5570();
            break;
            case 3:
            Inspiron_15_5575();
            break;
            case 4:
            Inspiron_14_5480();
            break;
            case 5:
            Inspiron_15_5580();
            case 0:
            Inspiron();
            break;
            case 9:
            bill();
            break;
            default:
            wrongChoice();
            Inspiron_5000();
        }
    }

    public void Inspiron_13_5370()
    {
        System.out.println("We sell the following variant:");
        System.out.println("             Inspiron 13 5370");
        System.out.println("Price:       Rs 57400");
        System.out.println("Processor:   8th Generation Intel® Core™ i5-8250U");
        System.out.println("             (6MB Cache, up to 3.4 GHz)");
        System.out.println("Memory:      8GB, DDR4, 2400MHz, up to 32GB ");
        System.out.println("Hard Drive:  256GB Solid State Drive");
        System.out.println("Video Card:  Intel® UHD Graphics 620");
        System.out.println("Display:     13.3-inch FHD (1920 x 1080)");
        System.out.println("Enter 1 to purchase the first one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_5000();
            break;
            case 1:
            System.out.println("You have choosed Inspiron 13 5370 laptop priced at Rs 57400");
            price[k]=57400;
            name[k]="Inspiron 13 5370";
            break;
            default:
            wrongChoice();
            Inspiron_13_5370();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
        Inspiron_5000();
    }

    public void Inspiron_15_5570()
    {
        System.out.println("We sell the following variant:");
        System.out.println("             Inspiron 15 5570");
        System.out.println("Price:       Rs 38300");
        System.out.println("Processor:   8th Generation Intel® Core™ i3-8130U(");
        System.out.println("             4MB Cache, up to 3.40 GHz)");
        System.out.println("Memory:      20GB Memory: 4GB 2400MHz DDR4 DRAM + 16GB Intel® Optane™ Memory");
        System.out.println("Hard Drive:  1TB 5400 rpm Hard Drive");
        System.out.println("Video Card:  Intel® HD graphics 620");
        System.out.println("Display:     15.6-inch FHD (1920 x 1080)");
        System.out.println("Enter 1 to purchase the first one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_5000();
            break;
            case 1:
            System.out.println("You have choosed Inspiron 15 5570 laptop priced at Rs 38300");
            price[k]=38300;
            name[k]="Inspiron 15 5570";
            break;
            default:
            wrongChoice();
            Inspiron_15_5570();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
        Inspiron_5000();
    }

    public void Inspiron_15_5575()
    {
        System.out.println("We sell the following variants:");
        System.out.println("             Inspiron 15 5575(1)                Inspiron 15 5575(2)");
        System.out.println("Price:       Rs 36900                           Rs 37400");
        System.out.println("Processor:   AMD Ryzen™ 3 2200U                 AMD Ryzen™ 3 2200U");
        System.out.println("             with Radeon™ Vega3 Graphics        with Radeon™ Vega3 Graphics");
        System.out.println("Memory:      4GB, DDR4, 2400MHz, up to 32GB     4GB, DDR4, 2400MHz, up to 32GB");
        System.out.println("Hard Drive:  1TB 5400 rpm Hard Drive            1TB 5400 rpm Hard Drive");
        System.out.println("Video Card:  Integrated graphics with AMD APU   Integrated graphics with AMD APU");
        System.out.println("Display:     15.6-inch HD (1366 x 768)          15.6-inch FHD (1920 x 1080)");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_5000();
            break;
            case 1:
            System.out.println("You have choosed Inspiron 15 5575(1) laptop priced at Rs 36900");
            price[k]=36900;
            name[k]="Inspiron 15 5575(1)";
            break;
            case 2:
            System.out.println("You have choosed Inspiron 15 5575(2) laptop priced at Rs 37400");
            price[k]=37400;
            name[k]="Inspiron 15 5575(2)";
            break;
            default:
            wrongChoice();
            Inspiron_15_5575();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
        Inspiron_5000();
    }

    public void Inspiron_14_5480()
    {
        System.out.println("We sell the following variants:");
        System.out.println("             Inspiron 14 5480(1)                    Inspiron 14 5480(2)");
        System.out.println("Price:       Rs 37000                               Rs 50000");
        System.out.println("Processor:   8th Generation Intel® Core™ i3-8145U   8th Generation Intel® Core™ i5-8265U");
        System.out.println("             (4MB Cache, up to 3.9 GHz)             (6MB Cache, up to 3.9 GHz)");
        System.out.println("Memory:      4GB 4GBx1 DDR4 2666MHz                 8GB, 2x4GB, DDR4, 2666MHz");
        System.out.println("Hard Drive:  1TB 5400 rpm 2.5 SATA Hard Drive       1TB 5400 rpm 2.5 SATA Hard Drive");
        System.out.println("Video Card:  Intel® UHD Graphics 620                Intel® UHD Graphics 620");
        System.out.println("Display:     14.0-inch FHD (1920 x 1080)            14.0-inch FHD (1920 x 1080)");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_5000();
            break;
            case 1:
            System.out.println("You have choosed Inspiron 14 5480(1) laptop priced at Rs 37000");
            price[k]=37000;
            name[k]="Inspiron 14 5480(1)";
            break;
            case 2:
            System.out.println("You have choosed Inspiron 14 5480(2) laptop priced at Rs 50000");
            price[k]=50000;
            name[k]="Inspiron 14 5480(2)";
            break;
            default:
            wrongChoice();
            Inspiron_14_5480();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
        Inspiron_5000();
    }

    public void Inspiron_15_5580()
    {
        System.out.println("We sell the following variants:");
        System.out.println("             Inspiron 15 5580(1)                    Inspiron 15 5580(2)");
        System.out.println("Price:       Rs 38000                               Rs 55000");
        System.out.println("Processor:   8th Generation Intel® Core™ i3-8145U   8th Generation Intel® Core™ i5-8265U ");
        System.out.println("             (4MB Cache, up to 3.9 GHz)             (6MB Cache, up to 3.9 GHz)");
        System.out.println("Memory:      4GB 4GBx1 DDR4 2666MHz                 8GB 8Gx1 DDR4, 2666MHz");
        System.out.println("Hard Drive:  1TB 5400 rpm 2.5 SATA Hard Drive       2TB 5400 rpm 2.5 SATA Hard Drive");
        System.out.println("Video Card:  Intel® UHD Graphics 620                Intel® UHD Graphics 620");
        System.out.println("Display:     15.6-inch FHD (1920 x 1080)            15.6-inch FHD (1920 x 1080) ");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_5000();
            break;
            case 1:
            System.out.println("You have choosed Inspiron 15 5580(1) laptop priced at Rs 38000");
            price[k]=38000;
            name[k]="Inspiron 15 5580(1)";
            break;
            case 2:
            System.out.println("You have choosed Inspiron 14 5580(2) laptop priced at Rs 55000");
            price[k]=55000;
            name[k]="Inspiron 14 5580(2)";
            break;
            default:
            wrongChoice();
            Inspiron_15_5580();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
        Inspiron_5000();
    }

    public void Inspiron_7000()
    {
        System.out.println("We possess the following models of Inspiron 5000 series:");
        System.out.println("1.Inspiron 13 7380");
        System.out.println("2.Inspiron 15 7572");
        System.out.println("Press 0 To Go Back To Inspiron Series");
        System.out.println("Press 9 to exit and print the bill");
        model=sc.nextInt();
        switch(model)
        {
            case 1:
            Inspiron_13_7380();
            break;
            case 2:
            Inspiron_15_7572();
            break;
            case 0:
            Inspiron();
            break;
            case 9:
            bill();
            break;
            default:
            wrongChoice();
            Inspiron_7000();
        }
    }

    public void Inspiron_13_7380()
    {
        System.out.println("We sell the following variants:");
        System.out.println("             Inspiron 13 7380(1)                     Inspiron 13 7380(2)");
        System.out.println("Price:       Rs 74000                                Rs 90600");
        System.out.println("Processor:   8th Generation Intel® Core™ i5-8265U    8th Generation Intel® Core™ i7-8565U");
        System.out.println("             (6MB Cache, up to 3.9 GHz)              (8MB Cache, up to 4.6 GHz)");
        System.out.println("Memory:      8GB, onboard, DDR4, 2400MHz             16GB, onboard, DDR4, 2400MHz");
        System.out.println("Hard Drive:  512GB M.2 PCIe NVMe Solid State Drive   512GB M.2 PCIe NVMe Solid State Drive");
        System.out.println("Video Card:  Intel® UHD Graphics 620                 Intel® UHD Graphics 620");
        System.out.println("Display:     13.3-inch FHD (1920 x 1080)             13.3-inch FHD (1920 x 1080)");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_7000();
            break;
            case 1:
            System.out.println("You have choosed Inspiron 13 7380(1) laptop priced at Rs 74000");
            price[k]=74000;
            name[k]="Inspiron 13 7380(1)";
            break;
            case 2:
            System.out.println("You have choosed Inspiron 13 7380(2) laptop priced at Rs 90600");
            price[k]=90600;
            name[k]="Inspiron 13 7380(2)";
            break;
            default:
            wrongChoice();
            Inspiron_13_7380();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
        Inspiron_7000();
    }

    public void Inspiron_15_7572()
    {
        System.out.println("We sell the following variants:");
        System.out.println("             Inspiron 15 7572(1)                          Inspiron 15 7572(1)");
        System.out.println("Price        Rs 63000                                     Rs 73000");
        System.out.println("Processor    8th Generation Intel® Core™ i5-8250U         8th Generation Intel® Core™ i7-8550U ");
        System.out.println("             (6MB Cache, up to 3.4GHz)                    (8MB Cache, up to 4.0 GHz)");
        System.out.println("Memory:      8GB, DDR4, 2400MHz; up to 16GB               8GB, DDR4, 2400MHz; up to 16GB ");
        System.out.println("Hard Drive:  Dual drives with 128GB Solid State Drive +   Dual drives with 128GB Solid State Drive +");
        System.out.println("             1TB 5400 rpm Hard Drive                      1TB 5400 rpm Hard Drive");
        System.out.println("Video Card:  NVIDIA® GeForce® MX150                       NVIDIA® GeForce® MX150 ");
        System.out.println("             with 4GB GDDR5 graphics memory               with 4GB GDDR5 graphics memory");
        System.out.println("Display:     15.6-inch FHD (1920 x 1080)                  15.6-inch FHD (1920 x 1080)");
        System.out.println("Enter 1 to purchase the first one,Enter 2 to purchase the second one,Else enter 0 to go back");
        var=sc.nextInt();
        switch(var)
        {
            case 0:
            Inspiron_7000();
            break;
            case 1:
            System.out.println("You have choosed Inspiron 15 7572(1) laptop priced at Rs 63000");
            price[k]=63000;
            name[k]="Inspiron 15 7572(1)";
            break;
            case 2:
            System.out.println("You have choosed Inspiron 15 7572(2) laptop priced at Rs 73000");
            price[k]=73000;
            name[k]="Inspiron 15 7572(2)";
            break;
            default:
            wrongChoice();
            Inspiron_15_7572();
        }
        System.out.println("Enter the number of laptops you wish to purchase");
        quantity[k]=sc.nextInt();
        purchase(name[k],quantity[k]);
        k++;
        Inspiron_7000();
    }

    public void bill()//This function prints the bill
    {
        ElectronicsShop e=new ElectronicsShop();
        int i,l1,l2,l3,tc=0;
        String s1,s2;
        System.out.println("Bill:");
        e.date();
        System.out.print("Name");
        e.space(4);
        System.out.print("Price per unit");
        e.space(14);
        System.out.print("Quantity");
        e.space(8);
        System.out.println("Total Cost");
        for(i=0;i<k;i++)
        {
            System.out.print(name[i]);
            l1=name[i].length();
            e.space(l1);
            System.out.print(e.rupee(price[i]));
            l2=(e.rupee(price[i])).length();
            e.space(l2);
            System.out.print(quantity[i]);
            s2=Integer.toString(quantity[i]);
            l3=s2.length();
            e.space(l3);
            System.out.println(e.rupee(price[i]*quantity[i]));
            tc=tc+(price[i]*quantity[i]);
        }
        System.out.println();
        System.out.print("Total Cost:");
        e.space(11);
        System.out.println(e.rupee(tc));
        System.out.println("*************Thanks for shopping with us*************");
        e.main();
    }

    public void wrongChoice()
    {
        System.out.println("Wrong Choice");
        System.out.println("Please Try Again");
    }
    
    public void purchase(String s,int q)//This function display the user's order
    {
        System.out.println("You have purchased "+q+" "+s+" laptop" );
    }
}































