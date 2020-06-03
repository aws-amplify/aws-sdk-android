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
 * JSON marshaller for POJO EsamSettings
 */
class EsamSettingsJsonMarshaller {

    public void marshall(EsamSettings esamSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (esamSettings.getManifestConfirmConditionNotification() != null) {
            EsamManifestConfirmConditionNotification manifestConfirmConditionNotification = esamSettings
                    .getManifestConfirmConditionNotification();
            jsonWriter.name("ManifestConfirmConditionNotification");
            EsamManifestConfirmConditionNotificationJsonMarshaller.getInstance().marshall(
                    manifestConfirmConditionNotification, jsonWriter);
        }
        if (esamSettings.getResponseSignalPreroll() != null) {
            Integer responseSignalPreroll = esamSettings.getResponseSignalPreroll();
            jsonWriter.name("ResponseSignalPreroll");
            jsonWriter.value(responseSignalPreroll);
        }
        if (esamSettings.getSignalProcessingNotification() != null) {
            EsamSignalProcessingNotification signalProcessingNotification = esamSettings
                    .getSignalProcessingNotification();
            jsonWriter.name("SignalProcessingNotification");
            EsamSignalProcessingNotificationJsonMarshaller.getInstance().marshall(
                    signalProcessingNotification, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EsamSettingsJsonMarshaller instance;

    public static EsamSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EsamSettingsJsonMarshaller();
        return instance;
    }
}
