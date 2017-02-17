package org.coursera.cbc.second.state

object Unsafe {

  case class Email(string: String)
  case class Person(name: String, email: Email, age: Int)

  def insert(person: Person): Unit = {
    ???
  }
  def email(person: Person): Unit = {
    ???
  }
  def publish(person: Person): Unit = {
    ???
  }

}

object UnsafeExample {
  import Unsafe._

  def signupFlow(person: Person): Unit = {
    insert(person)
    email(person)
    publish(person)
  }
}
