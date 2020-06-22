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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ShrinkPolicy
 */
class ShrinkPolicyJsonMarshaller {

    public void marshall(ShrinkPolicy shrinkPolicy, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (shrinkPolicy.getDecommissionTimeout() != null) {
            Integer decommissionTimeout = shrinkPolicy.getDecommissionTimeout();
            jsonWriter.name("DecommissionTimeout");
            jsonWriter.value(decommissionTimeout);
        }
        if (shrinkPolicy.getInstanceResizePolicy() != null) {
            InstanceResizePolicy instanceResizePolicy = shrinkPolicy.getInstanceResizePolicy();
            jsonWriter.name("InstanceResizePolicy");
            InstanceResizePolicyJsonMarshaller.getInstance().marshall(instanceResizePolicy,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ShrinkPolicyJsonMarshaller instance;

    public static ShrinkPolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ShrinkPolicyJsonMarshaller();
        return instance;
    }
}
