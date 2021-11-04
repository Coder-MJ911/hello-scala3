package newScalaType.Intersection

class Intersection {
  def f(x: Resettable & Growable[String]) = {
    x.reset()
    x.add("first")
  }

  //this x variable could use reset function and add function
  // A & B is same with B & A

  // other example：

  val x: A & B = new C
  val ys: List[A & B] = x.children
}
trait A {
  def children: List[A]
}

trait B {
  def children: List[B]
}