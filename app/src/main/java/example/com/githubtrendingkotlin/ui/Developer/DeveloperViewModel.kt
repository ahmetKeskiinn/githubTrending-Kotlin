package example.com.githubtrendingkotlin.ui.Developer

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import example.com.githubtrendingkotlin.DataBase.Developers.DevelopersRepo
import example.com.githubtrendingkotlin.Models.Developers.ExampleDevelopers
import example.com.githubtrendingkotlin.Models.Repositories.Example

class DeveloperViewModel(private val mRepo : DevelopersRepo) : ViewModel() {
    private var quote : LiveData<List<ExampleDevelopers>>? = null

    fun getDeveloperData(): LiveData<List<ExampleDevelopers>>{
        quote = mRepo.getDevelopers()
        return quote as LiveData<List<ExampleDevelopers>>
    }
}