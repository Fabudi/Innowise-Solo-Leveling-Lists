package inc.fabudi.lists.third

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import inc.fabudi.lists.R

class ThirdFragment : Fragment(R.layout.third_layout) {
    private lateinit var list: RecyclerView
    private lateinit var adapter: ThirdCustomAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.third_layout, container, false)
        list = view.findViewById(R.id.third_list)
        adapter = ThirdCustomAdapter(20)
        list.adapter = adapter
        return view
    }
}