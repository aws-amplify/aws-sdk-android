/*
 * Copyright 2018-2018 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobile.client.internal;

import android.util.Log;

import com.amazonaws.mobile.client.Callback;

import java.util.concurrent.CountDownLatch;

/**
 * Internal use. Refrain from using. Subject to breaking API changes at any time.
 *
 * Acts as a utility to de-reference library user's callback once it has been notified.
 * This class currently allows one callback before de-referencing.
 *
 * @param <R> result type of {@link InternalCallback#onResult(Object)}
 */
public class InternalCallback<R> implements Callback<R> {
    private static final String TAG = InternalCallback.class.getSimpleName();
    private enum Mode {
        Callback,
        Async,
        Sync,
        Done
    }

    private Callback<R> userCallback;
    private Mode mode;
    private CountDownLatch lock;
    private Runnable runnable;
    private R result;
    private Exception e;

    public InternalCallback() {
        this(null);
    }

    public InternalCallback(final Callback<R> userCallback) {
        this.userCallback = userCallback;
        mode = Mode.Callback;
        lock = new CountDownLatch(1);
    }

    @Override
    public void onResult(R result) {
        call(result, null);
    }

    @Override
    public void onError(Exception e) {
        call(null, e);
    }

    private void call(R result, Exception e) {
        switch (mode) {
            case Callback:
            case Async:
                if (e == null)
                    userCallback.onResult(result);
                else
                    userCallback.onError(e);
                break;
            case Sync:
                this.result = result;
                this.e = e;
                lock.countDown();
                break;
            case Done:
                Log.w(TAG, "Library attempted to call user callback twice, expected only once");
        }
        mode = Mode.Done;
        userCallback = null;
    }

    public void async(final Runnable runnable) {
        if (mode == Mode.Done) {
            Log.e(TAG, "Duplicate call to execute code.", new RuntimeException("Internal error, duplicate call"));
        }
        mode = Mode.Async;
        lock = null;
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runnable.run();
                } catch (Exception e) {
                    call(null, e);
                }
            }
        }).start();
    }

    public R await(final Runnable runnable) throws Exception {
        if (mode == Mode.Done) {
            Log.e(TAG, "Duplicate call to execute code.", new RuntimeException("Internal error, duplicate call"));
        }
        mode = Mode.Sync;
        try {
            runnable.run();
            lock.await();
        } catch (Exception e) {
            this.e = e;
        }

        final Exception localE = this.e;
        final R localResult = this.result;
        this.e = null;
        this.result = null;

        if (localE != null) {
            throw localE;
        }
        return localResult;
    }
}
