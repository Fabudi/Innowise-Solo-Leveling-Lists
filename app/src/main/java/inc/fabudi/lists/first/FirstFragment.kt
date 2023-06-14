package inc.fabudi.lists.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import inc.fabudi.lists.R
import inc.fabudi.lists.UserGenerator

class FirstFragment : Fragment(R.layout.first_layout) {
    private lateinit var recyclerView: RecyclerView
    private lateinit var firstCustomAdapter: FirstCustomAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.first_layout, container, false)
        recyclerView = view.findViewById(R.id.firstList)
        firstCustomAdapter = FirstCustomAdapter(UserGenerator.users)
        recyclerView.adapter = firstCustomAdapter
        return view
    }
}