package iv_properties

import org.junit.Assert.*
import org.junit.Test

class _34_Delegates_Examples {
    @Test fun testLazy() {
        var initialized = false
        val lazyProperty = LazyPropertyUsingDelegates({ initialized = true; 42 })
        assertFalse("Property shouldn't be initialized before access", initialized)
        val result: Int = lazyProperty.lazyValue
        assertTrue("Property should be initialized after access", initialized)
        assertEquals(42, result)
    }

    @Test fun initializedOnce() {
        var initialized = 0
        val lazyProperty = LazyPropertyUsingDelegates( { initialized++; 42 })
        lazyProperty.lazyValue
        lazyProperty.lazyValue
        assertEquals("Lazy property should be initialized once", 1, initialized)
    }

    @Test fun observable() {
        var called = false
        val user = User({ _, _, _ -> called = true })
        user.name = "Vasile"
        assertTrue("Handler should have been called", called)
        assertEquals("Name should have been set", "Vasile", user.name)
    }

    @Test fun propertiesInMap() {
        val user = UserFromMap(mapOf(
                "name" to "Vasile",
                "age" to 81
        ))
        assertEquals("Name should be set", "Vasile", user.name)
        assertEquals("Age should be set", 81, user.age)
    }
}