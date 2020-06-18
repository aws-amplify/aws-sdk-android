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
 * JSON marshaller for POJO M2tsScte35Esam
 */
class M2tsScte35EsamJsonMarshaller {

    public void marshall(M2tsScte35Esam m2tsScte35Esam, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (m2tsScte35Esam.getScte35EsamPid() != null) {
            Integer scte35EsamPid = m2tsScte35Esam.getScte35EsamPid();
            jsonWriter.name("Scte35EsamPid");
            jsonWriter.value(scte35EsamPid);
        }
        jsonWriter.endObject();
    }

    private static M2tsScte35EsamJsonMarshaller instance;

    public static M2tsScte35EsamJsonMarshaller getInstance() {
        if (instance == null)
            instance = new M2tsScte35EsamJsonMarshaller();
        return instance;
    }
}
