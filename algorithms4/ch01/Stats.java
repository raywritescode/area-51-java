// Stats.java
// 
// Adapted from Algorithms, 4th Edition by Sedgewick and Wayne
// Chapter 1, Section 1.3, page 125
//
// Requires classes Bag.java, StdIn.java, StdOut.java to be in same
// folder where Stats.java is located.
//
// Official locations of those external classes are:
//    http://introcs.cs.princeton.edu/java/stdlib/
//    http://algs4.cs.princeton.edu/13stacks/Bag.java.html
//
// Ray Santos
// September 3, 2014
//
// Example run:
// 
//    % java Stats
//    100 99 101 120 98 107 109 81 101 90
//
//    Mean: 100.60
//    Std dev: 10.51

import java.util.Iterator;

public class Stats
{
   public static void main(String[] args)
   {

      StdOut.printf("\nEnter a series of numbers, each separated by a space.\n");
      StdOut.printf("Press Enter after the last number and then press Ctrl-D\n");
      StdOut.printf("to view the Mean the Standard Deviation calculations.\n\n");

      Bag<Double> numbers = new Bag<Double>();
     
      while (!StdIn.isEmpty())
         numbers.add(StdIn.readDouble());
      int N = numbers.size();

      double sum = 0.0;
      for (double x : numbers)
         sum += x;
      double mean = sum / N;

      sum = 0.0;
      for (double x : numbers)
         sum += (x - mean) * (x - mean);
      double std = Math.sqrt(sum / (N - 1));

      StdOut.printf("\nMean: %.2f\n", mean);
      StdOut.printf("Std dev: %.2f\n", std);
   }
}
