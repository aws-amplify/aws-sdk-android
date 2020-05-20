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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Hdr10Settings
 */
class Hdr10SettingsJsonMarshaller {

    public void marshall(Hdr10Settings hdr10Settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hdr10Settings.getMaxCll() != null) {
            Integer maxCll = hdr10Settings.getMaxCll();
            jsonWriter.name("MaxCll");
            jsonWriter.value(maxCll);
        }
        if (hdr10Settings.getMaxFall() != null) {
            Integer maxFall = hdr10Settings.getMaxFall();
            jsonWriter.name("MaxFall");
            jsonWriter.value(maxFall);
        }
        jsonWriter.endObject();
    }

    private static Hdr10SettingsJsonMarshaller instance;

    public static Hdr10SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Hdr10SettingsJsonMarshaller();
        return instance;
    }
}
