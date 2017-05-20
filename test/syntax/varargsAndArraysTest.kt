package syntax

import junit.framework.Assert.assertEquals
import org.junit.Test
import syntax.varargs.use

class varargsAndArraysTest {
    @Test fun varargsTest() {
        assertEquals(listOf("arg1", "arg2"), use("arg1", "arg2").asList())
    }
}