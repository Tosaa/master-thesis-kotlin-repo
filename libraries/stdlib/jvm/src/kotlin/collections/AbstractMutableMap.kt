/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package kotlin.collections

import java.util.AbstractMap

/**
 * Provides a skeletal implementation of the [MutableMap] interface.
 *
 * The implementor is required to implement [entries] property, which should return mutable set of map entries, and [put] function.
 *
 * @param K the type of map keys. The map is invariant in its key type.
 * @param V the type of map values. The map is invariant in its value type.
 */
@SinceKotlin("1.1")
@Suppress("ACTUAL_CLASSIFIER_MUST_HAVE_THE_SAME_MEMBERS_AS_NON_FINAL_EXPECT_CLASSIFIER_WARNING", "ACTUAL_CLASSIFIER_MUST_HAVE_THE_SAME_SUPERTYPES_AS_NON_FINAL_EXPECT_CLASSIFIER_WARNING") // Can be dropped after bootstrap update
public actual abstract class AbstractMutableMap<K, V> protected actual constructor() : MutableMap<K, V>, AbstractMap<K, V>() {
    /**
     * Associates the specified [value] with the specified [key] in the map.
     *
     * This method is redeclared as abstract, because it's not implemented in the base class,
     * so it must be always overridden in the concrete mutable collection implementation.
     *
     * @return the previous value associated with the key, or `null` if the key was not present in the map.
     */
    actual abstract override fun put(key: K, value: V): V?
}