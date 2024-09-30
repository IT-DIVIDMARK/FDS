/*
class Continent {
  private String name;

  public Continent(String name) {
    this.name = name;
  }

  public String getContinent() {
    return name;
  }
}

class Country extends Continent {
  private String name;

  public Country(String continentName, String countryName) {
    super(continentName);
    this.name = countryName;
  }

  public String getCountry() {
    return name;
  }
}


class State extends Country {
  private String name;

  public State(String continentName, String countryName, String stateName) {
    super(continentName, countryName);
    this.name = stateName;
  }

  public String getState() {
    return name;
  }

  public void displayPlace() {
    System.out.println("Continent: " + getContinent());
    System.out.println("Country: " + getCountry());
    System.out.println("State: " + getState());
  }
}


public class Main {
  public static void main(String[] args) {
    State state = new State("Asia", "India", "Maharashtra");
    state.displayPlace();
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