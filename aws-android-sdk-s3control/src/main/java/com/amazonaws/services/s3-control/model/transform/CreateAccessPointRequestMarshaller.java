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
package com.amazonaws.services.s3-control.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;


/**
 * StAX request marshaller for CreateAccessPointRequest
 */
public class CreateAccessPointRequestMarshaller implements Marshaller<Request<CreateAccessPointRequest>, CreateAccessPointRequest> {

    public Request<CreateAccessPointRequest> marshall(CreateAccessPointRequest createAccessPointRequest) {
        if (createAccessPointRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateAccessPointRequest)");
        }

        Request<CreateAccessPointRequest> request = new DefaultRequest<CreateAccessPointRequest>(createAccessPointRequest, "AWSS3Control");
        request.addParameter("Action", "CreateAccessPoint");
        request.addParameter("Version", "2018-08-20");

        String prefix;
        if (createAccessPointRequest.getAccountId() != null) {
            prefix = "x-amz-account-id";
            String accountId = createAccessPointRequest.getAccountId();
            request.addParameter(prefix, StringUtils.fromString(accountId));
        }
        if (createAccessPointRequest.getName() != null) {
            prefix = "name";
            String name = createAccessPointRequest.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (createAccessPointRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = createAccessPointRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (createAccessPointRequest.getVpcConfiguration() != null) {
            prefix = "VpcConfiguration";
            VpcConfiguration vpcConfiguration = createAccessPointRequest.getVpcConfiguration();
            VpcConfigurationStaxMarshaller.getInstance().marshall(vpcConfiguration, request, prefix + ".");
        }
        if (createAccessPointRequest.getPublicAccessBlockConfiguration() != null) {
            prefix = "PublicAccessBlockConfiguration";
            PublicAccessBlockConfiguration publicAccessBlockConfiguration = createAccessPointRequest.getPublicAccessBlockConfiguration();
            PublicAccessBlockConfigurationStaxMarshaller.getInstance().marshall(publicAccessBlockConfiguration, request, prefix + ".");
        }

        return request;
    }
}
