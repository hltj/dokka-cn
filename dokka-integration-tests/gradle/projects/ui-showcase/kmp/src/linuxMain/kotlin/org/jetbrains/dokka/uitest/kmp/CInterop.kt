@file:Suppress("unused")

package org.jetbrains.dokka.uitest.kmp

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi

/**
 * Low-level Linux function
 */
@OptIn(ExperimentalForeignApi::class)
fun <T : CPointed> printPointerRawValue(pointer: CPointer<T>) {
    println(pointer.rawValue)
}
