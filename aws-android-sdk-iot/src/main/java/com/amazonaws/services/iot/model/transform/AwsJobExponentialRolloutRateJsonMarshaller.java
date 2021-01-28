/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsJobExponentialRolloutRate
 */
class AwsJobExponentialRolloutRateJsonMarshaller {

    public void marshall(AwsJobExponentialRolloutRate awsJobExponentialRolloutRate,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsJobExponentialRolloutRate.getBaseRatePerMinute() != null) {
            Integer baseRatePerMinute = awsJobExponentialRolloutRate.getBaseRatePerMinute();
            jsonWriter.name("baseRatePerMinute");
            jsonWriter.value(baseRatePerMinute);
        }
        if (awsJobExponentialRolloutRate.getIncrementFactor() != null) {
            Double incrementFactor = awsJobExponentialRolloutRate.getIncrementFactor();
            jsonWriter.name("incrementFactor");
            jsonWriter.value(incrementFactor);
        }
        if (awsJobExponentialRolloutRate.getRateIncreaseCriteria() != null) {
            AwsJobRateIncreaseCriteria rateIncreaseCriteria = awsJobExponentialRolloutRate
                    .getRateIncreaseCriteria();
            jsonWriter.name("rateIncreaseCriteria");
            AwsJobRateIncreaseCriteriaJsonMarshaller.getInstance().marshall(rateIncreaseCriteria,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AwsJobExponentialRolloutRateJsonMarshaller instance;

    public static AwsJobExponentialRolloutRateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsJobExponentialRolloutRateJsonMarshaller();
        return instance;
    }
}
