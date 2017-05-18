package iv_properties

import util.TODO
import util.doc34
import java.util.*
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class LazyPropertyUsingDelegates(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}

class User(val handler: (KProperty<*>, String, String) -> Unit) {
    var name: String by Delegates.observable("No name", handler)
}

class UserFromMap(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

fun todoTask34(): Lazy<Int> = TODO(
    """
        Task 34.
        Read about delegated properties and make the property lazy by using delegates.
    """,
    documentation = doc34()
)
