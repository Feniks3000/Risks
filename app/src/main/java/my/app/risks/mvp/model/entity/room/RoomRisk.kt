package my.app.risks.mvp.model.entity.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class RoomRisk(
    @PrimaryKey val id: Long,
    val registryId: Long,
    val typeId: Long,
    val name: String,
    val occurrenceProbability: Float,
    val detectionProbability: Float,
    val significance: Float,
    val value: Float,
    val priority: Int
)