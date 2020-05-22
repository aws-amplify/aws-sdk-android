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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PortalStatus
 */
class PortalStatusJsonMarshaller {

    public void marshall(PortalStatus portalStatus, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (portalStatus.getState() != null) {
            String state = portalStatus.getState();
            jsonWriter.name("state");
            jsonWriter.value(state);
        }
        if (portalStatus.getError() != null) {
            MonitorErrorDetails error = portalStatus.getError();
            jsonWriter.name("error");
            MonitorErrorDetailsJsonMarshaller.getInstance().marshall(error, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PortalStatusJsonMarshaller instance;

    public static PortalStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PortalStatusJsonMarshaller();
        return instance;
    }
}
