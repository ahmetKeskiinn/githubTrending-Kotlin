package example.com.githubtrendingkotlin.Models.Languages

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Example {
    @SerializedName("urlParam")
    @Expose
    private var urlParam: String? = null

    @SerializedName("name")
    @Expose
    private var name: String? = null

    fun getUrlParam(): String? {
        return urlParam
    }

    fun setUrlParam(urlParam: String?) {
        this.urlParam = urlParam
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

}