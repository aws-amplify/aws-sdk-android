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
 * JSON marshaller for POJO IamInstanceProfileAssociation
 */
class IamInstanceProfileAssociationJsonMarshaller {

    public void marshall(IamInstanceProfileAssociation iamInstanceProfileAssociation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (iamInstanceProfileAssociation.getAssociationId() != null) {
            String associationId = iamInstanceProfileAssociation.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (iamInstanceProfileAssociation.getInstanceId() != null) {
            String instanceId = iamInstanceProfileAssociation.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (iamInstanceProfileAssociation.getIamInstanceProfile() != null) {
            IamInstanceProfile iamInstanceProfile = iamInstanceProfileAssociation
                    .getIamInstanceProfile();
            jsonWriter.name("IamInstanceProfile");
            IamInstanceProfileJsonMarshaller.getInstance().marshall(iamInstanceProfile, jsonWriter);
        }
        if (iamInstanceProfileAssociation.getState() != null) {
            String state = iamInstanceProfileAssociation.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (iamInstanceProfileAssociation.getTimestamp() != null) {
            java.util.Date timestamp = iamInstanceProfileAssociation.getTimestamp();
            jsonWriter.name("Timestamp");
            jsonWriter.value(timestamp);
        }
        jsonWriter.endObject();
    }

    private static IamInstanceProfileAssociationJsonMarshaller instance;

    public static IamInstanceProfileAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IamInstanceProfileAssociationJsonMarshaller();
        return instance;
    }
}
