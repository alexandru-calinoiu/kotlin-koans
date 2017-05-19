package syntax

import junit.framework.Assert.assertEquals
import org.junit.Test
import syntax.javaCollections.People
import syntax.javaCollections.Person
import syntax.javaCollections.mapNames

class javaCollectionsTest {
    @Test fun testCovarianceForImmutableCollections() {
        val people = People()
        people.add(Person())
        assertEquals(listOf("Jon Doe"), mapNames(people))
    }
}