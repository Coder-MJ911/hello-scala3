package newScalaType.Intersection

trait Growable[T] {
  def add(t: T): Unit
}
