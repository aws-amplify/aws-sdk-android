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
 * JSON marshaller for POJO SampledHTTPRequest
 */
class SampledHTTPRequestJsonMarshaller {

    public void marshall(SampledHTTPRequest sampledHTTPRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sampledHTTPRequest.getRequest() != null) {
            HTTPRequest request = sampledHTTPRequest.getRequest();
            jsonWriter.name("Request");
            HTTPRequestJsonMarshaller.getInstance().marshall(request, jsonWriter);
        }
        if (sampledHTTPRequest.getWeight() != null) {
            Long weight = sampledHTTPRequest.getWeight();
            jsonWriter.name("Weight");
            jsonWriter.value(weight);
        }
        if (sampledHTTPRequest.getTimestamp() != null) {
            java.util.Date timestamp = sampledHTTPRequest.getTimestamp();
            jsonWriter.name("Timestamp");
            jsonWriter.value(timestamp);
        }
        if (sampledHTTPRequest.getAction() != null) {
            String action = sampledHTTPRequest.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (sampledHTTPRequest.getRuleWithinRuleGroup() != null) {
            String ruleWithinRuleGroup = sampledHTTPRequest.getRuleWithinRuleGroup();
            jsonWriter.name("RuleWithinRuleGroup");
            jsonWriter.value(ruleWithinRuleGroup);
        }
        jsonWriter.endObject();
    }

    private static SampledHTTPRequestJsonMarshaller instance;

    public static SampledHTTPRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SampledHTTPRequestJsonMarshaller();
        return instance;
    }
}
