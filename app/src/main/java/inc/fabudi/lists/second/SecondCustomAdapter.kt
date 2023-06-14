package inc.fabudi.lists.second

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import inc.fabudi.lists.R
import inc.fabudi.lists.User

class SecondCustomAdapter(private var users: ArrayList<User>? = null) :
    RecyclerView.Adapter<SecondViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.three_row_item, parent, false)
        return SecondViewHolder(view)
    }

    override fun getItemCount(): Int {
        return if (users == null) 0 else users!!.size
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.bind(users!![position])
    }
}