package example.com.githubtrendingkotlin.Models.Projects

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Example {
    @SerializedName("username")
    @Expose
    private var username: String? = null

    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null

    @SerializedName("sponsorUrl")
    @Expose
    private var sponsorUrl: Any? = null

    @SerializedName("avatar")
    @Expose
    private var avatar: String? = null

    @SerializedName("repo")
    @Expose
    private var repo: Repo? = null

    fun getUsername(): String? {
        return username
    }

    fun setUsername(username: String?) {
        this.username = username
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String?) {
        this.url = url
    }

    fun getSponsorUrl(): Any? {
        return sponsorUrl
    }

    fun setSponsorUrl(sponsorUrl: Any?) {
        this.sponsorUrl = sponsorUrl
    }

    fun getAvatar(): String? {
        return avatar
    }

    fun setAvatar(avatar: String?) {
        this.avatar = avatar
    }

    fun getRepo(): Repo? {
        return repo
    }

    fun setRepo(repo: Repo?) {
        this.repo = repo
    }
}