import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.workoutapp.R;

public class ExVideoActivity extends AppCompatActivity {

    WebView webView ;
    String VideoUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_video);
        webView = findViewById(R.id.WebView);

        VideoUrl = getIntent().getStringExtra("VideoUrl");

        webView.loadUrl(VideoUrl);
    }
}