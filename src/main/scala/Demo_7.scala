/**
  * Created by curtisnoel on 12/24/16.
  *
  * logical operators
  *
  */
object Demo_7 {
  def main( args: Array[ String]) {
    var a = true;
    var b = false;
    println(" a = true, b = false");
    println(" a && b = " + (a && b) );
    println(" a || b = " + (a || b) );
    println("!( a && b) = " + !( a && b) );
  }
}
