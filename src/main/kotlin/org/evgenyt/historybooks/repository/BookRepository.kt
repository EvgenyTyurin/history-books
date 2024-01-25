package org.evgenyt.historybooks.repository

import org.evgenyt.historybooks.model.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<Book, Long>