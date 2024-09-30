/*public class Employee {
    private int id;
    private String name;
    private String deptName;
    private double salary;

    private static int objectCount = 0;


    public Employee() {
        this.id = 0;
        this.name = "";
        this.deptName = "";
        this.salary = 0.0;
        objectCount++;
    }


    public Employee(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        objectCount++;
    }


    public static int getObjectCount() {
        return objectCount;
    }


    public void displayDetails() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.deptName);
        System.out.println("Salary: $" + this.salary);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "John Doe", "IT", 50000.0);
        System.out.println("Object count: " + Employee.getObjectCount());
        emp1.displayDetails();

        Employee emp2 = new Employee(2, "Jane Smith", "HR", 60000.0);
        System.out.println("Object count: " + Employee.getObjectCount());
        emp2.displayDetails();

        Employee emp3 = new Employee(3, "Mike Johnson", "Finance", 55000.0);
        System.out.println("Object count: " + Employee.getObjectCount());
        emp3.displayDetails();
    }
}*/
import java.util.Arrays;

public class CricketPlayer {
    private String name;
    private int noOfInnings;
    private int noOfTimesNotOut;
    private int totalRuns;
    private double batAvg;

    public CricketPlayer(String name, int noOfInnings, int noOfTimesNotOut, int totalRuns) {
        this.name = name;
        this.noOfInnings = noOfInnings;
        this.noOfTimesNotOut = noOfTimesNotOut;
        this.totalRuns = totalRuns;
        this.batAvg = avg(noOfInnings, noOfTimesNotOut, totalRuns);
    }

    public static double avg(int noOfInnings, int noOfTimesNotOut, int totalRuns) {
        return (double) totalRuns / (noOfInnings - noOfTimesNotOut);
    }

    public static void sort(CricketPlayer[] players) {
        Arrays.sort(players, (p1, p2) -> Double.compare(p2.batAvg, p1.batAvg));
    }

    public static void displayPlayers(CricketPlayer[] players) {
        for (CricketPlayer player : players) {
            System.out.println("Name: " + player.name + ", Batting Average: " + player.batAvg);
        }
    }

    public static void main(String[] args) {
        CricketPlayer[] players = new CricketPlayer[5]; // assume 5 players

        players[0] = new CricketPlayer("Player1", 10, 2, 300);
        players[1] = new CricketPlayer("Player2", 12, 3, 400);
        players[2] = new CricketPlayer("Player3", 8, 1, 200);
        players[3] = new CricketPlayer("Player4", 15, 4, 500);
        players[4] = new CricketPlayer("Player5", 9, 2, 250);

        sort(players);
        displayPlayers(players);
    }
}