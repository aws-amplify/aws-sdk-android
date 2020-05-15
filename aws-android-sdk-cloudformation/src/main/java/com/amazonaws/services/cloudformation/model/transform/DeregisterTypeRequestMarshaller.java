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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DeregisterTypeRequest
 */
public class DeregisterTypeRequestMarshaller implements
        Marshaller<Request<DeregisterTypeRequest>, DeregisterTypeRequest> {

    public Request<DeregisterTypeRequest> marshall(DeregisterTypeRequest deregisterTypeRequest) {
        if (deregisterTypeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeregisterTypeRequest)");
        }

        Request<DeregisterTypeRequest> request = new DefaultRequest<DeregisterTypeRequest>(
                deregisterTypeRequest, "AWSCloudFormation");
        request.addParameter("Action", "DeregisterType");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (deregisterTypeRequest.getArn() != null) {
            prefix = "Arn";
            String arn = deregisterTypeRequest.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (deregisterTypeRequest.getType() != null) {
            prefix = "Type";
            String type = deregisterTypeRequest.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (deregisterTypeRequest.getTypeName() != null) {
            prefix = "TypeName";
            String typeName = deregisterTypeRequest.getTypeName();
            request.addParameter(prefix, StringUtils.fromString(typeName));
        }
        if (deregisterTypeRequest.getVersionId() != null) {
            prefix = "VersionId";
            String versionId = deregisterTypeRequest.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }

        return request;
    }
}
