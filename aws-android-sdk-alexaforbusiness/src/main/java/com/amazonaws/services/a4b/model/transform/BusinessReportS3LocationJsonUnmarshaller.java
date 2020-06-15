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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO BusinessReportS3Location
 */
class BusinessReportS3LocationJsonUnmarshaller implements
        Unmarshaller<BusinessReportS3Location, JsonUnmarshallerContext> {

    public BusinessReportS3Location unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BusinessReportS3Location businessReportS3Location = new BusinessReportS3Location();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Path")) {
                businessReportS3Location.setPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BucketName")) {
                businessReportS3Location.setBucketName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return businessReportS3Location;
    }

    private static BusinessReportS3LocationJsonUnmarshaller instance;

    public static BusinessReportS3LocationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BusinessReportS3LocationJsonUnmarshaller();
        return instance;
    }
}
