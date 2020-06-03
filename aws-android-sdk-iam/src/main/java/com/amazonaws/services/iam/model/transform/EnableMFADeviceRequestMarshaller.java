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
 * StAX request marshaller for EnableMFADeviceRequest
 */
public class EnableMFADeviceRequestMarshaller implements
        Marshaller<Request<EnableMFADeviceRequest>, EnableMFADeviceRequest> {

    public Request<EnableMFADeviceRequest> marshall(EnableMFADeviceRequest enableMFADeviceRequest) {
        if (enableMFADeviceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(EnableMFADeviceRequest)");
        }

        Request<EnableMFADeviceRequest> request = new DefaultRequest<EnableMFADeviceRequest>(
                enableMFADeviceRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "EnableMFADevice");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (enableMFADeviceRequest.getUserName() != null) {
            prefix = "UserName";
            String userName = enableMFADeviceRequest.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (enableMFADeviceRequest.getSerialNumber() != null) {
            prefix = "SerialNumber";
            String serialNumber = enableMFADeviceRequest.getSerialNumber();
            request.addParameter(prefix, StringUtils.fromString(serialNumber));
        }
        if (enableMFADeviceRequest.getAuthenticationCode1() != null) {
            prefix = "AuthenticationCode1";
            String authenticationCode1 = enableMFADeviceRequest.getAuthenticationCode1();
            request.addParameter(prefix, StringUtils.fromString(authenticationCode1));
        }
        if (enableMFADeviceRequest.getAuthenticationCode2() != null) {
            prefix = "AuthenticationCode2";
            String authenticationCode2 = enableMFADeviceRequest.getAuthenticationCode2();
            request.addParameter(prefix, StringUtils.fromString(authenticationCode2));
        }

        return request;
    }
}
