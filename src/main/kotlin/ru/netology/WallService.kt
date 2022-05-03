package ru.netology

internal class WallService(
    private var posts: Array<Post> = emptyArray(),
    private var nextId: Int = 1

) {
    fun add(post: Post): Post {
        post.copy(id = nextId)
        //posts += post
        nextId++
        return post
    }

    fun update(post: Post): Boolean {
        for ((index, newPost) in posts.withIndex()) {
            if (post.id == newPost.id) {
                posts[index] = newPost.copy(ownerId = post.ownerId, date = post.date)
                return true
            }
        }
        return false
    }
}