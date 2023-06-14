package inc.fabudi.lists.first

import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import inc.fabudi.lists.R
import inc.fabudi.lists.Sex
import inc.fabudi.lists.User

class FirstViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val titleLabel = itemView.findViewById<TextView>(R.id.title_label)
    private val secondaryLabel = itemView.findViewById<TextView>(R.id.secondary_label)
    private val avatar = itemView.findViewById<AppCompatImageView>(R.id.avatar)
    private val icon = itemView.findViewById<AppCompatImageView>(R.id.icon)

    fun bind(user: User) {
        titleLabel.text = "${user.firstName} ${user.lastName}"
        secondaryLabel.text = "Age: ${user.age}"
        when (user.sex) {
            Sex.FEMALE -> icon.setBackgroundResource(R.drawable.baseline_woman_24)
            Sex.MALE -> icon.setBackgroundResource(R.drawable.baseline_man_2_24)
            Sex.UNKNOWN -> icon.visibility = View.INVISIBLE
        }
        Glide.with(itemView).load(user.squareAvatarUrl).centerCrop().into(avatar)
    }
}