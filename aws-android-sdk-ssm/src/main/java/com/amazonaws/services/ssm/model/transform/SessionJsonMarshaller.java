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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Session
 */
class SessionJsonMarshaller {

    public void marshall(Session session, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (session.getSessionId() != null) {
            String sessionId = session.getSessionId();
            jsonWriter.name("SessionId");
            jsonWriter.value(sessionId);
        }
        if (session.getTarget() != null) {
            String target = session.getTarget();
            jsonWriter.name("Target");
            jsonWriter.value(target);
        }
        if (session.getStatus() != null) {
            String status = session.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (session.getStartDate() != null) {
            java.util.Date startDate = session.getStartDate();
            jsonWriter.name("StartDate");
            jsonWriter.value(startDate);
        }
        if (session.getEndDate() != null) {
            java.util.Date endDate = session.getEndDate();
            jsonWriter.name("EndDate");
            jsonWriter.value(endDate);
        }
        if (session.getDocumentName() != null) {
            String documentName = session.getDocumentName();
            jsonWriter.name("DocumentName");
            jsonWriter.value(documentName);
        }
        if (session.getOwner() != null) {
            String owner = session.getOwner();
            jsonWriter.name("Owner");
            jsonWriter.value(owner);
        }
        if (session.getDetails() != null) {
            String details = session.getDetails();
            jsonWriter.name("Details");
            jsonWriter.value(details);
        }
        if (session.getOutputUrl() != null) {
            SessionManagerOutputUrl outputUrl = session.getOutputUrl();
            jsonWriter.name("OutputUrl");
            SessionManagerOutputUrlJsonMarshaller.getInstance().marshall(outputUrl, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SessionJsonMarshaller instance;

    public static SessionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SessionJsonMarshaller();
        return instance;
    }
}
