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
 * StAX request marshaller for HeadObjectRequest
 */
public class HeadObjectRequestMarshaller implements
        Marshaller<Request<HeadObjectRequest>, HeadObjectRequest> {

    public Request<HeadObjectRequest> marshall(HeadObjectRequest headObjectRequest) {
        if (headObjectRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(HeadObjectRequest)");
        }

        Request<HeadObjectRequest> request = new DefaultRequest<HeadObjectRequest>(
                headObjectRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "HeadObject");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (headObjectRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = headObjectRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (headObjectRequest.getIfMatch() != null) {
            prefix = "If-Match";
            String ifMatch = headObjectRequest.getIfMatch();
            request.addParameter(prefix, StringUtils.fromString(ifMatch));
        }
        if (headObjectRequest.getIfModifiedSince() != null) {
            prefix = "If-Modified-Since";
            java.util.Date ifModifiedSince = headObjectRequest.getIfModifiedSince();
            request.addParameter(prefix, StringUtils.fromDate(ifModifiedSince));
        }
        if (headObjectRequest.getIfNoneMatch() != null) {
            prefix = "If-None-Match";
            String ifNoneMatch = headObjectRequest.getIfNoneMatch();
            request.addParameter(prefix, StringUtils.fromString(ifNoneMatch));
        }
        if (headObjectRequest.getIfUnmodifiedSince() != null) {
            prefix = "If-Unmodified-Since";
            java.util.Date ifUnmodifiedSince = headObjectRequest.getIfUnmodifiedSince();
            request.addParameter(prefix, StringUtils.fromDate(ifUnmodifiedSince));
        }
        if (headObjectRequest.getKey() != null) {
            prefix = "Key";
            String key = headObjectRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (headObjectRequest.getRange() != null) {
            prefix = "Range";
            String range = headObjectRequest.getRange();
            request.addParameter(prefix, StringUtils.fromString(range));
        }
        if (headObjectRequest.getVersionId() != null) {
            prefix = "versionId";
            String versionId = headObjectRequest.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (headObjectRequest.getSSECustomerAlgorithm() != null) {
            prefix = "x-amz-server-side-encryption-customer-algorithm";
            String sSECustomerAlgorithm = headObjectRequest.getSSECustomerAlgorithm();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerAlgorithm));
        }
        if (headObjectRequest.getSSECustomerKey() != null) {
            prefix = "x-amz-server-side-encryption-customer-key";
            String sSECustomerKey = headObjectRequest.getSSECustomerKey();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKey));
        }
        if (headObjectRequest.getSSECustomerKeyMD5() != null) {
            prefix = "x-amz-server-side-encryption-customer-key-MD5";
            String sSECustomerKeyMD5 = headObjectRequest.getSSECustomerKeyMD5();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKeyMD5));
        }
        if (headObjectRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = headObjectRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }
        if (headObjectRequest.getPartNumber() != null) {
            prefix = "partNumber";
            Integer partNumber = headObjectRequest.getPartNumber();
            request.addParameter(prefix, StringUtils.fromInteger(partNumber));
        }

        return request;
    }
}
