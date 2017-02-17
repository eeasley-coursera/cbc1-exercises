package org.coursera.cbc.second.validation

object Unsafe {
  case class Email(string: String) {
    def valid: Boolean = {
      string.contains("@")
    }
  }
  case class Person(name: String, email: Email, age: Int) {
    def valid: Boolean = {
      email.valid && age > 0
    }
  }

  def insertPerson(person: Person): Unit = {
    ???
  }

  def post(person: Person): Unit = {
    if (person.valid) {
      insertPerson(person)
    } else {
      throw new IllegalArgumentException("Invalid person")
    }
  }

}
