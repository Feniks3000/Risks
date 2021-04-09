package my.app.risks.mvp.model.entity.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
class RoomEvent(
    @PrimaryKey val id: Long,
    val riskId: Long,
    val name: String,
    val responsible: String,
    val date: Date
)