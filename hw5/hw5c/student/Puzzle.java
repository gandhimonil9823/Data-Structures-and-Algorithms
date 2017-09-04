public class Puzzle 
{
   private String add1;
   private String add2;
   private String result;

   /**
      Constructs a puzzle.
      @param add1 a string containing digits 0 - 9 and letters
      @param add2 a string containing digits 0 - 9 and letters
      @param result a string containing digits 0 - 9 and letters
   */
   public Puzzle(String add1, String add2, String result) 
   {
      this.add1 = add1;
      this.add2 = add2;
      this.result = result;
   }
   
   /**
      Makes a new puzzle by replacing a letter with a digit.
      @param letter the letter to be replaced
      @param digit the digit to replace it with
      @return the new puzzle
   */
   public Puzzle replace(String letter, int digit)
   {
      ...
   }

   /**
      Gets the first letter in this puzzle.
      @return the first letter, or "" if there are no letters.
   */
   public String firstLetter()
   {
      ...
   }

   /**
      Returns true if the puzzle is solved.
      @return true if the puzzle has no letters, no number starts
      with zero, and the first two numbers add up to the third
   */
   public boolean isSolved() 
   {
      ...
   }

   /**
      Checks whether this puzzle contains a given digit.
      @param digit a digit
      @return true if this puzzle returns digit
   */
   public boolean contains(int digit)
   {
      ...
   }
    
   public String toString()
   {
      return add1 + "+" + add2 + "=" + result;
   }    
}
