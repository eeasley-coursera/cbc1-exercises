package org.coursera.cbc.fifth

object Expression {

  sealed trait Expr[A]
  object Expr {
    case class Trim()
    case class Drop()
    case class Head()
  }

  object Obvious {
    import Expr._

    def interpret[A](expr: Expr[A]): A = {
      ???
    }
  }

  object Example {
    import Expr._
  }

}
