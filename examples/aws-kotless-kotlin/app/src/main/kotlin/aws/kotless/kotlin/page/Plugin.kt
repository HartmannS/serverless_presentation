@file:Suppress("unused")

package aws.kotless.kotlin.page

import aws.kotless.kotlin.pages.PluginPages
import io.kotless.dsl.lang.http.Get

object Plugin {
    @Get("/pages/plugin/overview")
    fun overview() = PluginPages.overview()

    @Get("/pages/plugin/configuration")
    fun configuration() = PluginPages.configuration()

    @Get("/pages/plugin/tasks")
    fun tasks() = PluginPages.tasks()

    @Get("/pages/plugin/extensions")
    fun extensions() = PluginPages.extensions()
}
