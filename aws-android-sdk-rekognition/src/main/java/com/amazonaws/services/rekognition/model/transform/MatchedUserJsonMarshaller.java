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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MatchedUser
 */
class MatchedUserJsonMarshaller {

    public void marshall(MatchedUser matchedUser, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (matchedUser.getUserId() != null) {
            String userId = matchedUser.getUserId();
            jsonWriter.name("UserId");
            jsonWriter.value(userId);
        }
        if (matchedUser.getUserStatus() != null) {
            String userStatus = matchedUser.getUserStatus();
            jsonWriter.name("UserStatus");
            jsonWriter.value(userStatus);
        }
        jsonWriter.endObject();
    }

    private static MatchedUserJsonMarshaller instance;

    public static MatchedUserJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MatchedUserJsonMarshaller();
        return instance;
    }
}
