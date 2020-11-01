package com.datatype.C7_coroutine.common

object HttpError{
    const val HTTP_ERROR_NO_DATA = 999
    const val HTTP_ERROR_UNKNOWN = 998
}

data class HttpException(val code: Int): Exception()