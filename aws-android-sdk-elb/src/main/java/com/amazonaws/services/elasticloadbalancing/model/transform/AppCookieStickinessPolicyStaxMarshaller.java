/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO AppCookieStickinessPolicy
 */
class AppCookieStickinessPolicyStaxMarshaller {

    public void marshall(AppCookieStickinessPolicy _appCookieStickinessPolicy, Request<?> request,
            String _prefix) {
        String prefix;
        if (_appCookieStickinessPolicy.getPolicyName() != null) {
            prefix = _prefix + "PolicyName";
            String policyName = _appCookieStickinessPolicy.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }
        if (_appCookieStickinessPolicy.getCookieName() != null) {
            prefix = _prefix + "CookieName";
            String cookieName = _appCookieStickinessPolicy.getCookieName();
            request.addParameter(prefix, StringUtils.fromString(cookieName));
        }
    }

    private static AppCookieStickinessPolicyStaxMarshaller instance;

    public static AppCookieStickinessPolicyStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AppCookieStickinessPolicyStaxMarshaller();
        return instance;
    }
}
