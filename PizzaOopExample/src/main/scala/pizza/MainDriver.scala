package pizza

object MainDriver extends App {

  val p1 = Pizza(
    MediumCrustSize,
    ThinCrustType,
    List(Cheese)
  )

  // val p2 = Pizza (
  //     LargeCrustSize,
  //     ThinCrustType,
  //     ArrayBuffer(Cheese, Pepperoni, Sausage)
  // )

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
    List(p1 /*, p2*/),
    customer
  )

//  order.addPizza(
//    Pizza(
//      SmallCrustSize,
//      ThinCrustType,
//      ArrayBuffer(Cheese, Mushrooms)
//    )
//  )

  // print the order
  order.printOrder()

}



