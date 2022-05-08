object Solution {
    def findDuplicates(nums: Array[Int]): List[Int] = {
        val l = scala.collection.mutable.ListBuffer[Int]()
        nums.indices.foreach(i => {
        val m = math.abs(nums(i)) - 1
        if (nums(m) <0) l+=math.abs(m+1) else nums(m) = -nums(m)
        })
        l.toList
    }
}