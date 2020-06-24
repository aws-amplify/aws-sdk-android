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

package com.amazonaws.services.organizations.model.transform;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HandshakeFilter
 */
class HandshakeFilterJsonMarshaller {

    public void marshall(HandshakeFilter handshakeFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (handshakeFilter.getActionType() != null) {
            String actionType = handshakeFilter.getActionType();
            jsonWriter.name("ActionType");
            jsonWriter.value(actionType);
        }
        if (handshakeFilter.getParentHandshakeId() != null) {
            String parentHandshakeId = handshakeFilter.getParentHandshakeId();
            jsonWriter.name("ParentHandshakeId");
            jsonWriter.value(parentHandshakeId);
        }
        jsonWriter.endObject();
    }

    private static HandshakeFilterJsonMarshaller instance;

    public static HandshakeFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HandshakeFilterJsonMarshaller();
        return instance;
    }
}
