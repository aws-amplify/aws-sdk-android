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

package com.amazonaws.services.comprehendmedical.model.transform;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ComprehendMedicalAsyncJobProperties
 */
class ComprehendMedicalAsyncJobPropertiesJsonUnmarshaller implements
        Unmarshaller<ComprehendMedicalAsyncJobProperties, JsonUnmarshallerContext> {

    public ComprehendMedicalAsyncJobProperties unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ComprehendMedicalAsyncJobProperties comprehendMedicalAsyncJobProperties = new ComprehendMedicalAsyncJobProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                comprehendMedicalAsyncJobProperties.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobName")) {
                comprehendMedicalAsyncJobProperties.setJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobStatus")) {
                comprehendMedicalAsyncJobProperties.setJobStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                comprehendMedicalAsyncJobProperties.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubmitTime")) {
                comprehendMedicalAsyncJobProperties.setSubmitTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                comprehendMedicalAsyncJobProperties.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExpirationTime")) {
                comprehendMedicalAsyncJobProperties.setExpirationTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputDataConfig")) {
                comprehendMedicalAsyncJobProperties
                        .setInputDataConfig(InputDataConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("OutputDataConfig")) {
                comprehendMedicalAsyncJobProperties
                        .setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                comprehendMedicalAsyncJobProperties.setLanguageCode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataAccessRoleArn")) {
                comprehendMedicalAsyncJobProperties.setDataAccessRoleArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ManifestFilePath")) {
                comprehendMedicalAsyncJobProperties.setManifestFilePath(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KMSKey")) {
                comprehendMedicalAsyncJobProperties.setKMSKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelVersion")) {
                comprehendMedicalAsyncJobProperties.setModelVersion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return comprehendMedicalAsyncJobProperties;
    }

    private static ComprehendMedicalAsyncJobPropertiesJsonUnmarshaller instance;

    public static ComprehendMedicalAsyncJobPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComprehendMedicalAsyncJobPropertiesJsonUnmarshaller();
        return instance;
    }
}
