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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for GetCredentialReportRequest
 */
public class GetCredentialReportRequestMarshaller implements
        Marshaller<Request<GetCredentialReportRequest>, GetCredentialReportRequest> {

    public Request<GetCredentialReportRequest> marshall(
            GetCredentialReportRequest getCredentialReportRequest) {
        if (getCredentialReportRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetCredentialReportRequest)");
        }

        Request<GetCredentialReportRequest> request = new DefaultRequest<GetCredentialReportRequest>(
                getCredentialReportRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "GetCredentialReport");
        request.addParameter("Version", "2010-05-08");

        String prefix;

        return request;
    }
}
