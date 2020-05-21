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
 * StAX marshaller for POJO WebsiteConfiguration
 */
class WebsiteConfigurationStaxMarshaller {

    public void marshall(WebsiteConfiguration _websiteConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_websiteConfiguration.getErrorDocument() != null) {
            prefix = _prefix + "ErrorDocument";
            ErrorDocument errorDocument = _websiteConfiguration.getErrorDocument();
            ErrorDocumentStaxMarshaller.getInstance()
                    .marshall(errorDocument, request, prefix + ".");
        }
        if (_websiteConfiguration.getIndexDocument() != null) {
            prefix = _prefix + "IndexDocument";
            IndexDocument indexDocument = _websiteConfiguration.getIndexDocument();
            IndexDocumentStaxMarshaller.getInstance()
                    .marshall(indexDocument, request, prefix + ".");
        }
        if (_websiteConfiguration.getRedirectAllRequestsTo() != null) {
            prefix = _prefix + "RedirectAllRequestsTo";
            RedirectAllRequestsTo redirectAllRequestsTo = _websiteConfiguration
                    .getRedirectAllRequestsTo();
            RedirectAllRequestsToStaxMarshaller.getInstance().marshall(redirectAllRequestsTo,
                    request, prefix + ".");
        }
        if (_websiteConfiguration.getRoutingRules() != null) {
            prefix = _prefix + "RoutingRules";
            java.util.List<RoutingRule> routingRules = _websiteConfiguration.getRoutingRules();
            int routingRulesIndex = 1;
            String routingRulesPrefix = prefix;
            for (RoutingRule routingRulesItem : routingRules) {
                prefix = routingRulesPrefix + "." + routingRulesIndex;
                if (routingRulesItem != null) {
                    RoutingRuleStaxMarshaller.getInstance().marshall(routingRulesItem, request,
                            prefix + ".");
                }
                routingRulesIndex++;
            }
            prefix = routingRulesPrefix;
        }
    }

    private static WebsiteConfigurationStaxMarshaller instance;

    public static WebsiteConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new WebsiteConfigurationStaxMarshaller();
        return instance;
    }
}
