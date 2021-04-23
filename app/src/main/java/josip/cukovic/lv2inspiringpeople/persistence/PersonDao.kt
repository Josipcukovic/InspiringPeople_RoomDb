package josip.cukovic.lv2inspiringpeople.persistence

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import josip.cukovic.lv2inspiringpeople.model.InspiringPerson

@Dao
interface PersonDao {
    @Insert
    fun insert(person: InspiringPerson)

    @Delete
    fun delete(person : InspiringPerson)

    @Query("SELECT * FROM InspiringPeople")
    fun getAll() : List<InspiringPerson>
}