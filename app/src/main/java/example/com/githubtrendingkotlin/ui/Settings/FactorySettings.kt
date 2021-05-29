package example.com.githubtrendingkotlin.ui.Settings

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import example.com.githubtrendingkotlin.DataBase.Repositories.RepoRepository

class FactorySettings(private val mApplication: Application, private val repo : RepoRepository) :
    ViewModelProvider.Factory {
    private val mParam: String? = null
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SettingsViewModel(repo) as T
    }
}