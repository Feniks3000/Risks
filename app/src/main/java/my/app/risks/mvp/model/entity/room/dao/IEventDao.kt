package my.app.risks.mvp.model.entity.room.dao

import androidx.room.*
import my.app.risks.mvp.model.entity.room.RoomEvent

@Dao
interface IEventDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(event: RoomEvent)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg events: RoomEvent)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(events: List<RoomEvent>)

    @Update
    fun update(event: RoomEvent)

    @Update
    fun update(vararg events: RoomEvent)

    @Update
    fun update(events: List<RoomEvent>)

    @Delete
    fun delete(event: RoomEvent)

    @Delete
    fun delete(vararg events: RoomEvent)

    @Delete
    fun delete(events: List<RoomEvent>)

    @Query("SELECT * FROM RoomEvent")
    fun getAll(): List<RoomEvent>

    @Query("SELECT * FROM RoomEvent WHERE id = :id")
    fun findById(id: Long): RoomEvent?

    @Query("SELECT * FROM RoomEvent WHERE riskId = :riskId")
    fun findByRiskId(riskId: Long): List<RoomEvent>
}