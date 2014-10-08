package test

object Problem9 {
   //31875000
  def main(args:Array[String]) {
    var a = 1;
    var b = 2;
    var fin = true;
    var prod = 0;
    while (fin) {
      while (a < b) {
        var c = 1000 - a - b;
        if (a * a + b * b == c * c) {
          prod = a * b * c;
          println(prod);
          fin = false;
          return;
        }
      }
    }
    println(prod);
    return;
  }
}