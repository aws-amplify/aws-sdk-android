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
 * JSON marshaller for POJO StandardsSubscription
 */
class StandardsSubscriptionJsonMarshaller {

    public void marshall(StandardsSubscription standardsSubscription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (standardsSubscription.getStandardsSubscriptionArn() != null) {
            String standardsSubscriptionArn = standardsSubscription.getStandardsSubscriptionArn();
            jsonWriter.name("StandardsSubscriptionArn");
            jsonWriter.value(standardsSubscriptionArn);
        }
        if (standardsSubscription.getStandardsArn() != null) {
            String standardsArn = standardsSubscription.getStandardsArn();
            jsonWriter.name("StandardsArn");
            jsonWriter.value(standardsArn);
        }
        if (standardsSubscription.getStandardsInput() != null) {
            java.util.Map<String, String> standardsInput = standardsSubscription
                    .getStandardsInput();
            jsonWriter.name("StandardsInput");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> standardsInputEntry : standardsInput
                    .entrySet()) {
                String standardsInputValue = standardsInputEntry.getValue();
                if (standardsInputValue != null) {
                    jsonWriter.name(standardsInputEntry.getKey());
                    jsonWriter.value(standardsInputValue);
                }
            }
            jsonWriter.endObject();
        }
        if (standardsSubscription.getStandardsStatus() != null) {
            String standardsStatus = standardsSubscription.getStandardsStatus();
            jsonWriter.name("StandardsStatus");
            jsonWriter.value(standardsStatus);
        }
        jsonWriter.endObject();
    }

    private static StandardsSubscriptionJsonMarshaller instance;

    public static StandardsSubscriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StandardsSubscriptionJsonMarshaller();
        return instance;
    }
}
