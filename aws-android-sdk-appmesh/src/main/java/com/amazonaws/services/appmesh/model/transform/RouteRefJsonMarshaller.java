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
 * JSON marshaller for POJO RouteRef
 */
class RouteRefJsonMarshaller {

    public void marshall(RouteRef routeRef, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (routeRef.getArn() != null) {
            String arn = routeRef.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (routeRef.getCreatedAt() != null) {
            java.util.Date createdAt = routeRef.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (routeRef.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = routeRef.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (routeRef.getMeshName() != null) {
            String meshName = routeRef.getMeshName();
            jsonWriter.name("meshName");
            jsonWriter.value(meshName);
        }
        if (routeRef.getMeshOwner() != null) {
            String meshOwner = routeRef.getMeshOwner();
            jsonWriter.name("meshOwner");
            jsonWriter.value(meshOwner);
        }
        if (routeRef.getResourceOwner() != null) {
            String resourceOwner = routeRef.getResourceOwner();
            jsonWriter.name("resourceOwner");
            jsonWriter.value(resourceOwner);
        }
        if (routeRef.getRouteName() != null) {
            String routeName = routeRef.getRouteName();
            jsonWriter.name("routeName");
            jsonWriter.value(routeName);
        }
        if (routeRef.getVersion() != null) {
            Long version = routeRef.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (routeRef.getVirtualRouterName() != null) {
            String virtualRouterName = routeRef.getVirtualRouterName();
            jsonWriter.name("virtualRouterName");
            jsonWriter.value(virtualRouterName);
        }
        jsonWriter.endObject();
    }

    private static RouteRefJsonMarshaller instance;

    public static RouteRefJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RouteRefJsonMarshaller();
        return instance;
    }
}
