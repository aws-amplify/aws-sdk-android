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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SessionContextAttributes
 */
class SessionContextAttributesJsonMarshaller {

    public void marshall(SessionContextAttributes sessionContextAttributes, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sessionContextAttributes.getCreationDate() != null) {
            java.util.Date creationDate = sessionContextAttributes.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (sessionContextAttributes.getMfaAuthenticated() != null) {
            Boolean mfaAuthenticated = sessionContextAttributes.getMfaAuthenticated();
            jsonWriter.name("mfaAuthenticated");
            jsonWriter.value(mfaAuthenticated);
        }
        jsonWriter.endObject();
    }

    private static SessionContextAttributesJsonMarshaller instance;

    public static SessionContextAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SessionContextAttributesJsonMarshaller();
        return instance;
    }
}
