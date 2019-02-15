/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates.
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

package com.amazonaws.async;

/**
 * Callback for async operations.
 * @param <R> the type of the result
 */
public interface Callback<R> {

    /**
     * If the underlying operation succeeds this method will be called with the result.
     *
     * @param result the result
     */
    void onResult(R result);

    /**
     * If the underlying operation fails this method will be called with the exception.
     *
     * @param e the error
     */
    void onError(Exception e);
}
