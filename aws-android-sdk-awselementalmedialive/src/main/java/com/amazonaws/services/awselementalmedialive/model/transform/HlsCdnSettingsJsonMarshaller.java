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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HlsCdnSettings
 */
class HlsCdnSettingsJsonMarshaller {

    public void marshall(HlsCdnSettings hlsCdnSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hlsCdnSettings.getHlsAkamaiSettings() != null) {
            HlsAkamaiSettings hlsAkamaiSettings = hlsCdnSettings.getHlsAkamaiSettings();
            jsonWriter.name("HlsAkamaiSettings");
            HlsAkamaiSettingsJsonMarshaller.getInstance().marshall(hlsAkamaiSettings, jsonWriter);
        }
        if (hlsCdnSettings.getHlsBasicPutSettings() != null) {
            HlsBasicPutSettings hlsBasicPutSettings = hlsCdnSettings.getHlsBasicPutSettings();
            jsonWriter.name("HlsBasicPutSettings");
            HlsBasicPutSettingsJsonMarshaller.getInstance().marshall(hlsBasicPutSettings,
                    jsonWriter);
        }
        if (hlsCdnSettings.getHlsMediaStoreSettings() != null) {
            HlsMediaStoreSettings hlsMediaStoreSettings = hlsCdnSettings.getHlsMediaStoreSettings();
            jsonWriter.name("HlsMediaStoreSettings");
            HlsMediaStoreSettingsJsonMarshaller.getInstance().marshall(hlsMediaStoreSettings,
                    jsonWriter);
        }
        if (hlsCdnSettings.getHlsWebdavSettings() != null) {
            HlsWebdavSettings hlsWebdavSettings = hlsCdnSettings.getHlsWebdavSettings();
            jsonWriter.name("HlsWebdavSettings");
            HlsWebdavSettingsJsonMarshaller.getInstance().marshall(hlsWebdavSettings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HlsCdnSettingsJsonMarshaller instance;

    public static HlsCdnSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsCdnSettingsJsonMarshaller();
        return instance;
    }
}
