package data.repository

interface CrudRepository<T, ID> {
    suspend  fun  create(item: T): Boolean
    suspend fun read(id: ID): T
    suspend fun update(item: T) : Boolean
    suspend fun delete(id: ID): Boolean
}


interface ListRepository<T> {
    suspend fun getAll(): List<T>
}
