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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Service
 */
class ServiceJsonMarshaller {

    public void marshall(Service service, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (service.getAction() != null) {
            Action action = service.getAction();
            jsonWriter.name("Action");
            ActionJsonMarshaller.getInstance().marshall(action, jsonWriter);
        }
        if (service.getEvidence() != null) {
            Evidence evidence = service.getEvidence();
            jsonWriter.name("Evidence");
            EvidenceJsonMarshaller.getInstance().marshall(evidence, jsonWriter);
        }
        if (service.getArchived() != null) {
            Boolean archived = service.getArchived();
            jsonWriter.name("Archived");
            jsonWriter.value(archived);
        }
        if (service.getCount() != null) {
            Integer count = service.getCount();
            jsonWriter.name("Count");
            jsonWriter.value(count);
        }
        if (service.getDetectorId() != null) {
            String detectorId = service.getDetectorId();
            jsonWriter.name("DetectorId");
            jsonWriter.value(detectorId);
        }
        if (service.getEventFirstSeen() != null) {
            String eventFirstSeen = service.getEventFirstSeen();
            jsonWriter.name("EventFirstSeen");
            jsonWriter.value(eventFirstSeen);
        }
        if (service.getEventLastSeen() != null) {
            String eventLastSeen = service.getEventLastSeen();
            jsonWriter.name("EventLastSeen");
            jsonWriter.value(eventLastSeen);
        }
        if (service.getResourceRole() != null) {
            String resourceRole = service.getResourceRole();
            jsonWriter.name("ResourceRole");
            jsonWriter.value(resourceRole);
        }
        if (service.getServiceName() != null) {
            String serviceName = service.getServiceName();
            jsonWriter.name("ServiceName");
            jsonWriter.value(serviceName);
        }
        if (service.getUserFeedback() != null) {
            String userFeedback = service.getUserFeedback();
            jsonWriter.name("UserFeedback");
            jsonWriter.value(userFeedback);
        }
        jsonWriter.endObject();
    }

    private static ServiceJsonMarshaller instance;

    public static ServiceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceJsonMarshaller();
        return instance;
    }
}
