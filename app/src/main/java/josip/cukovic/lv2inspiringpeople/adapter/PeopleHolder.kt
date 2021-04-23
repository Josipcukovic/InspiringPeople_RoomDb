package josip.cukovic.lv2inspiringpeople.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import josip.cukovic.lv2inspiringpeople.InspiringPeopleApp
import josip.cukovic.lv2inspiringpeople.databinding.PersonLayoutBinding
import josip.cukovic.lv2inspiringpeople.model.InspiringPerson

class PeopleHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun bind(person : InspiringPerson){
        val itemBinding = PersonLayoutBinding.bind(itemView)
        itemBinding.ivPersonImage.setImageResource(person.image)
        itemBinding.tvName.text = person.name
        itemBinding.tvDate.text = person.dateOfDeath
        itemBinding.tvDescription.text = person.description

        itemBinding.ivPersonImage.setOnClickListener{ Toast.makeText(InspiringPeopleApp.ApplicationContext, person.quote(), Toast.LENGTH_LONG).show()}
    }

}