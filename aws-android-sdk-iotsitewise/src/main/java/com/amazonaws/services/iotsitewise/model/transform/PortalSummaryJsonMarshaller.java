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
 * JSON marshaller for POJO PortalSummary
 */
class PortalSummaryJsonMarshaller {

    public void marshall(PortalSummary portalSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (portalSummary.getId() != null) {
            String id = portalSummary.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (portalSummary.getName() != null) {
            String name = portalSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (portalSummary.getDescription() != null) {
            String description = portalSummary.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (portalSummary.getStartUrl() != null) {
            String startUrl = portalSummary.getStartUrl();
            jsonWriter.name("startUrl");
            jsonWriter.value(startUrl);
        }
        if (portalSummary.getCreationDate() != null) {
            java.util.Date creationDate = portalSummary.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (portalSummary.getLastUpdateDate() != null) {
            java.util.Date lastUpdateDate = portalSummary.getLastUpdateDate();
            jsonWriter.name("lastUpdateDate");
            jsonWriter.value(lastUpdateDate);
        }
        if (portalSummary.getRoleArn() != null) {
            String roleArn = portalSummary.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        jsonWriter.endObject();
    }

    private static PortalSummaryJsonMarshaller instance;

    public static PortalSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PortalSummaryJsonMarshaller();
        return instance;
    }
}
