package org.coursera.cbc.fourth

object Grading {
  trait Expr[A]
  case class D(d: Double) extends Expr[Double]
  case object Grades extends Expr[List[Double]]
  case class Length(list: Expr[List[Double]]) extends Expr[Double]
  case class Sum(list: Expr[List[Double]]) extends Expr[Double]
  case class Maximum(list: Expr[List[Double]]) extends Expr[Double]
  case class Add(l: Expr[Double], r: Expr[Double]) extends Expr[Double]
  case class Sub(l: Expr[Double], r: Expr[Double]) extends Expr[Double]
  case class Mult(l: Expr[Double], r: Expr[Double]) extends Expr[Double]
  case class Div(l: Expr[Double], r: Expr[Double]) extends Expr[Double]

  def interp[A](grades: List[Double], expr: Expr[A]): A = {
    ???
  }

  object Examples {
    implicit def tagDouble(d: Double): Expr[Double] = D(d)
    val average = Div(Sum(Grades), Length(Grades))
    val maxWithPenalty = Sub(Maximum(Grades), Mult(Length(Grades), 0.1))
  }

}
