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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for PutObjectLockConfigurationRequest
 */
public class PutObjectLockConfigurationRequestMarshaller implements
        Marshaller<Request<PutObjectLockConfigurationRequest>, PutObjectLockConfigurationRequest> {

    public Request<PutObjectLockConfigurationRequest> marshall(
            PutObjectLockConfigurationRequest putObjectLockConfigurationRequest) {
        if (putObjectLockConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutObjectLockConfigurationRequest)");
        }

        Request<PutObjectLockConfigurationRequest> request = new DefaultRequest<PutObjectLockConfigurationRequest>(
                putObjectLockConfigurationRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "PutObjectLockConfiguration");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (putObjectLockConfigurationRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = putObjectLockConfigurationRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (putObjectLockConfigurationRequest.getObjectLockConfiguration() != null) {
            prefix = "ObjectLockConfiguration";
            ObjectLockConfiguration objectLockConfiguration = putObjectLockConfigurationRequest
                    .getObjectLockConfiguration();
            ObjectLockConfigurationStaxMarshaller.getInstance().marshall(objectLockConfiguration,
                    request, prefix + ".");
        }
        if (putObjectLockConfigurationRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = putObjectLockConfigurationRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }
        if (putObjectLockConfigurationRequest.getToken() != null) {
            prefix = "x-amz-bucket-object-lock-token";
            String token = putObjectLockConfigurationRequest.getToken();
            request.addParameter(prefix, StringUtils.fromString(token));
        }
        if (putObjectLockConfigurationRequest.getContentMD5() != null) {
            prefix = "Content-MD5";
            String contentMD5 = putObjectLockConfigurationRequest.getContentMD5();
            request.addParameter(prefix, StringUtils.fromString(contentMD5));
        }

        return request;
    }
}
