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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO S3Source
 */
class S3SourceJsonUnmarshaller implements Unmarshaller<S3Source, JsonUnmarshallerContext> {

    public S3Source unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3Source s3Source = new S3Source();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DataSourceArn")) {
                s3Source.setDataSourceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UploadSettings")) {
                s3Source.setUploadSettings(UploadSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputColumns")) {
                s3Source.setInputColumns(new ListUnmarshaller<InputColumn>(
                        InputColumnJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3Source;
    }

    private static S3SourceJsonUnmarshaller instance;

    public static S3SourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3SourceJsonUnmarshaller();
        return instance;
    }
}
