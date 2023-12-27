package pizza

//sealed trait Topping
//case object Cheese extends Topping
//case object Pepperoni extends Topping
//case object Sausage extends Topping
//case object Mushrooms extends Topping
//case object Onions extends Topping
enum Topping:
  case Cheese, Pepperoni, Sausage, Mushrooms, Onions

//sealed trait CrustSize
//case object SmallCrustSize extends CrustSize
//case object MediumCrustSize extends CrustSize
//case object LargeCrustSize extends CrustSize
enum CrustSize:
  case Small, Medium, Large

//sealed trait CrustType
//case object RegularCrustType extends CrustType
//case object ThinCrustType extends CrustType
//case object ThickCrustType extends CrustType
enum CrustType:
  case Thin, Regular, Thick

object PriceList:
  import Topping._
  import CrustSize.{Small, Medium, Large}
  import CrustType.{Thin, Regular, Thick}

  val toppingsPrices: Map[Topping, Double] = Map(
    Cheese -> 0.5,
    Onions -> 0.5,
    Pepperoni -> 0.75,
    Sausage -> 0.75,
    Mushrooms -> 0.75,
  )
  val crustSizePrices: Map[CrustSize, Double] = Map(
    Small -> 0.25,
    Medium -> 0.5,
    Large -> 0.75,
  )
  val crustTypePrices: Map[CrustType, Double] = Map(
    Thin -> 0.25,
    Regular -> 0.5,
    Thick -> 0.75,
  )
