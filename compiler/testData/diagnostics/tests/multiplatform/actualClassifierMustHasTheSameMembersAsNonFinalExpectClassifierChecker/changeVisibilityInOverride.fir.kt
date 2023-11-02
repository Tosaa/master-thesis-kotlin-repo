// MODULE: m1-common
// FILE: common.kt

open class Base {
    protected open fun foo() {}
}

<!INCOMPATIBLE_MATCHING{JVM}, INCOMPATIBLE_MATCHING{JVM}!>expect open class Foo : Base<!>

// MODULE: m2-jvm()()(m1-common)
// FILE: jvm.kt

actual open class Foo : Base() {
    public override fun foo() {}
}
