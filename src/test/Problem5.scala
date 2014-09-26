package test

object Problem5 {
  //232792560
    def main(args:Array[String]) {
    var max = 20;
    while (true) {
      if (max % 2 == 0 && max % 3 == 0 && max % 4 == 0 && max % 5 == 0 &&
          max % 6 == 0 && max % 7 == 0 && max % 8 == 0 && max % 9 == 0 && max % 10 == 0 && 
          max % 11 == 0 && max % 12 == 0 && max % 13 == 0 && max % 14 == 0 && max % 15 == 0
          && max % 16 == 0 && max % 17 == 0 && max % 18 == 0 && max % 19 == 0 && max % 20 == 0) {
        println("Number:" + max);
        return;
      }
      max=max+1;
    }   
    println(max);
  }
}