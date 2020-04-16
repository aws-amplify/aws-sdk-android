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
 * JSON marshaller for POJO StaticKeyProvider
 */
class StaticKeyProviderJsonMarshaller {

    public void marshall(StaticKeyProvider staticKeyProvider, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (staticKeyProvider.getKeyFormat() != null) {
            String keyFormat = staticKeyProvider.getKeyFormat();
            jsonWriter.name("KeyFormat");
            jsonWriter.value(keyFormat);
        }
        if (staticKeyProvider.getKeyFormatVersions() != null) {
            String keyFormatVersions = staticKeyProvider.getKeyFormatVersions();
            jsonWriter.name("KeyFormatVersions");
            jsonWriter.value(keyFormatVersions);
        }
        if (staticKeyProvider.getStaticKeyValue() != null) {
            String staticKeyValue = staticKeyProvider.getStaticKeyValue();
            jsonWriter.name("StaticKeyValue");
            jsonWriter.value(staticKeyValue);
        }
        if (staticKeyProvider.getUrl() != null) {
            String url = staticKeyProvider.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static StaticKeyProviderJsonMarshaller instance;

    public static StaticKeyProviderJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StaticKeyProviderJsonMarshaller();
        return instance;
    }
}
