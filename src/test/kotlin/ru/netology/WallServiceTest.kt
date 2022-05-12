package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        val add = Post(
            id = 7,
            ownerId = 123,
            fromId = 333,
            createdBy = 8989,
            date = 22_02_2022,
            text = "Hello world! Here i am!",
            replyOwnerId = 115,
            replyPostId = 333,
            friendsOnly = false,
            copyright = "Материал предоставлен фондом по созданию фондов",
            postType = "post",
            signerId = 777,
            canPin = true,
            canDelete = true,
            canEdit = false,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0
        )
        val result = service.add(add)
        assertNotNull(result)
    }

    @Test
    fun update() {
        val service = WallService()
        service.add(
            Post(
                id = 1,
                ownerId = 123,
                fromId = 333,
                createdBy = 8989,
                date = 22_02_2022,
                text = "Hello world! Here i am!",
                replyOwnerId = 115,
                replyPostId = 333,
                friendsOnly = false,
                copyright = "Материал предоставлен фондом ЮНЕСКО",
                postType = "post",
                signerId = 777,
                canPin = true,
                canDelete = true,
                canEdit = false,
                isPinned = true,
                markedAsAds = false,
                isFavorite = true,
                postponedId = 0
            )
        )
        service.add(
            Post(
                id = 2,
                ownerId = 124,
                fromId = 335,
                createdBy = 8990,
                date = 23_02_2022,
                text = "Hello world! This is my first library!",
                replyOwnerId = 117,
                replyPostId = 335,
                friendsOnly = false,
                copyright = "Материал предоставлен холдингом ВК",
                postType = "post",
                signerId = 778,
                canPin = true,
                canDelete = true,
                canEdit = false,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                postponedId = 0
            )
        )
        service.add(
            Post(
                id = 3,
                ownerId = 125,
                fromId = 336,
                createdBy = 8999,
                date = 24_02_2022,
                text = "Hello world! I'm happy to live on this planet!",
                replyOwnerId = 118,
                replyPostId = 336,
                friendsOnly = false,
                copyright = "Материал предоставлен фондом по защите животных",
                postType = "post",
                signerId = 779,
                canPin = true,
                canDelete = true,
                canEdit = false,
                isPinned = true,
                markedAsAds = false,
                isFavorite = true,
                postponedId = 0
            )
        )

        val update = Post(
            id = 1,
            ownerId = 124,
            fromId = 333,
            createdBy = 8989,
            date = 25_02_2022,
            text = "Hello world! At last I was born! I'm happy",
            replyOwnerId = 117,
            replyPostId = 333,
            friendsOnly = false,
            copyright = "Материал предоставлен фондом ЮНЕСКО",
            postType = "post",
            signerId = 780,
            canPin = true,
            canDelete = true,
            canEdit = false,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0
        )

        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun notUpdate() {
        val service = WallService()
        service.add(
            Post(
                id = 1,
                ownerId = 123,
                fromId = 333,
                createdBy = 8989,
                date = 22_02_2022,
                text = "Hello world! At last I was born!",
                replyOwnerId = 115,
                replyPostId = 333,
                friendsOnly = false,
                copyright = "Материал предоставлен фондом ЮНЕСКО",
                postType = "post",
                signerId = 777,
                canPin = true,
                canDelete = true,
                canEdit = false,
                isPinned = true,
                markedAsAds = false,
                isFavorite = true,
                postponedId = 0
            )
        )
        service.add(
            Post(
                id = 2,
                ownerId = 124,
                fromId = 335,
                createdBy = 8990,
                date = 23_02_2022,
                text = "Hello world! This is my first library!",
                replyOwnerId = 117,
                replyPostId = 335,
                friendsOnly = false,
                copyright = "Материал предоставлен холдингом ВК",
                postType = "post",
                signerId = 778,
                canPin = true,
                canDelete = true,
                canEdit = false,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                postponedId = 0
            )
        )
        service.add(
            Post(
                id = 3,
                ownerId = 125,
                fromId = 336,
                createdBy = 8999,
                date = 24_02_2022,
                text = "Hello world! I'm happy to live on this planet!",
                replyOwnerId = 118,
                replyPostId = 336,
                friendsOnly = false,
                copyright = "Материал предоставлен фондом по защите животных",
                postType = "post",
                signerId = 779,
                canPin = true,
                canDelete = true,
                canEdit = false,
                isPinned = true,
                markedAsAds = false,
                isFavorite = true,
                postponedId = 0
            )
        )
        val update = Post(
            id = 55,
            ownerId = 166,
            fromId = 444,
            createdBy = 100,
            date = 25_02_2021,
            text = "Hakuna Matata! What a wonderful phrase!",
            replyOwnerId = 122,
            replyPostId = 888,
            friendsOnly = true,
            copyright = "Материал предоставлен кинокомпанией Walt Disney",
            postType = "post",
            signerId = 889,
            canPin = true,
            canDelete = true,
            canEdit = false,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 1
        )

        val result = service.update(update)
        assertFalse(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()
        service.add(
            Post(
                id = 3,
                ownerId = 125,
                fromId = 336,
                createdBy = 8999,
                date = 24_02_2022,
                text = "Hello world! I'm happy to live on this planet!",
                replyOwnerId = 118,
                replyPostId = 336,
                friendsOnly = false,
                copyright = "Материал предоставлен фондом по защите животных",
                postType = "post",
                signerId = 779,
                canPin = true,
                canDelete = true,
                canEdit = false,
                isPinned = true,
                markedAsAds = false,
                isFavorite = true,
                postponedId = 0
            )
        )
        service.createComment(
            Comment(
                id = 1,
                fromId = 1,
                date = 25_02_2022,
                text = "Fantastic Post!!",
                replyToUser = 1,
                replyToComment = 1,
                postId = 5
            )
        )
    }

    @Test
    fun shouldAddComment() {
        val service = WallService()
        val addedPost1 = service.add(
            Post(
                id = 1,
                ownerId = 125,
                fromId = 336,
                createdBy = 8999,
                date = 24_02_2022,
                text = "Hello world! I'm happy to live on this planet!",
                replyOwnerId = 118,
                replyPostId = 336,
                friendsOnly = false,
                copyright = "Материал предоставлен фондом по защите животных",
                postType = "post",
                signerId = 779,
                canPin = true,
                canDelete = true,
                canEdit = false,
                isPinned = true,
                markedAsAds = false,
                isFavorite = true,
                postponedId = 0
            )
        )
        val addedPost2 = service.add(
            Post(
                id = 3,
                ownerId = 125,
                fromId = 336,
                createdBy = 8999,
                date = 24_02_2022,
                text = "Hello world! I'm happy to live on this planet!",
                replyOwnerId = 118,
                replyPostId = 336,
                friendsOnly = false,
                copyright = "Материал предоставлен фондом по защите животных",
                postType = "post",
                signerId = 779,
                canPin = true,
                canDelete = true,
                canEdit = false,
                isPinned = true,
                markedAsAds = false,
                isFavorite = true,
                postponedId = 0
            )
        )
        val comment = Comment(
            id = 2,
            fromId = 1,
            date = 25_02_2022,
            text = "Fantastic Post!!",
            replyToUser = 1,
            replyToComment = 1,
            postId = addedPost1.id,

        )

        val twoComment = Comment(
            id = 2,
            fromId = 1,
            date = 25_02_2022,
            text = "Fantastic Post!!",
            replyToUser = 1,
            replyToComment = 1,
            postId = addedPost2.id,
        )

        service.createComment(comment)
        service.createComment(twoComment)
    }
}