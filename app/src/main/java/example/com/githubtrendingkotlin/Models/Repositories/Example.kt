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

    fun getData() : List<String>{
        val data : MutableList<String> = mutableListOf()
        author?.let { data.add(it) }
        name?.let { data.add(it) }
        avatar?.let { data.add(it) }
        return data
    }
}