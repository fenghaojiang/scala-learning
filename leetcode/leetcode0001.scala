import scala.collection.mutable.ArrayBuffer
object Solution {
    def main(args:Array[String]):Unit =  {
        twoSum(Array(0,1,2,3), 3)
        return 
    }

    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        val result = ArrayBuffer[Int]()

        for(i <- 0 until nums.length) 
            print(nums(i))
        
        return result.toArray
    }
}