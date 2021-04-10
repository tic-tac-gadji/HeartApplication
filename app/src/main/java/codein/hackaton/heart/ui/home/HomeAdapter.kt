package codein.hackaton.heart.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_makes.view.*
import codein.hackaton.heart.R
import codein.hackaton.heart.models.Make
import com.squareup.picasso.Picasso

class HomeAdapter (
    private val makesClickListener: ((Make) -> Unit)?
//    private val itemWidth: Int
    ): RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

        private val makes = arrayListOf<Make>()

        fun setData (banners: ArrayList<Make>){
            this.makes.run{
                clear()
                addAll(banners)
            }
            notifyDataSetChanged()
        }

    override fun getItemCount() = makes.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder (
           view =  LayoutInflater.from(parent.context).inflate(R.layout.item_makes, parent, false),
                   makesClickListener = makesClickListener
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(makes[position])
    }

    inner class ViewHolder(view: View,
          private val makesClickListener: ((Make)-> Unit)?
    ): RecyclerView.ViewHolder(view) {

        private fun View.requestNewSize(
                width: Int
        ) {
            layoutParams.width = width

        }
        init {
//            itemView.requestNewSize(itemWidth)
        }


        fun bindData(type: Make) {
            itemView.makesTitle.text = type.nickname
            itemView.make_price.text = type.price
            itemView.descriptionMakes.text = type.description

            Picasso
                    .get()
                    .load(type.pic)
                    .placeholder(R.drawable.ic_launcher_foreground)
                    .into(itemView.makesImage)

            itemView.setOnClickListener { makesClickListener?.invoke(type) }

        }
    }

}