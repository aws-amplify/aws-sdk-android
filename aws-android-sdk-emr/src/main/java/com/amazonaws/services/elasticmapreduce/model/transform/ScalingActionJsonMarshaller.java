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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ScalingAction
 */
class ScalingActionJsonMarshaller {

    public void marshall(ScalingAction scalingAction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scalingAction.getMarket() != null) {
            String market = scalingAction.getMarket();
            jsonWriter.name("Market");
            jsonWriter.value(market);
        }
        if (scalingAction.getSimpleScalingPolicyConfiguration() != null) {
            SimpleScalingPolicyConfiguration simpleScalingPolicyConfiguration = scalingAction
                    .getSimpleScalingPolicyConfiguration();
            jsonWriter.name("SimpleScalingPolicyConfiguration");
            SimpleScalingPolicyConfigurationJsonMarshaller.getInstance().marshall(
                    simpleScalingPolicyConfiguration, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ScalingActionJsonMarshaller instance;

    public static ScalingActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScalingActionJsonMarshaller();
        return instance;
    }
}
