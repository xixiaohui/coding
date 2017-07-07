

import scala.util.matching.Regex


val numPattern = "[0-9]+".r




// println (numPattern)

// for( matchString <- numPattern.findAllIn("99 bottles,98 bottles").toArray) {
	
// 	println(matchString)
// }

// val s = numPattern.replaceFirstIn("99 bottles,98 bottles","XX")

// println(s)

val numitemPattern = "([0-9]+) ([a-z]+)".r

for(numitemPattern(num,item) <- numitemPattern.findAllIn("99 bottles,98 bottles")){
	println("num " + num +" item = "+ item)
}


