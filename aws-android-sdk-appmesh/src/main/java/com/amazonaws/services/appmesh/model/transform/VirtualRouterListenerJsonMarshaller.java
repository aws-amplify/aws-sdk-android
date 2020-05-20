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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VirtualRouterListener
 */
class VirtualRouterListenerJsonMarshaller {

    public void marshall(VirtualRouterListener virtualRouterListener, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (virtualRouterListener.getPortMapping() != null) {
            PortMapping portMapping = virtualRouterListener.getPortMapping();
            jsonWriter.name("portMapping");
            PortMappingJsonMarshaller.getInstance().marshall(portMapping, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static VirtualRouterListenerJsonMarshaller instance;

    public static VirtualRouterListenerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VirtualRouterListenerJsonMarshaller();
        return instance;
    }
}
