〈div
  〈p When demolishing a string, in each step, one can either remove the first or the last letter. For example, if the string is 〈 amber〉, then you can break it into 〈 a〉 and 〈 mber〉 or 〈 ambe〉 and 〈 r〉. 〉
  〈p There is a cost to each step. If the letter that was broken off is a consonant, the cost is the length of the remaining string. If the letter that was broken off is a vowel, the step is free. Also, a string of length 1 has no demolition cost.〉
  〈p Your task is to find the cheapest way of demolishing a string. For example, the cost of demolishing 〉
  〈pre
amber -> ambe r -> a mbe -> mb e -> m b -> m〉
  〈p is 4 + 0 + 0 + 1 + 0 = 5〉
  〈p but the cost of〉
  〈pre
amber -> a mber -> mbe r -> mb e -> m b -> m〉
  〈p is 0 + 3 + 0 + 1 + 0 = 4〉
  〈p In the draft, only print the cheapest cost. In the final, show it, breaking ties towards choosing the first letter.〉
〉
