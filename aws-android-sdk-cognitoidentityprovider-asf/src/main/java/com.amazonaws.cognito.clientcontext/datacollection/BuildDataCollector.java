/*
 * Copyright 2017-2022 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.cognito.clientcontext.datacollection;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.os.Build;

/**
 * It collects build information for underlying device hardware.
 */
public class BuildDataCollector extends DataCollector {

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> collect(Context context) {
        Map<String, String> contextData = new HashMap<String, String>();
        contextData.put(DataRecordKey.BRAND, Build.BRAND);
        contextData.put(DataRecordKey.FINGERPRINT, Build.FINGERPRINT);
        contextData.put(DataRecordKey.HARDWARE, Build.HARDWARE);
        contextData.put(DataRecordKey.MODEL, Build.MODEL);
        contextData.put(DataRecordKey.PRODUCT, Build.PRODUCT);
        contextData.put(DataRecordKey.BUILD_TYPE, Build.TYPE);
        contextData.put(DataRecordKey.VERSION_RELEASE, Build.VERSION.RELEASE);
        contextData.put(DataRecordKey.VERSION_SDK, Build.VERSION.SDK);
        return contextData;
    }
}