package work.crash.micalhl.fireflyx.util

import kotlin.random.Random

object Captcha {

    fun generate(index: Int): String {
        val captcha = StringBuilder()
        val chars = "0123456789abcdefghijklmnopqrstuvwxyz"
        val length = chars.length
        for (i in 0 until index) {
            val nextInt: Int = Random.nextInt(length)
            captcha.append(chars[nextInt])
        }
        return captcha.toString()
    }

}
