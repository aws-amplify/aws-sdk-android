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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FileSystemDataSource
 */
class FileSystemDataSourceJsonMarshaller {

    public void marshall(FileSystemDataSource fileSystemDataSource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (fileSystemDataSource.getFileSystemId() != null) {
            String fileSystemId = fileSystemDataSource.getFileSystemId();
            jsonWriter.name("FileSystemId");
            jsonWriter.value(fileSystemId);
        }
        if (fileSystemDataSource.getFileSystemAccessMode() != null) {
            String fileSystemAccessMode = fileSystemDataSource.getFileSystemAccessMode();
            jsonWriter.name("FileSystemAccessMode");
            jsonWriter.value(fileSystemAccessMode);
        }
        if (fileSystemDataSource.getFileSystemType() != null) {
            String fileSystemType = fileSystemDataSource.getFileSystemType();
            jsonWriter.name("FileSystemType");
            jsonWriter.value(fileSystemType);
        }
        if (fileSystemDataSource.getDirectoryPath() != null) {
            String directoryPath = fileSystemDataSource.getDirectoryPath();
            jsonWriter.name("DirectoryPath");
            jsonWriter.value(directoryPath);
        }
        jsonWriter.endObject();
    }

    private static FileSystemDataSourceJsonMarshaller instance;

    public static FileSystemDataSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FileSystemDataSourceJsonMarshaller();
        return instance;
    }
}
