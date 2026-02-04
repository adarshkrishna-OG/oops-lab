import java.util.Scanner;
class CPU {
    int price;
    int ram;
    class Processor {
        int cores;
        String manufacturer;
        void displayProcessorInfo() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }
    void displayCPUInfo() {
        System.out.println("CPU Price: " + price);
        System.out.println("RAM: " + ram + " GB");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CPU cpu = new CPU();
        System.out.print("Enter CPU price: ");
        cpu.price = sc.nextInt();
        System.out.print("Enter RAM size (in GB): ");
        cpu.ram = sc.nextInt();
        CPU.Processor processor = cpu.new Processor();
        System.out.print("Enter number of processor cores: ");
        processor.cores = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter processor manufacturer: ");
        processor.manufacturer = sc.nextLine();
        System.out.println("\n--- CPU DETAILS ---");
        cpu.displayCPUInfo();
        System.out.println("\n--- PROCESSOR DETAILS ---");
        processor.displayProcessorInfo();
        sc.close();
    }
}