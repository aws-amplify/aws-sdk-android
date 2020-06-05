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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO EnvironmentInfoDescription
 */
class EnvironmentInfoDescriptionStaxMarshaller {

    public void marshall(EnvironmentInfoDescription _environmentInfoDescription,
            Request<?> request, String _prefix) {
        String prefix;
        if (_environmentInfoDescription.getInfoType() != null) {
            prefix = _prefix + "InfoType";
            String infoType = _environmentInfoDescription.getInfoType();
            request.addParameter(prefix, StringUtils.fromString(infoType));
        }
        if (_environmentInfoDescription.getEc2InstanceId() != null) {
            prefix = _prefix + "Ec2InstanceId";
            String ec2InstanceId = _environmentInfoDescription.getEc2InstanceId();
            request.addParameter(prefix, StringUtils.fromString(ec2InstanceId));
        }
        if (_environmentInfoDescription.getSampleTimestamp() != null) {
            prefix = _prefix + "SampleTimestamp";
            java.util.Date sampleTimestamp = _environmentInfoDescription.getSampleTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(sampleTimestamp));
        }
        if (_environmentInfoDescription.getMessage() != null) {
            prefix = _prefix + "Message";
            String message = _environmentInfoDescription.getMessage();
            request.addParameter(prefix, StringUtils.fromString(message));
        }
    }

    private static EnvironmentInfoDescriptionStaxMarshaller instance;

    public static EnvironmentInfoDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentInfoDescriptionStaxMarshaller();
        return instance;
    }
}
