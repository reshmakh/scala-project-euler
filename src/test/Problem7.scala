package test

object Problem7 {
  //Answer is 104731
  def main(args:Array[String]) {
    var primes = 1;
    var i = 3;
    while (primes < 10000) {
      if (isPrime(i)) {
        primes = primes+1;
      }
      i = i+2;
    }
    println(i);
  }
  
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