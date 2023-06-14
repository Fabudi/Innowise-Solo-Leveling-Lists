package inc.fabudi.lists.fourth

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import inc.fabudi.lists.R

class FourthAdapter(private var sights: ArrayList<Sight>? = null) :
    RecyclerView.Adapter<FourthViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FourthViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        return when(viewType){
            FULL, HALF -> FourthViewHolder(inflater.inflate(R.layout.fourth_item, parent, false))
            QUARTER -> FourthViewHolder(inflater.inflate(R.layout.fourth_item_half, parent, false))
            else -> {FourthViewHolder(inflater.inflate(R.layout.fourth_item, parent, false))}
        }
    }

    override fun getItemViewType(pos: Int): Int {
        return when (pos % 8) {
            0, 5 -> HALF
            3, 7 -> FULL
            else -> QUARTER
        }
    }

    override fun getItemCount(): Int {
        return if (sights == null) 0 else sights!!.size
    }

    override fun onBindViewHolder(holder: FourthViewHolder, position: Int) {
        holder.bind(sights!![position])
    }

    companion object {
        const val FULL = 0
        const val HALF = 1
        const val QUARTER = 2
    }
}