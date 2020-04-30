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

package com.amazonaws.services.awsstoragegateway.model.transform;

import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DeleteVolumeResult
 */
public class DeleteVolumeResultJsonUnmarshaller implements
        Unmarshaller<DeleteVolumeResult, JsonUnmarshallerContext> {

    public DeleteVolumeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteVolumeResult deleteVolumeResult = new DeleteVolumeResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("VolumeARN")) {
                deleteVolumeResult.setVolumeARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteVolumeResult;
    }

    private static DeleteVolumeResultJsonUnmarshaller instance;

    public static DeleteVolumeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteVolumeResultJsonUnmarshaller();
        return instance;
    }
}
