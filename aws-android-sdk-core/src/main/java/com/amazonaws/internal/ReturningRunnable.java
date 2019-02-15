/*
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates.
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

package com.amazonaws.internal;

import com.amazonaws.async.Callback;

/**
 * Internal class to allow easy surfacing of synchronous and asynchronous operations.
 * This class may change without notice and may not be reflected in the SDK versioning scheme.
 *
 * @param <R> the type of the result/return
 */
public abstract class ReturningRunnable<R> {

    private final String operationDescription;

    /**
     * Default constructor. When an exception is thrown, it will not be wrapped with another
     * exception.
     */
    public ReturningRunnable() {
        this.operationDescription = null;
    }

    /**
     * When an exception is thrown, it will be wrapped with another exception with a message
     * specified by operationDescription.
     *
     * @param operationDescription The message of the exception that wraps the underlying exception.
     */
    public ReturningRunnable(final String operationDescription) {
        this.operationDescription = operationDescription;
    }

    /**
     * This method contains the underlying operation.
     *
     * @return Any result object of type R
     * @throws Exception Any error from performing the underlying operation
     */
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
     * Runs the code inside {@link #run()} on a new Thread asynchronously and returns immediately.
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
