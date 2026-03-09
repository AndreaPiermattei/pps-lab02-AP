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

  def compose(f: Int => Int, g: Int => Int): Int => Int = (x:Int) => f(g(x)) // compose prende in input due funzioni e mette in output una ulteriore funzione che prende in input un Int

  def recurrentExponential (b: Int, e: Int):Int =
    def exp(e2: Int):Int = e2 match
      case 0 => 1
      case _ => b*exp(e2-1)
    exp(e)

  def recurrentExponentialTail(b: Int, e: Int): Int =
    @annotation.tailrec
    def _expTail(e2: Int, acc: Int):Int = e2 match
      case 0 => acc
      case _ => _expTail(e2-1,acc*b)
    _expTail(e,1)


  def reverse(input: Int): Int =
    @annotation.tailrec
    def _reverse(input: Int, acc: Int): Int = input match
      case 0 => acc
      case _ => _reverse(input/10,(acc*10)+(input%10))
    _reverse(input,0)  
      


