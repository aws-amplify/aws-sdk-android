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
 * JSON marshaller for POJO RouteSpec
 */
class RouteSpecJsonMarshaller {

    public void marshall(RouteSpec routeSpec, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (routeSpec.getGrpcRoute() != null) {
            GrpcRoute grpcRoute = routeSpec.getGrpcRoute();
            jsonWriter.name("grpcRoute");
            GrpcRouteJsonMarshaller.getInstance().marshall(grpcRoute, jsonWriter);
        }
        if (routeSpec.getHttp2Route() != null) {
            HttpRoute http2Route = routeSpec.getHttp2Route();
            jsonWriter.name("http2Route");
            HttpRouteJsonMarshaller.getInstance().marshall(http2Route, jsonWriter);
        }
        if (routeSpec.getHttpRoute() != null) {
            HttpRoute httpRoute = routeSpec.getHttpRoute();
            jsonWriter.name("httpRoute");
            HttpRouteJsonMarshaller.getInstance().marshall(httpRoute, jsonWriter);
        }
        if (routeSpec.getPriority() != null) {
            Integer priority = routeSpec.getPriority();
            jsonWriter.name("priority");
            jsonWriter.value(priority);
        }
        if (routeSpec.getTcpRoute() != null) {
            TcpRoute tcpRoute = routeSpec.getTcpRoute();
            jsonWriter.name("tcpRoute");
            TcpRouteJsonMarshaller.getInstance().marshall(tcpRoute, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RouteSpecJsonMarshaller instance;

    public static RouteSpecJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RouteSpecJsonMarshaller();
        return instance;
    }
}
