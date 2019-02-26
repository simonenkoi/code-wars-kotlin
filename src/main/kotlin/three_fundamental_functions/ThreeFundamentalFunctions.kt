package three_fundamental_functions

inline fun unless(condition: Boolean, action: () -> Unit) {
    if (!condition) {
        action()
    }
}

inline fun until(condition: () -> Boolean, action: () -> Unit) {
    while (!condition.invoke()) {
        action()
    }
}

inline fun forceRun(action: () -> Unit) {
    try {
        action()
    } catch (e: Throwable) {
        print(e)
    }
}