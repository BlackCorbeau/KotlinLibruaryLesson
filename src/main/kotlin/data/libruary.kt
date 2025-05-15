package org.exampl.data

import org.exampl.data.Book
import java.time.LocalDate

class Libruary(_had : MutableList<Book> = mutableListOf<Book>()) {

    private val had = _had;

    fun insert(book: Book) {
        had!!.add(book);
    }

    fun delete(id: Int) {
        had?.forEach { item ->
            if (item.id == id ) {
                had.remove(item)
            }
        }
    }

    fun delete( str : String) {
        had?.forEach { item ->
            if (item.title == str ) {
                had.remove(item);
                return;
            } else if (item.author == str){
                had.remove(item);
                return;
            }
        }
    }

    fun delete( dat: LocalDate) {
        had?.forEach{item ->
            if (item.year == dat) {
                had.remove(item);
                return;
            }
        }
    }
}