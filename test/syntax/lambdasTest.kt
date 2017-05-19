package syntax

import junit.framework.Assert.assertEquals
import org.junit.Test
import syntax.lambdas.closure

class lambdasTest {
    @Test fun testClojure() {
        assertEquals(10, closure())
    }
}