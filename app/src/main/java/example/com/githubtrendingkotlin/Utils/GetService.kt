package example.com.githubtrendingkotlin.Utils

import android.telecom.Call
import example.com.githubtrendingkotlin.Models.Repositories.Example
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface GetService {
    @GET("repositories")
    fun getRepositories(@Header("x-rapidapi-key") key:String?,
                        @Header("x-rapidapi-host") host: String?,
                        @Query("language") language: String?,
                        @Query ("since") since:String?,
                        @Query("spoken_language_code") langCode : String?): retrofit2.Call<List<Example?>>?

}