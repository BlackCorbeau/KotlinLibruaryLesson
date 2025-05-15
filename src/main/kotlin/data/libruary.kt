package org.exampl.data

import org.exampl.data.Book
import java.time.LocalDate

class Libruary(_had : MutableList<Book> = mutableListOf<Book>()) {

    private val had = _had;

    fun insert(book: Book) {
        had.add(book);
    }

    fun delete(id: Int) {
        had.forEach { item ->
            if (item.id == id ) {
                had.remove(item)
            }
        }
    }

    fun findByTitle(title: String): Book? {
        had.forEach {item ->
            if (item.title == title) {
                return item;
            }
        }
        return null;
    }

    fun findByAuthor(author: String): Book? {
        for ( i in 0..had.size) {
            if (had[i].author == author) {
                return had[i];
            }
        }
        return null;
    }

}