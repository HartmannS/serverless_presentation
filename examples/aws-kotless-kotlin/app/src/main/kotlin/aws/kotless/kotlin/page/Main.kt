@file:Suppress("unused")

package aws.kotless.kotlin.page

import aws.kotless.kotlin.pages.MainPages
import io.kotless.MimeType
import io.kotless.dsl.lang.http.Get

object Main {
    @Get("/", MimeType.HTML)
    fun root() = MainPages.root()
}
