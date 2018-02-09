import edu.princeton.cs.algs4.*;

public class RandomClient {

  public static void main(String[] args) {
    int n = StdIn.readInt(); // Pick from a uniform(0,n) distribution
    //int t = StdIn.readInt(); // Number of times to repeat the experiment
    int[] a = new int[10*n]; // Array for holding u and v, twice

    // Initialize array
    for (int i=0; i<(10*n); i++) {
      a[i] = StdRandom.uniform(n);
    }

    // Print to StdOut
    StdOut.println(n);
    for (int i=0; i<(10*n); i++) {
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
