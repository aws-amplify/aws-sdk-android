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

public class MockAppDetails extends AndroidAppDetails {

    public String packageName() {
        return "com.amazon.packagename";
    }

    public String versionName() {
        return "v1.2.0301-Alpha";
    }

    public String versionCode() {
        return "14";
    }

    public String getAppTitle() {
        return "TestAppTitle";
    }

    public String getAppId() {
        return "TestAppId";
    }

}
