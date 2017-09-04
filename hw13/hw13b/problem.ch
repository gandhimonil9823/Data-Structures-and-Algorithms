〈div
  〈p Provide an iterator for the 〈 Bag〉 class from the preceding homework.〉
  〈p Start with my solution. The iterator should traverse the elements in the
  same order as the 〈 toString〉 method, starting with the newest inserted element, yielding it as many times as it occurs in the bag, then moving on to the next element.〉
  〈p For the draft, just implement 〈 hasNext〉 and 〈 next〉. For the final, implement 〈 remove〉. Also, for the final, throw a 〈 ConcurrentModificationException〉 when an iterator method is called on a bag that has been modified through a bag method or 〈em another〉 iterator.〉
  〈p To track these modifications, use an instance variable 〈 modCount〉. Increment it with any 〈 add〉, 〈 remove〉, and removal via an iterator. When an iterator is constructed, copy the 〈 modCount〉 into an iterator. If an iterator is called and the 〈 modCount〉 of the bag has increased without the iterator's knowledge, then throw the exception. However, if this iterator caused the mutation (via 〈 remove〉), no exception should be thrown.〉
〉
