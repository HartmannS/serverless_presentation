@file:Suppress("unused")

package aws.kotless.kotlin.page

import aws.kotless.kotlin.pages.IntroductionPages
import io.kotless.dsl.lang.http.Get

object Introduction {

    @Get("/pages/introduction")
    fun introduction() = IntroductionPages.introduction()
}
