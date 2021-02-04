/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MitigationAction
 */
class MitigationActionJsonMarshaller {

    public void marshall(MitigationAction mitigationAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (mitigationAction.getName() != null) {
            String name = mitigationAction.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (mitigationAction.getId() != null) {
            String id = mitigationAction.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (mitigationAction.getRoleArn() != null) {
            String roleArn = mitigationAction.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (mitigationAction.getActionParams() != null) {
            MitigationActionParams actionParams = mitigationAction.getActionParams();
            jsonWriter.name("actionParams");
            MitigationActionParamsJsonMarshaller.getInstance().marshall(actionParams, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MitigationActionJsonMarshaller instance;

    public static MitigationActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MitigationActionJsonMarshaller();
        return instance;
    }
}
