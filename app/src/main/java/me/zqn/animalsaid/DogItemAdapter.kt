package me.zqn.animalsaid

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import me.zqn.animalsaid.data.DogInfo

class DogItemAdapter(
    private val context: Context,
    private val dataset: List<DogInfo>
    ): RecyclerView.Adapter<DogItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.small_image)
        val textView1: TextView = view.findViewById(R.id.title)
        val button: Button = view.findViewById(R.id.btu1)

    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_dog, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView1.text = context.resources.getString(item.name)
        holder.imageView.setImageResource(item.imageId)
        holder.button.setOnClickListener{
            val context = holder.view.context
            val intent = Intent(context, DogDetailActivity::class.java)
            intent.putExtra("name", item.name)
            intent.putExtra("pic", item.imageId)
            intent.putExtra("detail", item.introduce)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size
}