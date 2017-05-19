package syntax.javaCollections

import java.util.*


// In Kotlin, Java standard collections are used, but there are two representations of them:
// mutable and read-only

fun useReadonlySet(set: Set<Int>) {
    // doesn't compile:
//    set.add(1)
}

fun useMutableSet(set: MutableSet<Int>) {
    set.add(1)
}

// Read-only collections are covariant

data class Person(val name: String = "Jon Doe")

class People : ArrayList<Person>()

fun mapNames(people: List<Person>) : List<String> {
    return people.map { it.name }
}

