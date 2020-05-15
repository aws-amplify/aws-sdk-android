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
 * JSON unmarshaller for response StartImageScanResult
 */
public class StartImageScanResultJsonUnmarshaller implements
        Unmarshaller<StartImageScanResult, JsonUnmarshallerContext> {

    public StartImageScanResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartImageScanResult startImageScanResult = new StartImageScanResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("registryId")) {
                startImageScanResult.setRegistryId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("repositoryName")) {
                startImageScanResult.setRepositoryName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageId")) {
                startImageScanResult.setImageId(ImageIdentifierJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageScanStatus")) {
                startImageScanResult.setImageScanStatus(ImageScanStatusJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return startImageScanResult;
    }

    private static StartImageScanResultJsonUnmarshaller instance;

    public static StartImageScanResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartImageScanResultJsonUnmarshaller();
        return instance;
    }
}
