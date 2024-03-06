import android.app.AlertDialog
import android.content.Context
import android.text.InputType
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import com.aryan.listproject.databinding.MaterialCardBinding
import com.aryan.listproject.models.ItemModel

class ChildAdapter(private val dataList: List<ItemModel>) :
    RecyclerView.Adapter<ChildAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            MyViewHolder {
        val binding = MaterialCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = dataList[position]
        holder.binding.apply  {
            imageview.setImageResource(data.image)
            title.text = data.bigtitle
            title2.text = data.title
            title3.text = data.total_views

            title.setOnClickListener {
                DialogEditBox(holder.itemView.context, position)
            }
        }
    }
    override fun getItemCount(): Int = dataList.size

    inner class MyViewHolder(val binding: MaterialCardBinding) : RecyclerView.ViewHolder(binding.root)

    private fun DialogEditBox(context: Context, position: Int) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle("Edit Title")

        val input = EditText(context)
        input.inputType = InputType.TYPE_CLASS_TEXT
        input.setText(dataList[position].bigtitle)
        builder.setView(input)


        builder.setPositiveButton("OK") { dialog, _ ->
            val newText = input.text.toString()
            if (newText.isNotEmpty()) {
                dataList[position].bigtitle = newText
                notifyItemChanged(position)
            }
            dialog.dismiss()
        }
        builder.setNegativeButton("Cancel") { dialog, _ -> dialog.cancel() }
        builder.show()
    }

}
