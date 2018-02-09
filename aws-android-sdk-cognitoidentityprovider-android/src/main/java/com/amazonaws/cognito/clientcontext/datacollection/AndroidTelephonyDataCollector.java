package com.amazonaws.cognito.clientcontext.datacollection;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.telephony.TelephonyManager;

/**
 * It collect device's network related information.
 */
public class AndroidTelephonyDataCollector extends AndroidDataCollector {
    
    @Override
    public Map<String, String> collect(Context context) {
        Map<String, String> contextData = new HashMap<String, String>();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);

        if (telephonyManager != null) {
            contextData.put(AndroidDataRecordKey.HAS_ICC_CARD, String.valueOf(telephonyManager.hasIccCard()));
            contextData.put(AndroidDataRecordKey.IS_NETWORK_ROAMING, String.valueOf(telephonyManager.isNetworkRoaming()));
            contextData.put(AndroidDataRecordKey.NETWORK_OPERATOR, telephonyManager.getNetworkOperatorName());
            contextData.put(AndroidDataRecordKey.NETWORK_TYPE, String.valueOf(telephonyManager.getNetworkType()));
            contextData.put(AndroidDataRecordKey.PHONE_TYPE, String.valueOf(telephonyManager.getPhoneType()));

            if (telephonyManager.getSimState() == TelephonyManager.SIM_STATE_READY) {
                contextData.put(AndroidDataRecordKey.SIM_COUNTRY_ISO, String.valueOf(telephonyManager.getSimCountryIso()));
                contextData.put(AndroidDataRecordKey.SIM_OPERATOR, String.valueOf(telephonyManager.getSimOperatorName()));
            }
        }
        return contextData;
    }
}