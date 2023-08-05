class Car1 (var type: String, var name: String, var model: String, var price: String, var owner: String, var milesDrive: String) {
    fun displayCarInfo() {
        println("\n------Car-1 Information------")
        println("Type: $type")
        println("Name: $name")
        println("Model: $model")
        println("price: $price")
        println("Owner name: $owner")
        println("Miles drove: $milesDrive")
    }
}class Car2{
    var type = ""
    var name = ""
    var model = ""
    var price = ""
    var owner = ""
    var milesDrive = ""
    init{
        println("\nEnter the details of car-2")
        print("Enter vehicle type: ")
        type = readln()
        print("Enter name: ")
        name = readln()
        print("Enter model: ")
        model = readln()
        print("Enter owner name: ")
        owner = readln()
        print("Enter price: ")
        price = readln()
        print("Enter mileDrove: ")
        milesDrive = readln()
    }
    fun displayCarInfo(){
        println("\n------Car-2 Information------")
        println("Type: $type")
        println("Name: $name")
        println("Model: $model")
        println("Owner name: $owner")
        println("Miles drove: $milesDrive")
    }
}
class Car3{
    var type = ""
    var name = ""
    var model = ""
    var price = ""
    var owner = ""
    var milesDrive = ""
    constructor (type: String,name: String,model: String,price: String,owner: String,milesDrive: String){
        this.type = type
        this.name = name
        this.model = model
        this.price = price
        this.owner = owner
        this.milesDrive = milesDrive
    }
    fun getCarPrice(){
        println("Price: $price")
    }
    fun displayCarInfo(){
        println("\n------Car-3 Information------")
        println("Type: $type")
        println("Name: $name")
        println("Model: $model")
        println("price:$price")
        println("Owner name: $owner")
        println("Miles drove: $milesDrive")
    }
}
fun main(args: Array<String>) {
    var c1 = Car1("4-Wheeler","Kia","Hybrid","1200000","harsh","12000")
    c1.displayCarInfo()

    var c2 = Car2()
    c2.displayCarInfo()

    var c3 = Car3("4-Wheeler","Alcazar","XUV","2300000","xyz","12000")
    c3.displayCarInfo()
}