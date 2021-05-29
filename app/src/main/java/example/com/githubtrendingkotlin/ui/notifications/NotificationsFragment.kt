package example.com.githubtrendingkotlin.ui.notifications

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

class NotificationsFragment : Fragment() {
    // Lazy Inject ViewModel
    // private val viewModel: NotificationsViewModel by viewModel
    private lateinit var viewModel: NotificationsViewModel
    private lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_notifications, container, false)
        initialVM()
        getData(false)
        return root
    }
    private fun initialVM(){
        viewModel = ViewModelProvider(
            this,
            Factory(Application(), RepoRepository())
        ).get(NotificationsViewModel::class.java)
    }
    private fun getData(refresh : Boolean) {
        Log.d("TAG", "getData: ")
        viewModel.getQuoteData(refresh).observe(this, Observer {
            Log.d("asdas", "asdasdas")

        })
    }
}