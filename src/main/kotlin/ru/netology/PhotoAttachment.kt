package ru.netology

internal data class PhotoAttachment(
    override val type: String = "photo",
    val photo: Photo = Photo(
        id = 1,
        albumId = 1,
        ownerId = 1,
        userId = 1,
        text = "The world is amazing",
        date = 10_02_2022,
        width = 150,
        height = 100,
        sizes = emptyArray()
    )
) : Attachment {

    class Photo(
        val id: Int,
        val albumId: Int,
        val ownerId: Int,
        val userId: Int,
        val text: String,
        val date: Int,
        val width: Int,
        val height: Int,
        val sizes: Array<Photo.Size>
    ) {
        class Size(
            val type: String,
            val url: String,
            val width: Int,
            val height: Int
        )
    }
}