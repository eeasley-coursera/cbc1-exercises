package org.coursera.cbc.fourth

object Arithmetic {

  sealed trait Expr
  case class I(int: Int) extends Expr
  case class Add(left: Expr, right: Expr) extends Expr
  case class Mult(left: Expr, right: Expr) extends Expr

  def interp(expr: Expr): Int = {
    ???
  }

  object Examples {
    implicit def tagInt(i: Int): Expr = I(i)
    val example = Add(Mult(2, 3), 4)
    val example2 = Add(Add(Mult(2, 1), 0), 2)
  }

}
