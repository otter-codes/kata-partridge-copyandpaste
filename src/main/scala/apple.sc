val x = 2.toInt
//
//if (x * x > 1000) {
//  "It's hotter than the sun!!"
//} else {
//  "Help yourself to a honeycomb Yorkie for the glovebox."
//}

def apple(x: Any): String = {
  val n = x match {
    case i: Int => i
    case s: String => s.toInt
    case _ => throw new IllegalArgumentException("Nah bruv, gotta be an Int or String")
  }
  if (n * n > 1000) {
    "It's hotter than the sun!!"
  } else {
    "Help yourself to a honeycomb Yorkie for the glovebox"
  }
}

apple(true)