package example.com.githubtrendingkotlin.Models.Developers

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ExampleDevelopers {
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

    fun getData() : List<String>{
        val data : MutableList<String> = mutableListOf()
        username?.let { data.add(it) }
        name?.let { data.add(it) }
        url?.let { data.add(it) }
        sponsorUrl.let { data.add(it as String) }
        avatar?.let { data.add(it) }
        val repoData = repo?.getData()
        repo?.let {data.add(repoData.toString()) }
        return data
    }
}