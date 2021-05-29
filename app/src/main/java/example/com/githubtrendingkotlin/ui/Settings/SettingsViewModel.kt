package example.com.githubtrendingkotlin.ui.Settings

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import example.com.githubtrendingkotlin.DataBase.Repositories.RepoRepository
import example.com.githubtrendingkotlin.Models.Repositories.Example

class SettingsViewModel(private val mApiRepo: RepoRepository) : ViewModel() {
    private var quote : LiveData<Example>? = null

    fun getSettingsData(): LiveData<Example>{
        quote = mApiRepo.getRepositories()
        return quote as LiveData<Example>
    }
}