package ru.netology

internal data class PageAttachment(
    override val type: String,
    val page: Page = Page(
        id = 1,
        groupId = 1,
        creatorId = 1,
        title = "Top of the World",
        currentUserCanEdit = false,
        currentUserCanEditAccess = false,
        whoCanView = 2,
        whoCanEdit = 1,
        edited = 23_03_2022,
        created = 10_02_2022,
        editorId = 1,
        views = 333,
        parent = "",
        parent2 = "",
        source = "",
        html = "",
        viewUrl = "https://.."
    )
) : Attachment {

    class Page(
        val id: Int,
        val groupId: Int,
        val creatorId: Int,
        val title: String,
        val currentUserCanEdit: Boolean,
        val currentUserCanEditAccess: Boolean,
        val whoCanView: Int,
        val whoCanEdit: Int,
        val edited: Int,
        val created: Int,
        val editorId: Int,
        val views: Int,
        val parent: String,
        val parent2: String,
        val source: String,
        val html: String,
        val viewUrl: String
    )

}