import java.util.*;

public class PuzzleSolver
{ 
   /**
      Returns all solutions to a puzzle.
      @param p a puzzle
      @return the list of solutions
   */
   public static ArrayList<Puzzle> solvePuzzle(Puzzle p)
   {
      ...
   }

   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      String line = in.nextLine();
      int n1 = line.indexOf("+");
      int n2 = line.indexOf("=");
      Puzzle p = new Puzzle(
         line.substring(0, n1).trim(), 
         line.substring(n1 + 1, n2).trim(),
         line.substring(n2 + 1).trim());
      ArrayList<Puzzle> solutions = solvePuzzle(p);
      // Sorted so that the order in which the solutions were arrived
      // does not matter for testing
      Collections.sort(solutions,
         (p1, p2) -> p1.toString().compareTo(p2.toString()));
      System.out.println(solutions);
   }
}
