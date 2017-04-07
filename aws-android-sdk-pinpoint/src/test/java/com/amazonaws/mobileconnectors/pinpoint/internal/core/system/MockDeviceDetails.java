/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.pinpoint.internal.core.system;

import java.util.Locale;

public class MockDeviceDetails extends AndroidDeviceDetails {

    private Locale locale = Locale.US;

    public String platformVersion() {
        return "4.0";
    }

    public String platform() {
        return "ANDROID";
    }

    public String manufacturer() {
        return "Samsung";
    }

    public String model() {
        return "Galaxy S";
    }

    public Locale locale() {
        return locale;
    }

    public void setLocale(Locale newLocale) {
        this.locale = newLocale;
    }

    public String carrier() {
        return "TestCarrier";
    }

}
