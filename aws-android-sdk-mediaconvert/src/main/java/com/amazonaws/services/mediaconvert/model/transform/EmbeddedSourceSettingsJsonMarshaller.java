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
 * JSON marshaller for POJO EmbeddedSourceSettings
 */
class EmbeddedSourceSettingsJsonMarshaller {

    public void marshall(EmbeddedSourceSettings embeddedSourceSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (embeddedSourceSettings.getConvert608To708() != null) {
            String convert608To708 = embeddedSourceSettings.getConvert608To708();
            jsonWriter.name("Convert608To708");
            jsonWriter.value(convert608To708);
        }
        if (embeddedSourceSettings.getSource608ChannelNumber() != null) {
            Integer source608ChannelNumber = embeddedSourceSettings.getSource608ChannelNumber();
            jsonWriter.name("Source608ChannelNumber");
            jsonWriter.value(source608ChannelNumber);
        }
        if (embeddedSourceSettings.getSource608TrackNumber() != null) {
            Integer source608TrackNumber = embeddedSourceSettings.getSource608TrackNumber();
            jsonWriter.name("Source608TrackNumber");
            jsonWriter.value(source608TrackNumber);
        }
        if (embeddedSourceSettings.getTerminateCaptions() != null) {
            String terminateCaptions = embeddedSourceSettings.getTerminateCaptions();
            jsonWriter.name("TerminateCaptions");
            jsonWriter.value(terminateCaptions);
        }
        jsonWriter.endObject();
    }

    private static EmbeddedSourceSettingsJsonMarshaller instance;

    public static EmbeddedSourceSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EmbeddedSourceSettingsJsonMarshaller();
        return instance;
    }
}
