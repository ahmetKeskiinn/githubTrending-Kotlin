package example.com.githubtrendingkotlin.ui.Projects

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import example.com.githubtrendingkotlin.DataBase.Developers.DevelopersRepo
import example.com.githubtrendingkotlin.DataBase.Repositories.RepoRepository
import example.com.githubtrendingkotlin.ui.Developer.DeveloperViewModel
import example.com.githubtrendingkotlin.ui.Settings.SettingsViewModel


class FactoryProject(private val mApplication: Application, private val repo : RepoRepository) :
    ViewModelProvider.Factory {
    private val mParam: String? = null
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ProjectsViewModel(repo) as T
    }
}