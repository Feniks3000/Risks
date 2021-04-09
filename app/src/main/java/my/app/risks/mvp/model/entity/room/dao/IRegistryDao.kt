package my.app.risks.mvp.model.entity.room.dao

import androidx.room.*
import my.app.risks.mvp.model.entity.room.RoomRegistry

@Dao
interface IRegistryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(registry: RoomRegistry)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg registers: RoomRegistry)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(registers: List<RoomRegistry>)

    @Update
    fun update(registry: RoomRegistry)

    @Update
    fun update(vararg registers: RoomRegistry)

    @Update
    fun update(registers: List<RoomRegistry>)

    @Delete
    fun delete(registry: RoomRegistry)

    @Delete
    fun delete(vararg registers: RoomRegistry)

    @Delete
    fun delete(registers: List<RoomRegistry>)

    @Query("SELECT * FROM RoomRegistry")
    fun getAll(): List<RoomRegistry>

    @Query("SELECT * FROM RoomRegistry WHERE id = :id")
    fun findById(id: Long): RoomRegistry?

}