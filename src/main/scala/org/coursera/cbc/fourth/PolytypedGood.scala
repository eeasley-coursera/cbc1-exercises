package org.coursera.cbc.fourth

object PolytypedGood {

  sealed trait Expr[A]
  case class Conv(bool: Expr[Boolean]) extends Expr[Int]
  case class B(bool: Boolean) extends Expr[Boolean]
  case class And(left: Expr[Boolean], right: Expr[Boolean]) extends Expr[Boolean]
  case class Or(left: Expr[Boolean], right: Expr[Boolean]) extends Expr[Boolean]
  case class I(int: Int) extends Expr[Int]
  case class Add(left: Expr[Int], right: Expr[Int]) extends Expr[Int]
  case class Mult(left: Expr[Int], right: Expr[Int]) extends Expr[Int]

  def interp[A](expr: Expr[A]): A = {
    ???
  }

  object Exampels {
    implicit def tagInt(i: Int): Expr[Int] = I(i)
    implicit def tagBool(b: Boolean): Expr[Boolean] = B(b)
    val example = Add(Add(Mult(2, 3), 4), Conv(And(true, true)))
    //  val badExample = Add(true, 2)
  }

}
