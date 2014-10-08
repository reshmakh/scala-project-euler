package test

object Problem9 extends App {
  //31875000
  var a = 1;
  var b = 2;
  var fin = true;
  while (fin) {
    while (a < b) {
      var c = 1000 - a - b;
      if (a * a + b * b == c * c) {
        var prod = a * b * c;
        println(prod);
        fin = false;
      }
      a = a + 1;
    }
    b = b + 1;
    a = 1;
  }
}