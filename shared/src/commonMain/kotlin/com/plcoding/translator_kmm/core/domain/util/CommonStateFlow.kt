package com.plcoding.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.StateFlow

fun <T> StateFlow<T>.toCommonStateFlow() = CommonStateFlow(this)
expect open class CommonStateFlow<T>(flow: StateFlow<T>): StateFlow<T>