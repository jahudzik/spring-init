package com.jahu.springinit.quotes

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * Created by jahudzik on 31/08/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class Value(
        val id: Long,
        val quote: String
)