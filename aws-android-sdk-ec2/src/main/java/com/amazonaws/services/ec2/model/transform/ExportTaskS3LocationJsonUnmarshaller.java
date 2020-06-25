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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ExportTaskS3Location
 */
class ExportTaskS3LocationJsonUnmarshaller implements
        Unmarshaller<ExportTaskS3Location, JsonUnmarshallerContext> {

    public ExportTaskS3Location unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ExportTaskS3Location exportTaskS3Location = new ExportTaskS3Location();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("S3Bucket")) {
                exportTaskS3Location.setS3Bucket(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3Prefix")) {
                exportTaskS3Location.setS3Prefix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return exportTaskS3Location;
    }

    private static ExportTaskS3LocationJsonUnmarshaller instance;

    public static ExportTaskS3LocationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportTaskS3LocationJsonUnmarshaller();
        return instance;
    }
}
