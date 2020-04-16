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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsWafWebAclDetails
 */
class AwsWafWebAclDetailsJsonMarshaller {

    public void marshall(AwsWafWebAclDetails awsWafWebAclDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsWafWebAclDetails.getName() != null) {
            String name = awsWafWebAclDetails.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (awsWafWebAclDetails.getDefaultAction() != null) {
            String defaultAction = awsWafWebAclDetails.getDefaultAction();
            jsonWriter.name("DefaultAction");
            jsonWriter.value(defaultAction);
        }
        if (awsWafWebAclDetails.getRules() != null) {
            java.util.List<AwsWafWebAclRule> rules = awsWafWebAclDetails.getRules();
            jsonWriter.name("Rules");
            jsonWriter.beginArray();
            for (AwsWafWebAclRule rulesItem : rules) {
                if (rulesItem != null) {
                    AwsWafWebAclRuleJsonMarshaller.getInstance().marshall(rulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsWafWebAclDetails.getWebAclId() != null) {
            String webAclId = awsWafWebAclDetails.getWebAclId();
            jsonWriter.name("WebAclId");
            jsonWriter.value(webAclId);
        }
        jsonWriter.endObject();
    }

    private static AwsWafWebAclDetailsJsonMarshaller instance;

    public static AwsWafWebAclDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsWafWebAclDetailsJsonMarshaller();
        return instance;
    }
}
