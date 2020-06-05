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
 * StAX marshaller for POJO CustomAmi
 */
class CustomAmiStaxMarshaller {

    public void marshall(CustomAmi _customAmi, Request<?> request, String _prefix) {
        String prefix;
        if (_customAmi.getVirtualizationType() != null) {
            prefix = _prefix + "VirtualizationType";
            String virtualizationType = _customAmi.getVirtualizationType();
            request.addParameter(prefix, StringUtils.fromString(virtualizationType));
        }
        if (_customAmi.getImageId() != null) {
            prefix = _prefix + "ImageId";
            String imageId = _customAmi.getImageId();
            request.addParameter(prefix, StringUtils.fromString(imageId));
        }
    }

    private static CustomAmiStaxMarshaller instance;

    public static CustomAmiStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CustomAmiStaxMarshaller();
        return instance;
    }
}
