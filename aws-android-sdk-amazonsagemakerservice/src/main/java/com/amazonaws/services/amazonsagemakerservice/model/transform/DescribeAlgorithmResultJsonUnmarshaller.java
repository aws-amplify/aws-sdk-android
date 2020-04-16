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
 * JSON unmarshaller for response DescribeAlgorithmResult
 */
public class DescribeAlgorithmResultJsonUnmarshaller implements
        Unmarshaller<DescribeAlgorithmResult, JsonUnmarshallerContext> {

    public DescribeAlgorithmResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAlgorithmResult describeAlgorithmResult = new DescribeAlgorithmResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AlgorithmName")) {
                describeAlgorithmResult.setAlgorithmName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AlgorithmArn")) {
                describeAlgorithmResult.setAlgorithmArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AlgorithmDescription")) {
                describeAlgorithmResult.setAlgorithmDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeAlgorithmResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingSpecification")) {
                describeAlgorithmResult
                        .setTrainingSpecification(TrainingSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("InferenceSpecification")) {
                describeAlgorithmResult
                        .setInferenceSpecification(InferenceSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ValidationSpecification")) {
                describeAlgorithmResult
                        .setValidationSpecification(AlgorithmValidationSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AlgorithmStatus")) {
                describeAlgorithmResult.setAlgorithmStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AlgorithmStatusDetails")) {
                describeAlgorithmResult
                        .setAlgorithmStatusDetails(AlgorithmStatusDetailsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ProductId")) {
                describeAlgorithmResult.setProductId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CertifyForMarketplace")) {
                describeAlgorithmResult.setCertifyForMarketplace(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeAlgorithmResult;
    }

    private static DescribeAlgorithmResultJsonUnmarshaller instance;

    public static DescribeAlgorithmResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAlgorithmResultJsonUnmarshaller();
        return instance;
    }
}
