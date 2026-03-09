package helloScala

def helloScalaFunction(name: String) : String = "Hello, Scala! " + name

@main def tryHelloScala(): Unit =
  println(helloScalaFunction("Rolleroror"))
  println(HelloScalaObject.hello())

  println(HelloScalaObject.isPositiveVersionDef(5))
  println(HelloScalaObject.isPositiveVersionDef(-4))

  println(HelloScalaObject.isPositiveVersionVal(5))
  println(HelloScalaObject.isPositiveVersionVal(-4))

  val notEmpty = HelloScalaObject.neg(empty) // which type of notEmpty?
  notEmpty("foo") // true
  notEmpty("") // false
  notEmpty("foo") && !notEmpty("") // true.. a comprehensive test
