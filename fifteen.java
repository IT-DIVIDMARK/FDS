import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide 5 numbers as command line arguments.");
            return;
        }

        Arrays.stream(args)
                .mapToInt(Integer::parseInt)
                .sorted()
                .forEach(System.out::println);
    }
}
/*
 @FunctionalInterface
interface Cube {
    int calculate(int num);
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its cube: ");
        int num = sc.nextInt();

        Cube cube = num -> num * num * num;
        System.out.println("Cube of " + num + ": " + cube.calculate(num));
    }
}
 */
/*import java.util.Arrays;
import java.util.Scanner;
class CricketPlayer {
    String name;
    int noOfInnings;
    int noOfTimesNotout;
    int totalRuns;
    double batAvg;

    CricketPlayer(String name, int noOfInnings, int noOfTimesNotout, int totalRuns) {
        this.name = name;
        this.noOfInnings = noOfInnings;
        this.noOfTimesNotout = noOfTimesNotout;
        this.totalRuns = totalRuns;
        this.batAvg = avg(noOfInnings, noOfTimesNotout, totalRuns);
    }

    static double avg(int noOfInnings, int noOfTimesNotout, int totalRuns) {
        if (noOfInnings == 0) return 0;
        return (double) totalRuns / (noOfInnings - noOfTimesNotout);
    }

    static void sort(CricketPlayer[] players) {
        Arrays.sort(players, (p1, p2) -> Double.compare(p2.batAvg, p1.batAvg));
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("No of Innings: " + noOfInnings);
        System.out.println("No of Times Notout: " + noOfTimesNotout);
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Batting Average: " + batAvg);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int n = sc.nextInt();

        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter player details for player " + (i + 1));
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter no of innings: ");
            int noOfInnings = sc.nextInt();
            System.out.print("Enter no of times notout: ");
            int noOfTimesNotout = sc.nextInt();
            System.out.print("Enter total runs: ");
            int totalRuns = sc.nextInt();

            players[i] = new CricketPlayer(name, noOfInnings, noOfTimesNotout, totalRuns);
        }

        CricketPlayer.sort(players);

        System.out.println("Player Details in Sorted Order:");
        for (CricketPlayer player : players) {
            player.display();
            System.out.println();
        }
    }
}
*/