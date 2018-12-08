/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public interface Preferences {
    public boolean getBoolean(final String key, final boolean optValue);

    public int getInt(final String key, final int optValue);

    public float getFloat(final String key, final float optValue);

    public long getLong(final String key, final long optValue);

    public String getString(final String key, final String optValue);

    public void putBoolean(final String key, final boolean value);

    public void putInt(final String key, final int value);

    public void putFloat(final String key, final float value);

    public void putLong(final String key, final long value);

    public void putString(final String key, final String value);
}
