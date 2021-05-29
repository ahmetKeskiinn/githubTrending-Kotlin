package example.com.githubtrendingkotlin.Models.Repositories

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BuiltBy {

    @SerializedName("username")
    @Expose
    private var username: String? = null

    @SerializedName("href")
    @Expose
    private var href: String? = null

    @SerializedName("avatar")
    @Expose
    private var avatar: String? = null

    fun getUsername(): String? {
        return username
    }

    fun setUsername(username: String?) {
        this.username = username
    }

    fun getHref(): String? {
        return href
    }

    fun setHref(href: String?) {
        this.href = href
    }

    fun getAvatar(): String? {
        return avatar
    }

    fun setAvatar(avatar: String?) {
        this.avatar = avatar
    }
}