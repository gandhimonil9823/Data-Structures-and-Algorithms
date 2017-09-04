〈div
  〈p In this problem, you will determine how often each element of an array occurs in the array. (We call that the 〈em frequency〉 of the element.) For example, the frequency of 1 in the array [3, 1, 4, 1, 4, 4] is 2.〉
  〈p You will implement a method that, given an array, yields another array of frequencies for each element. For example, for the array [3, 1, 4, 1, 4, 4] you should produce the array [1, 2, 3, 2, 3, 3]. 〉
  〈p In the draft, use a straightforward O(n〈sup 2〉) algorithm. For each element a[i], count how often it occurs in a, and store that count in f[i].〉
  〈p In the final, implement an O(n log(n)) algorithm. When you sort the array, it is easy to tell the frequencies. For example, in the sorted array [1, 1, 3, 4, 4, 4] you can tell in O(n) time what the frequencies of 1, 3, and 4 are—just the lengths of the ranges with repeated elements. There is just one problem—you no longer know where the values came from, so you can't return the frequency array with the original positions.〉
  〈p The trick to overcome this is to sort not just the values but the values 〈em together with their positions〉. In our case, you'd start with [(3, 0), (1, 1), (4, 2), (1, 3), (4, 4), (4, 5)] and sort to [(1, 1), (1, 3), (3, 0), (4, 2), (4, 4), (4, 5)]. Then when you determine the frequency of 1, you know put it into positions 1 and 3.〉
  〈p Use 〈 Arrays.sort〉.〉
  〈p In the draft AND the final, add a comment to the top of your solution that carries out a computation of your choice by hand. That is, start with some array and show how the frequencies are computed, a step at a time.〉
  〈hr〉
〈p In this assignment (part A only), you will put your work on Github. Follow 〈a href=https://classroom.github.com/assignment-invitations/b94c41027502c622fe11197f95f2f8dc target=_blank this invitation link〉 and follow 〈a href=http://horstmann.com/sjsu/fall2015/cs46b/github-classroom.html target=_blank these instructions〉 to set up your repo.〉
  〈p When you are done, paste the git SSH (not HTTP) URL of your repo (and not the invitation link) into the field at the bottom of this page. Codecheck will check out your repo, check it, and show you how your code did.〉
  〈p For now, you still submit the signed zip file in the usual way. (If you view the source of the HTML file, you'll see your repo name inside. That's how the grader can tell that the code came from Github.)〉
〉
