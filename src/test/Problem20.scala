package test

object Problem20 extends App {
    //648
    var factorial = BigInt(1);
    for (i <- 1 to 100) {
      factorial = factorial*BigInt(i);
    }
    var sum = 0;
    var s = factorial.toString;
    for (j <- 0 to s.length()-1) {
      sum = sum + s.substring(j, j+1).toInt;
    }
    println(sum);
}