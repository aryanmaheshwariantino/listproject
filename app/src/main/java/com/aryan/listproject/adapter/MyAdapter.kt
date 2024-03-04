
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aryan.listproject.R

class MyAdapter(private val dataList: List<Item>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.material_card, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = dataList[position]
        holder.titleTextView.text = data.bigtitle
        holder.subtitleTextView.text = data.title
        holder.subtitleTextView2.text = data.total_views
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.title)
        val subtitleTextView: TextView = itemView.findViewById(R.id.title2)
        val subtitleTextView2: TextView = itemView.findViewById(R.id.title3)
    }
}
