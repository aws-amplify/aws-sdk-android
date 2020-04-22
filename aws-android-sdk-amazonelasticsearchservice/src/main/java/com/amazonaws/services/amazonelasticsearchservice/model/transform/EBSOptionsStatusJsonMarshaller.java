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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EBSOptionsStatus
 */
class EBSOptionsStatusJsonMarshaller {

    public void marshall(EBSOptionsStatus eBSOptionsStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eBSOptionsStatus.getOptions() != null) {
            EBSOptions options = eBSOptionsStatus.getOptions();
            jsonWriter.name("Options");
            EBSOptionsJsonMarshaller.getInstance().marshall(options, jsonWriter);
        }
        if (eBSOptionsStatus.getStatus() != null) {
            OptionStatus status = eBSOptionsStatus.getStatus();
            jsonWriter.name("Status");
            OptionStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EBSOptionsStatusJsonMarshaller instance;

    public static EBSOptionsStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EBSOptionsStatusJsonMarshaller();
        return instance;
    }
}
