package ru.netology

internal data class LinkAttachment(
    override val type: String = "link",
    val link: Link = Link(
        url = "https://miro.medium.com/max/1000/1*Kr52kpans_yMI8_9x0GKJQ.png",
        title = "Kotlin",
        caption = "",
        description = "",
        previewPage = "owner_id_page_id",
        previewUrl = ""
    )
) : Attachment {

    class Link(
        val url: String,
        val title: String,
        val caption: String,
        val description: String,
        val previewPage: String,
        val previewUrl: String,
    )
}