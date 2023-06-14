package inc.fabudi.lists.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import inc.fabudi.lists.R
import inc.fabudi.lists.UserGenerator

class SecondFragment : Fragment(R.layout.second_layout) {
    private lateinit var list: RecyclerView
    private lateinit var adapter: SecondCustomAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.second_layout, container, false)
        list = view.findViewById(R.id.second_list)
        adapter = SecondCustomAdapter(UserGenerator.users)
        list.adapter = adapter
        return view
    }
}