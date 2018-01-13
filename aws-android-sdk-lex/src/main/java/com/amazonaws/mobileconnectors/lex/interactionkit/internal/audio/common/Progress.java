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

package com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.common;

/**
 * A progress class for AsynchronousTask.
 *
 * @param <T> type of the progress state.
 */
public class Progress<T> {

    /**
     * Create an progress with no payload.
     *
     * @param state the state of the progress.
     */
    public Progress(final T state) {
        this(state, null);
    }

    /**
     * Create an progress with a payload.
     *
     * @param state the state of the progress.
     * @param payload the payload to add to the progress.
     */
    public Progress(final T state, final Object payload) {
        mState = state;
        mPayload = payload;
    }

    /**
     * Get the state of the progress.
     *
     * @return the state.
     */
    public T getState() {
        return mState;
    }

    /**
     * Get the payload.
     *
     * @return the payload.
     */
    public Object getPayload() {
        return mPayload;
    }

    /**
     * The state..
     */
    private final T mState;

    /**
     * The payload that was received.
     */
    private final Object mPayload;
}
