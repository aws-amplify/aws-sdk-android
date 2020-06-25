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
 * JSON unmarshaller for POJO ExportToS3TaskSpecification
 */
class ExportToS3TaskSpecificationJsonUnmarshaller implements
        Unmarshaller<ExportToS3TaskSpecification, JsonUnmarshallerContext> {

    public ExportToS3TaskSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ExportToS3TaskSpecification exportToS3TaskSpecification = new ExportToS3TaskSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ContainerFormat")) {
                exportToS3TaskSpecification.setContainerFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DiskImageFormat")) {
                exportToS3TaskSpecification.setDiskImageFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3Bucket")) {
                exportToS3TaskSpecification.setS3Bucket(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3Prefix")) {
                exportToS3TaskSpecification.setS3Prefix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return exportToS3TaskSpecification;
    }

    private static ExportToS3TaskSpecificationJsonUnmarshaller instance;

    public static ExportToS3TaskSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportToS3TaskSpecificationJsonUnmarshaller();
        return instance;
    }
}
