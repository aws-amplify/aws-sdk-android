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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO CORSRule
 */
class CORSRuleStaxMarshaller {

    public void marshall(CORSRule _cORSRule, Request<?> request, String _prefix) {
        String prefix;
        if (_cORSRule.getAllowedHeaders() != null) {
            prefix = _prefix + "AllowedHeaders";
            java.util.List<String> allowedHeaders = _cORSRule.getAllowedHeaders();
            int allowedHeadersIndex = 1;
            String allowedHeadersPrefix = prefix;
            for (String allowedHeadersItem : allowedHeaders) {
                prefix = allowedHeadersPrefix + ".member." + allowedHeadersIndex;
                if (allowedHeadersItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(allowedHeadersItem));
                }
                allowedHeadersIndex++;
            }
            prefix = allowedHeadersPrefix;
        }
        if (_cORSRule.getAllowedMethods() != null) {
            prefix = _prefix + "AllowedMethods";
            java.util.List<String> allowedMethods = _cORSRule.getAllowedMethods();
            int allowedMethodsIndex = 1;
            String allowedMethodsPrefix = prefix;
            for (String allowedMethodsItem : allowedMethods) {
                prefix = allowedMethodsPrefix + ".member." + allowedMethodsIndex;
                if (allowedMethodsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(allowedMethodsItem));
                }
                allowedMethodsIndex++;
            }
            prefix = allowedMethodsPrefix;
        }
        if (_cORSRule.getAllowedOrigins() != null) {
            prefix = _prefix + "AllowedOrigins";
            java.util.List<String> allowedOrigins = _cORSRule.getAllowedOrigins();
            int allowedOriginsIndex = 1;
            String allowedOriginsPrefix = prefix;
            for (String allowedOriginsItem : allowedOrigins) {
                prefix = allowedOriginsPrefix + ".member." + allowedOriginsIndex;
                if (allowedOriginsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(allowedOriginsItem));
                }
                allowedOriginsIndex++;
            }
            prefix = allowedOriginsPrefix;
        }
        if (_cORSRule.getExposeHeaders() != null) {
            prefix = _prefix + "ExposeHeaders";
            java.util.List<String> exposeHeaders = _cORSRule.getExposeHeaders();
            int exposeHeadersIndex = 1;
            String exposeHeadersPrefix = prefix;
            for (String exposeHeadersItem : exposeHeaders) {
                prefix = exposeHeadersPrefix + ".member." + exposeHeadersIndex;
                if (exposeHeadersItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(exposeHeadersItem));
                }
                exposeHeadersIndex++;
            }
            prefix = exposeHeadersPrefix;
        }
        if (_cORSRule.getMaxAgeSeconds() != null) {
            prefix = _prefix + "MaxAgeSeconds";
            Integer maxAgeSeconds = _cORSRule.getMaxAgeSeconds();
            request.addParameter(prefix, StringUtils.fromInteger(maxAgeSeconds));
        }
    }

    private static CORSRuleStaxMarshaller instance;

    public static CORSRuleStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CORSRuleStaxMarshaller();
        return instance;
    }
}
