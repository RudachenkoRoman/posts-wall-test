package ru.netology

internal data class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio = Audio(
        id = 1,
        ownerId = 1,
        artist = "Linkin Park",
        title = "What Ive done",
        duration = 60,
        url = "https://fandomir.ru/wa-data/public/shop/products/29/16/1629/images/194239/194239.750x0@2x.JPG",
        lyricsId = 1,
        albumId = 1,
        genreId = 1,
        date = 4_04_2007,
        noSearch = true,
        isHq = false
    )
) : Attachment {

    class Audio(
        val id: Int,
        val ownerId: Int,
        val artist: String,
        val title: String,
        val duration: Int,
        val url: String,
        val lyricsId: Int,
        val albumId: Int,
        val genreId: Int,
        val date: Int,
        val noSearch: Boolean,
        val isHq: Boolean
    )
}