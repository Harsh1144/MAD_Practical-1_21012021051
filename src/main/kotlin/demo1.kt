open class Person(var firstname:String,var lastname:String){

}
class Student(var no:Int,f:String,l:String):Person(f,l) {
    var name: String = f + "" + l
}
fun  main(){
    var s1=Student(11,"harsh","nai")

    println(s1.name)
}