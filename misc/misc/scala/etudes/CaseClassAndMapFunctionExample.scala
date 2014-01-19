package misc.scala.etudes

object CaseClassAndMapFunctionExample {

  case class Product(ean: Long, name: String);
  
  def main(args: Array[String]) {
    
    val products = Set(Product(11111, "acne_one"), Product(22222, "acne_two"));
    val findResult = products.find(_.ean == 11111);
    println(findResult);
    println(findResult.getOrElse("nothing found"));
    
    val productsAsSortedList = products.toList.sortBy(_.ean);
    println(productsAsSortedList);
    println(productsAsSortedList.map(_.ean)); //notice the use of map here
  }
}