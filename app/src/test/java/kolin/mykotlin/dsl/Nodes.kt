package kolin.mykotlin.dsl

/**
 * desc:
 */
fun html(block: Tag.() -> Unit): Tag {
    return Tag("html").apply(block)
}

fun Tag.head(block: Head.() -> Unit) {
    this@head.children + Head().apply(block)
}

fun Tag.body(block: Body.() -> Unit) {
    this@body + Body().apply(block)
}

class StringNode(val content: String) : Node {
    override fun render(): String {
        return content
    }
}

class Head : Tag("head")
class Body : Tag("body") {
    var id by MapDelegate(proerties)
    var `class` by MapDelegate(proerties)
}
