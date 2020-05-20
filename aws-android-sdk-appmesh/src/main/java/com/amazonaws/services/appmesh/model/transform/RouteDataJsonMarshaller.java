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
 * JSON marshaller for POJO RouteData
 */
class RouteDataJsonMarshaller {

    public void marshall(RouteData routeData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (routeData.getMeshName() != null) {
            String meshName = routeData.getMeshName();
            jsonWriter.name("meshName");
            jsonWriter.value(meshName);
        }
        if (routeData.getMetadata() != null) {
            ResourceMetadata metadata = routeData.getMetadata();
            jsonWriter.name("metadata");
            ResourceMetadataJsonMarshaller.getInstance().marshall(metadata, jsonWriter);
        }
        if (routeData.getRouteName() != null) {
            String routeName = routeData.getRouteName();
            jsonWriter.name("routeName");
            jsonWriter.value(routeName);
        }
        if (routeData.getSpec() != null) {
            RouteSpec spec = routeData.getSpec();
            jsonWriter.name("spec");
            RouteSpecJsonMarshaller.getInstance().marshall(spec, jsonWriter);
        }
        if (routeData.getStatus() != null) {
            RouteStatus status = routeData.getStatus();
            jsonWriter.name("status");
            RouteStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (routeData.getVirtualRouterName() != null) {
            String virtualRouterName = routeData.getVirtualRouterName();
            jsonWriter.name("virtualRouterName");
            jsonWriter.value(virtualRouterName);
        }
        jsonWriter.endObject();
    }

    private static RouteDataJsonMarshaller instance;

    public static RouteDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RouteDataJsonMarshaller();
        return instance;
    }
}
