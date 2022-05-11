package ru.netology

internal data class NoteAttachment(
    override val type: String = "note",
    val note: Note = Note(
        id = 1,
        ownerId = 1,
        title = "Peace",
        text = "Let's meditate for peace",
        date = 3_03_2022,
        comments = 33,
        readComments = 33,
        viewUrl = "https://idsb.tmgrup.com.tr/ly/uploads/images/2021/07/30/132271.jpg"
    )
) : Attachment {

    class Note(
        val id: Int,
        val ownerId: Int,
        val title: String,
        val text: String,
        val date: Int,
        val comments: Int,
        val readComments: Int,
        val viewUrl: String
    )
}