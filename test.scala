

/**
def sayHello(name:String,age:Int)={

	printf("hi,%s,you are %d years old.",name,age)
}

def sum(n:Int) ={
	var sum= 0
	
	for (i <- 1 to n){
		sum += i
	}
	sum
}

def fab(n:Int) = {


}

print("hello")



val a = Array(1,2,3,4,5)

val b= a.filter( _ %2 == 0).map(2*_)

val c= a.filter{ _ %2 == 0}.map{2*_}

for (ele <- c){

	println (ele)
}
	






val ages = Map("Loe" ->30)

//ages("Loe") = 31

print(ages("Loe"))





val names =Array ("leo","jack","mike")

val ages = Array(30,24,26)

val nameAges = names.zip(ages)

for ((name,age) <- nameAges) println(name +":" + age)
*/



val scores = new scala.collection.mutable.HashMap[String,Int]

scores +=("Bob" -> 10,"Fred" -> 7)

println(scores("Bob"))

























































