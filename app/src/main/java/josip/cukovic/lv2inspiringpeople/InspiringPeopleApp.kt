package josip.cukovic.lv2inspiringpeople

import android.app.Application
import android.content.Context

class InspiringPeopleApp : Application(){

    companion object{
        lateinit var ApplicationContext : Context
        private set
    }

    override fun onCreate() {
        super.onCreate()
        ApplicationContext = this
    }
}