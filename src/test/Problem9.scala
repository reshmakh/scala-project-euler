package test

object Problem9 extends App {
  //31875000
  var prod = 0;
  for (b <- 1 to 999) {
    for (a <- b to 1 by -1) {
      var c = 1000 - a - b;
      if (math.pow(c.toDouble, 2.0) == math.pow(a.toDouble, 2.0) + math.pow(b.toDouble, 2.0)) {
        prod = a * b * c;
      }
    }
  }
  println(prod);

}