object Solution {
    def main(args:Array[String]):Unit = {
        charsum("Hello");
    }

    def signum(x: Int) : Int = {
       if (x > 0) 
           return 1
       else if (x < 0) 
           return -1
       return 0
    }

    def scalaVersion() = {
        var x = 10;
        while(x >= 0) {
            print(x)
            x = x - 1
        }
    }

    def charsum(str : String) = {
        var sum:Long = 1;
        for(ch <- str) {
            sum *= ch
        }
        print(sum)
    }
}