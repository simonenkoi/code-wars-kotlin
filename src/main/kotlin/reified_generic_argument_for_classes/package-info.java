/**
 * This is a series of Kotlin tricks.
 *
 * As we know, Kotlin supports reified, which works only with inline.
 * If you don't know, search it! It's very useful.
 *
 * The problem here is, reified dependends on inline. Only functions can be inlined, constructors cannot.
 *
 * And your task in this Kata is to make a reified constructor!
 *
 * The exmaple tests and final tests are not the same.
 *
 * What? You want hint? The description above is a huge hint!
 *
 * class TrickyKotlin6<T : Any>() {
 *     fun classOrSuperClassOf(anyGetter: () -> Any) = false
 * }
 * This is your initial solution, your task is to implement a method of a class that checks if T is a super class of
 * anyGetter's return value's class.
 *
 * You may do a big refactoring to the initial solution, like changing the function signature.
 *
 * I will pass some evil things to anyGetter, so please be careful to invoke it (To be honest, you can't call it. I will
 * throw Exceptions inside).
 */
package reified_generic_argument_for_classes;