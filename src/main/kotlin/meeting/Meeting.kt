package meeting

fun meeting(s: String): String {
    return s.split(";")
        .map { Person.valueOf(it) }
        .sortedWith(Person.COMPARATOR)
        .joinToString ("")
}

data class Person private constructor(val name: String, val lastName: String) {

    companion object {

        val COMPARATOR: Comparator<Person> = Comparator.comparing(Person::lastName).thenComparing(Person::name)

        fun valueOf(str: String): Person {
            val split = str.toUpperCase().split(":")
            return Person(name = split[0], lastName = split[1])
        }
    }

    override fun toString(): String = "($lastName, $name)"
}
