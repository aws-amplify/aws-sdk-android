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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobTemplateSettings
 */
class JobTemplateSettingsJsonMarshaller {

    public void marshall(JobTemplateSettings jobTemplateSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (jobTemplateSettings.getAdAvailOffset() != null) {
            Integer adAvailOffset = jobTemplateSettings.getAdAvailOffset();
            jsonWriter.name("AdAvailOffset");
            jsonWriter.value(adAvailOffset);
        }
        if (jobTemplateSettings.getAvailBlanking() != null) {
            AvailBlanking availBlanking = jobTemplateSettings.getAvailBlanking();
            jsonWriter.name("AvailBlanking");
            AvailBlankingJsonMarshaller.getInstance().marshall(availBlanking, jsonWriter);
        }
        if (jobTemplateSettings.getEsam() != null) {
            EsamSettings esam = jobTemplateSettings.getEsam();
            jsonWriter.name("Esam");
            EsamSettingsJsonMarshaller.getInstance().marshall(esam, jsonWriter);
        }
        if (jobTemplateSettings.getInputs() != null) {
            java.util.List<InputTemplate> inputs = jobTemplateSettings.getInputs();
            jsonWriter.name("Inputs");
            jsonWriter.beginArray();
            for (InputTemplate inputsItem : inputs) {
                if (inputsItem != null) {
                    InputTemplateJsonMarshaller.getInstance().marshall(inputsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobTemplateSettings.getMotionImageInserter() != null) {
            MotionImageInserter motionImageInserter = jobTemplateSettings.getMotionImageInserter();
            jsonWriter.name("MotionImageInserter");
            MotionImageInserterJsonMarshaller.getInstance().marshall(motionImageInserter,
                    jsonWriter);
        }
        if (jobTemplateSettings.getNielsenConfiguration() != null) {
            NielsenConfiguration nielsenConfiguration = jobTemplateSettings
                    .getNielsenConfiguration();
            jsonWriter.name("NielsenConfiguration");
            NielsenConfigurationJsonMarshaller.getInstance().marshall(nielsenConfiguration,
                    jsonWriter);
        }
        if (jobTemplateSettings.getOutputGroups() != null) {
            java.util.List<OutputGroup> outputGroups = jobTemplateSettings.getOutputGroups();
            jsonWriter.name("OutputGroups");
            jsonWriter.beginArray();
            for (OutputGroup outputGroupsItem : outputGroups) {
                if (outputGroupsItem != null) {
                    OutputGroupJsonMarshaller.getInstance().marshall(outputGroupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobTemplateSettings.getTimecodeConfig() != null) {
            TimecodeConfig timecodeConfig = jobTemplateSettings.getTimecodeConfig();
            jsonWriter.name("TimecodeConfig");
            TimecodeConfigJsonMarshaller.getInstance().marshall(timecodeConfig, jsonWriter);
        }
        if (jobTemplateSettings.getTimedMetadataInsertion() != null) {
            TimedMetadataInsertion timedMetadataInsertion = jobTemplateSettings
                    .getTimedMetadataInsertion();
            jsonWriter.name("TimedMetadataInsertion");
            TimedMetadataInsertionJsonMarshaller.getInstance().marshall(timedMetadataInsertion,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static JobTemplateSettingsJsonMarshaller instance;

    public static JobTemplateSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobTemplateSettingsJsonMarshaller();
        return instance;
    }
}
