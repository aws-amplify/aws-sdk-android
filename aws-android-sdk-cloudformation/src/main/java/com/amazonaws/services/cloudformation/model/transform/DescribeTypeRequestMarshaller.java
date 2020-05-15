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
 * StAX request marshaller for DescribeTypeRequest
 */
public class DescribeTypeRequestMarshaller implements
        Marshaller<Request<DescribeTypeRequest>, DescribeTypeRequest> {

    public Request<DescribeTypeRequest> marshall(DescribeTypeRequest describeTypeRequest) {
        if (describeTypeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeTypeRequest)");
        }

        Request<DescribeTypeRequest> request = new DefaultRequest<DescribeTypeRequest>(
                describeTypeRequest, "AWSCloudFormation");
        request.addParameter("Action", "DescribeType");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (describeTypeRequest.getType() != null) {
            prefix = "Type";
            String type = describeTypeRequest.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (describeTypeRequest.getTypeName() != null) {
            prefix = "TypeName";
            String typeName = describeTypeRequest.getTypeName();
            request.addParameter(prefix, StringUtils.fromString(typeName));
        }
        if (describeTypeRequest.getArn() != null) {
            prefix = "Arn";
            String arn = describeTypeRequest.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (describeTypeRequest.getVersionId() != null) {
            prefix = "VersionId";
            String versionId = describeTypeRequest.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }

        return request;
    }
}
