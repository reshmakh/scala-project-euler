package test

object Problem6 {
   //Answer is 25164150
    def main(args:Array[String]) {
    var sumSquares = 0D;
    var sum = 0D;
    for (i <- 1 to 100) {
      sumSquares = sumSquares + math.pow(i.toDouble, 2.0);
      sum = sum + i;
    }
    var result = math.pow(sum, 2.0) - sumSquares;
    println(result);
  }
}