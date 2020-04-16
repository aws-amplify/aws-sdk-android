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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NetworkConfig
 */
class NetworkConfigJsonMarshaller {

    public void marshall(NetworkConfig networkConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (networkConfig.getEnableNetworkIsolation() != null) {
            Boolean enableNetworkIsolation = networkConfig.getEnableNetworkIsolation();
            jsonWriter.name("EnableNetworkIsolation");
            jsonWriter.value(enableNetworkIsolation);
        }
        if (networkConfig.getVpcConfig() != null) {
            VpcConfig vpcConfig = networkConfig.getVpcConfig();
            jsonWriter.name("VpcConfig");
            VpcConfigJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static NetworkConfigJsonMarshaller instance;

    public static NetworkConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkConfigJsonMarshaller();
        return instance;
    }
}
