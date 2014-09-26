package test

object Problem3 {
  //6857
  def main(args:Array[String]) {
    var composite = 600851475143l;
    var max = math.sqrt(composite).toInt;
    //iterate over the numbers in reverse order
    for (z <- max to 2 by -1) {
      if (composite % z == 0 && isPrime(z)) {
        println(z);
        return;
      }
    }
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