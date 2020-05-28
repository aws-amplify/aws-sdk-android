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

package com.amazonaws.services.session.qldb.model.transform;

import com.amazonaws.services.session.qldb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StartSessionResult
 */
class StartSessionResultJsonMarshaller {

    public void marshall(StartSessionResult startSessionResult, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (startSessionResult.getSessionToken() != null) {
            String sessionToken = startSessionResult.getSessionToken();
            jsonWriter.name("SessionToken");
            jsonWriter.value(sessionToken);
        }
        jsonWriter.endObject();
    }

    private static StartSessionResultJsonMarshaller instance;

    public static StartSessionResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StartSessionResultJsonMarshaller();
        return instance;
    }
}
