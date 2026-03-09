package task5

import org.junit.*
import org.junit.Assert.*
import Optionals.*
import helloScala.HelloScalaObject

val empty: String => Boolean = _ == ""

class testNeg {
  @Test
  def testNegValFunction: Unit =
    val notEmpty = HelloScalaObject.neg(empty) // which type of notEmpty?
    notEmpty("foo") // true
    notEmpty("") // false
    notEmpty("foo") && !notEmpty("") // true.. a comprehensive test
}
