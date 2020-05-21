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
 * StAX request marshaller for PutObjectRetentionRequest
 */
public class PutObjectRetentionRequestMarshaller implements
        Marshaller<Request<PutObjectRetentionRequest>, PutObjectRetentionRequest> {

    public Request<PutObjectRetentionRequest> marshall(
            PutObjectRetentionRequest putObjectRetentionRequest) {
        if (putObjectRetentionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutObjectRetentionRequest)");
        }

        Request<PutObjectRetentionRequest> request = new DefaultRequest<PutObjectRetentionRequest>(
                putObjectRetentionRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "PutObjectRetention");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (putObjectRetentionRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = putObjectRetentionRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (putObjectRetentionRequest.getKey() != null) {
            prefix = "Key";
            String key = putObjectRetentionRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (putObjectRetentionRequest.getRetention() != null) {
            prefix = "Retention";
            ObjectLockRetention retention = putObjectRetentionRequest.getRetention();
            ObjectLockRetentionStaxMarshaller.getInstance().marshall(retention, request,
                    prefix + ".");
        }
        if (putObjectRetentionRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = putObjectRetentionRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }
        if (putObjectRetentionRequest.getVersionId() != null) {
            prefix = "versionId";
            String versionId = putObjectRetentionRequest.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (putObjectRetentionRequest.getBypassGovernanceRetention() != null) {
            prefix = "x-amz-bypass-governance-retention";
            Boolean bypassGovernanceRetention = putObjectRetentionRequest
                    .getBypassGovernanceRetention();
            request.addParameter(prefix, StringUtils.fromBoolean(bypassGovernanceRetention));
        }
        if (putObjectRetentionRequest.getContentMD5() != null) {
            prefix = "Content-MD5";
            String contentMD5 = putObjectRetentionRequest.getContentMD5();
            request.addParameter(prefix, StringUtils.fromString(contentMD5));
        }

        return request;
    }
}
