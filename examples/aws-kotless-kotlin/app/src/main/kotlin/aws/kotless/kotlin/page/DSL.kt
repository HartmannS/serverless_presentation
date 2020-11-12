@file:Suppress("unused")

package aws.kotless.kotlin.page

import aws.kotless.kotlin.pages.DSLPages
import io.kotless.dsl.lang.http.Get

object DSL {
    @Get("/pages/dsl/overview")
    fun overview() = DSLPages.overview()

    @Get("/pages/dsl/lifecycle")
    fun lifecycle() = DSLPages.lifecycle()

    @Get("/pages/dsl/permissions")
    fun permissions() = DSLPages.permissions()

    @Get("/pages/dsl/http")
    fun http() = DSLPages.http()

    @Get("/pages/dsl/events")
    fun events() = DSLPages.events()
}
