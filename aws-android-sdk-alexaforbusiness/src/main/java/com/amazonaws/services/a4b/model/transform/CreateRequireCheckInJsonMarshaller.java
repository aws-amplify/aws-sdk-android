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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CreateRequireCheckIn
 */
class CreateRequireCheckInJsonMarshaller {

    public void marshall(CreateRequireCheckIn createRequireCheckIn, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (createRequireCheckIn.getReleaseAfterMinutes() != null) {
            Integer releaseAfterMinutes = createRequireCheckIn.getReleaseAfterMinutes();
            jsonWriter.name("ReleaseAfterMinutes");
            jsonWriter.value(releaseAfterMinutes);
        }
        if (createRequireCheckIn.getEnabled() != null) {
            Boolean enabled = createRequireCheckIn.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        jsonWriter.endObject();
    }

    private static CreateRequireCheckInJsonMarshaller instance;

    public static CreateRequireCheckInJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateRequireCheckInJsonMarshaller();
        return instance;
    }
}
