package com.software.rmh.tourthebible

import com.software.rmh.tourthebible.models.Bible
import org.junit.Test

/**
 * Created by rhoffman on 12/22/17.
 */
class BibleTests {

    @Test
    fun testGetBooksJson() {
        val bible = Bible()
        assert(bible.getBooksFromJson() is String)
    }
}