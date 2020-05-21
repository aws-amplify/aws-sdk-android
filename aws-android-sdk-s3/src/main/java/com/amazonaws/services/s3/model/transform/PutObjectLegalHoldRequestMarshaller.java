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
 * StAX request marshaller for PutObjectLegalHoldRequest
 */
public class PutObjectLegalHoldRequestMarshaller implements
        Marshaller<Request<PutObjectLegalHoldRequest>, PutObjectLegalHoldRequest> {

    public Request<PutObjectLegalHoldRequest> marshall(
            PutObjectLegalHoldRequest putObjectLegalHoldRequest) {
        if (putObjectLegalHoldRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutObjectLegalHoldRequest)");
        }

        Request<PutObjectLegalHoldRequest> request = new DefaultRequest<PutObjectLegalHoldRequest>(
                putObjectLegalHoldRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "PutObjectLegalHold");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (putObjectLegalHoldRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = putObjectLegalHoldRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (putObjectLegalHoldRequest.getKey() != null) {
            prefix = "Key";
            String key = putObjectLegalHoldRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (putObjectLegalHoldRequest.getLegalHold() != null) {
            prefix = "LegalHold";
            ObjectLockLegalHold legalHold = putObjectLegalHoldRequest.getLegalHold();
            ObjectLockLegalHoldStaxMarshaller.getInstance().marshall(legalHold, request,
                    prefix + ".");
        }
        if (putObjectLegalHoldRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = putObjectLegalHoldRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }
        if (putObjectLegalHoldRequest.getVersionId() != null) {
            prefix = "versionId";
            String versionId = putObjectLegalHoldRequest.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (putObjectLegalHoldRequest.getContentMD5() != null) {
            prefix = "Content-MD5";
            String contentMD5 = putObjectLegalHoldRequest.getContentMD5();
            request.addParameter(prefix, StringUtils.fromString(contentMD5));
        }

        return request;
    }
}
