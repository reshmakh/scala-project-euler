package test
import java.util.Calendar


object Problem19 extends App {
    //173
    var start = Calendar.getInstance();
    start.set(1900, 1, 1);
    var end = Calendar.getInstance();
    end.set(2000, 12, 31);
    var firstSundays = 0;
    while (!start.equals(end)) {
      start.add(Calendar.DATE, 1);
      if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY &&
          start.get(Calendar.DAY_OF_MONTH) == 1) {
        firstSundays = firstSundays+1;
      }
    }
    println(firstSundays);
}