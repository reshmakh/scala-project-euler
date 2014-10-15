package test

object Problem14 extends App {
  //476 length
  //910107 number
  var max = 0;
  var maxNum = 0;
  for (n <- 1 to 1000000) {
    var chain = 1;
    var m = n;
    while (m > 1) {
      if (m % 2 == 0) {
        m = m / 2;
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