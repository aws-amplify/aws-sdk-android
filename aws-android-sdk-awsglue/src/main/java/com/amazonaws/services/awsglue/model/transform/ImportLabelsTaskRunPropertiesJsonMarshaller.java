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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ImportLabelsTaskRunProperties
 */
class ImportLabelsTaskRunPropertiesJsonMarshaller {

    public void marshall(ImportLabelsTaskRunProperties importLabelsTaskRunProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (importLabelsTaskRunProperties.getInputS3Path() != null) {
            String inputS3Path = importLabelsTaskRunProperties.getInputS3Path();
            jsonWriter.name("InputS3Path");
            jsonWriter.value(inputS3Path);
        }
        if (importLabelsTaskRunProperties.getReplace() != null) {
            Boolean replace = importLabelsTaskRunProperties.getReplace();
            jsonWriter.name("Replace");
            jsonWriter.value(replace);
        }
        jsonWriter.endObject();
    }

    private static ImportLabelsTaskRunPropertiesJsonMarshaller instance;

    public static ImportLabelsTaskRunPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportLabelsTaskRunPropertiesJsonMarshaller();
        return instance;
    }
}
