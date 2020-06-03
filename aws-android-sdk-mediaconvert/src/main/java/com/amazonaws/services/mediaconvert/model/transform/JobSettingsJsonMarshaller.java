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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobSettings
 */
class JobSettingsJsonMarshaller {

    public void marshall(JobSettings jobSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobSettings.getAdAvailOffset() != null) {
            Integer adAvailOffset = jobSettings.getAdAvailOffset();
            jsonWriter.name("AdAvailOffset");
            jsonWriter.value(adAvailOffset);
        }
        if (jobSettings.getAvailBlanking() != null) {
            AvailBlanking availBlanking = jobSettings.getAvailBlanking();
            jsonWriter.name("AvailBlanking");
            AvailBlankingJsonMarshaller.getInstance().marshall(availBlanking, jsonWriter);
        }
        if (jobSettings.getEsam() != null) {
            EsamSettings esam = jobSettings.getEsam();
            jsonWriter.name("Esam");
            EsamSettingsJsonMarshaller.getInstance().marshall(esam, jsonWriter);
        }
        if (jobSettings.getInputs() != null) {
            java.util.List<Input> inputs = jobSettings.getInputs();
            jsonWriter.name("Inputs");
            jsonWriter.beginArray();
            for (Input inputsItem : inputs) {
                if (inputsItem != null) {
                    InputJsonMarshaller.getInstance().marshall(inputsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobSettings.getMotionImageInserter() != null) {
            MotionImageInserter motionImageInserter = jobSettings.getMotionImageInserter();
            jsonWriter.name("MotionImageInserter");
            MotionImageInserterJsonMarshaller.getInstance().marshall(motionImageInserter,
                    jsonWriter);
        }
        if (jobSettings.getNielsenConfiguration() != null) {
            NielsenConfiguration nielsenConfiguration = jobSettings.getNielsenConfiguration();
            jsonWriter.name("NielsenConfiguration");
            NielsenConfigurationJsonMarshaller.getInstance().marshall(nielsenConfiguration,
                    jsonWriter);
        }
        if (jobSettings.getOutputGroups() != null) {
            java.util.List<OutputGroup> outputGroups = jobSettings.getOutputGroups();
            jsonWriter.name("OutputGroups");
            jsonWriter.beginArray();
            for (OutputGroup outputGroupsItem : outputGroups) {
                if (outputGroupsItem != null) {
                    OutputGroupJsonMarshaller.getInstance().marshall(outputGroupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobSettings.getTimecodeConfig() != null) {
            TimecodeConfig timecodeConfig = jobSettings.getTimecodeConfig();
            jsonWriter.name("TimecodeConfig");
            TimecodeConfigJsonMarshaller.getInstance().marshall(timecodeConfig, jsonWriter);
        }
        if (jobSettings.getTimedMetadataInsertion() != null) {
            TimedMetadataInsertion timedMetadataInsertion = jobSettings.getTimedMetadataInsertion();
            jsonWriter.name("TimedMetadataInsertion");
            TimedMetadataInsertionJsonMarshaller.getInstance().marshall(timedMetadataInsertion,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static JobSettingsJsonMarshaller instance;

    public static JobSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobSettingsJsonMarshaller();
        return instance;
    }
}
