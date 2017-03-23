package org.coursera.cbc.fifth

import scala.language.higherKinds

object HKT {

  trait Mappable[Container[_]] {
    def map[A, B](container: Container[A])(func: A => B): Container[B]
  }
  object Mappable {
    val optionMappable: Mappable[Option] = new Mappable[Option] {
      override def map[A, B](option: Option[A])(func: A => B) = {
        option.map(func)
      }
    }
    val listMappable: Mappable[List] = ???
  }

  trait FlatMappable[Container[_]] {
    def flatMap[A, B](
      container: Container[A])(
      func: A => Container[B]): Container[B]
  }
  object FlatMappable {
    val optionFlatMappable: FlatMappable[Option] = new FlatMappable[Option] {
      override def flatMap[A, B](option: Option[A])(func: A => Option[B]): Option[B] = {
        option.flatMap(func)
      }
    }
    val listFlatMappable: FlatMappable[List] = ???
  }
  def tuple[Container[_], A, B](
    a: Container[A], b: Container[B])(
    flatMappable: FlatMappable[Container], mappable: Mappable[Container]): Container[(A, B)] = {
    ???
  }

}
