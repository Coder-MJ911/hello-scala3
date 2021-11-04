package newScalaType.Union


case class UserName(name: String)
case class Password(hash: Int)

class unionTest {
  def help(id: UserName | Password) = {
    val user = id match
      case UserName(name) => lookupName(name)
      case Password(hash) => lookupPassword(hash)
  }

  //A | B is same with B | A
}