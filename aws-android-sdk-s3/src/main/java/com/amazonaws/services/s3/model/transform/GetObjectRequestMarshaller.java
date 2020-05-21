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
 * StAX request marshaller for GetObjectRequest
 */
public class GetObjectRequestMarshaller implements
        Marshaller<Request<GetObjectRequest>, GetObjectRequest> {

    public Request<GetObjectRequest> marshall(GetObjectRequest getObjectRequest) {
        if (getObjectRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(GetObjectRequest)");
        }

        Request<GetObjectRequest> request = new DefaultRequest<GetObjectRequest>(getObjectRequest,
                "AmazonSimpleStorageService");
        request.addParameter("Action", "GetObject");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (getObjectRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = getObjectRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (getObjectRequest.getIfMatch() != null) {
            prefix = "If-Match";
            String ifMatch = getObjectRequest.getIfMatch();
            request.addParameter(prefix, StringUtils.fromString(ifMatch));
        }
        if (getObjectRequest.getIfModifiedSince() != null) {
            prefix = "If-Modified-Since";
            java.util.Date ifModifiedSince = getObjectRequest.getIfModifiedSince();
            request.addParameter(prefix, StringUtils.fromDate(ifModifiedSince));
        }
        if (getObjectRequest.getIfNoneMatch() != null) {
            prefix = "If-None-Match";
            String ifNoneMatch = getObjectRequest.getIfNoneMatch();
            request.addParameter(prefix, StringUtils.fromString(ifNoneMatch));
        }
        if (getObjectRequest.getIfUnmodifiedSince() != null) {
            prefix = "If-Unmodified-Since";
            java.util.Date ifUnmodifiedSince = getObjectRequest.getIfUnmodifiedSince();
            request.addParameter(prefix, StringUtils.fromDate(ifUnmodifiedSince));
        }
        if (getObjectRequest.getKey() != null) {
            prefix = "Key";
            String key = getObjectRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (getObjectRequest.getRange() != null) {
            prefix = "Range";
            String range = getObjectRequest.getRange();
            request.addParameter(prefix, StringUtils.fromString(range));
        }
        if (getObjectRequest.getResponseCacheControl() != null) {
            prefix = "response-cache-control";
            String responseCacheControl = getObjectRequest.getResponseCacheControl();
            request.addParameter(prefix, StringUtils.fromString(responseCacheControl));
        }
        if (getObjectRequest.getResponseContentDisposition() != null) {
            prefix = "response-content-disposition";
            String responseContentDisposition = getObjectRequest.getResponseContentDisposition();
            request.addParameter(prefix, StringUtils.fromString(responseContentDisposition));
        }
        if (getObjectRequest.getResponseContentEncoding() != null) {
            prefix = "response-content-encoding";
            String responseContentEncoding = getObjectRequest.getResponseContentEncoding();
            request.addParameter(prefix, StringUtils.fromString(responseContentEncoding));
        }
        if (getObjectRequest.getResponseContentLanguage() != null) {
            prefix = "response-content-language";
            String responseContentLanguage = getObjectRequest.getResponseContentLanguage();
            request.addParameter(prefix, StringUtils.fromString(responseContentLanguage));
        }
        if (getObjectRequest.getResponseContentType() != null) {
            prefix = "response-content-type";
            String responseContentType = getObjectRequest.getResponseContentType();
            request.addParameter(prefix, StringUtils.fromString(responseContentType));
        }
        if (getObjectRequest.getResponseExpires() != null) {
            prefix = "response-expires";
            java.util.Date responseExpires = getObjectRequest.getResponseExpires();
            request.addParameter(prefix, StringUtils.fromDate(responseExpires));
        }
        if (getObjectRequest.getVersionId() != null) {
            prefix = "versionId";
            String versionId = getObjectRequest.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (getObjectRequest.getSSECustomerAlgorithm() != null) {
            prefix = "x-amz-server-side-encryption-customer-algorithm";
            String sSECustomerAlgorithm = getObjectRequest.getSSECustomerAlgorithm();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerAlgorithm));
        }
        if (getObjectRequest.getSSECustomerKey() != null) {
            prefix = "x-amz-server-side-encryption-customer-key";
            String sSECustomerKey = getObjectRequest.getSSECustomerKey();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKey));
        }
        if (getObjectRequest.getSSECustomerKeyMD5() != null) {
            prefix = "x-amz-server-side-encryption-customer-key-MD5";
            String sSECustomerKeyMD5 = getObjectRequest.getSSECustomerKeyMD5();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKeyMD5));
        }
        if (getObjectRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = getObjectRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }
        if (getObjectRequest.getPartNumber() != null) {
            prefix = "partNumber";
            Integer partNumber = getObjectRequest.getPartNumber();
            request.addParameter(prefix, StringUtils.fromInteger(partNumber));
        }

        return request;
    }
}
