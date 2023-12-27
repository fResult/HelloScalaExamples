package pizza

import pizza.helpers.percentage

case class Order(
  val pizzas: List[Pizza],
  val customer: Customer
):
  def addPizza(p: Pizza): Order = copy(pizzas = p +: pizzas)

  def removePizza(p: Pizza): Order = copy(pizzas = pizzas.filterNot(_ == p))

  // need to implement these
  def getBasePrice: Double = pizzas.map(_.getPrice(
    toppingsPrices = PriceList.toppingsPrices,
    crustSizePrices = PriceList.crustSizePrices,
    crustTypePrices = PriceList.crustTypePrices,
  )
  ).sum

  private def getTaxes: Double = percentage(7.0)(getBasePrice)

  private def getTotalPrice: Double = getBasePrice + getTaxes

  def printOrder(): Unit = {
    pizzas.foreach(println)
    println(
      s"""
         | Price:
         |   Base Price: $getBasePrice
         |   Tax: $getTaxes
         |   Net Price: $getTotalPrice
      """.stripMargin
    )
  }
