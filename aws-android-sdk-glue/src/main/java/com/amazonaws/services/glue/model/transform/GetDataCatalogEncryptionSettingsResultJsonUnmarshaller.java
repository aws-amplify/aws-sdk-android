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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetDataCatalogEncryptionSettingsResult
 */
public class GetDataCatalogEncryptionSettingsResultJsonUnmarshaller implements
        Unmarshaller<GetDataCatalogEncryptionSettingsResult, JsonUnmarshallerContext> {

    public GetDataCatalogEncryptionSettingsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetDataCatalogEncryptionSettingsResult getDataCatalogEncryptionSettingsResult = new GetDataCatalogEncryptionSettingsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DataCatalogEncryptionSettings")) {
                getDataCatalogEncryptionSettingsResult
                        .setDataCatalogEncryptionSettings(DataCatalogEncryptionSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getDataCatalogEncryptionSettingsResult;
    }

    private static GetDataCatalogEncryptionSettingsResultJsonUnmarshaller instance;

    public static GetDataCatalogEncryptionSettingsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDataCatalogEncryptionSettingsResultJsonUnmarshaller();
        return instance;
    }
}
