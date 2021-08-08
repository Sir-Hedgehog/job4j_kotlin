package ru.job4j.dsl.builder

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.1
 * @since 08.08.2021
 */
class NewBasicDataSource private constructor(
    private val driverClassName: String,
    private val url: String,
    private val username: String,
    private val password: String,
    private val minIdle: Int,
    private val maxIdle: Int,
    private val maxOpenPreparedStatements: Int) {

    fun print(): String {
        return "NewBasicDataSource($driverClassName, $url, $username, $password, $minIdle, $maxIdle, $maxOpenPreparedStatements)"
    }

    companion object Builder {

        private var driverClassName : String? = null
        private var url : String? = null
        private var username : String? = null
        private var password : String? = null
        private var minIdle : Int? = null
        private var maxIdle : Int? = null
        private var maxOpenPreparedStatements : Int? = null

        fun driverClassName(value: String) = apply { driverClassName = value }
        fun url(value: String) = apply { url = value }
        fun username(value: String) = apply { username = value }
        fun password(value: String) = apply { password = value }
        fun minIdle(value: Int) = apply { minIdle = value }
        fun maxIdle(value: Int) = apply { maxIdle = value }
        fun maxOpenPreparedStatements(value: Int) = apply { maxOpenPreparedStatements = value }

        fun build() : NewBasicDataSource = NewBasicDataSource(
            driverClassName ?: "",
            url ?: "",
            username ?: "",
            password ?: "",
            minIdle ?: 0,
            maxIdle ?: 0,
            maxOpenPreparedStatements ?: 0)
    }
}

