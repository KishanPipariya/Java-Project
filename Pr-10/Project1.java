import java.util.Scanner;
 class Project1
{
    int catg,comp,mode,var,budget,p;
    Scanner sc=new Scanner(System.in);
    public static void main()
    {
        System.out.println("Welcome");
        Project1 obj=new Project1();
        obj.budget();
    }
    public void budget()
    {
        budget=sc.nextInt();
        catg();
    }
    public void catg()
    {
        System.out.println("Enter 1 to view our range of laptops");
        System.out.println("Enter 2 to exit");
        catg=sc.nextInt();
        switch(catg)
        {
             case 1:
             Laptop();
             break;
             case 2:
             bill();
             break;
        } 
    }
    public void Laptop()
    {
        System.out.println("You are viewing the laptop section");
        System.out.println("We sell laptops made by following manufactures:");
        System.out.println("1.Alienware");
        System.out.println("2.Dell");
        System.out.println("3.Exit to view the categories");
        comp=sc.nextInt();
        switch(comp)
        {
            case 1:
            Alienware();
            break;
            case 2:
            Dell();
            break;
            case 3:
            catg();
            break;
        }
    }
    public void Alienware()
    {
        System.out.println("We possess the following models of Alienware");
        System.out.println("1.Alienware 13");
        System.out.println("2.Exit to laptop section");
        mode=sc.nextInt();
        switch(mode)
        {
            case 1:
            Alienware_13();
            break;
            case 2:
            Laptop();
            break;
        }
    }
    public void Alienware_13()
    {
        System.out.println("We have the following four variants");
        System.out.println("              Variant 1                                                  Variant 2                                                       Variant 3                                                          Variant 4                                                       Variant 5                                                      Variant 6");
        System.out.println("Price         Rs 75000                                                   Rs 98000                                                        Rs 118000                                                          Rs 144000                                                       Rs 174000                                                      227000"     );
        System.out.println("Processor     7th Generation Intel® Core™ i5-7300HQ                      7th Generation Intel® Core™ i7-7700HQ                          7th Generation Intel® Core™ i7-7700HQ                              7th Generation Intel® Core™ i7-7700HQ                           7th Generation Intel® Core™ i7-7700HQ                         7th Generation Intel® Core™ i7-7700HQ          ");
        System.out.println("              (Quad-Core, 6MB Cache,up to 3.5GHz w/ Turbo Boost)         (Quad-Core, 6MB Cache, up to 3.8GHz w/ Turbo Boost)             (Quad-Core, 6MB Cache, up to 3.8GHz w/ Turbo Boost)                (Quad-Core, 6MB Cache, up to 3.8GHz w/ Turbo Boost)             (Quad-Core, 6MB Cache, up to 3.8GHz w/ Turbo Boost)            (Quad-Core, 6MB Cache, up to 3.8GHz w/ Turbo Boost)         ");
        System.out.println("Memory        8GB DDR4 at 2400MHz (1x8GB)                                 8GB DDR4 at 2400MHz (1x8GB)                                    16GB DDR4 at 2400MHz (2x8GB)                                       16GB DDR4 at 2666MHz (2x 8GB)                                   32GB DDR4 at 2400MHz (2x16GB)                                  32GB DDR4 at 2400MHz (2x16GB)");
        System.out.println("Hard Drive    256GB PCIe SSD (Boot)                                       256GB PCIe SSD (Boot)                                          256GB PCIe SSD (Boot)                                              512GB PCIe SSD (Boot)                                           1TB PCIe SSD (Boot)                                            1TB PCIe SSD (Boot) + 1TB PCIe SSD "); 
        System.out.println("Video Card    NVIDIA® GeForce® GTX 1050Ti with 2GB GDDR5                  NVIDIA® GeForce® GTX 1060 with 6GB GDDR5                       NVIDIA® GeForce® GTX 1060 with 6GB GDDR5                           NVIDIA® GeForce® GTX 1060 with 6GB GDDR5                        NVIDIA® GeForce® GTX 1060 with 6GB GDDR5                       NVIDIA® GeForce® GTX 1060 with 6GB GDDR5");
        var=sc.nextInt();
        switch(var)
        {
            case 1:
            System.out.println("You purchased a Alienware 13 laptop costing Rs 75000");
            p=75000;
            break;            
        }
        budget=budget-p;
        Alienware();
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
            Laptop();
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
        System.out.println("The program is successfull "+budget);
    }
}