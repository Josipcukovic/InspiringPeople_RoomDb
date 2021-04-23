package josip.cukovic.lv2inspiringpeople.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import josip.cukovic.lv2inspiringpeople.model.InspiringPerson

@Database(entities = [InspiringPerson::class], version = 1)
abstract class PeopleDatabase : RoomDatabase() {
    abstract fun personDao () : PersonDao

    companion object{
        const val NAME = "peopleDb"
    }

}