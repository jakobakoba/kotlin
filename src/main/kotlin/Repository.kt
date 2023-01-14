/**
1.методы должны быть паблик и оверрайд (нарушение: приватные методы недопустимы)
2. свойства должны быть приватными (немутабельными) (нарушение: паблик свойства недопустимы)
3. завсисимости должны приходить в конструктор как интерфейсы (нарушение: вызов конструктора классов внутри других)
 */

interface Repository {

    suspend fun fetch(): Data


    class Base(
        private val cloudDataSource: DataSource,
        private val cacheDataSource: MutableDataSource
    ) : Repository {
        override suspend fun fetch(): Data {
                return if (cacheDataSource.contains())
                    Data(cacheDataSource.fetch())
            else
                Data(cloudDataSource.fetch())

        }


    }
}

interface DataSource {
    suspend fun fetch(): String
}

interface MutableDataSource : DataSource {
    suspend fun contains(): Boolean

}

class Data(private val value: String)