

import java.io.PrintWriter
import java.io.File

import scala.io.Source

val source = Source.fromFile("text.txt","UTF-8")

var lineIterator = source.getLines

var content = source.mkString

def printText() = {
	println(content)

}

// printText


def mylines():Unit = {

	// var arr = lineIterator.toArray
	var lineIterator = Source.fromFile("text.txt","UTF-8").getLines
	for(l <- lineIterator){
		println(l)

	}
	
}

// mylines()

// source.close


def bufferedTest(){
	val source = Source.fromFile("text.txt","UTF-8")
	// val iter = source.buffered

	// while(iter.hasNext){
	// 	if(iter.head == "h"){
	// 		println(iter.head)
	// 		iter.next
	// 	}
	// 	else{
	// 		println("...")
	// 	}
	// }

	val tokens = source.mkString.split("\\S+")

	for( t <- tokens) {
		println("...")
	}

}

import java.io.PrintWriter
// bufferedTest()
def write():Unit = {

	val out = new PrintWriter("number.txt")

	for( i <- 0 to 100) {
		out.print(i)
	}
	out.close()

}

// write
import sys.process._
def myProcess():Unit = {
	
	"echo 42"! #> new File("output.txt")

}

// myProcess












