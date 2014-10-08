package test

object Problem10 extends App {
  //1179908154
  var sum = 2;
  for (i <- 3 to 2000000 by 2) {
      if (isPrime(i)) {
        sum = sum +i;
      }
  }
  println(sum);

  def isPrime(x:Int) : Boolean = {
    var max = math.floor(math.sqrt(x)).toInt;
    for (y <- 2 to max) {
      if (x % y == 0) {
        return false;
      }
    }
    return true;
  }
}
