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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO S3ReportExportConfig
 */
class S3ReportExportConfigJsonUnmarshaller implements
        Unmarshaller<S3ReportExportConfig, JsonUnmarshallerContext> {

    public S3ReportExportConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3ReportExportConfig s3ReportExportConfig = new S3ReportExportConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("bucket")) {
                s3ReportExportConfig.setBucket(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("path")) {
                s3ReportExportConfig.setPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("packaging")) {
                s3ReportExportConfig.setPackaging(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("encryptionKey")) {
                s3ReportExportConfig.setEncryptionKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("encryptionDisabled")) {
                s3ReportExportConfig.setEncryptionDisabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3ReportExportConfig;
    }

    private static S3ReportExportConfigJsonUnmarshaller instance;

    public static S3ReportExportConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3ReportExportConfigJsonUnmarshaller();
        return instance;
    }
}
