package josip.cukovic.lv2inspiringpeople.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import josip.cukovic.lv2inspiringpeople.R
import java.io.Serializable
@Entity(tableName = "InspiringPeople")
class InspiringPerson(
    @ColumnInfo(name = "name") val name:String,
    @ColumnInfo(name = "date")val dateOfDeath : String,
    @ColumnInfo(name = "description")val description : String,
    @ColumnInfo(name = "quote") val quote : String,
    @ColumnInfo(name = "image")val image : Int = R.drawable.character,
    @PrimaryKey(autoGenerate = true) val id : Int = 0) {


    @Ignore
    fun quote():String{
        return quote
    }

}