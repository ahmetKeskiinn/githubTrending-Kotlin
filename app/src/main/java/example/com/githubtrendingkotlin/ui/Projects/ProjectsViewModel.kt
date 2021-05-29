package example.com.githubtrendingkotlin.ui.Projects

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import example.com.githubtrendingkotlin.DataBase.Developers.DevelopersRepo
import example.com.githubtrendingkotlin.DataBase.Repositories.RepoRepository
import example.com.githubtrendingkotlin.Models.Developers.ExampleDevelopers
import example.com.githubtrendingkotlin.Models.Repositories.Example

class ProjectsViewModel(private val mRepo : RepoRepository) : ViewModel() {
    private var quote : LiveData<List<Example>>? = null

    fun getProjectData(): LiveData<List<Example>>{
        quote = mRepo.getRepositories()
        return quote as LiveData<List<Example>>
    }
}
