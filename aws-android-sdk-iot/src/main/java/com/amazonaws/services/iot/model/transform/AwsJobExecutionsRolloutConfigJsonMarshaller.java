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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsJobExecutionsRolloutConfig
 */
class AwsJobExecutionsRolloutConfigJsonMarshaller {

    public void marshall(AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsJobExecutionsRolloutConfig.getMaximumPerMinute() != null) {
            Integer maximumPerMinute = awsJobExecutionsRolloutConfig.getMaximumPerMinute();
            jsonWriter.name("maximumPerMinute");
            jsonWriter.value(maximumPerMinute);
        }
        jsonWriter.endObject();
    }

    private static AwsJobExecutionsRolloutConfigJsonMarshaller instance;

    public static AwsJobExecutionsRolloutConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsJobExecutionsRolloutConfigJsonMarshaller();
        return instance;
    }
}
