package com.bigaton.hogwarts.ui.main


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bigaton.hogwarts.R
import com.bigaton.hogwarts.databinding.ItemHouseBinding
import com.bigaton.hogwarts.ui.HouseType
import com.bigaton.hogwarts.ui.HouseType.*

class MainAdapter(val action: (ImageView, HouseType) -> Unit) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    private val items = mutableListOf(
        Gryffindor,
        Slytherin,
        Ravenclaw,
        Hufflepuff
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataBindingUtil.inflate<ItemHouseBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_house,
            parent,
            false
        ).let { MainViewHolder(it) }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) =
        holder.bind(items[position])

    inner class MainViewHolder(private val binding: ItemHouseBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                action(
                    binding.imageViewItemHouseLogo,
                    items[bindingAdapterPosition]
                )
            }
        }

        fun bind(item: HouseType) {
            binding.apply {
                house = item
                executePendingBindings()
            }
        }
    }
}