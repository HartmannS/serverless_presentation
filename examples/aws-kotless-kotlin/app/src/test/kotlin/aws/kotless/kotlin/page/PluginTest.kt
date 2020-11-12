package aws.kotless.kotlin.page

import kotlin.test.Test
import kotlin.test.assertNotNull

class PluginTest {
    @Test
    fun testAppHasAGreeting() {
        val classUnderTest = Plugin
        assertNotNull(classUnderTest.overview(), "app should have a greeting")
    }
}
