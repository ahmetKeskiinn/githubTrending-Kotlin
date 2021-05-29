package example.com.githubtrendingkotlin.ui.Projects

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import example.com.githubtrendingkotlin.DataBase.Developers.DevelopersRepo
import example.com.githubtrendingkotlin.DataBase.Repositories.RepoRepository
import example.com.githubtrendingkotlin.Models.Repositories.Example

class ProjectsViewModel(private val mRepo : RepoRepository) : ViewModel() {
    private var quote : LiveData<Example>? = null

    fun getProjectData(): LiveData<Example>{
        quote = mRepo.getRepositories()
        return quote as LiveData<Example>
    }
}