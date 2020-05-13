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
 * JSON marshaller for POJO PolicyDetails
 */
class PolicyDetailsJsonMarshaller {

    public void marshall(PolicyDetails policyDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (policyDetails.getAction() != null) {
            FindingAction action = policyDetails.getAction();
            jsonWriter.name("action");
            FindingActionJsonMarshaller.getInstance().marshall(action, jsonWriter);
        }
        if (policyDetails.getActor() != null) {
            FindingActor actor = policyDetails.getActor();
            jsonWriter.name("actor");
            FindingActorJsonMarshaller.getInstance().marshall(actor, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PolicyDetailsJsonMarshaller instance;

    public static PolicyDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyDetailsJsonMarshaller();
        return instance;
    }
}
