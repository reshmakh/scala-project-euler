package test

object Problem17 extends App {
  //46261
  val numbers = Map(0 -> "",
    1 -> "one",
    2 -> "two",
    3 -> "three",
    4 -> "four",
    5 -> "five",
    6 -> "six",
    7 -> "seven",
    8 -> "eight",
    9 -> "nine",
    10 -> "ten",
    11 -> "eleven",
    12 -> "twelve",
    13 -> "thirteen",
    14 -> "fourteen",
    15 -> "fifteen",
    16 -> "sixteen",
    17 -> "seventeen",
    18 -> "eighteen",
    19 -> "nineteen",
    20 -> "twenty",
    30 -> "thirty",
    40 -> "forty",
    50 -> "fifty",
    60 -> "sixty",
    70 -> "seventy",
    80 -> "eighty",
    90 -> "ninety",
    100 -> "hundred",
    1000 -> "thousand");
  var sum = 0;
  for (i <- 1 to 1000) {
    //pad everything with zeros
    var s = "0000" + i.toString;
    var sprime = s.substring(s.length - 4, s.length)
    var thousand = sprime.substring(0, 1).toInt;
    sum = sum + numbers.get(thousand).toString.length;
    if (thousand > 0) {
      sum = sum + "thousand".length();
    }
    print(numbers.get(thousand).toString);
    var hundreds = sprime.substring(1, 2).toInt;
    if (hundreds > 0) {
      sum = sum + numbers.get(hundreds).toString.length + "hundredand".length;
      print(numbers.get(hundreds).toString + "hundred");
    }
    var tens = sprime.substring(2, 4).toInt;
    if (tens > 0) {
      sum = sum + "and".length;
    }
    if (tens <= 20) {
      sum = sum + numbers.get(tens).toString.length;
      print(numbers.get(tens).toString);
    } else {
      tens = sprime.substring(2, 3).toInt * 10;
      sum = sum + numbers.get(tens).toString.length;
      print(numbers.get(tens).toString);
      var ones = sprime.substring(3, 4).toInt;
      sum = sum + numbers.get(ones).toString.length;
      print(numbers.get(ones).toString);
    }
    println();
  }
  println(sum);
}