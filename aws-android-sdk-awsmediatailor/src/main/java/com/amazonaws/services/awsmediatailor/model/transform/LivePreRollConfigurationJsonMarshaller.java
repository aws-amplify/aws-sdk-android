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

package com.amazonaws.services.awsmediatailor.model.transform;

import com.amazonaws.services.awsmediatailor.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LivePreRollConfiguration
 */
class LivePreRollConfigurationJsonMarshaller {

    public void marshall(LivePreRollConfiguration livePreRollConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (livePreRollConfiguration.getAdDecisionServerUrl() != null) {
            String adDecisionServerUrl = livePreRollConfiguration.getAdDecisionServerUrl();
            jsonWriter.name("AdDecisionServerUrl");
            jsonWriter.value(adDecisionServerUrl);
        }
        if (livePreRollConfiguration.getMaxDurationSeconds() != null) {
            Integer maxDurationSeconds = livePreRollConfiguration.getMaxDurationSeconds();
            jsonWriter.name("MaxDurationSeconds");
            jsonWriter.value(maxDurationSeconds);
        }
        jsonWriter.endObject();
    }

    private static LivePreRollConfigurationJsonMarshaller instance;

    public static LivePreRollConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LivePreRollConfigurationJsonMarshaller();
        return instance;
    }
}
