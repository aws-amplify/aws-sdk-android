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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceInfo
 */
class InstanceInfoJsonMarshaller {

    public void marshall(InstanceInfo instanceInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceInfo.getInstanceName() != null) {
            String instanceName = instanceInfo.getInstanceName();
            jsonWriter.name("instanceName");
            jsonWriter.value(instanceName);
        }
        if (instanceInfo.getIamSessionArn() != null) {
            String iamSessionArn = instanceInfo.getIamSessionArn();
            jsonWriter.name("iamSessionArn");
            jsonWriter.value(iamSessionArn);
        }
        if (instanceInfo.getIamUserArn() != null) {
            String iamUserArn = instanceInfo.getIamUserArn();
            jsonWriter.name("iamUserArn");
            jsonWriter.value(iamUserArn);
        }
        if (instanceInfo.getInstanceArn() != null) {
            String instanceArn = instanceInfo.getInstanceArn();
            jsonWriter.name("instanceArn");
            jsonWriter.value(instanceArn);
        }
        if (instanceInfo.getRegisterTime() != null) {
            java.util.Date registerTime = instanceInfo.getRegisterTime();
            jsonWriter.name("registerTime");
            jsonWriter.value(registerTime);
        }
        if (instanceInfo.getDeregisterTime() != null) {
            java.util.Date deregisterTime = instanceInfo.getDeregisterTime();
            jsonWriter.name("deregisterTime");
            jsonWriter.value(deregisterTime);
        }
        if (instanceInfo.getTags() != null) {
            java.util.List<Tag> tags = instanceInfo.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static InstanceInfoJsonMarshaller instance;

    public static InstanceInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceInfoJsonMarshaller();
        return instance;
    }
}
