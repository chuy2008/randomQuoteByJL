import scala.io.Source
import scala.util.Random

object RandomQuote
{
   type quote = List[String]
   type allQuotesList = List[quote]
      
   def gatherAllQuotes(url: String, code: String): allQuotesList = 
   {
       def loop(remainingLines: List[String], totalAcc: allQuotesList, partialAcc: quote): allQuotesList =
       {
           if (!remainingLines.headOption.isEmpty)
           {
               if ( (for (cc <- remainingLines.head if (cc != ' ')) yield cc).length == 0)
               {
                 loop(remainingLines.tail, partialAcc.reverse :: totalAcc, List())
               }
               else
               {
                 loop(remainingLines.tail, totalAcc, remainingLines.head :: partialAcc )              
               }
           }
           else
           {
             totalAcc
           }
       }
       loop(Source.fromURL(url, code).getLines.toList, List(), List())
   }
}

object Main extends App 
{
    val allQuotes = RandomQuote.gatherAllQuotes("http://www.coverfire.com/files/quotes.txt", "UTF-8")
    for (ll <- allQuotes(Random.nextInt(allQuotes.length))) println(ll)
}