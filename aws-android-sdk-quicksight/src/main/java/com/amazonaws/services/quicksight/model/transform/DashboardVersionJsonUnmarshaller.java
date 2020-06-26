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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DashboardVersion
 */
class DashboardVersionJsonUnmarshaller implements
        Unmarshaller<DashboardVersion, JsonUnmarshallerContext> {

    public DashboardVersion unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DashboardVersion dashboardVersion = new DashboardVersion();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CreatedTime")) {
                dashboardVersion.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Errors")) {
                dashboardVersion.setErrors(new ListUnmarshaller<DashboardError>(
                        DashboardErrorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VersionNumber")) {
                dashboardVersion.setVersionNumber(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                dashboardVersion.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                dashboardVersion.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceEntityArn")) {
                dashboardVersion.setSourceEntityArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataSetArns")) {
                dashboardVersion.setDataSetArns(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Description")) {
                dashboardVersion.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dashboardVersion;
    }

    private static DashboardVersionJsonUnmarshaller instance;

    public static DashboardVersionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DashboardVersionJsonUnmarshaller();
        return instance;
    }
}
