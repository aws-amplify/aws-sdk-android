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

package com.amazonaws.services.snowball.model.transform;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobResource
 */
class JobResourceJsonMarshaller {

    public void marshall(JobResource jobResource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobResource.getS3Resources() != null) {
            java.util.List<S3Resource> s3Resources = jobResource.getS3Resources();
            jsonWriter.name("S3Resources");
            jsonWriter.beginArray();
            for (S3Resource s3ResourcesItem : s3Resources) {
                if (s3ResourcesItem != null) {
                    S3ResourceJsonMarshaller.getInstance().marshall(s3ResourcesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobResource.getLambdaResources() != null) {
            java.util.List<LambdaResource> lambdaResources = jobResource.getLambdaResources();
            jsonWriter.name("LambdaResources");
            jsonWriter.beginArray();
            for (LambdaResource lambdaResourcesItem : lambdaResources) {
                if (lambdaResourcesItem != null) {
                    LambdaResourceJsonMarshaller.getInstance().marshall(lambdaResourcesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobResource.getEc2AmiResources() != null) {
            java.util.List<Ec2AmiResource> ec2AmiResources = jobResource.getEc2AmiResources();
            jsonWriter.name("Ec2AmiResources");
            jsonWriter.beginArray();
            for (Ec2AmiResource ec2AmiResourcesItem : ec2AmiResources) {
                if (ec2AmiResourcesItem != null) {
                    Ec2AmiResourceJsonMarshaller.getInstance().marshall(ec2AmiResourcesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static JobResourceJsonMarshaller instance;

    public static JobResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobResourceJsonMarshaller();
        return instance;
    }
}
