/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudfront.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO CookiePreference
 */
class CookiePreferenceStaxMarshaller {

    public void marshall(CookiePreference _cookiePreference, Request<?> request, String _prefix) {
        String prefix;
        if (_cookiePreference.getForward() != null) {
            prefix = _prefix + "Forward";
            String forward = _cookiePreference.getForward();
            request.addParameter(prefix, StringUtils.fromString(forward));
        }
        if (_cookiePreference.getWhitelistedNames() != null) {
            prefix = _prefix + "WhitelistedNames";
            CookieNames whitelistedNames = _cookiePreference.getWhitelistedNames();
            CookieNamesStaxMarshaller.getInstance().marshall(whitelistedNames, request,
                    prefix + ".");
        }
    }

    private static CookiePreferenceStaxMarshaller instance;

    public static CookiePreferenceStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CookiePreferenceStaxMarshaller();
        return instance;
    }
}
