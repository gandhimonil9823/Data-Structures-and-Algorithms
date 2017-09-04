〈div
  〈p In textbooks, theses, and other structured documents, you have section numbers such as 1.1, 1.2, and subsection numbers such as 1.2.1, 1.2.2, 1.2.2.1, and so on. 〉
  〈p Of course, you want them to be in order. It would be embarrassing if 1.2.2.1 came after 1.2.3.〉
  〈p In the draft, implement a class 〈 SectionNumberComparator〉 that compares two strings containing section numbers: sequences of numbers separated by dots. You can assume that the inputs to the 〈 compare〉 method are properly formed—nothing but digits and dots, and at least one digit before the first dot, after the last dot, and between any two dots.〉
  〈p In the final, put this class to work in a program that reads in a file, and looks for lines that start with section numbers. Whenever a line does so, the section number is compared (using that comparator) with the previous section number. If they are not in order, then a warning is displayed.〉
〉
