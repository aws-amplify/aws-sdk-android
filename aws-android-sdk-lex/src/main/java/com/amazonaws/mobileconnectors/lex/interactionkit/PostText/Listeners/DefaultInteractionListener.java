package com.example.prakritibansal.posttextrequest.Listeners;

/**
 * Created by prakritibansal on 12/28/17.
 */

import android.util.Log;

import com.example.prakritibansal.posttextrequest.Continuations.LexServiceContinuation;
import com.example.prakritibansal.posttextrequest.TextResponse;

public class DefaultInteractionListener implements InteractionListener {
    private static final String TAG = "DefaultInteractionLis";

    @Override
    public void onReadyForFulfillment(TextResponse response) {
        Log.d(TAG, "ready to be fulfilled");
    }

    @Override
    public void promptUserToRespond(TextResponse response,
                                    LexServiceContinuation continuation) {
        Log.d(TAG, "Prompting user to respond");
    }

    @Override
    public void onInteractionError(TextResponse response, Exception e) {
        Log.e(TAG, "on interaction error " + e.getMessage());
    }

}

