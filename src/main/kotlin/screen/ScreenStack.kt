package screen

object ScreenStack {
    private val screenStack = mutableListOf<Screen>()

    fun push(screen: Screen){

    }

    fun pop(){
        screenStack.removeLastOrNull()
    }

    fun peek(): Screen? {
        return screenStack.lastOrNull()
    }
}

sealed class Screen