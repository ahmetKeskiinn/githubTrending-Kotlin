package example.com.githubtrendingkotlin.Models.Projects

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Repo {
    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("description")
    @Expose
    private var description: String? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
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
}