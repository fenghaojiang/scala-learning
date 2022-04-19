# Charpter 03 

## Scala解码指环  

|Scaladoc|解读|
|:--:|:--:|
|def count(p:(A) => Boolean): Int|接受一个前提作为参数，这是一个从A到Boolean的函数。count函数用于清点有多少元素在应用该参数后得到true。举例来说，a.count(_ > 0) 的意思是清点有多少a的元素是正值|
|||
|||
|||

...  


```scala
var bobsScore = scores.getOrElse("Bob", 0)
```
