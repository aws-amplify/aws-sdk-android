/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RoutingProfileSummary
 */
class RoutingProfileSummaryJsonMarshaller {

    public void marshall(RoutingProfileSummary routingProfileSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (routingProfileSummary.getId() != null) {
            String id = routingProfileSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (routingProfileSummary.getArn() != null) {
            String arn = routingProfileSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (routingProfileSummary.getName() != null) {
            String name = routingProfileSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static RoutingProfileSummaryJsonMarshaller instance;

    public static RoutingProfileSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RoutingProfileSummaryJsonMarshaller();
        return instance;
    }
}
