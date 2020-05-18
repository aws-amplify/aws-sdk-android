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

package com.amazonaws.services.dynamodb.model.transform;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DeleteReplicationGroupMemberAction
 */
class DeleteReplicationGroupMemberActionJsonMarshaller {

    public void marshall(DeleteReplicationGroupMemberAction deleteReplicationGroupMemberAction,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deleteReplicationGroupMemberAction.getRegionName() != null) {
            String regionName = deleteReplicationGroupMemberAction.getRegionName();
            jsonWriter.name("RegionName");
            jsonWriter.value(regionName);
        }
        jsonWriter.endObject();
    }

    private static DeleteReplicationGroupMemberActionJsonMarshaller instance;

    public static DeleteReplicationGroupMemberActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeleteReplicationGroupMemberActionJsonMarshaller();
        return instance;
    }
}
