package task5
import org.junit.*
import org.junit.Assert.*
import Optionals.*
import helloScala.HelloScalaObject

class TestHelloScala:

  @Test
  def testNegValFunction(): Unit =
    val empty: String => Boolean = _ == ""
    val notEmpty = HelloScalaObject.neg(empty) // which type of notEmpty?
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty("")) // false
    assertTrue(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test

