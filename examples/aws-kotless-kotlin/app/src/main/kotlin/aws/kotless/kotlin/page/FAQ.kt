@file:Suppress("unused")

package aws.kotless.kotlin.page

import aws.kotless.kotlin.pages.FAQPages
import io.kotless.dsl.lang.http.Get

object FAQ {
    @Get("/pages/faq")
    fun faq() = FAQPages.faq()
}
