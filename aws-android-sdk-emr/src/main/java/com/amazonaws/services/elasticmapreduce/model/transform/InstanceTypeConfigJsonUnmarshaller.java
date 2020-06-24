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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InstanceTypeConfig
 */
class InstanceTypeConfigJsonUnmarshaller implements
        Unmarshaller<InstanceTypeConfig, JsonUnmarshallerContext> {

    public InstanceTypeConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceTypeConfig instanceTypeConfig = new InstanceTypeConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceType")) {
                instanceTypeConfig.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WeightedCapacity")) {
                instanceTypeConfig.setWeightedCapacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BidPrice")) {
                instanceTypeConfig.setBidPrice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BidPriceAsPercentageOfOnDemandPrice")) {
                instanceTypeConfig.setBidPriceAsPercentageOfOnDemandPrice(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EbsConfiguration")) {
                instanceTypeConfig.setEbsConfiguration(EbsConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Configurations")) {
                instanceTypeConfig.setConfigurations(new ListUnmarshaller<Configuration>(
                        ConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceTypeConfig;
    }

    private static InstanceTypeConfigJsonUnmarshaller instance;

    public static InstanceTypeConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceTypeConfigJsonUnmarshaller();
        return instance;
    }
}
