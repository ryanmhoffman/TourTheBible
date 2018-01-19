package com.software.rmh.tourthebible.models

import android.annotation.SuppressLint
import android.os.AsyncTask
import com.google.gson.GsonBuilder
import java.net.HttpURLConnection
import java.net.URL

/**
 * Created by rhoffman on 12/18/17.
 *
 * The class that interacts with all endpoints of the API and feeds all of the values
 * from each endpoint.
 */
// TODO(RMH): Fix this giant mess of spaghetti
class Bible {
    // Endpoint the returns all of the books in the KJV Bible along with their number in order.
    private val booksEndpoint = "https://getbible.net/index.php?option=com_getbible&task=bible.books&format=json&v=kjv"
    var text: String? = null

    fun getBookList(): Array<Books> {
        val gson = GsonBuilder().create()
        //var books: Array<Books> = gson.fromJson()
        return arrayOf(Books("", 0, ""))
    }

    fun getBooksFromJson(): String {
        // Open the connection to the API.
        val connection = URL(booksEndpoint).openConnection() as HttpURLConnection
        connection.addRequestProperty("User-Agent", "Mozilla/4.0")
        // Store the response as a String. Connection closes automatically with readText()
        val list = connection.inputStream.bufferedReader().readText()
        // Initialize gson and have it convert the String to JSON and return it.
        val gson = GsonBuilder().setPrettyPrinting().create()
        print(gson.toJson(list))
        return gson.toJson(list)
    }

    fun getChapter(book: String): String? {
        val call = NetworkCall()
        call.execute(this)
        return text
    }

    fun getChapterAsync(book: String): String {
        val endpoint = "https://getbible.net/json?p=" + book + 1
        val connection = URL(endpoint).openConnection() as HttpURLConnection
        connection.addRequestProperty("User-Agent", "Mozilla/4.0")
        val list = connection.inputStream.bufferedReader().readText()
        print(list)
        return "abc"
    }

    @SuppressLint("StaticFieldLeak")
    inner class NetworkCall : AsyncTask<Bible, Long, String>() {

        override fun doInBackground(vararg p0: Bible?): String {
            return p0[0]!!.getChapterAsync("Genesis")
        }

        override fun onPostExecute(result: String?) {
            text = result
        }

    }

}