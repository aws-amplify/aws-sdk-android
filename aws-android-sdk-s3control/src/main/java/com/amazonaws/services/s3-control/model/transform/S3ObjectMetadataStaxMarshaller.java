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

import com.amazonaws.Request;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO S3ObjectMetadata
 */
class S3ObjectMetadataStaxMarshaller {

    public void marshall(S3ObjectMetadata _s3ObjectMetadata, Request<?> request, String _prefix) {
        String prefix;
        if (_s3ObjectMetadata.getCacheControl() != null) {
            prefix = _prefix + "CacheControl";
            String cacheControl = _s3ObjectMetadata.getCacheControl();
            request.addParameter(prefix, StringUtils.fromString(cacheControl));
        }
        if (_s3ObjectMetadata.getContentDisposition() != null) {
            prefix = _prefix + "ContentDisposition";
            String contentDisposition = _s3ObjectMetadata.getContentDisposition();
            request.addParameter(prefix, StringUtils.fromString(contentDisposition));
        }
        if (_s3ObjectMetadata.getContentEncoding() != null) {
            prefix = _prefix + "ContentEncoding";
            String contentEncoding = _s3ObjectMetadata.getContentEncoding();
            request.addParameter(prefix, StringUtils.fromString(contentEncoding));
        }
        if (_s3ObjectMetadata.getContentLanguage() != null) {
            prefix = _prefix + "ContentLanguage";
            String contentLanguage = _s3ObjectMetadata.getContentLanguage();
            request.addParameter(prefix, StringUtils.fromString(contentLanguage));
        }
        if (_s3ObjectMetadata.getUserMetadata() != null) {
            prefix = _prefix + "UserMetadata";
            java.util.Map<String, String> userMetadata = _s3ObjectMetadata.getUserMetadata();
            int userMetadataIndex = 1;
            String userMetadataPrefix = prefix + ".entry.";
            for (java.util.Map.Entry<String, String> userMetadataEntry : userMetadata.entrySet()) {
                prefix = userMetadataPrefix  + userMetadataIndex;
                if (userMetadataEntry.getKey() != null) {
                    request.addParameter(prefix + ".key", StringUtils.fromString(userMetadataEntry.getKey()));
                }
                prefix += ".value";
                if (userMetadataEntry.getValue() != null) {
                    String userMetadataValue = userMetadataEntry.getValue();
            request.addParameter(prefix, StringUtils.fromString(userMetadataValue));
                }
                userMetadataIndex ++;
            }
            prefix = userMetadataPrefix;
        }
        if (_s3ObjectMetadata.getContentLength() != null) {
            prefix = _prefix + "ContentLength";
            Long contentLength = _s3ObjectMetadata.getContentLength();
            request.addParameter(prefix, StringUtils.fromLong(contentLength));
        }
        if (_s3ObjectMetadata.getContentMD5() != null) {
            prefix = _prefix + "ContentMD5";
            String contentMD5 = _s3ObjectMetadata.getContentMD5();
            request.addParameter(prefix, StringUtils.fromString(contentMD5));
        }
        if (_s3ObjectMetadata.getContentType() != null) {
            prefix = _prefix + "ContentType";
            String contentType = _s3ObjectMetadata.getContentType();
            request.addParameter(prefix, StringUtils.fromString(contentType));
        }
        if (_s3ObjectMetadata.getHttpExpiresDate() != null) {
            prefix = _prefix + "HttpExpiresDate";
            java.util.Date httpExpiresDate = _s3ObjectMetadata.getHttpExpiresDate();
            request.addParameter(prefix, StringUtils.fromDate(httpExpiresDate));
        }
        if (_s3ObjectMetadata.getRequesterCharged() != null) {
            prefix = _prefix + "RequesterCharged";
            Boolean requesterCharged = _s3ObjectMetadata.getRequesterCharged();
            request.addParameter(prefix, StringUtils.fromBoolean(requesterCharged));
        }
        if (_s3ObjectMetadata.getSSEAlgorithm() != null) {
            prefix = _prefix + "SSEAlgorithm";
            String sSEAlgorithm = _s3ObjectMetadata.getSSEAlgorithm();
            request.addParameter(prefix, StringUtils.fromString(sSEAlgorithm));
        }
    }

    private static S3ObjectMetadataStaxMarshaller instance;
    public static S3ObjectMetadataStaxMarshaller getInstance() {
        if (instance == null) instance = new S3ObjectMetadataStaxMarshaller();
        return instance;
    }
}
