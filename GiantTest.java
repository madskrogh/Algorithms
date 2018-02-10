import one.cGiantBook;
import edu.princeton.cs.algs4.*;

public class GiantTest {
  public static void main(String[] args) {
    int n = StdIn.readInt();
    cGiantBook gb = new cGiantBook(n);

    //public int[] a;

    //number of times experiment is repeated
    int runs = 10;

    //counter
    int count = 0;

    int t = 20*n;

    double[][] results  = new double[runs][4];
    double[] giant_count = new double[runs];
    double[] nonisolated_count = new double[runs];
    double[] connected_count = new double[runs];

    //calls and runs experiment count times
    while(runs > count) {
      //stores result in results (array of arrays)
      results[count] = gb.run();
      //N is specified at first run
      if(count == 0) {
        results[0][0] = n;
      }
      //arrays are populated
      giant_count[count] = results[count][1];
      nonisolated_count[count] = results[count][2];
      connected_count[count] = results[count][3];
      count++;
    }
    //mean and stddev for each event is calculated
    double giant_mean = StdStats.mean(giant_count);
    double giant_stddev = StdStats.stddev(giant_count);

    double nonisolated_stddev = StdStats.stddev(nonisolated_count);
    double nonisolated_mean = StdStats.mean(nonisolated_count);

    double connected_stddev = StdStats.stddev(connected_count);
    double connected_mean = StdStats.mean(connected_count);

    //Outputs results
    StdOut.println("N: " + n);
    StdOut.println("T: " + t);
    StdOut.println("number of experiments: " + runs);

    StdOut.println("Giant mean: " + giant_mean);
    StdOut.println("Giant standard deviation: " + giant_stddev);

    StdOut.println("Nonisolated mean: " + nonisolated_mean);
    StdOut.println("Nonisolated standard deviation: " + nonisolated_stddev);

    StdOut.println("Connected mean: " + connected_mean);
    StdOut.println("Connected standard deviation: " + connected_stddev);


  }
}
