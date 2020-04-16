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

package com.amazonaws.services.amazonimportexportsnowball.model.transform;

import com.amazonaws.services.amazonimportexportsnowball.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JobResource
 */
class JobResourceJsonUnmarshaller implements Unmarshaller<JobResource, JsonUnmarshallerContext> {

    public JobResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobResource jobResource = new JobResource();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("S3Resources")) {
                jobResource.setS3Resources(new ListUnmarshaller<S3Resource>(
                        S3ResourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LambdaResources")) {
                jobResource.setLambdaResources(new ListUnmarshaller<LambdaResource>(
                        LambdaResourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Ec2AmiResources")) {
                jobResource.setEc2AmiResources(new ListUnmarshaller<Ec2AmiResource>(
                        Ec2AmiResourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobResource;
    }

    private static JobResourceJsonUnmarshaller instance;

    public static JobResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobResourceJsonUnmarshaller();
        return instance;
    }
}
