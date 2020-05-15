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

package com.amazonaws.services.api.ecr.model.transform;

import com.amazonaws.services.api.ecr.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeImageScanFindingsResult
 */
public class DescribeImageScanFindingsResultJsonUnmarshaller implements
        Unmarshaller<DescribeImageScanFindingsResult, JsonUnmarshallerContext> {

    public DescribeImageScanFindingsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeImageScanFindingsResult describeImageScanFindingsResult = new DescribeImageScanFindingsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("registryId")) {
                describeImageScanFindingsResult.setRegistryId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("repositoryName")) {
                describeImageScanFindingsResult.setRepositoryName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageId")) {
                describeImageScanFindingsResult.setImageId(ImageIdentifierJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageScanStatus")) {
                describeImageScanFindingsResult.setImageScanStatus(ImageScanStatusJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageScanFindings")) {
                describeImageScanFindingsResult
                        .setImageScanFindings(ImageScanFindingsJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                describeImageScanFindingsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeImageScanFindingsResult;
    }

    private static DescribeImageScanFindingsResultJsonUnmarshaller instance;

    public static DescribeImageScanFindingsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeImageScanFindingsResultJsonUnmarshaller();
        return instance;
    }
}
