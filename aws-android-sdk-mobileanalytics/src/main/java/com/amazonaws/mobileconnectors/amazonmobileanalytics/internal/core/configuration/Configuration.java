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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.configuration;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public interface Configuration {
    public Long getLong(String propertyName);

    public String getString(String propertyName);

    public Integer getInt(String propertyName);

    public Short getShort(String propertyName);

    public Double getDouble(String propertyName);

    public Boolean getBoolean(String propertyName);

    public Long optLong(String propertyName, Long optValue);

    public String optString(String propertyName, String optValue);

    public Integer optInt(String propertyName, Integer optValue);

    public Short optShort(String propertyName, Short optVaue);

    public Double optDouble(String propertyName, Double optValue);

    public Boolean optBoolean(String propertyName, Boolean optValue);
}
