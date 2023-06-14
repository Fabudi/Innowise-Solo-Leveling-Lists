package inc.fabudi.lists.fourth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import inc.fabudi.lists.R
import io.plaidapp.ui.recyclerview.SpannedGridLayoutManager
import io.plaidapp.ui.recyclerview.SpannedGridLayoutManager.SpanInfo


class FourthFragment : Fragment(R.layout.fourth_layout) {
    private lateinit var list: RecyclerView
    private lateinit var adapter: FourthAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fourth_layout, container, false)
        list = view.findViewById(R.id.fourth_list)
        val displayMetrics = view.context.resources.displayMetrics
        val dpWidth = displayMetrics.widthPixels / displayMetrics.density
        val manager = SpannedGridLayoutManager(
            { position ->
                when (position % 8) {
                    0, 5 -> SpanInfo(2, 2)
                    3, 7 -> SpanInfo(3, 2)
                    else -> SpanInfo(1, 1)
                }
            }, 3, 2 / 3f * dpWidth / 100
        )
        list.layoutManager = manager
        list.itemAnimator = null

        adapter = FourthAdapter(SightsGenerator.sights)
        list.adapter = adapter
        return view
    }
}