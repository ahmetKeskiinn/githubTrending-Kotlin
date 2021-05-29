package example.com.githubtrendingkotlin.Utils

import example.com.githubtrendingkotlin.Models.Repositories.Example

class ApiResponse {

    var posts: Example? = null
    var error: Throwable? = null
    var code : Int? = null

    constructor(posts: Example) {
        this.posts = posts
        this.error = null
    }

    constructor(error: Throwable) {
        this.error = error
        this.posts = null
    }

    constructor(code : Int){
        this.code = code
    }
}