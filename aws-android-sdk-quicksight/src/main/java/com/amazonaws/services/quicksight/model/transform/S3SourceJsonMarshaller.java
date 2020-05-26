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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3Source
 */
class S3SourceJsonMarshaller {

    public void marshall(S3Source s3Source, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Source.getDataSourceArn() != null) {
            String dataSourceArn = s3Source.getDataSourceArn();
            jsonWriter.name("DataSourceArn");
            jsonWriter.value(dataSourceArn);
        }
        if (s3Source.getUploadSettings() != null) {
            UploadSettings uploadSettings = s3Source.getUploadSettings();
            jsonWriter.name("UploadSettings");
            UploadSettingsJsonMarshaller.getInstance().marshall(uploadSettings, jsonWriter);
        }
        if (s3Source.getInputColumns() != null) {
            java.util.List<InputColumn> inputColumns = s3Source.getInputColumns();
            jsonWriter.name("InputColumns");
            jsonWriter.beginArray();
            for (InputColumn inputColumnsItem : inputColumns) {
                if (inputColumnsItem != null) {
                    InputColumnJsonMarshaller.getInstance().marshall(inputColumnsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static S3SourceJsonMarshaller instance;

    public static S3SourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3SourceJsonMarshaller();
        return instance;
    }
}
