package reified_generic_argument_for_classes

class TrickyKotlin6<T> {}

inline fun <reified T, reified U> TrickyKotlin6<T>.classOrSuperClassOf(anyGetter: () -> U) =
    T::class.java.isAssignableFrom(U::class.java)