/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EdgeAgentStatus
 */
class EdgeAgentStatusJsonMarshaller {

    public void marshall(EdgeAgentStatus edgeAgentStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (edgeAgentStatus.getLastRecorderStatus() != null) {
            LastRecorderStatus lastRecorderStatus = edgeAgentStatus.getLastRecorderStatus();
            jsonWriter.name("LastRecorderStatus");
            LastRecorderStatusJsonMarshaller.getInstance().marshall(lastRecorderStatus, jsonWriter);
        }
        if (edgeAgentStatus.getLastUploaderStatus() != null) {
            LastUploaderStatus lastUploaderStatus = edgeAgentStatus.getLastUploaderStatus();
            jsonWriter.name("LastUploaderStatus");
            LastUploaderStatusJsonMarshaller.getInstance().marshall(lastUploaderStatus, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EdgeAgentStatusJsonMarshaller instance;

    public static EdgeAgentStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EdgeAgentStatusJsonMarshaller();
        return instance;
    }
}
