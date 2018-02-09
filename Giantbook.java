// Import MyUnionFind.java
import edu.princeton.cs.algs4.*;
import one.MyUnionFind;


public class Giantbook
{
    public static void main(String[] args)
    {
      // Generate u and v uniformly at random (how to specify how many to choose from?)
      /*Read from StdIn a number n, then n pairs of numbers u and v. An event happens
      at time i if it happens after i edges have been read*/
      int n = StdIn.readInt(); //Size of data structure
      int i = 0; //Number of edges that have been read
      int i_isolated = -1; // Number of edges read when no more isolated nodes
      int i_giant = -1; // Number of edges read when graph has a giant component
      int i_connected = -1; // Number of edges read when the graph is connected

      MyUnionFind uf = new MyUnionFind(n);

      while (!StdIn.isEmpty())
      {
        int p = StdIn.readInt();
        int q = StdIn.readInt();
        i++; // Increment number of edges
        if (uf.connected(p, q)) continue;
        uf.union(p, q);

        // Giant component emerges
        if (i_giant == -1 && uf.maxComponentSize() >= (n/2)) {
          i_giant = i;
        }

        // Isolated
        if (i_isolated == -1 && uf.isolated() == 0) {
          i_isolated = i;
        }

        // Connected
        if (i_connected == -1 && uf.count() == 1) {
          i_connected = i;
          break;

        }
      }

      /* The output of your program is a single line with four numbers:
      n, the number of vertices (that's how we can use it for a plot)
      the first time the graph has no more isolated vertices
      the first time that the graph has a giant component
      the first time that the graph is connected. */
      StdOut.println("Number of components: "+ n + " \nNumber of random connections before connected: " + i_connected + " \nNumber of components: " + uf.count());
      StdOut.println("Max component size: " + uf.maxComponentSize());
      StdOut.println("Number of rand connections before giant component: " + i_giant);
      StdOut.println("Number of rand connections before non-isolated: " + i_isolated);

    }








}
