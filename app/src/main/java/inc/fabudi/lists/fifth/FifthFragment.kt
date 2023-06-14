package inc.fabudi.lists.fifth

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import inc.fabudi.lists.R
import inc.fabudi.lists.UserGenerator

class FifthFragment : Fragment(R.layout.fifth_layout) {
    private lateinit var recyclerView: RecyclerView
    private lateinit var refreshLayout: SwipeRefreshLayout
    private lateinit var emptyView: TextView
    private lateinit var fifthCustomAdapter: FifthCustomAdapter
    private lateinit var emptyDataObserver: EmptyDataObserver
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fifth_layout, container, false)
        recyclerView = view.findViewById(R.id.fifth_list)
        emptyView = view.findViewById(R.id.empty_view)
        refreshLayout = view.findViewById(R.id.swipe_to_refresh)
        fifthCustomAdapter = FifthCustomAdapter()
        recyclerView.adapter = fifthCustomAdapter

        Handler(Looper.getMainLooper()).postDelayed({
            view.findViewById<ProgressBar>(R.id.progressBar).visibility = View.GONE
            fifthCustomAdapter.setUpData(UserGenerator.users)
            emptyDataObserver = EmptyDataObserver(recyclerView, emptyView)
            fifthCustomAdapter.registerAdapterDataObserver(emptyDataObserver)
        }, 6000)
        view.findViewById<FloatingActionButton>(R.id.floatingActionButton).setOnClickListener {
            fifthCustomAdapter.setUpData(null)
        }

        refreshLayout.setOnRefreshListener {
            Handler(Looper.getMainLooper()).postDelayed({
                fifthCustomAdapter.setUpData(UserGenerator.users)
                refreshLayout.isRefreshing = false
            }, 3000)
        }
        return view
    }
}