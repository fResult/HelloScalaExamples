package pizza

import scala.collection.mutable.ArrayBuffer

object MainDriver extends App {

  val p1 = new Pizza(
    MediumCrustSize,
    ThinCrustType,
    ArrayBuffer(Cheese)
  )

  // val p2 = new Pizza (
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

  val order = new Order(
    ArrayBuffer(p1 /*, p2*/),
    customer
  )

//  order.addPizza(
//    new Pizza(
//      SmallCrustSize,
//      ThinCrustType,
//      ArrayBuffer(Cheese, Mushrooms)
//    )
//  )

  // print the order
  order.printOrder()

}



