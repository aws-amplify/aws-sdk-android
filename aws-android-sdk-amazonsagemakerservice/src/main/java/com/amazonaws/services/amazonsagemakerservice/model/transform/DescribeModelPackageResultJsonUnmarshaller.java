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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeModelPackageResult
 */
public class DescribeModelPackageResultJsonUnmarshaller implements
        Unmarshaller<DescribeModelPackageResult, JsonUnmarshallerContext> {

    public DescribeModelPackageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeModelPackageResult describeModelPackageResult = new DescribeModelPackageResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ModelPackageName")) {
                describeModelPackageResult.setModelPackageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelPackageArn")) {
                describeModelPackageResult.setModelPackageArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelPackageDescription")) {
                describeModelPackageResult.setModelPackageDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeModelPackageResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InferenceSpecification")) {
                describeModelPackageResult
                        .setInferenceSpecification(InferenceSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("SourceAlgorithmSpecification")) {
                describeModelPackageResult
                        .setSourceAlgorithmSpecification(SourceAlgorithmSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ValidationSpecification")) {
                describeModelPackageResult
                        .setValidationSpecification(ModelPackageValidationSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ModelPackageStatus")) {
                describeModelPackageResult.setModelPackageStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelPackageStatusDetails")) {
                describeModelPackageResult
                        .setModelPackageStatusDetails(ModelPackageStatusDetailsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("CertifyForMarketplace")) {
                describeModelPackageResult.setCertifyForMarketplace(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeModelPackageResult;
    }

    private static DescribeModelPackageResultJsonUnmarshaller instance;

    public static DescribeModelPackageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeModelPackageResultJsonUnmarshaller();
        return instance;
    }
}
