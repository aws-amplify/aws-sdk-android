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

package com.amazonaws.services.amazonelasticfilesystem.model.transform;

import com.amazonaws.services.amazonelasticfilesystem.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FileSystemSize
 */
class FileSystemSizeJsonMarshaller {

    public void marshall(FileSystemSize fileSystemSize, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (fileSystemSize.getValue() != null) {
            Long value = fileSystemSize.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (fileSystemSize.getTimestamp() != null) {
            java.util.Date timestamp = fileSystemSize.getTimestamp();
            jsonWriter.name("Timestamp");
            jsonWriter.value(timestamp);
        }
        if (fileSystemSize.getValueInIA() != null) {
            Long valueInIA = fileSystemSize.getValueInIA();
            jsonWriter.name("ValueInIA");
            jsonWriter.value(valueInIA);
        }
        if (fileSystemSize.getValueInStandard() != null) {
            Long valueInStandard = fileSystemSize.getValueInStandard();
            jsonWriter.name("ValueInStandard");
            jsonWriter.value(valueInStandard);
        }
        jsonWriter.endObject();
    }

    private static FileSystemSizeJsonMarshaller instance;

    public static FileSystemSizeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FileSystemSizeJsonMarshaller();
        return instance;
    }
}
