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
 * JSON marshaller for POJO JobExecutionsRolloutConfig
 */
class JobExecutionsRolloutConfigJsonMarshaller {

    public void marshall(JobExecutionsRolloutConfig jobExecutionsRolloutConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobExecutionsRolloutConfig.getMaximumPerMinute() != null) {
            Integer maximumPerMinute = jobExecutionsRolloutConfig.getMaximumPerMinute();
            jsonWriter.name("maximumPerMinute");
            jsonWriter.value(maximumPerMinute);
        }
        if (jobExecutionsRolloutConfig.getExponentialRate() != null) {
            ExponentialRolloutRate exponentialRate = jobExecutionsRolloutConfig
                    .getExponentialRate();
            jsonWriter.name("exponentialRate");
            ExponentialRolloutRateJsonMarshaller.getInstance()
                    .marshall(exponentialRate, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static JobExecutionsRolloutConfigJsonMarshaller instance;

    public static JobExecutionsRolloutConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobExecutionsRolloutConfigJsonMarshaller();
        return instance;
    }
}
