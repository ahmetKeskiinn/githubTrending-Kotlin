package example.com.githubtrendingkotlin.ui.notifications

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import example.com.githubtrendingkotlin.DataBase.Repositories.RepoRepository
import example.com.githubtrendingkotlin.Models.Repositories.Example

class NotificationsViewModel(private val mApiRepo: RepoRepository) : ViewModel() {
    private var quote : LiveData<Example>? = null

    fun getQuoteData(refresh: Boolean): LiveData<Example>{
        Log.d("TAG", "getQuoteData: ")
        if(refresh){
            quote = null
        }
        if (this.quote == null) {
            quote = mApiRepo.getRepositories()
            return quote as LiveData<Example>
        }
        return quote as LiveData<Example>
    }
}