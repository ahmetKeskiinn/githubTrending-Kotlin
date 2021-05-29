package example.com.githubtrendingkotlin.DataBase.Languages

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import example.com.githubtrendingkotlin.Models.Languages.ExampleLanguages
import example.com.githubtrendingkotlin.Models.Repositories.Example
import example.com.githubtrendingkotlin.Utils.Api
import example.com.githubtrendingkotlin.Utils.GetService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LanguageRepository(private val key: String?, private val host : String?, private val language : String?, private val since : String, private val langCode : String?) {
    var endpoints : Api = Api()
    fun getDevelopers() : LiveData<ExampleLanguages> {
        Log.d("TAG", "getRepositories: ")
        val apiResponse = MutableLiveData<ExampleLanguages>()
        val apiService = endpoints.getClient()!!.create(GetService::class.java)
        val call : Call<List<ExampleLanguages?>>? = apiService.getLanguages(key, host)
        call?.enqueue(object : Callback<List<ExampleLanguages?>> {
            override fun onFailure(call: Call<List<ExampleLanguages?>>, t: Throwable) {
                Log.d("TAG", "onFailure: " + t)
            }

            override fun onResponse(
                call: Call<List<ExampleLanguages?>>,
                response: Response<List<ExampleLanguages?>>
            ) {
                if (response!!.isSuccessful) {
                    Log.d("TAG", "onResponse: " + response.body()?.get(0)?.getData())
                    // apiResponse.postValue(ApiResponse(response.body()!!))
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