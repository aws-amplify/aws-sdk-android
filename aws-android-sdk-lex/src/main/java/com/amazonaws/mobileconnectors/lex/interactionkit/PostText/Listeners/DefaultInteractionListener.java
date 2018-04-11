package com.amazonaws.mobileconnectors.lex.interactionkit.PostText.Listeners;



import android.util.Log;

import com.amazonaws.mobileconnectors.lex.interactionkit.PostText.Continuations.LexServiceContinuation;
import com.amazonaws.mobileconnectors.lex.interactionkit.PostText.TextResponse;

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
        //continuation.continueWithTextInForTextOut();
    }

    @Override
    public void onInteractionError(TextResponse response, Exception e) {
        Log.e(TAG, "on interaction error " + e.getMessage());
    }

}

