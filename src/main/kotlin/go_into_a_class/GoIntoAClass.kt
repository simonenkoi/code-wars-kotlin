package go_into_a_class

inline operator fun Box.invoke(action: Box.() -> Unit) = action(this)