〈div
  〈p Every year, the CSU system makes available a table with the salaries of its university presidents. The most current one is 〈a href=https://www.calstate.edu/exec_comp/documents/ExecCompSalary.pdf here〉. And here is one from a few years ago (saved as a text file, not PDF):〉 
    〈pre
Campus President Salary Housing Auto Allowance
Bakersfield Horace Mitchell $285,000 $50,000 $12,000
Channel Island Richard R. Rush $275,000 $60,000 $12,000
Chico Paul J. Zingg $279,500 $50,000 $12,000
Dominguez Hills Mildred Garcia $295,000 provided $12,000
East Bay Mohammad H. Qayoumi $276,055 $60,000 $12,000
Fresno John Welty $299,000 provided $12,000
Fullerton Milton A. Gordon $295,000 provided $12,000
Humboldt Rollin C. Richmond $297,870 $50,000 $12,000
Long Beach F. King Alexander $320,329 provided $12,000
Los Angeles James Rosser $325,000 $60,000 $12,000
Maritime William B. Eisenhardt $258,680 provided $12,000
Monterey Bay Diane F. Harrison $270,315 provided $12,000
Northridge Jolene Koester $295,000 provided $12,000
Pomona J. Michael Ortiz $292,000 provided $12,000
Sacramento Alexander Gonzalez $295,000 $60,000 $12,000
San Bernardino Albert K. Karnig $290,000 $50,000 $12,000
San Diego Stephen L. Weber $299,435 provided $12,000
San Francisco Robert A. Corrigan $298,749 $60,000 $12,000
San Jose Don W. Kassing $328,209 provided $12,000
San Luis Obispo Jeffrey D. Armstrong $350,000 $60,000 $12,000
San Marcos Karen S. Haynes $270,568 $60,000 $12,000
Sonoma Ruben Arminaña $291,179 $60,000 $12,000
Stanislaus Hamid Shirvani $270,000 $50,000 $12,000〉 
    〈p Each line contains the name of the campus, the president's name, and some dollar amounts. Your program will print the total compensation for each president, i.e.〉 
    〈pre
Horace Mitchell $347,000
Richard R. Rush $347,000
 ...〉 
    〈p It's a bit unfortunate that the campus names can have one or two parts and the president's names can have two or three. Use the following heuristic: Going backwards from the first dollar amount, take the two preceding words as the president's name, except if you find an initial of the form X., where X is a single letter, in which case the name has three parts. 〉 
    〈p The name of the file is supplied on the command line. 〉〈p In the draft version, you can assume that the file exists. In the final version, if the file name is not present, print〉 
    〈pre
File not found: (Name of file)〉 
    〈p In the draft, just print the totals, not the names. For example,〉 
    〈pre
$347,000
$347,000
 ...〉 
    〈p Pay attention to those $ and commas. You need to remove them before turning the strings to numbers. To put the commas back in, use 〈 printf〉.〉 
  〉 

