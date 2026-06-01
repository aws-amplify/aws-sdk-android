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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MedicalScribeJob
 */
class MedicalScribeJobJsonMarshaller {

    public void marshall(MedicalScribeJob medicalScribeJob, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (medicalScribeJob.getMedicalScribeJobName() != null) {
            String medicalScribeJobName = medicalScribeJob.getMedicalScribeJobName();
            jsonWriter.name("MedicalScribeJobName");
            jsonWriter.value(medicalScribeJobName);
        }
        if (medicalScribeJob.getMedicalScribeJobStatus() != null) {
            String medicalScribeJobStatus = medicalScribeJob.getMedicalScribeJobStatus();
            jsonWriter.name("MedicalScribeJobStatus");
            jsonWriter.value(medicalScribeJobStatus);
        }
        if (medicalScribeJob.getLanguageCode() != null) {
            String languageCode = medicalScribeJob.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (medicalScribeJob.getMedia() != null) {
            Media media = medicalScribeJob.getMedia();
            jsonWriter.name("Media");
            MediaJsonMarshaller.getInstance().marshall(media, jsonWriter);
        }
        if (medicalScribeJob.getMedicalScribeOutput() != null) {
            MedicalScribeOutput medicalScribeOutput = medicalScribeJob.getMedicalScribeOutput();
            jsonWriter.name("MedicalScribeOutput");
            MedicalScribeOutputJsonMarshaller.getInstance().marshall(medicalScribeOutput,
                    jsonWriter);
        }
        if (medicalScribeJob.getStartTime() != null) {
            java.util.Date startTime = medicalScribeJob.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (medicalScribeJob.getCreationTime() != null) {
            java.util.Date creationTime = medicalScribeJob.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (medicalScribeJob.getCompletionTime() != null) {
            java.util.Date completionTime = medicalScribeJob.getCompletionTime();
            jsonWriter.name("CompletionTime");
            jsonWriter.value(completionTime);
        }
        if (medicalScribeJob.getFailureReason() != null) {
            String failureReason = medicalScribeJob.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (medicalScribeJob.getSettings() != null) {
            MedicalScribeSettings settings = medicalScribeJob.getSettings();
            jsonWriter.name("Settings");
            MedicalScribeSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
        }
        if (medicalScribeJob.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = medicalScribeJob.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        if (medicalScribeJob.getChannelDefinitions() != null) {
            java.util.List<MedicalScribeChannelDefinition> channelDefinitions = medicalScribeJob
                    .getChannelDefinitions();
            jsonWriter.name("ChannelDefinitions");
            jsonWriter.beginArray();
            for (MedicalScribeChannelDefinition channelDefinitionsItem : channelDefinitions) {
                if (channelDefinitionsItem != null) {
                    MedicalScribeChannelDefinitionJsonMarshaller.getInstance().marshall(
                            channelDefinitionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (medicalScribeJob.getTags() != null) {
            java.util.List<Tag> tags = medicalScribeJob.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static MedicalScribeJobJsonMarshaller instance;

    public static MedicalScribeJobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MedicalScribeJobJsonMarshaller();
        return instance;
    }
}
