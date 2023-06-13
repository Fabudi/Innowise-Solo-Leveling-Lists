package inc.fabudi.lists.third

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import inc.fabudi.lists.R

class ThirdCustomAdapter(private var size: Int) :
    RecyclerView.Adapter<ThirdViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThirdViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.third_card_item, parent, false)
        return ThirdViewHolder(view)
    }

    override fun getItemCount(): Int {
        return size
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: ThirdViewHolder, position: Int) {
        holder.bind(position)
    }
}