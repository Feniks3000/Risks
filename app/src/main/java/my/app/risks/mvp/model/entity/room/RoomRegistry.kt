package my.app.risks.mvp.model.entity.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
class RoomRegistry(
    @PrimaryKey val id: Long,
    val productionName: String,
    val evaluationModel: String,
    val scaleFrom: Int,
    val scaleTo: Int,
    val date: Date
)