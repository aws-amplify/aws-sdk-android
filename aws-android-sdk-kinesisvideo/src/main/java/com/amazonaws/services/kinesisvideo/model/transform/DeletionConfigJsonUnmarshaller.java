/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DeletionConfig
 */
class DeletionConfigJsonUnmarshaller implements
        Unmarshaller<DeletionConfig, JsonUnmarshallerContext> {

    public DeletionConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DeletionConfig deletionConfig = new DeletionConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EdgeRetentionInHours")) {
                deletionConfig.setEdgeRetentionInHours(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LocalSizeConfig")) {
                deletionConfig.setLocalSizeConfig(LocalSizeConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeleteAfterUpload")) {
                deletionConfig.setDeleteAfterUpload(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return deletionConfig;
    }

    private static DeletionConfigJsonUnmarshaller instance;

    public static DeletionConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeletionConfigJsonUnmarshaller();
        return instance;
    }
}
