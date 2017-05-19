package syntax

import org.junit.Assert.assertEquals
import org.junit.Test
import syntax.ifWhenExpressions.whenExpression

class ifWhenExpressionsTest {
    @Test fun testWhenExpression() {
        assertEquals("Null is null", "null", whenExpression(null))
        assertEquals("Null is null", "String", whenExpression("some string"))
    }
}