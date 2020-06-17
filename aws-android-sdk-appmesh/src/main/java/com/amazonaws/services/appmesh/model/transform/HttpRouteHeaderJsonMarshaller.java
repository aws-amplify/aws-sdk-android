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
 * JSON marshaller for POJO HttpRouteHeader
 */
class HttpRouteHeaderJsonMarshaller {

    public void marshall(HttpRouteHeader httpRouteHeader, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (httpRouteHeader.getInvert() != null) {
            Boolean invert = httpRouteHeader.getInvert();
            jsonWriter.name("invert");
            jsonWriter.value(invert);
        }
        if (httpRouteHeader.getMatch() != null) {
            HeaderMatchMethod match = httpRouteHeader.getMatch();
            jsonWriter.name("match");
            HeaderMatchMethodJsonMarshaller.getInstance().marshall(match, jsonWriter);
        }
        if (httpRouteHeader.getName() != null) {
            String name = httpRouteHeader.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static HttpRouteHeaderJsonMarshaller instance;

    public static HttpRouteHeaderJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HttpRouteHeaderJsonMarshaller();
        return instance;
    }
}
