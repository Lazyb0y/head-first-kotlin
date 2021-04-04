import kotlinx.coroutines.GlobalScope
import java.io.File
import javax.sound.sampled.AudioSystem

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")
    var count = 0
    for (part in parts) {
        count += part.length + 1
        if (part == "") {
            playSound(file)
        } else {
            delay(100 * (part.length + 1L))
            if (count < beats.length) {
                playSound(file)
            }
        }
    }
}

fun playSound(file: String) {
    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream(
        File(file)
    )
    clip.open(audioInputStream)
    clip.start()
}

fun main() {
    runBlocking {
        // running in same thread but in separate coroutines
        launch { playBeats("x-x-x-x-x-x-", "audio/toms.aiff") }
        playBeats("x-----x----", "audio/crash_cymbal.aiff")
    }
}