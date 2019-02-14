package com.amazonaws.mobile.client.internal;

import com.amazonaws.mobile.client.Callback;

/**
 * Internal class to allow easy surfacing of synchronous and asynchronous operations.
 *
 * @param <R> the type of the result/return
 */
public abstract class ReturningRunnable<R> {

    private final String operationDescription;

    public ReturningRunnable() {
        this.operationDescription = null;
    }

    public ReturningRunnable(final String operationDescription) {
        this.operationDescription = operationDescription;
    }

    public abstract R run() throws Exception;

    /**
     * Runs the code inside {@link #run()} synchronously on the same thread this method is called.
     *
     * @return the result from the {@link #run()} method
     * @throws Exception error from the operation
     */
    public R await() throws Exception {
        return this.run();
    }

    /**
     * Runs the code inside {@link #run()} on a new Thread and returns immediately.
     *
     * @param callback receives the result or error from the operation
     */
    public void async(final Callback<R> callback) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    callback.onResult(ReturningRunnable.this.run());
                } catch (final Exception e) {
                    if (operationDescription == null) {
                        callback.onError(e);
                    } else {
                        callback.onError(new Exception(operationDescription, e));
                    }
                }
            }
        }).start();
    }
}
