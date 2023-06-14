package inc.fabudi.lists.second

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import inc.fabudi.lists.R
import inc.fabudi.lists.Sex
import inc.fabudi.lists.User

class SecondViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val firstLine = itemView.findViewById<TextView>(R.id.second_first_line)
    private val secondLine = itemView.findViewById<TextView>(R.id.second_second_line)
    private val icon = itemView.findViewById<ImageView>(R.id.second_icon)
    private val avatar = itemView.findViewById<AppCompatImageView>(R.id.second_avatar)

    fun bind(user: User) {
        firstLine.text = "${user.firstName} ${user.lastName}"
        secondLine.text = "Age: ${user.age}\n${user.description}"
        when (user.sex) {
            Sex.FEMALE -> icon.setBackgroundResource(R.drawable.baseline_woman_24)
            Sex.MALE -> icon.setBackgroundResource(R.drawable.baseline_man_2_24)
            Sex.UNKNOWN -> icon.visibility = View.INVISIBLE
        }
        Glide.with(itemView).load(user.squareAvatarUrl).centerCrop().into(avatar)
    }
}