```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { String item, int index ->
    println "Item $index: $item"
    if (item == "stop") {
      return // Exits the closure
    }
  }
  println "Method completed"
}

def myMethodCorrected(List<String> list) {
  for (int i = 0; i < list.size(); i++) {
    String item = list[i]
    println "Item $i: $item"
    if (item == "stop") {
      return  // Exits the method
    }
  }
  println "Method completed"
}

myMethod(['a', 'b', 'stop', 'c'])
myMethodCorrected(['a', 'b', 'stop', 'c']) 
```