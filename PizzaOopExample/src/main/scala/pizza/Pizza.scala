package pizza

case class Pizza(
  val crustSize: CrustSize,
  val crustType: CrustType,
  val toppings: List[Topping]
):
  def addTopping(t: Topping): Pizza = copy(toppings = t +: toppings)

  def removeTopping(t: Topping): Pizza = copy(toppings = toppings.filter(_ != t))

  def removeAllToppings(): Pizza = copy(toppings = List())


  override def toString: String = {
    val toppingsString = for (t <- toppings) yield t
    s"""Pizza:
       |  Crust Size: $crustSize
       |  Crust Type: $crustType
       |  Toppings:   $toppingsString
     """.stripMargin
  }

  def getPrice(
    toppingsPrices: Map[Topping, Double],
    crustSizePrices: Map[CrustSize, Double],
    crustTypePrices: Map[CrustType, Double]
  ): Double = {
    val toppingsPrice = toppingsPrices.view.filterKeys(toppings.toSet).values.sum
    val crustTypePrice = crustTypePrices(crustType)
    val crustSizePrice = crustSizePrices(crustSize)
    toppingsPrice + crustTypePrice + crustSizePrice
  }
