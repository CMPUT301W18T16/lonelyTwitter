package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.ListView;

import com.robotium.solo.Solo;
import junit.framework.TestCase;


/**
 * Created by coursaux on 2/27/18.
 */

public class EditTweetActivityTest extends ActivityInstrumentationTestCase2 {

    private Solo solo;

    public EditTweetActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }

    public void setUp() throws Exception{
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testEditViewText() throws Exception {
        EditTweetActivity activity = (EditTweetActivity) solo.getCurrentActivity();
        solo.assertCurrentActivity("Wrong Activity!", EditTweetActivity.class);

        final String editTweet = activity.getOldTweet();
        assertEquals("Tweet test!", editTweet);



    }




    @Override
    public void tearDown() throws Exception{
        solo.finishOpenedActivities();
    }

}
