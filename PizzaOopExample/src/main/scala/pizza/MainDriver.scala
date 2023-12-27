package pizza

object MainDriver extends App {
  val p1 = Pizza(
    CrustSize.Medium,
    CrustType.Thin,
    List(Topping.Cheese)
  )

  val p2 = Pizza(
    CrustSize.Large,
    CrustType.Thin,
    List(Topping.Cheese, Topping.Pepperoni, Topping.Sausage)
  )

  val address = Address(
    "123 Main Street",
    "Apt. 1",
    "Talkeetna",
    "Alaska",
    "99676"
  )

  val customer = Customer(
    "Alvin Alexander",
    "907-555-1212",
    address
  )

  val order = Order(
    List(p1 , p2),
    customer
  )

  val addedPizzaOrder = order.addPizza(
    Pizza(
      CrustSize.Small,
      CrustType.Thin,
      List(Topping.Cheese, Topping.Mushrooms, Topping.Onions)
    )
  )

  // print the order
  addedPizzaOrder.printOrder()
}



