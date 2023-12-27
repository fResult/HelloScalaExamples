package pizza.helpers

def percentage(percent: Double): Double => Double = {
  val forNumber = (number: Double) => number * percent / 100
  forNumber
}