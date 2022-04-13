# Charpter 02 

## 变长数组  

```scala
def sum(args:Int*) = { //*
    var result = 0
    for (arg <- args) result += arg
    result
}
```

可以使用任意多参数调用函数。

```scala
val s = sum(1, 4, 9)

val s = sum(1 to 5) //错误，只能1个值

val s = sum(1 to 5: _*) //转换成一个参数 将1 to 5当作参数序列处理
```

