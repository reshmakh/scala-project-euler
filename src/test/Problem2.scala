package test

object Problem2 extends App {
  //4613732
    var sum = 2;
    var fib1 = 1;
    var fib2 = 2;
    while (fib2 < 4000000) {
      var next = fib1+fib2;
      fib1 = fib2;
      fib2 = next;
      if (fib2 % 2 == 0) {
        sum += fib2;
      }
    }
    println(sum);
}