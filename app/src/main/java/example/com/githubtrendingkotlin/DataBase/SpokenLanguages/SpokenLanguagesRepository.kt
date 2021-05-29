package example.com.githubtrendingkotlin.DataBase.SpokenLanguages

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import example.com.githubtrendingkotlin.Models.Repositories.Example
import example.com.githubtrendingkotlin.Models.SpokenLanguages.ExampleSpoken
import example.com.githubtrendingkotlin.Utils.Api
import example.com.githubtrendingkotlin.Utils.GetService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SpokenLanguagesRepository (private val key: String?, private val host : String?, private val language : String?, private val since : String, private val langCode : String?) {
    var endpoints : Api = Api()
    fun getDevelopers() : LiveData<ExampleSpoken> {
        Log.d("TAG", "getRepositories: ")
        val apiResponse = MutableLiveData<ExampleSpoken>()
        val apiService = endpoints.getClient()!!.create(GetService::class.java)
        val call : Call<List<ExampleSpoken?>>? = apiService.getSpokenLanguages(key, host)
        call?.enqueue(object : Callback<List<ExampleSpoken?>> {
            override fun onFailure(call: Call<List<ExampleSpoken?>>, t: Throwable) {
                Log.d("TAG", "onFailure: " + t)
            }

            override fun onResponse(
                call: Call<List<ExampleSpoken?>>,
                response: Response<List<ExampleSpoken?>>
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