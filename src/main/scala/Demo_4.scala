//singleton

import java.io._;

class Point_4( val xc: Int, val yc: Int) {
  var x: Int = xc;
  var y: Int = yc;

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx;
    y = y + dy;
  }
}

object Demo_4 {
  def main( args: Array[String]) {
    val point = new Point_4( 10, 20);
    printPoint;

    def printPoint{
      println (" Point x location : " + point.x);
      println (" Point y location : " + point.y);
    }
  }
}

