package test

object Problem12 extends App {
  def main(args:Array[String]) {
 var triangle = 0;
 var count = 1;
 var over = false;
 while (!over) {
   triangle = triangle + count;
   count = count+1;
   if (numDivisors(triangle) >= 500) {
     println(triangle);
     over = true;
   }
 }
 println(triangle);
}
 def numDivisors(x:Int) : Int = {
     var divisors = 0;
     for (i <- 1 to x) {
       if (x % i == 0) {
         divisors = divisors + 1;
       }
     }
     return divisors;
   }
}