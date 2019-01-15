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
 * StAX marshaller for POJO Policies
 */
class PoliciesStaxMarshaller {

    public void marshall(Policies _policies, Request<?> request, String _prefix) {
        String prefix;
        if (_policies.getAppCookieStickinessPolicies() != null) {
            prefix = _prefix + "AppCookieStickinessPolicies";
            java.util.List<AppCookieStickinessPolicy> appCookieStickinessPolicies = _policies
                    .getAppCookieStickinessPolicies();
            int appCookieStickinessPoliciesIndex = 1;
            String appCookieStickinessPoliciesPrefix = prefix;
            for (AppCookieStickinessPolicy appCookieStickinessPoliciesItem : appCookieStickinessPolicies) {
                prefix = appCookieStickinessPoliciesPrefix + ".member."
                        + appCookieStickinessPoliciesIndex;
                if (appCookieStickinessPoliciesItem != null) {
                    AppCookieStickinessPolicyStaxMarshaller.getInstance().marshall(
                            appCookieStickinessPoliciesItem, request, prefix + ".");
                }
                appCookieStickinessPoliciesIndex++;
            }
            prefix = appCookieStickinessPoliciesPrefix;
        }
        if (_policies.getLBCookieStickinessPolicies() != null) {
            prefix = _prefix + "LBCookieStickinessPolicies";
            java.util.List<LBCookieStickinessPolicy> lBCookieStickinessPolicies = _policies
                    .getLBCookieStickinessPolicies();
            int lBCookieStickinessPoliciesIndex = 1;
            String lBCookieStickinessPoliciesPrefix = prefix;
            for (LBCookieStickinessPolicy lBCookieStickinessPoliciesItem : lBCookieStickinessPolicies) {
                prefix = lBCookieStickinessPoliciesPrefix + ".member."
                        + lBCookieStickinessPoliciesIndex;
                if (lBCookieStickinessPoliciesItem != null) {
                    LBCookieStickinessPolicyStaxMarshaller.getInstance().marshall(
                            lBCookieStickinessPoliciesItem, request, prefix + ".");
                }
                lBCookieStickinessPoliciesIndex++;
            }
            prefix = lBCookieStickinessPoliciesPrefix;
        }
        if (_policies.getOtherPolicies() != null) {
            prefix = _prefix + "OtherPolicies";
            java.util.List<String> otherPolicies = _policies.getOtherPolicies();
            int otherPoliciesIndex = 1;
            String otherPoliciesPrefix = prefix;
            for (String otherPoliciesItem : otherPolicies) {
                prefix = otherPoliciesPrefix + ".member." + otherPoliciesIndex;
                if (otherPoliciesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(otherPoliciesItem));
                }
                otherPoliciesIndex++;
            }
            prefix = otherPoliciesPrefix;
        }
    }

    private static PoliciesStaxMarshaller instance;

    public static PoliciesStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PoliciesStaxMarshaller();
        return instance;
    }
}
