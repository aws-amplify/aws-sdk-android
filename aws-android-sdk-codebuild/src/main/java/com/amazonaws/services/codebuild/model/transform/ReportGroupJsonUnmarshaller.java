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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ReportGroup
 */
class ReportGroupJsonUnmarshaller implements Unmarshaller<ReportGroup, JsonUnmarshallerContext> {

    public ReportGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReportGroup reportGroup = new ReportGroup();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                reportGroup.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                reportGroup.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("type")) {
                reportGroup.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("exportConfig")) {
                reportGroup.setExportConfig(ReportExportConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("created")) {
                reportGroup.setCreated(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModified")) {
                reportGroup.setLastModified(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return reportGroup;
    }

    private static ReportGroupJsonUnmarshaller instance;

    public static ReportGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReportGroupJsonUnmarshaller();
        return instance;
    }
}
