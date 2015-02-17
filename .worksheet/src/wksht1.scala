object wksht1
{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(42); 
  
  val ll = List("one", "two", "three");System.out.println("""ll  : List[String] = """ + $show(ll ));$skip(8); val res$0 = 
  ll(1);System.out.println("""res0: String = """ + $show(res$0));$skip(32); 
  val lll = ll ::: List("four");System.out.println("""lll  : List[String] = """ + $show(lll ));$skip(6); val res$1 = 
  lll;System.out.println("""res1: List[String] = """ + $show(res$1));$skip(18); val res$2 = 
  "hola  ".length;System.out.println("""res2: Int = """ + $show(res$2));$skip(66); 
  val strWithoutBlanks = for ( cc <- " " if (cc != ' ')) yield cc;System.out.println("""strWithoutBlanks  : String = """ + $show(strWithoutBlanks ));$skip(26); val res$3 = 
  strWithoutBlanks.length;System.out.println("""res3: Int = """ + $show(res$3))}
  
}
