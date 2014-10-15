package test

object Problem14 extends App {
  //525 length
  //837799 number
  var max = 0L;
  var maxNum = 0L;
  for (n <- 1L to 1000000L) {
    var chain = 1;
    var m = n;
    while (m > 1) {
      if (m % 2 == 0) {
        m = (m / 2).toLong;
        chain = chain + 1;
      } else {
        m = 3 * m + 1;
        chain = chain + 1;
      }
    }
    if (chain > max) {
      max = chain;
      maxNum = n;
    }
  }
  println(max);
  println(maxNum);
}