/*
 * Copyright 2017-2018 Amazon.com,
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
import android.telephony.TelephonyManager;

/**
 * It collect device's network related information.
 */
public class TelephonyDataCollector extends DataCollector {

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> collect(Context context) {
        Map<String, String> contextData = new HashMap<String, String>();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);

        if (telephonyManager != null) {
            contextData.put(DataRecordKey.HAS_ICC_CARD, String.valueOf(telephonyManager.hasIccCard()));
            contextData.put(DataRecordKey.IS_NETWORK_ROAMING, String.valueOf(telephonyManager.isNetworkRoaming()));
            contextData.put(DataRecordKey.NETWORK_OPERATOR, telephonyManager.getNetworkOperatorName());
            contextData.put(DataRecordKey.NETWORK_TYPE, String.valueOf(telephonyManager.getNetworkType()));
            contextData.put(DataRecordKey.PHONE_TYPE, String.valueOf(telephonyManager.getPhoneType()));

            if (telephonyManager.getSimState() == TelephonyManager.SIM_STATE_READY) {
                contextData.put(DataRecordKey.SIM_COUNTRY_ISO, String.valueOf(telephonyManager.getSimCountryIso()));
                contextData.put(DataRecordKey.SIM_OPERATOR, String.valueOf(telephonyManager.getSimOperatorName()));
            }
        }
        return contextData;
    }
}