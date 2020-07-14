/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.lex.interactionkit.listeners;

import android.annotation.SuppressLint;
import android.util.Log;

import com.amazonaws.mobileconnectors.lex.interactionkit.Response;
import com.amazonaws.mobileconnectors.lex.interactionkit.continuations.LexServiceContinuation;

@SuppressLint("LongLogTag")
public class DefaultInteractionListener implements InteractionListener {
    private static final String TAG = "DefaultInteractionListener";

    @Override
    public void onReadyForFulfillment(Response response) {
        Log.d(TAG, "ready to be fulfilled");
    }

    @Override
    public void promptUserToRespond(Response response,
            LexServiceContinuation continuation) {
        continuation.continueWithCurrentMode();
    }

    @Override
    public void onInteractionError(Response response, Exception e) {
        Log.e(TAG, "on interaction error " + e.getMessage());
    }

}
