package helloScala

val empty: String => Boolean = _ == ""

object HelloScalaObject extends App:
  def hello() : String = "Hello, Scala"

  def isPositiveVersionDef(number: Int): String = number match
    case number if number >= 0 => "positive"
    case _ => "negative"

  val isPositiveVersionVal: Int => String = number => number match
    case number if number >= 0 => "positive"
    case _ => "negative"

  val neg: (String => Boolean) => (String => Boolean) = predicateInput => !predicateInput(_)

  def p4(x: Int, y:Int, z:Int): Boolean = (x<=y) && (y==z)
  def p3(x: Int)(y:Int)(z:Int): Boolean = (x<=y) && (y==z)

  val p1: (Int, Int, Int) => Boolean = (x,y,z)=> (x<=y) && (y==z)
  val p2: ((Int), (Int), (Int)) => Boolean = (x,y,z)=> (x<=y) && (y==z)

  def compose(f: Int => Int, g: Int => Int): Int => Int



