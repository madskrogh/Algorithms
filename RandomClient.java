import edu.princeton.cs.algs4.*;

public class RandomClient {

  public static void main(String[] args) {
    int n = StdIn.readInt(); // Pick from a uniform(0,n) distribution
    //int t = StdIn.readInt(); // Number of times to repeat the experiment
    int[] a = new int[6*n]; // Array for holding u and v, twice


    for (int i=0; i<(6*n); i++) {
      a[i] = StdRandom.uniform(n);
    }


    StdOut.println(n);
    /*while (true) StdOut.println(StdRandom.uniform(n));
    */

    for (int i=0; i<(6*n); i++) {
      StdOut.println(a[i]);
    }
  }
}

// Takes stdinput how big a uniform distribution to pick from
//Outputs a stream that can be piped into Giantbook.java
//OR
//Calls Giantbook N times and collects the results

//Data structure for holding the u and v values
//Data structure for holding the results
