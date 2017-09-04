〈div
  〈p The Bulgarian sort method relies on the fact that it's easy to sort an array of length 3. If 〈 a[0]〉 and 〈 a[1]〉 are out of order, swap them. If 〈 a[1]〉 and 〈 a[2]〉 are out of order, swap them. One more compare-and-swap (that you get to figure out), and you are done.〉〈p 

Implement the following algorithm:〉
  〈pre 
While the array is not sorted
   For each adjacent triple of elements starting at 0, 2, 4, 6, ...
      Sort the triple
〉
〈p Submit a file BulgarianSorter.java. In the draft, just implement the 〈 sortTriple〉 method.〉
〉
