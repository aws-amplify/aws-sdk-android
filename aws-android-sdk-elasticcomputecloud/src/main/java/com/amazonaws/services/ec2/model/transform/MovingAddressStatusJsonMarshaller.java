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
 * JSON marshaller for POJO MovingAddressStatus
 */
class MovingAddressStatusJsonMarshaller {

    public void marshall(MovingAddressStatus movingAddressStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (movingAddressStatus.getMoveStatus() != null) {
            String moveStatus = movingAddressStatus.getMoveStatus();
            jsonWriter.name("MoveStatus");
            jsonWriter.value(moveStatus);
        }
        if (movingAddressStatus.getPublicIp() != null) {
            String publicIp = movingAddressStatus.getPublicIp();
            jsonWriter.name("PublicIp");
            jsonWriter.value(publicIp);
        }
        jsonWriter.endObject();
    }

    private static MovingAddressStatusJsonMarshaller instance;

    public static MovingAddressStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MovingAddressStatusJsonMarshaller();
        return instance;
    }
}
