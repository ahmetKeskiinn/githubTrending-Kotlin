package example.com.githubtrendingkotlin.ui.Settings

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
import example.com.githubtrendingkotlin.ui.Projects.FactoryProject

class SettingsFragment : Fragment() {
    // Lazy Inject ViewModel
    // private val viewModel: NotificationsViewModel by viewModel
    private lateinit var viewModel: SettingsViewModel
    private lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_notifications, container, false)
        initialVM()
        getData()
        return root
    }
    private fun initialVM(){
        val key = "966dd09665mshfee82873a81b1f5p1a2d3bjsnb22c69531b3e"
        val host = "github-trending.p.rapidapi.com"
        viewModel = ViewModelProvider(
            this,
            FactorySettings(Application(), RepoRepository(key, host , "rust" , "daily","en"))
        ).get(SettingsViewModel::class.java)
    }
    private fun getData() {
        Log.d("TAG", "getData: ")
        viewModel.getSettingsData().observe(this, Observer {
            Log.d("asdas", "asdasdas")

        })
    }
}