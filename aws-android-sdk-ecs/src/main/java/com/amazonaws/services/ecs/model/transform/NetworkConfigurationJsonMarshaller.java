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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NetworkConfiguration
 */
class NetworkConfigurationJsonMarshaller {

    public void marshall(NetworkConfiguration networkConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (networkConfiguration.getAwsvpcConfiguration() != null) {
            AwsVpcConfiguration awsvpcConfiguration = networkConfiguration.getAwsvpcConfiguration();
            jsonWriter.name("awsvpcConfiguration");
            AwsVpcConfigurationJsonMarshaller.getInstance().marshall(awsvpcConfiguration,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static NetworkConfigurationJsonMarshaller instance;

    public static NetworkConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkConfigurationJsonMarshaller();
        return instance;
    }
}
