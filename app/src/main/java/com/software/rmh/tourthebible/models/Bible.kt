package com.software.rmh.tourthebible.models

/**
 * Created by rhoffman on 12/18/17.
 *
 * The class that interacts with all endpoints of the API and feeds all of the values
 * from each endpoint. It is an entire "Bible" so to speak.
 */
class Bible {
    // Endpoint the returns all of the books in the KJV Bible along with their number in order.
    val booksEndpoint = "https://getbible.net/index.php?option=com_getbible&task=bible.books&format=json&v=kjv"

    fun getBookList(): Array<String> {
        return arrayOf("")
    }

}