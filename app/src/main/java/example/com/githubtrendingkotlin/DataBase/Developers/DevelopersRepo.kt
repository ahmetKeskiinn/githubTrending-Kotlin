package example.com.githubtrendingkotlin.DataBase.Developers

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import example.com.githubtrendingkotlin.Models.Developers.ExampleDevelopers
import example.com.githubtrendingkotlin.Models.Repositories.Example
import example.com.githubtrendingkotlin.Utils.Api
import example.com.githubtrendingkotlin.Utils.GetService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DevelopersRepo(private val key: String?, private val host : String?, private val language : String?, private val since : String, private val langCode : String?) {
    var endpoints : Api = Api()
    fun getDevelopers() : MutableLiveData<List<ExampleDevelopers>> {
        val apiResponse = MutableLiveData<List<ExampleDevelopers>>()
        val apiService = endpoints.getClient()!!.create(GetService::class.java)
        val call : Call<List<ExampleDevelopers?>>? = apiService.getDevelopers(key, host, language, since, langCode)
        call?.enqueue(object : Callback<List<ExampleDevelopers?>> {
            override fun onFailure(call: Call<List<ExampleDevelopers?>>, t: Throwable) {
                Log.d("TAG", "onFailure: " + t)
            }

            override fun onResponse(
                call: Call<List<ExampleDevelopers?>>,
                response: Response<List<ExampleDevelopers?>>
            ) {
                if (response!!.isSuccessful) {
                     apiResponse.postValue(response.body()!! as List<ExampleDevelopers>?)
                } else {
                    Log.d("TAG", "onResponse: Not Success")
                    // apiResponse.postValue(ApiResponse(response.code()))
                }
            }

        })
        Log.d("TAG", "getRepositories: ")
        return apiResponse
    }
}