package inc.fabudi.lists.third

import android.content.res.ColorStateList
import android.os.Build
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import inc.fabudi.lists.R

class ThirdViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val layout: ConstraintLayout = itemView.findViewById(R.id.third_layout)
    private val text: TextView = itemView.findViewById(R.id.third_label)

    @RequiresApi(Build.VERSION_CODES.O)
    fun bind(position: Int) {
        val index = position % Cards.colors.size
        layout.backgroundTintList = ColorStateList.valueOf(Cards.colors[index])
        text.text = Cards.texts[index]
    }
}