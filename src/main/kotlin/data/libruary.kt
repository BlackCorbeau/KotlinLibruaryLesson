package org.exampl.data

import org.exampl.data.Book
import java.time.LocalDate
import java.time.Year

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

    fun findByGenere(geners: Geners): MutableList<Book>? {
        val res: MutableList<Book> = mutableListOf<Book>();
        for (i in had){
            if (i.genere == geners){
                res.add(i);
            }
        }
        if (res.size == 0){
            return null;
        }
        return res;
    }

    fun findByYearData(data: Year): MutableList<Book>? {
        val res: MutableList<Book> = mutableListOf();
        had.forEach {item ->
            if (item.year == data) {
                res.add(item);
            }
        }
        if (res.size == 0){
            return null;
        }
        return res;
    }
}