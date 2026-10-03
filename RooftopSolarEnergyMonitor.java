import java.util.Scanner;

public class RooftopSolarEnergyMonitor {

    
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
        // 2a: Data Types
        int panelId = 101;
        double energyGenerated = 12.5;
        int numberOfPanels = 20;
        char systemStatus = 'A';

        System.out.println("----- Solar System Details -----");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);

        
        
        // 2b: If-Else Condition
        System.out.println("\n----- Energy Monitoring -----");
        System.out.print("Enter energy generated in kWh: ");
        double energy = sc.nextDouble();

        if (energy >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        // 2c: Method
        System.out.println("\n----- Total Energy Calculation -----");
        System.out.print("Enter morning energy in kWh: ");
        double morningEnergy = sc.nextDouble();

        System.out.print("Enter evening energy in kWh: ");
        double eveningEnergy = sc.nextDouble();

        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        sc.close();
    }
}
