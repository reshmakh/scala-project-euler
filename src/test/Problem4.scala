package test
//Answer is 906609

object Problem4 {
  def main(args:Array[String]) {
    var max = 0;
    isPalendrome(998001);
    //iterate over the numbers in reverse order
    for (i <- 100 to 999) {
      for (j <- i to 999) {
        if (isPalendrome(i*j) && i*j > max) {
          max = i*j;
        }
      }
    }
    println(max);
  }
  
  def isPalendrome(x:Int) : Boolean = {
    var sX = x.toString;
    for (y <- 0 to (sX.length()/2).toInt) {
      var z = sX.length() - 1 - y;
      if (!sX.charAt(y).equals(sX.charAt(z))) {
        return false;
      }
    }
    return true;
  }
}