/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package com.example

<<<<<<<< HEAD:libraries/tools/kotlin-gradle-plugin-integration-tests/src/test/resources/testProject/kotlin-js-browser-library-project/app/src/main/kotlin/App.kt
fun main() {
    require("css/main.css")
    println("Sheldon: ${sheldon()}")
}

external fun require(o: String)
========
fun answer(): Int {
    return best()
}

fun sheldon(): Int {
    return simpleBest()
}
>>>>>>>> jetbrains/2.0.0-Beta2:libraries/tools/kotlin-gradle-plugin-integration-tests/src/test/resources/testProject/kotlin-js-browser-library-project/lib/src/main/kotlin/Lib.kt
