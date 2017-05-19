package syntax

import junit.framework.Assert.assertEquals
import org.junit.Test
import syntax.properties.A
import syntax.properties.B

class propertiesTest {
    @Test fun testCustomSetterAndGetter() {
        val a = A()
        a.propertyWithCustomAccessors = 42
        assertEquals(42, a.propertyWithCustomAccessors)
    }

    @Test(expected = IllegalStateException::class) fun testDelegateNotNull() {
        val b = B()
        b.i
    }
}