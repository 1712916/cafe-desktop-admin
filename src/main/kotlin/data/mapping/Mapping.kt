package data.mapping

interface Mapping<T, D> {
    fun mapping(source: T): D
}
