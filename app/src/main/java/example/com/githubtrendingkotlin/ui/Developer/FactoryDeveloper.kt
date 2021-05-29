package example.com.githubtrendingkotlin.ui.Developer

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import example.com.githubtrendingkotlin.DataBase.Developers.DevelopersRepo
import example.com.githubtrendingkotlin.DataBase.Repositories.RepoRepository
import example.com.githubtrendingkotlin.ui.Settings.SettingsViewModel

class FactoryDeveloper(private val mApplication: Application, private val repo : DevelopersRepo) :
    ViewModelProvider.Factory {
    private val mParam: String? = null
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return DeveloperViewModel(repo) as T
    }
}