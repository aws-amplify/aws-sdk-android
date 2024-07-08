/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO XksProxyConfigurationType
 */
class XksProxyConfigurationTypeJsonUnmarshaller implements
        Unmarshaller<XksProxyConfigurationType, JsonUnmarshallerContext> {

    public XksProxyConfigurationType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        XksProxyConfigurationType xksProxyConfigurationType = new XksProxyConfigurationType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Connectivity")) {
                xksProxyConfigurationType.setConnectivity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AccessKeyId")) {
                xksProxyConfigurationType.setAccessKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UriEndpoint")) {
                xksProxyConfigurationType.setUriEndpoint(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UriPath")) {
                xksProxyConfigurationType.setUriPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcEndpointServiceName")) {
                xksProxyConfigurationType.setVpcEndpointServiceName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return xksProxyConfigurationType;
    }

    private static XksProxyConfigurationTypeJsonUnmarshaller instance;

    public static XksProxyConfigurationTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new XksProxyConfigurationTypeJsonUnmarshaller();
        return instance;
    }
}
