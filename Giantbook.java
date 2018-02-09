// Import MyUnionFind.java
import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Giantbook
{
    public static void main(String[] args)
    {
      // Generate u and v uniformly at random (how to specify how many to choose from?)
      /*Read from StdIn a number n, then n pairs of numbers u and v. An event happens
      at time i if it happens after i edges have been read*/
      int n = StdIn.readInt(); //Size of data structure
      //int t = StdIn.readInt(); // Number of times to repeat experiment
      //int[] a; // u and v array
      int i = 0; //Number of edges that have been read
      int i_isolated = -1; // Number of edges read when no more isolated nodes
      int i_giant = -1; // Number of edges read when graph has a giant component
      int i_connected = -1; // Number of edges read when the graph is connected

      WeightedQuickUnionUF uf = new WeightedQuickUnionUF(n);
      //Commejgkls
      while (!StdIn.isEmpty())
      {
        int p = StdIn.readInt();
        int q = StdIn.readInt();
        i++; // Increment number of edges
        if (uf.connected(p, q)) continue;
        uf.union(p, q);
        if (uf.count() == 1) i_connected = i; // Check if the graph is connected
      }

      /* The output of your program is a single line with four numbers:
      n, the number of vertices (that's how we can use it for a plot)
      the first time the graph has no more isolated vertices
      the first time that the graph has a giant component
      the first time that the graph is connected. */
      StdOut.println("Number of components: "+ n + " \nNumber of random connections before connected: " + i_connected + " \nNumber of components: " + uf.count());
    }








}
