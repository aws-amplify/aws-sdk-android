/**
 * COPYRIGHT:
 * <p>
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.kinesisvideo.producer;

import android.support.annotation.NonNull;

import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;

/**
 * Kinesis Video Tag representation.
 *
 * NOTE: This class must match the Tag declaration in native code in
 * /client/Include.h
 *
 */
public class Tag {
    /**
     * Tag name
     */
    private final String mName;

    /**
     * Tag value
     */
    private final String mValue;

    /**
     * Public constructor which can be called from native code.
     * @param name Name of the tag
     * @param value Value of the tag
     */
    public Tag(@NonNull final String name, @NonNull final String value) {
        mName = Preconditions.checkNotNull(name);
        mValue = Preconditions.checkNotNull(value);
    }

    /**
     * Gets the name of the tag
     * @return tag name
     */
    @NonNull
    public String getName() {
        return mName;
    }

    /**
     * Gets the value of the tag
     * @return tag value
     */
    @NonNull
    public String getValue() {
        return mValue;
    }
}
