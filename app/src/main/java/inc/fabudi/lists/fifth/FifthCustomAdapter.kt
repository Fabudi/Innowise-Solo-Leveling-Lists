package inc.fabudi.lists.fifth

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import inc.fabudi.lists.R
import inc.fabudi.lists.User

class FifthCustomAdapter(private var users: ArrayList<User>? = null) :
    RecyclerView.Adapter<FifthViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FifthViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.two_row_item, parent, false)
        return FifthViewHolder(view)
    }

    override fun getItemCount(): Int {
        return if (users == null) 0 else users!!.size
    }

    override fun onBindViewHolder(holder: FifthViewHolder, position: Int) {
        holder.bind(users!![position])
    }

    fun setUpData(data: ArrayList<User>?){
        users = data
        notifyDataSetChanged()
    }
}