package com.plcoding.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.MutableStateFlow

fun <T> MutableStateFlow<T>.toCommonMutableStateFlow() = CommonMutableStateFlow(this)
expect class CommonMutableStateFlow<T>(flow: MutableStateFlow<T>) : MutableStateFlow<T>