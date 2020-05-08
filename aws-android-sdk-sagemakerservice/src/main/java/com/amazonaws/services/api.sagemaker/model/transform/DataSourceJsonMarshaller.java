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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DataSource
 */
class DataSourceJsonMarshaller {

    public void marshall(DataSource dataSource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dataSource.getS3DataSource() != null) {
            S3DataSource s3DataSource = dataSource.getS3DataSource();
            jsonWriter.name("S3DataSource");
            S3DataSourceJsonMarshaller.getInstance().marshall(s3DataSource, jsonWriter);
        }
        if (dataSource.getFileSystemDataSource() != null) {
            FileSystemDataSource fileSystemDataSource = dataSource.getFileSystemDataSource();
            jsonWriter.name("FileSystemDataSource");
            FileSystemDataSourceJsonMarshaller.getInstance().marshall(fileSystemDataSource,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DataSourceJsonMarshaller instance;

    public static DataSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceJsonMarshaller();
        return instance;
    }
}
