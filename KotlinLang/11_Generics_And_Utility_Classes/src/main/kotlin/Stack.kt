class Stack<T> {
    private val stack = mutableListOf<T>()

    fun push(item: T) {
        stack.add(item)
    }

    fun isEmpty():Boolean {
        return stack.isEmpty()
    }

    fun pop(): T?{
        return when (stack.isEmpty()) {
            true -> null
            false -> stack.removeLast()
        }
    }
}