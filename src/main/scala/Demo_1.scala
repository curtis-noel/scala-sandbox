import java.io._

class Point_1( val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc
  def move( dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println (" Point x location : " + x);
    println (" Point y location : " + y);
  }
}

object Demo_1 {
  def main( args: Array[ String]) {
    val pt = new Point_1( 10, 20);
    // Move to a new location
    pt.move( 10, 10);
  }
}
