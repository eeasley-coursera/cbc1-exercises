package org.coursera.cbc.second

object Smart {

  case class Natural private (int: Int)
  object Natural {
    def make(int: Int): Option[Natural] = {
      if (int >= 0) {
        Some(Natural(int))
      } else {
        None
      }
    }
  }

  object NonEmpty {
    def make[A](list: List[A]): Option[::[A]] = {
      list match {
        case Nil => None
        case a :: as => Some(::(a, as))
      }
    }
  }

}
