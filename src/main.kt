fun main() {
var t=Cr("Wargon","Jeep","Black",7)
    var v = bus("minibus",   "triple A3","blue",89)
    println(t.carry(7))
    t.identify()
    println(t.calculateParkingFees(2))

   println( v.carry(89))
   println( v.maxTripFare(59.0))
    println(v.calculateParkingFees(2))

}
open class Car(var make:String, var model:String, var color:String, var capacity: Int){
    fun carry(people:Int){
        var r=people-capacity
        if (people==r){
            println("Carrying $people passengers")
        }
        else{
            println("Overcapacity by $people people")
        }
    }
    fun identify(){
        println("I am $color $model  $make")
    }

}
class Cr(make:String, model:String,color:String, capacity:Int):Car(make,model,color,capacity){


    fun calculateParkingFees(hours:Int):Int {
        var x = 20
        x *= hours
        return x
    }

}
class bus( make:String, model:String,color:String, capacity:Int):Car(make,model,color, capacity) {


    fun maxTripFare(fare:Double):Double{
        var maximumFare= fare* capacity

        return maximumFare
    }
    fun calculateParkingFees(hours:Int):Int{
        var product=hours*capacity
        return product
    }
}