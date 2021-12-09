/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model.transform;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ParallelDataProperties
 */
class ParallelDataPropertiesJsonUnmarshaller implements
        Unmarshaller<ParallelDataProperties, JsonUnmarshallerContext> {

    public ParallelDataProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ParallelDataProperties parallelDataProperties = new ParallelDataProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                parallelDataProperties.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                parallelDataProperties.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                parallelDataProperties.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                parallelDataProperties.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceLanguageCode")) {
                parallelDataProperties.setSourceLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetLanguageCodes")) {
                parallelDataProperties.setTargetLanguageCodes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ParallelDataConfig")) {
                parallelDataProperties.setParallelDataConfig(ParallelDataConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                parallelDataProperties.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImportedDataSize")) {
                parallelDataProperties.setImportedDataSize(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImportedRecordCount")) {
                parallelDataProperties.setImportedRecordCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailedRecordCount")) {
                parallelDataProperties.setFailedRecordCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SkippedRecordCount")) {
                parallelDataProperties.setSkippedRecordCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EncryptionKey")) {
                parallelDataProperties.setEncryptionKey(EncryptionKeyJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                parallelDataProperties.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedAt")) {
                parallelDataProperties.setLastUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LatestUpdateAttemptStatus")) {
                parallelDataProperties.setLatestUpdateAttemptStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LatestUpdateAttemptAt")) {
                parallelDataProperties.setLatestUpdateAttemptAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return parallelDataProperties;
    }

    private static ParallelDataPropertiesJsonUnmarshaller instance;

    public static ParallelDataPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ParallelDataPropertiesJsonUnmarshaller();
        return instance;
    }
}
