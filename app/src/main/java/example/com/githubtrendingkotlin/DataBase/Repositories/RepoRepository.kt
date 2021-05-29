package example.com.githubtrendingkotlin.DataBase.Repositories

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import example.com.githubtrendingkotlin.Models.Repositories.Example
import example.com.githubtrendingkotlin.Utils.Api
import example.com.githubtrendingkotlin.Utils.GetService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepoRepository {
    var endpoints : Api = Api()
    fun getRepositories() : LiveData<Example> {
        Log.d("TAG", "getRepositories: ")
        val apiResponse = MutableLiveData<Example>()
        val apiService = endpoints.getClient()!!.create(GetService::class.java)
        val call : Call<List<Example?>>? = apiService.getRepositories("966dd09665mshfee82873a81b1f5p1a2d3bjsnb22c69531b3e",
            "github-trending.p.rapidapi.com",
            "rust",
            "daily" ,
            "en")
        call?.enqueue(object : Callback<List<Example?>> {

            override fun onFailure(call: Call<List<Example?>>, t: Throwable) {
                Log.d("TAG", "onFailure: " + t)
            }

            override fun onResponse(
                call: Call<List<Example?>>,
                response: Response<List<Example?>>
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

