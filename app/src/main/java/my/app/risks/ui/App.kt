package my.app.risks.ui

import android.app.Application
import my.app.risks.di.AppComponent
import my.app.risks.di.DaggerAppComponent
import my.app.risks.di.module.AppModule
import my.app.risks.mvp.model.entity.room.db.Database

class App : Application() {

    companion object {
        lateinit var instance: App
    }

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        Database.create(this)

        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}