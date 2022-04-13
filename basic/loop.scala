


object Solution {
    def main(args:Array[String]): Unit = {
        var s = "Hello"
        var sum = 0
        for (i <- 0 to s.length -1)
            sum += 1

        for (i <- 1 to 3; j <- 1 to 3 if i != j) print(f"${10 * i + j}%3d")
        // 12 13 21 23 31 32

        for (i <- 1 to 3; from = 4 - i; j <- from to 3) print(f"${10 * i + j}%3d")
        //13 22 23 31 32 33

        for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar
        //将交出vector('H', 'e', 'l', 'l', 'o', 'I'...)  

        // for (i <- 1 to 10) yield i % 3
        //将交出vector(1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0)  
    }

    def decorate(str:String, left:String="[", right:String="]") = //默认值
        left + str + right
}