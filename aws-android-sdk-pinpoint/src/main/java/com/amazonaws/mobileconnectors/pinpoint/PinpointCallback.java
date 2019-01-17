/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint;

/**
 * The {@link PinpointCallback} is an abstract class which allows you create
 * subclasses that will handle the completion of certain tasks. On success, the
 * handler's return object is passed into the onComplete method as an argument.
 *
 * @param <T>
 */
public abstract class PinpointCallback<T> {
    protected PinpointCallback() {
    }

    /**
     * This is called by the accepting object when a specific method or action
     * completes
     *
     * @param response The kind of response expected upon completion
     */
    public abstract void onComplete(final T response);

}
