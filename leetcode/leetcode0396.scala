object Solution {
    def main(args:Array[String]) :Unit = {
        println(maxRotateFunction(Array(4,3,2,6)))
    }
    def maxRotateFunction(nums: Array[Int]): Int = {
        if (nums.length <= 1) return 0
        else {
            var sum:Int = 0
            var f:Int = 0
            for (i <- 0 until nums.length) {
                sum += nums(i)
                f += i*nums(i)
            }
            var res = f
            for (i <- (1 to nums.length-1).reverse) {
                f += sum - nums.length*nums(i)
                res = res.max(f)
            }
            return res
        }
    }
}