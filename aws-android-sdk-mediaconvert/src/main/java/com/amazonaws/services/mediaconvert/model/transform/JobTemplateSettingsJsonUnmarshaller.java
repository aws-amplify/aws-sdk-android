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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JobTemplateSettings
 */
class JobTemplateSettingsJsonUnmarshaller implements
        Unmarshaller<JobTemplateSettings, JsonUnmarshallerContext> {

    public JobTemplateSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobTemplateSettings jobTemplateSettings = new JobTemplateSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdAvailOffset")) {
                jobTemplateSettings.setAdAvailOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailBlanking")) {
                jobTemplateSettings.setAvailBlanking(AvailBlankingJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Esam")) {
                jobTemplateSettings.setEsam(EsamSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Inputs")) {
                jobTemplateSettings.setInputs(new ListUnmarshaller<InputTemplate>(
                        InputTemplateJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MotionImageInserter")) {
                jobTemplateSettings.setMotionImageInserter(MotionImageInserterJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NielsenConfiguration")) {
                jobTemplateSettings.setNielsenConfiguration(NielsenConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputGroups")) {
                jobTemplateSettings.setOutputGroups(new ListUnmarshaller<OutputGroup>(
                        OutputGroupJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TimecodeConfig")) {
                jobTemplateSettings.setTimecodeConfig(TimecodeConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimedMetadataInsertion")) {
                jobTemplateSettings
                        .setTimedMetadataInsertion(TimedMetadataInsertionJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobTemplateSettings;
    }

    private static JobTemplateSettingsJsonUnmarshaller instance;

    public static JobTemplateSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobTemplateSettingsJsonUnmarshaller();
        return instance;
    }
}
