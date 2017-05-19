package syntax

import org.junit.Test
import syntax.enums.ProtocolState
import org.junit.Assert.assertEquals

class SignalTest {
    @Test fun testSignal() {
        assertEquals("Talking should follow to waiting", ProtocolState.WAITING.signal(), ProtocolState.TALKING)
    }
}