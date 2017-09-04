〈div  
  〈p Write a program that reads a text file and prints the number of words and sentences in the file.〉 
  〈p A sentence ends in a period, exclamation mark, or question mark. But an ellipsis (...) is not the end of a sentence, so don't count it. Count any sequence of two or more . as an ellipsis (.., ..., ...., etc.).〉 
  〈p A word consists of only upper- and lowercase letters and apostrophes. 〉 
  〈p The input〉 
  〈pre
"What's up?", he said. I didn't know--and don't think I was ever going to know...that's just how I am.〉 
  〈p has 21 words and 3 sentences.〉
  〈p For the draft, read input from 〈 System.in〉 and only count the words, using a relaxed definition for words, namely any sequence of non-whitespace characters. That's what you get when you call 〈 in.next()〉 where 〈 in〉 is an instance of 〈 Scanner〉.〉
  〈p With that definition of words, the input above has 19 words.〉
  〈p For the final version, first prompt the user for a file name and then read a character at a time from that file.〉 
〉
