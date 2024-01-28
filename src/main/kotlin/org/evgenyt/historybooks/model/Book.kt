package org.evgenyt.historybooks.model

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "book")
open class Book {
    @Id
    @Column(name = "id", nullable = false)
    open var id: UUID? = null

    @Column(name = "title", nullable = true)
    open var title: String? = null

    @Column(name = "authors", nullable = true)
    open var authors: String? = null

    @Column(name = "cover_image_name", nullable = true)
    open var coverImageName: String? = null
}
