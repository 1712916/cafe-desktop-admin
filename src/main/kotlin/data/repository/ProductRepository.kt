package data.repository

import data.entity.*

interface ProductRepository :  CrudRepository<ProductEntity, Id> {}
