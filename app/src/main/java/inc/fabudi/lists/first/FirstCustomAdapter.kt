package inc.fabudi.lists.first

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import inc.fabudi.lists.R
import inc.fabudi.lists.User

class FirstCustomAdapter(private var users: ArrayList<User>? = null) : RecyclerView.Adapter<FirstViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.two_row_item, parent, false)
        return FirstViewHolder(view)
    }

    override fun getItemCount(): Int {
        return if (users == null) 0 else users!!.size
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.bind(users!![position])
    }
}