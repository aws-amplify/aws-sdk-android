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

package com.amazonaws.services.health.model.transform;

import com.amazonaws.services.health.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO OrganizationEvent
 */
class OrganizationEventJsonUnmarshaller implements
        Unmarshaller<OrganizationEvent, JsonUnmarshallerContext> {

    public OrganizationEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        OrganizationEvent organizationEvent = new OrganizationEvent();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                organizationEvent.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("service")) {
                organizationEvent.setService(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("eventTypeCode")) {
                organizationEvent.setEventTypeCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("eventTypeCategory")) {
                organizationEvent.setEventTypeCategory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("eventScopeCode")) {
                organizationEvent.setEventScopeCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                organizationEvent.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("startTime")) {
                organizationEvent.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("endTime")) {
                organizationEvent.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedTime")) {
                organizationEvent.setLastUpdatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("statusCode")) {
                organizationEvent.setStatusCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return organizationEvent;
    }

    private static OrganizationEventJsonUnmarshaller instance;

    public static OrganizationEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationEventJsonUnmarshaller();
        return instance;
    }
}
