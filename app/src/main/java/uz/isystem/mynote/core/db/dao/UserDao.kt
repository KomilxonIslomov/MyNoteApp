package uz.isystem.mynote.core.db.dao

import androidx.room.*
import uz.isystem.mynote.core.models.Notes

@Dao
interface UserDao {
    @Query("SELECT*FROM notes  ORDER BY id DESC ")
    fun getAllUsers(): List<Notes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(userData: Notes)

    @Delete()
    fun deleteUser(userData: Notes)

    @Query("UPDATE notes SET title=:title,notes=:notes WHERE ID=:id")
    fun update(id: Int, title: String, notes: String)

    @Query("UPDATE notes SET pinned=:pin WHERE ID=:id")
    fun pin(id: Int, pin: Boolean)

}