import scala.collection.mutable.ArrayBuffer

class NetWork {
    class Member(val name:String) {
        val contacts = new ArrayBuffer[Member]
    }
    private val members = new ArrayBuffer[Member]

    def join(name:String) = {
        val m = new Member(name)
        members += m
        m
    }
}

object Solution {
    def main(args:Array[String]):Unit = {
        print("Hello");
        val chatter = new NetWork
        val myFace = new NetWork

        var fred = chatter.join("Fred")
        var wilma = chatter.join("Wilma")


        fred.contacts += wilma
    }


}