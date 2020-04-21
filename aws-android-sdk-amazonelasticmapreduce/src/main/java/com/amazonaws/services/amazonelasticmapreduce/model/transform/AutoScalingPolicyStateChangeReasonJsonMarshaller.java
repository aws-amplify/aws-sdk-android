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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AutoScalingPolicyStateChangeReason
 */
class AutoScalingPolicyStateChangeReasonJsonMarshaller {

    public void marshall(AutoScalingPolicyStateChangeReason autoScalingPolicyStateChangeReason,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (autoScalingPolicyStateChangeReason.getCode() != null) {
            String code = autoScalingPolicyStateChangeReason.getCode();
            jsonWriter.name("Code");
            jsonWriter.value(code);
        }
        if (autoScalingPolicyStateChangeReason.getMessage() != null) {
            String message = autoScalingPolicyStateChangeReason.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static AutoScalingPolicyStateChangeReasonJsonMarshaller instance;

    public static AutoScalingPolicyStateChangeReasonJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingPolicyStateChangeReasonJsonMarshaller();
        return instance;
    }
}
