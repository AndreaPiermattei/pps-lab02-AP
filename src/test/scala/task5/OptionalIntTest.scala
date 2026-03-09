package task5

import org.junit.*
import org.junit.Assert.*
import Optionals.*

class OptionalIntTest:
  @Test
  def emptyOptionalShouldBeEmpty(): Unit =
    val empty = OptionalInt.Empty()
    assertTrue(OptionalInt.isEmpty(empty))

  @Test
  def nonEmptyOptionalShouldNotBeEmpty(): Unit =
    val nonEmpty = OptionalInt.Just(0)
    assertFalse(OptionalInt.isEmpty(nonEmpty))

  @Test
  def orElseShouldReturnDefaultWhenEmpty(): Unit =
    val nonEmpty = OptionalInt.Just(0)
    assertEquals(0, OptionalInt.orElse(nonEmpty, 1))

  @Test
  def orElseShouldReturnValueWhenNonEmpty(): Unit =
    val empty = OptionalInt.Empty()
    assertEquals(1, OptionalInt.orElse(empty, 1))

  def basicTransformFunction(value: Int): Int =
    value + 4


  @Test
  def testMapIntWithNotEmpty(): Unit =
    val input: Int = 5
    assertEquals(OptionalInt.Just(input+4),OptionalInt.mapInt(OptionalInt.Just(input),basicTransformFunction))


  @Test
  def testMapIntWithEmpty(): Unit =
    assertEquals(OptionalInt.Empty(),OptionalInt.mapInt(OptionalInt.Empty(),basicTransformFunction))

  def basicConditionFilter(value: Int, myConditionValue: Int): (Int)=>Boolean =
    (value) => value > myConditionValue

  @Test
  def testFilterWithNotEmptyCorrect(): Unit = {
    assertEquals(OptionalInt.Just(5),OptionalInt.filter(OptionalInt.Just(5),basicConditionFilter(5,2)))
  }

  @Test
  def testFilterWithNotEmptyInCorrect(): Unit = {
    assertEquals(OptionalInt.Empty(), OptionalInt.filter(OptionalInt.Just(5), basicConditionFilter(5,10)))
  }

  @Test
  def testFilterWithEmpty(): Unit =
    assertEquals(OptionalInt.Empty(),OptionalInt.filter(OptionalInt.Empty(),basicConditionFilter(5,2)))


/** Task 5: do test for map **/