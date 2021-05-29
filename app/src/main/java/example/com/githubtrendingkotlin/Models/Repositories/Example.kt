package example.com.githubtrendingkotlin.Models.Repositories

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Example {


    @SerializedName("author")
    @Expose
    private var author: String? = null

    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("avatar")
    @Expose
    private var avatar: String? = null

    @SerializedName("description")
    @Expose
    private var description: String? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null

    @SerializedName("language")
    @Expose
    private var language: String? = null

    @SerializedName("languageColor")
    @Expose
    private var languageColor: String? = null

    @SerializedName("stars")
    @Expose
    private var stars: Int? = null

    @SerializedName("forks")
    @Expose
    private var forks: Int? = null

    @SerializedName("currentPeriodStars")
    @Expose
    private var currentPeriodStars: Int? = null

    @SerializedName("builtBy")
    @Expose
    private var builtBy: List<BuiltBy?>? = null

    fun getAuthor(): String? {
        return author
    }

    fun setAuthor(author: String?) {
        this.author = author
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getAvatar(): String? {
        return avatar
    }

    fun setAvatar(avatar: String?) {
        this.avatar = avatar
    }

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String?) {
        this.description = description
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String?) {
        this.url = url
    }

    fun getLanguage(): String? {
        return language
    }

    fun setLanguage(language: String?) {
        this.language = language
    }

    fun getLanguageColor(): String? {
        return languageColor
    }

    fun setLanguageColor(languageColor: String?) {
        this.languageColor = languageColor
    }

    fun getStars(): Int? {
        return stars
    }

    fun setStars(stars: Int?) {
        this.stars = stars
    }

    fun getForks(): Int? {
        return forks
    }

    fun setForks(forks: Int?) {
        this.forks = forks
    }

    fun getCurrentPeriodStars(): Int? {
        return currentPeriodStars
    }

    fun setCurrentPeriodStars(currentPeriodStars: Int?) {
        this.currentPeriodStars = currentPeriodStars
    }

    fun getBuiltBy(): List<BuiltBy?>? {
        return builtBy
    }

    fun setBuiltBy(builtBy: List<BuiltBy?>?) {
        this.builtBy = builtBy
    }

}