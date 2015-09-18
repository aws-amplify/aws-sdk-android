/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.DeviceDetails;

import java.util.Locale;

public class MockDeviceDetails implements DeviceDetails {

    private Locale locale = Locale.US;

    @Override
    public String platformVersion() {
        return "4.0";
    }

    @Override
    public String platform() {
        return "ANDROID";
    }

    @Override
    public String manufacturer() {
        return "Samsung";
    }

    @Override
    public String model() {
        return "Galaxy S";
    }

    @Override
    public Locale locale() {
        return locale;
    }

    public void setLocale(Locale newLocale) {
        this.locale = newLocale;
    }

    @Override
    public String carrier() {
        return "TestCarrier";
    }

}
