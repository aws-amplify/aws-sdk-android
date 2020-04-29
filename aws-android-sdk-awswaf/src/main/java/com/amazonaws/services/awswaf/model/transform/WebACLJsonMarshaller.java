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

package com.amazonaws.services.awswaf.model.transform;

import com.amazonaws.services.awswaf.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO WebACL
 */
class WebACLJsonMarshaller {

    public void marshall(WebACL webACL, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (webACL.getWebACLId() != null) {
            String webACLId = webACL.getWebACLId();
            jsonWriter.name("WebACLId");
            jsonWriter.value(webACLId);
        }
        if (webACL.getName() != null) {
            String name = webACL.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (webACL.getMetricName() != null) {
            String metricName = webACL.getMetricName();
            jsonWriter.name("MetricName");
            jsonWriter.value(metricName);
        }
        if (webACL.getDefaultAction() != null) {
            WafAction defaultAction = webACL.getDefaultAction();
            jsonWriter.name("DefaultAction");
            WafActionJsonMarshaller.getInstance().marshall(defaultAction, jsonWriter);
        }
        if (webACL.getRules() != null) {
            java.util.List<ActivatedRule> rules = webACL.getRules();
            jsonWriter.name("Rules");
            jsonWriter.beginArray();
            for (ActivatedRule rulesItem : rules) {
                if (rulesItem != null) {
                    ActivatedRuleJsonMarshaller.getInstance().marshall(rulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (webACL.getWebACLArn() != null) {
            String webACLArn = webACL.getWebACLArn();
            jsonWriter.name("WebACLArn");
            jsonWriter.value(webACLArn);
        }
        jsonWriter.endObject();
    }

    private static WebACLJsonMarshaller instance;

    public static WebACLJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WebACLJsonMarshaller();
        return instance;
    }
}
