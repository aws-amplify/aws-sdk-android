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
 * StAX request marshaller for ResyncMFADeviceRequest
 */
public class ResyncMFADeviceRequestMarshaller implements
        Marshaller<Request<ResyncMFADeviceRequest>, ResyncMFADeviceRequest> {

    public Request<ResyncMFADeviceRequest> marshall(ResyncMFADeviceRequest resyncMFADeviceRequest) {
        if (resyncMFADeviceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ResyncMFADeviceRequest)");
        }

        Request<ResyncMFADeviceRequest> request = new DefaultRequest<ResyncMFADeviceRequest>(
                resyncMFADeviceRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "ResyncMFADevice");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (resyncMFADeviceRequest.getUserName() != null) {
            prefix = "UserName";
            String userName = resyncMFADeviceRequest.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (resyncMFADeviceRequest.getSerialNumber() != null) {
            prefix = "SerialNumber";
            String serialNumber = resyncMFADeviceRequest.getSerialNumber();
            request.addParameter(prefix, StringUtils.fromString(serialNumber));
        }
        if (resyncMFADeviceRequest.getAuthenticationCode1() != null) {
            prefix = "AuthenticationCode1";
            String authenticationCode1 = resyncMFADeviceRequest.getAuthenticationCode1();
            request.addParameter(prefix, StringUtils.fromString(authenticationCode1));
        }
        if (resyncMFADeviceRequest.getAuthenticationCode2() != null) {
            prefix = "AuthenticationCode2";
            String authenticationCode2 = resyncMFADeviceRequest.getAuthenticationCode2();
            request.addParameter(prefix, StringUtils.fromString(authenticationCode2));
        }

        return request;
    }
}
