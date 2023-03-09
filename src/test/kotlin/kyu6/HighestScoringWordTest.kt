package kyu6

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HighestScoringWordTest() {
    @Test
    fun testFixed() {
        Assertions.assertEquals("taxi", high("man i need a taxi up to ubud"))
        Assertions.assertEquals("volcano", high("what time are we climbing up the volcano"))
        Assertions.assertEquals("semynak", high("take me to semynak"))
        Assertions.assertEquals("aa", high("aa b"))
        Assertions.assertEquals("b", high("b aa"))
        Assertions.assertEquals("bb", high("bb d"))
        Assertions.assertEquals("d", high("d bb"))
        Assertions.assertEquals("aaa", high("aaa b"))
    }
}