package test

object Problem9 extends App {
  //35541072
  var a = 1;
  var b = 2;
  var fin = true;
  while (fin) {
    while (a < b) {
      var c2 = Math.pow(a, 2.0) + Math.pow(b, 2.0);
      var c = Math.sqrt(c2).toInt;
      if (a + b + c == 1000) {
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