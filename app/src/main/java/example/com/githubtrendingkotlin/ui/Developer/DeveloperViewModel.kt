package example.com.githubtrendingkotlin.ui.Developer

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import example.com.githubtrendingkotlin.DataBase.Developers.DevelopersRepo
import example.com.githubtrendingkotlin.Models.Repositories.Example

class DeveloperViewModel(private val mRepo : DevelopersRepo) : ViewModel() {
    private var quote : LiveData<Example>? = null

    fun getDeveloperData(): LiveData<Example>{
        quote = mRepo.getDevelopers()
        return quote as LiveData<Example>
    }
}