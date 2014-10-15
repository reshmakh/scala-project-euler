package test

object Problem16 extends App {
    //1366
    val r = BigInt(2).pow(1000);
    var s = r.toString;
    var sum = 0;
    for (i <- 0 to s.length - 1) {
      sum = sum + s.substring(i, i+1).toInt;
    }
    println(sum);
}