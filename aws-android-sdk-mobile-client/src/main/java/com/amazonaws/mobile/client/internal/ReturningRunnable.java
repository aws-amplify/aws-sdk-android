package com.amazonaws.mobile.client.internal;

import com.amazonaws.mobile.client.Callback;

public abstract class ReturningRunnable<R> {
    public abstract R run() throws Exception;

    public R await() throws Exception {
        return this.run();
    }

    public void async(final Callback<R> callback) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    callback.onResult(ReturningRunnable.this.run());
                } catch (final Exception e) {
                    callback.onError(e);
                }
            }
        }).start();
    }
}
