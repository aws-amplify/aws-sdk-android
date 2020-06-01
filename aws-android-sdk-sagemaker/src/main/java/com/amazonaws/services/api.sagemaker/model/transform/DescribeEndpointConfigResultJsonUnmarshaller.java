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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeEndpointConfigResult
 */
public class DescribeEndpointConfigResultJsonUnmarshaller implements
        Unmarshaller<DescribeEndpointConfigResult, JsonUnmarshallerContext> {

    public DescribeEndpointConfigResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeEndpointConfigResult describeEndpointConfigResult = new DescribeEndpointConfigResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EndpointConfigName")) {
                describeEndpointConfigResult.setEndpointConfigName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointConfigArn")) {
                describeEndpointConfigResult.setEndpointConfigArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductionVariants")) {
                describeEndpointConfigResult
                        .setProductionVariants(new ListUnmarshaller<ProductionVariant>(
                                ProductionVariantJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DataCaptureConfig")) {
                describeEndpointConfigResult.setDataCaptureConfig(DataCaptureConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                describeEndpointConfigResult.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeEndpointConfigResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeEndpointConfigResult;
    }

    private static DescribeEndpointConfigResultJsonUnmarshaller instance;

    public static DescribeEndpointConfigResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeEndpointConfigResultJsonUnmarshaller();
        return instance;
    }
}
