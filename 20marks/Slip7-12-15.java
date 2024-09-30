// Slip No : 7, 12, 15
// Define a class CricketPlayer (name,no_of_innings,no_of_times_notout,
// totatruns, bat_avg). Create an array of n player objects .Calculate the
// batting average for each player using static method avg(). Define a static
// sort method which sorts the array on the basis of average. Display the
// player details in sorted order.
// =>
import java.io.*;
import java.util.*;
class Cricket {
String name;
int innings, notOuts, totalRuns;
float batAvg;
public Cricket(String name, int innings, int notOuts, int totalRuns) {
this.name = name;
this.innings = innings;
this.notOuts = notOuts;
this.totalRuns = totalRuns;
this.batAvg = innings != 0 ? (float) totalRuns / innings : 0;
}
public static void sortAndDisplay(Cricket[] players) {
Arrays.sort(players, (a, b) -> Float.compare(b.batAvg, a.batAvg));
for (Cricket player : players) {
System.out.printf("Name=%s, Innings=%d, NotOuts=%d,
TotalRuns=%d, BatAvg=%.2f%n", player.name,
player.innings, player.notOuts, player.totalRuns,
player.batAvg);
}
}
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new
InputStreamReader(System.in));
System.out.print("Enter the number of players: ");
int n = Integer.parseInt(br.readLine());
Cricket[] players = new Cricket[n];
for (int i = 0; i < n; i++) {
System.out.println("Enter name, innings, not outs, total runs:");
String name = br.readLine();
int innings = Integer.parseInt(br.readLine());
int notOuts = Integer.parseInt(br.readLine());
int totalRuns = Integer.parseInt(br.readLine());
players[i] = new Cricket(name, innings, notOuts, totalRuns);
}
Cricket.sortAndDisplay(players);
}
}
// javac Cricket.java
// java Cricket