package org.exampl.data

import org.exampl.data.Book
import java.time.LocalDate

class Libruary(_had : MutableList<Book>? = null) {

    private val had = _had;

    fun insert(book: Book) {
        had!!.add(book);
    }
}