package test

object Problem15 extends App {
  //137846528820
  var x = 0;
  var y = 0;
  var max = 20;

  println(pathLength(x,y, max));

  def pathLength(x: Int, y: Int, max: Int): BigInt = {
    if (x == max && y == max) {
      return BigInt(1);
    }
    if (x < max & y < max) {
      return pathLength(x + 1, y, max) + pathLength(x, y + 1, max);
    }
    if (x == max && y < max) {
      return pathLength(x, y + 1, max);
    }
    return pathLength(x + 1, y, max);
  }

}