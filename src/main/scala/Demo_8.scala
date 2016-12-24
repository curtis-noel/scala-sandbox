/**
  * Created by curtisnoel on 12/24/16.
  *
  * bitwise ops
  *
  * -----------------------------------------------------------------------
  * Precedence
  * -----------------------------------------------------------------------
  * Postfix () [] Left to right
  * Unary ! ~ Right to left
  * Multiplicative * / % Left to right
  * Additive + Left to right
  * Shift > > > > > < < Left to right
  * Relational > > = < < = Left to right
  * Equality = = != Left to right
  * Bitwise AND & Left to right
  * Bitwise XOR ^ Left to right
  * Bitwise OR | Left to right
  * Logical AND && Left to right
  * Logical OR | | Left to right
  * Assignment = + = -= *= /= %= > > = < < = &= ^ = | = Right to left
  * Comma , Left to right
  * -----------------------------------------------------------------------

object Demo_8 {

  def toBinary(i: Int, digits: Int = 8) =
    String.format("%" + digits + "s", i.toBinaryString).replace(' ', '0')

  def main( args: Array[ String]) {
    var a = 60; /* 60 = 0011 1100 */
    var b = 13; /* 13 = 0000 1101 */
    var c = 0;

    println("a = 00111100), b = 00001101, c = 00000000")

    c = a & b; /* binary add: 12 = 0000 1100 */
    println(" a & b = " + toBinary(c, 8));

    c = a | b; /* binary or: 61 = 0011 1101 */
    println(" a | b = " + toBinary(c, 8));

    c = a ^ b; /* binary exclusive or: 49 = 0011 0001 */
    println(" a ^ b = " + toBinary(c, 8));

    c = ~ a; /* (ones compliment / negation: -61 = 1100 0011 */
    println(" ~ a = " + toBinary(c, 8));

    c = a << 2; /* left shift: 240 = 1111 0000 */
    println(" a << 2 = " + toBinary(c, 8));

    c = a >> 2; /* right shift: 215 = 1111 */
    println(" a >> 2 = " + toBinary(c, 8));

    c = a >>> 2; /* shift right, zero fill: 215 = 0000 1111 */
    println(" a >>> 2 = " + toBinary(c, 8));

  }
}

