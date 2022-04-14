import scala.collection.mutable._
object Solution {
    def main(args:Array[String]):Unit =  {
        twoSum(Array(0,1,2,3), 3)
        return 
    }

    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        var map:Map[Int, Int] = Map()
        for(i <- 0 until nums.length) 
            if (map.contains(nums(i))) 
                return Array(map(nums(i)), i)
            else
                map += (target - nums(i) -> i)
        return Array(0, 0)
    }
}