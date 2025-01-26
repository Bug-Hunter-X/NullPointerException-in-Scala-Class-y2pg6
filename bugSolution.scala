```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

val obj = new MyClass(10) 
val result = obj.myMethod(5) 
println(result) // prints 15

//Solution: Use Option to handle null values
class AnotherClass(var myVar : Option[String]){
  def printMyVar() : Unit ={
     println(myVar.getOrElse("Default Value"))
  }
} 

val anotherObj = new AnotherClass(None)
anotherObj.printMyVar() // prints Default Value
val anotherObj2 = new AnotherClass(Some("Hello"))
anotherObj2.printMyVar() // prints Hello
```