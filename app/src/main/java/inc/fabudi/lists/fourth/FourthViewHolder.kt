package inc.fabudi.lists.fourth

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import inc.fabudi.lists.R

class FourthViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val image = itemView.findViewById<ImageView>(R.id.fourth_image)
    private val text = itemView.findViewById<TextView>(R.id.fourth_label)

    fun bind(sight: Sight) {
        Glide.with(itemView).load(sight.url).centerCrop().into(image)
        text.text = sight.location
    }
}