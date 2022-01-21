/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InputDataConfig
 */
class InputDataConfigJsonMarshaller {

    public void marshall(InputDataConfig inputDataConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inputDataConfig.getS3Uri() != null) {
            String s3Uri = inputDataConfig.getS3Uri();
            jsonWriter.name("S3Uri");
            jsonWriter.value(s3Uri);
        }
        if (inputDataConfig.getTuningDataS3Uri() != null) {
            String tuningDataS3Uri = inputDataConfig.getTuningDataS3Uri();
            jsonWriter.name("TuningDataS3Uri");
            jsonWriter.value(tuningDataS3Uri);
        }
        if (inputDataConfig.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = inputDataConfig.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        jsonWriter.endObject();
    }

    private static InputDataConfigJsonMarshaller instance;

    public static InputDataConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputDataConfigJsonMarshaller();
        return instance;
    }
}
