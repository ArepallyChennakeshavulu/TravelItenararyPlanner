
import java.util.ArrayList;
import java.util.Scanner;

class Destination {
    private String name;
    private String startDate;
    private String endDate;
    private String preferences;
    private double budget;

    public Destination(String name, String startDate, String endDate, String preferences, double budget) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.preferences = preferences;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getPreferences() {
        return preferences;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return String.format("Destination: %s\nStart Date: %s\nEnd Date: %s\nPreferences: %s\nBudget: %.2f\n", 
                             name, startDate, endDate, preferences, budget);
    }
}

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Destination> itinerary = new ArrayList<>();

        System.out.println("Welcome to the Travel Itinerary Planner!");

        while (true) {
            System.out.print("Enter destination name (or type 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter start date (YYYY-MM-DD): ");
            String startDate = scanner.nextLine();

            System.out.print("Enter end date (YYYY-MM-DD): ");
            String endDate = scanner.nextLine();

            System.out.print("Enter preferences (e.g., sightseeing, adventure, relaxation): ");
            String preferences = scanner.nextLine();

            System.out.print("Enter estimated budget: ");
            double budget = scanner.nextDouble();
            scanner.nextLine(); 

            itinerary.add(new Destination(name, startDate, endDate, preferences, budget));
        }

        System.out.println("\nYour Travel Itinerary:");
        double totalBudget = 0;
        for (Destination dest : itinerary) {
            System.out.println(dest);
            totalBudget += dest.getBudget();
        }
        System.out.printf("Total Estimated Budget: %.2f\n", totalBudget);

        scanner.close();
    }
}
