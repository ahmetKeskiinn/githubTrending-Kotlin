package example.com.githubtrendingkotlin.ui.Projects

import android.app.Application
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import example.com.githubtrendingkotlin.DataBase.Repositories.RepoRepository
import example.com.githubtrendingkotlin.R
import example.com.githubtrendingkotlin.ui.Settings.FactorySettings
import example.com.githubtrendingkotlin.ui.Settings.SettingsViewModel

class ProjectsFragment : Fragment() {

    private lateinit var viewModel: ProjectsViewModel
    private lateinit var root: View


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_home, container, false)
        Log.d("TAG", "onCreateView: " + "asdasdasdasdasdasdasdsadsa")
        return root
    }

    private fun initialVM(){
        val key = "966dd09665mshfee82873a81b1f5p1a2d3bjsnb22c69531b3e"
        val host = "github-trending.p.rapidapi.com"
        viewModel = ViewModelProvider(
            this,
            FactoryProject(Application(), RepoRepository(key, host , "rust" , "daily","en"))
        ).get(ProjectsViewModel::class.java)
    }
    private fun getData() {
        Log.d("TAG", "getData: ")
        viewModel.getProjectData().observe(this, Observer {
            Log.d("asdas", "asdasdas")

        })
    }

}