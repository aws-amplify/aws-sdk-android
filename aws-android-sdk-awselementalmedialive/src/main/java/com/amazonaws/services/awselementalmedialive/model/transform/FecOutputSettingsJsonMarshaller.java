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
 * JSON marshaller for POJO FecOutputSettings
 */
class FecOutputSettingsJsonMarshaller {

    public void marshall(FecOutputSettings fecOutputSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (fecOutputSettings.getColumnDepth() != null) {
            Integer columnDepth = fecOutputSettings.getColumnDepth();
            jsonWriter.name("ColumnDepth");
            jsonWriter.value(columnDepth);
        }
        if (fecOutputSettings.getIncludeFec() != null) {
            String includeFec = fecOutputSettings.getIncludeFec();
            jsonWriter.name("IncludeFec");
            jsonWriter.value(includeFec);
        }
        if (fecOutputSettings.getRowLength() != null) {
            Integer rowLength = fecOutputSettings.getRowLength();
            jsonWriter.name("RowLength");
            jsonWriter.value(rowLength);
        }
        jsonWriter.endObject();
    }

    private static FecOutputSettingsJsonMarshaller instance;

    public static FecOutputSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FecOutputSettingsJsonMarshaller();
        return instance;
    }
}
