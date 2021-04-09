package my.app.risks.mvp.model.entity.room.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

@androidx.room.Database(
    entities = [
    ],
    version = 1
)
abstract class Database : RoomDatabase() {

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
