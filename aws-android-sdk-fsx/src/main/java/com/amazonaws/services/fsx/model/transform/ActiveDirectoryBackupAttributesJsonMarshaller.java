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

package com.amazonaws.services.fsx.model.transform;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ActiveDirectoryBackupAttributes
 */
class ActiveDirectoryBackupAttributesJsonMarshaller {

    public void marshall(ActiveDirectoryBackupAttributes activeDirectoryBackupAttributes,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (activeDirectoryBackupAttributes.getDomainName() != null) {
            String domainName = activeDirectoryBackupAttributes.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (activeDirectoryBackupAttributes.getActiveDirectoryId() != null) {
            String activeDirectoryId = activeDirectoryBackupAttributes.getActiveDirectoryId();
            jsonWriter.name("ActiveDirectoryId");
            jsonWriter.value(activeDirectoryId);
        }
        jsonWriter.endObject();
    }

    private static ActiveDirectoryBackupAttributesJsonMarshaller instance;

    public static ActiveDirectoryBackupAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActiveDirectoryBackupAttributesJsonMarshaller();
        return instance;
    }
}
