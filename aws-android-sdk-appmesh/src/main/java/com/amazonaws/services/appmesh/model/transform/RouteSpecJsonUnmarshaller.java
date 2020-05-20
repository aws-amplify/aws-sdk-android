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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RouteSpec
 */
class RouteSpecJsonUnmarshaller implements Unmarshaller<RouteSpec, JsonUnmarshallerContext> {

    public RouteSpec unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RouteSpec routeSpec = new RouteSpec();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("grpcRoute")) {
                routeSpec.setGrpcRoute(GrpcRouteJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("http2Route")) {
                routeSpec.setHttp2Route(HttpRouteJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("httpRoute")) {
                routeSpec.setHttpRoute(HttpRouteJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("priority")) {
                routeSpec.setPriority(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tcpRoute")) {
                routeSpec.setTcpRoute(TcpRouteJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return routeSpec;
    }

    private static RouteSpecJsonUnmarshaller instance;

    public static RouteSpecJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RouteSpecJsonUnmarshaller();
        return instance;
    }
}
