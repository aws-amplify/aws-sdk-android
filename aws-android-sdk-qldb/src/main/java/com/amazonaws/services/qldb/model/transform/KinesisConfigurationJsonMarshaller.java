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

package com.amazonaws.services.qldb.model.transform;

import com.amazonaws.services.qldb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO KinesisConfiguration
 */
class KinesisConfigurationJsonMarshaller {

    public void marshall(KinesisConfiguration kinesisConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (kinesisConfiguration.getStreamArn() != null) {
            String streamArn = kinesisConfiguration.getStreamArn();
            jsonWriter.name("StreamArn");
            jsonWriter.value(streamArn);
        }
        if (kinesisConfiguration.getAggregationEnabled() != null) {
            Boolean aggregationEnabled = kinesisConfiguration.getAggregationEnabled();
            jsonWriter.name("AggregationEnabled");
            jsonWriter.value(aggregationEnabled);
        }
        jsonWriter.endObject();
    }

    private static KinesisConfigurationJsonMarshaller instance;

    public static KinesisConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KinesisConfigurationJsonMarshaller();
        return instance;
    }
}
