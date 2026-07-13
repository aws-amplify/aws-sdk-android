/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MedicalScribeJob
 */
class MedicalScribeJobJsonUnmarshaller implements
        Unmarshaller<MedicalScribeJob, JsonUnmarshallerContext> {

    public MedicalScribeJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MedicalScribeJob medicalScribeJob = new MedicalScribeJob();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MedicalScribeJobName")) {
                medicalScribeJob.setMedicalScribeJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MedicalScribeJobStatus")) {
                medicalScribeJob.setMedicalScribeJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                medicalScribeJob.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Media")) {
                medicalScribeJob.setMedia(MediaJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MedicalScribeOutput")) {
                medicalScribeJob.setMedicalScribeOutput(MedicalScribeOutputJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                medicalScribeJob.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                medicalScribeJob.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionTime")) {
                medicalScribeJob.setCompletionTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                medicalScribeJob.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Settings")) {
                medicalScribeJob.setSettings(MedicalScribeSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataAccessRoleArn")) {
                medicalScribeJob.setDataAccessRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChannelDefinitions")) {
                medicalScribeJob
                        .setChannelDefinitions(new ListUnmarshaller<MedicalScribeChannelDefinition>(
                                MedicalScribeChannelDefinitionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                medicalScribeJob.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return medicalScribeJob;
    }

    private static MedicalScribeJobJsonUnmarshaller instance;

    public static MedicalScribeJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MedicalScribeJobJsonUnmarshaller();
        return instance;
    }
}
