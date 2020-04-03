class Book(val name: String)

class BookParser(val separator: String) {
    fun parse(books: String): List<Book> {
       return books.split(separator).map { Book(it.trim()) }
    }
}

class BookLoader(val separator: String) {
    fun load(): String {
        val books = listOf(
            "Super agent for Doomies",
            "Kotlin for the win",
            "Lets learn dependency injection"
        )

        return books.joinToString(separator)
    }
}

class Library(val loader: BookLoader, val parser: BookParser) {
    fun loadBooks(): List<Book> {
        val serializedBooks = loader.load()
		return parser.parse(serializedBooks)
    }
}

fun printBooks() {
    //
    // TODO: Implementar
    // Imprimir en cada linea todos los libros de la Library
 	//
}

fun main() {
	printBooks()
}