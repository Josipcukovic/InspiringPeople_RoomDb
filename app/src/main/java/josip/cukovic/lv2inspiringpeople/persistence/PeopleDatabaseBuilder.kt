package josip.cukovic.lv2inspiringpeople.persistence

import androidx.room.Room
import josip.cukovic.lv2inspiringpeople.InspiringPeopleApp

object PeopleDatabaseBuilder {

    private var instance: PeopleDatabase? = null

    fun getInstance(): PeopleDatabase {
        synchronized(PeopleDatabase::class) {
            if (instance == null) {
                instance = buildDatabase()
            }
        }
        return instance!!
    }

    private fun buildDatabase(): PeopleDatabase {
        return Room.databaseBuilder(InspiringPeopleApp.ApplicationContext, PeopleDatabase::class.java, PeopleDatabase.NAME)
                .allowMainThreadQueries()
                .build()
    }
}