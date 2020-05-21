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
 * StAX request marshaller for PutBucketRequestPaymentRequest
 */
public class PutBucketRequestPaymentRequestMarshaller implements
        Marshaller<Request<PutBucketRequestPaymentRequest>, PutBucketRequestPaymentRequest> {

    public Request<PutBucketRequestPaymentRequest> marshall(
            PutBucketRequestPaymentRequest putBucketRequestPaymentRequest) {
        if (putBucketRequestPaymentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutBucketRequestPaymentRequest)");
        }

        Request<PutBucketRequestPaymentRequest> request = new DefaultRequest<PutBucketRequestPaymentRequest>(
                putBucketRequestPaymentRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "PutBucketRequestPayment");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (putBucketRequestPaymentRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = putBucketRequestPaymentRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (putBucketRequestPaymentRequest.getContentMD5() != null) {
            prefix = "Content-MD5";
            String contentMD5 = putBucketRequestPaymentRequest.getContentMD5();
            request.addParameter(prefix, StringUtils.fromString(contentMD5));
        }
        if (putBucketRequestPaymentRequest.getRequestPaymentConfiguration() != null) {
            prefix = "RequestPaymentConfiguration";
            RequestPaymentConfiguration requestPaymentConfiguration = putBucketRequestPaymentRequest
                    .getRequestPaymentConfiguration();
            RequestPaymentConfigurationStaxMarshaller.getInstance().marshall(
                    requestPaymentConfiguration, request, prefix + ".");
        }

        return request;
    }
}
