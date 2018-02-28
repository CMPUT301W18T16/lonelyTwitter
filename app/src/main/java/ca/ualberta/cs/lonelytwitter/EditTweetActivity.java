package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {
    private String oldTweet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        oldTweet = getIntent().getStringExtra("OldList");

        final TextView editView =(TextView) findViewById(R.id.TweetDisplay);
        editView.setText(oldTweet);


    }

    public String getOldTweet(){
        return oldTweet;
    }

}
