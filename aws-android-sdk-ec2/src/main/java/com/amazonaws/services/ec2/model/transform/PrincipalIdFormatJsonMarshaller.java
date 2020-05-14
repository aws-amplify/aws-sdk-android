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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PrincipalIdFormat
 */
class PrincipalIdFormatJsonMarshaller {

    public void marshall(PrincipalIdFormat principalIdFormat, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (principalIdFormat.getArn() != null) {
            String arn = principalIdFormat.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (principalIdFormat.getStatuses() != null) {
            java.util.List<IdFormat> statuses = principalIdFormat.getStatuses();
            jsonWriter.name("Statuses");
            jsonWriter.beginArray();
            for (IdFormat statusesItem : statuses) {
                if (statusesItem != null) {
                    IdFormatJsonMarshaller.getInstance().marshall(statusesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static PrincipalIdFormatJsonMarshaller instance;

    public static PrincipalIdFormatJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PrincipalIdFormatJsonMarshaller();
        return instance;
    }
}
