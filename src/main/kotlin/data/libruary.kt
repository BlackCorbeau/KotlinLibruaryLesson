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

            }
        }
    }

            }
        }
    }
}