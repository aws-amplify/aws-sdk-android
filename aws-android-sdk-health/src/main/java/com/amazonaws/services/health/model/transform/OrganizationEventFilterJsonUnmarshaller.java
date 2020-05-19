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
 * JSON unmarshaller for POJO OrganizationEventFilter
 */
class OrganizationEventFilterJsonUnmarshaller implements
        Unmarshaller<OrganizationEventFilter, JsonUnmarshallerContext> {

    public OrganizationEventFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        OrganizationEventFilter organizationEventFilter = new OrganizationEventFilter();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("eventTypeCodes")) {
                organizationEventFilter.setEventTypeCodes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("awsAccountIds")) {
                organizationEventFilter.setAwsAccountIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("services")) {
                organizationEventFilter.setServices(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("regions")) {
                organizationEventFilter.setRegions(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("startTime")) {
                organizationEventFilter.setStartTime(DateTimeRangeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("endTime")) {
                organizationEventFilter.setEndTime(DateTimeRangeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedTime")) {
                organizationEventFilter.setLastUpdatedTime(DateTimeRangeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("entityArns")) {
                organizationEventFilter.setEntityArns(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("entityValues")) {
                organizationEventFilter.setEntityValues(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("eventTypeCategories")) {
                organizationEventFilter.setEventTypeCategories(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("eventStatusCodes")) {
                organizationEventFilter.setEventStatusCodes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return organizationEventFilter;
    }

    private static OrganizationEventFilterJsonUnmarshaller instance;

    public static OrganizationEventFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationEventFilterJsonUnmarshaller();
        return instance;
    }
}
