```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { String item, int index ->
    println "Item $index: $item"
    if (item == "stop") {
      return // This will only exit the eachWithIndex closure, not the method
    }
  }
  println "Method completed"
}

myMethod(['a', 'b', 'stop', 'c'])
```