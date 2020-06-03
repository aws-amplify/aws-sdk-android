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
 * JSON marshaller for POJO AncillarySourceSettings
 */
class AncillarySourceSettingsJsonMarshaller {

    public void marshall(AncillarySourceSettings ancillarySourceSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (ancillarySourceSettings.getConvert608To708() != null) {
            String convert608To708 = ancillarySourceSettings.getConvert608To708();
            jsonWriter.name("Convert608To708");
            jsonWriter.value(convert608To708);
        }
        if (ancillarySourceSettings.getSourceAncillaryChannelNumber() != null) {
            Integer sourceAncillaryChannelNumber = ancillarySourceSettings
                    .getSourceAncillaryChannelNumber();
            jsonWriter.name("SourceAncillaryChannelNumber");
            jsonWriter.value(sourceAncillaryChannelNumber);
        }
        if (ancillarySourceSettings.getTerminateCaptions() != null) {
            String terminateCaptions = ancillarySourceSettings.getTerminateCaptions();
            jsonWriter.name("TerminateCaptions");
            jsonWriter.value(terminateCaptions);
        }
        jsonWriter.endObject();
    }

    private static AncillarySourceSettingsJsonMarshaller instance;

    public static AncillarySourceSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AncillarySourceSettingsJsonMarshaller();
        return instance;
    }
}
