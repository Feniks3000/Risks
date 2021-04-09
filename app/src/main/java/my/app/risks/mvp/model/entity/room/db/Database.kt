package my.app.risks.mvp.model.entity.room.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import my.app.risks.mvp.model.entity.room.RoomEvent
import my.app.risks.mvp.model.entity.room.RoomRegistry
import my.app.risks.mvp.model.entity.room.RoomRisk
import my.app.risks.mvp.model.entity.room.dao.IEventDao
import my.app.risks.mvp.model.entity.room.dao.IRegistryDao
import my.app.risks.mvp.model.entity.room.dao.IRiskDao

@androidx.room.Database(
    entities = [
        RoomRegistry::class,
        RoomRisk::class,
        RoomEvent::class
    ],
    version = 1
)
abstract class Database : RoomDatabase() {
    abstract val registryDao: IRegistryDao
    abstract val riskDao: IRiskDao
    abstract val eventDao: IEventDao

    companion object {
        const val DB_NAME = "database.db"
        private var instance: Database? = null

        fun getInstance() = instance ?: throw IllegalStateException("Database has not been created")

        fun create(context: Context) {
            if (instance == null) {
                instance = Room.databaseBuilder(context, Database::class.java, DB_NAME).build()
            }
        }
    }
}
