# Groovy `eachWithIndex` Return Behavior

This example demonstrates a common pitfall in Groovy when using the `eachWithIndex` method with lists.  The `return` statement inside the closure only exits the closure itself, not the enclosing method.  This might lead to unexpected code execution.  The solution demonstrates how to properly stop iteration and control method execution.