package fr.eni.mod10rvclimat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import fr.eni.mod10rvclimat.databinding.ItemListClimBinding

class ClimatisationAdapter(val arrayListClim: ArrayList<Climatisation>, val listenerClim : OnClimClickListener) : RecyclerView.Adapter<ClimatisationAdapter.ClimatisationVH>() {
    class ClimatisationVH constructor(val binding: ItemListClimBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClimatisationVH {
        val binding = ItemListClimBinding.inflate(LayoutInflater.from(parent.context),
        parent, false)
        return ClimatisationVH(binding)
    }

    override fun onBindViewHolder(holder: ClimatisationVH, position: Int) {
        holder.binding.clim = arrayListClim[position]
        holder.itemView.setOnClickListener {
            listenerClim.onClimClick(arrayListClim[position])
        }
    }

    override fun getItemCount(): Int = arrayListClim.size

    class OnClimClickListener(val listener: (clim:Climatisation) -> Unit) {
        fun onClimClick(clim: Climatisation) = listener(clim)
    }
}