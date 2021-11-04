package newScalaType

import newScalaType.Intersection.{Growable, Resettable}

class Intersection {
  def f(x: Resettable & Growable[String]) = {
    x.reset()
    x.add("first")
  }

  //this x variable could use reset function and add function
  // A & B is same with B & A
}
