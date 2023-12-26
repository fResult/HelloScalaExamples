package pizza

case class Order(
  val pizzas: List[Pizza],
  val customer: Customer
) {

  def addPizza(p: Pizza): Order = {
    copy(pizzas = p +: pizzas)
  }

  def removePizza(p: Pizza): Order = {
    copy(pizzas = pizzas.filter(_ != p))
  }

  // need to implement these
  def getBasePrice(): Int = ???

  def getTaxes(): Int = ???

  def getTotalPrice(): Int = ???

  def printOrder(): Unit = {
    for (p <- pizzas) println(p)
  }

}
