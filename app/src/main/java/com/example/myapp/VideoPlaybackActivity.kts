import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class VideoPlaybackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_playback)

        val videoUri = intent.getStringExtra("videoUri")
        val videoView = findViewById<VideoView>(R.id.videoView)

        videoView.setVideoURI(Uri.parse(videoUri))
        videoView.start()
    }
}
