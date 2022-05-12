package fr.eni.tpprogrammation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import fr.eni.tpprogrammation.databinding.ItemListProgBinding

class LangageAdapter(val arrayListLangage: ArrayList<Langage>) : RecyclerView.Adapter<LangageAdapter.LangageVH>() {
    class LangageVH constructor(val binding: ItemListProgBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LangageVH {
        val binding = ItemListProgBinding.inflate(LayoutInflater.from(parent.context),
        parent, false)
        return LangageVH(binding)
    }

    override fun onBindViewHolder(holder: LangageVH, position: Int) {
        holder.binding.langage = arrayListLangage[position]
    }

    override fun getItemCount(): Int = arrayListLangage.size


}