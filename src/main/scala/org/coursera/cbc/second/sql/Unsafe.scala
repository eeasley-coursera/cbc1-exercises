package org.coursera.cbc.second.sql

object Unsafe {

  case class PreparedStatement(query: String)

  def executeStatement[A](query: PreparedStatement, params: Seq[String]): A = {
    ???
  }

  def prepareStatement(query: String): PreparedStatement = {
    ???
  }

}

object UnsafeExample {
  import Unsafe._

  case class Email(string: String)
  case class Person(name: String, email: Email, age: Int)

}
