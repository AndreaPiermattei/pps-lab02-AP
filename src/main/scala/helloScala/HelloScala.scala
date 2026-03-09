package helloScala

def helloScalaFunction(name: String) : String = "Hello, Scala! " + name

@main def tryHelloScala(): Unit =
  println(helloScalaFunction("Rolleroror"))
  println(HelloScalaObject.hello())

  println(HelloScalaObject.isPositiveVersionDef(5))
  println(HelloScalaObject.isPositiveVersionDef(-4))

  println(HelloScalaObject.isPositiveVersionVal(5))
  println(HelloScalaObject.isPositiveVersionVal(-4))

  println(HelloScalaObject.compose(_ - 1, _ * 2)(5))

  println(HelloScalaObject.recurrentExponential(2,4))
  println(HelloScalaObject.recurrentExponentialTail(2,4))
  println(HelloScalaObject.reverse(2341))
