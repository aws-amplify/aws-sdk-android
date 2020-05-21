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
 * StAX request marshaller for PutBucketAclRequest
 */
public class PutBucketAclRequestMarshaller implements
        Marshaller<Request<PutBucketAclRequest>, PutBucketAclRequest> {

    public Request<PutBucketAclRequest> marshall(PutBucketAclRequest putBucketAclRequest) {
        if (putBucketAclRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutBucketAclRequest)");
        }

        Request<PutBucketAclRequest> request = new DefaultRequest<PutBucketAclRequest>(
                putBucketAclRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "PutBucketAcl");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (putBucketAclRequest.getACL() != null) {
            prefix = "x-amz-acl";
            String aCL = putBucketAclRequest.getACL();
            request.addParameter(prefix, StringUtils.fromString(aCL));
        }
        if (putBucketAclRequest.getAccessControlPolicy() != null) {
            prefix = "AccessControlPolicy";
            AccessControlPolicy accessControlPolicy = putBucketAclRequest.getAccessControlPolicy();
            AccessControlPolicyStaxMarshaller.getInstance().marshall(accessControlPolicy, request,
                    prefix + ".");
        }
        if (putBucketAclRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = putBucketAclRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (putBucketAclRequest.getContentMD5() != null) {
            prefix = "Content-MD5";
            String contentMD5 = putBucketAclRequest.getContentMD5();
            request.addParameter(prefix, StringUtils.fromString(contentMD5));
        }
        if (putBucketAclRequest.getGrantFullControl() != null) {
            prefix = "x-amz-grant-full-control";
            String grantFullControl = putBucketAclRequest.getGrantFullControl();
            request.addParameter(prefix, StringUtils.fromString(grantFullControl));
        }
        if (putBucketAclRequest.getGrantRead() != null) {
            prefix = "x-amz-grant-read";
            String grantRead = putBucketAclRequest.getGrantRead();
            request.addParameter(prefix, StringUtils.fromString(grantRead));
        }
        if (putBucketAclRequest.getGrantReadACP() != null) {
            prefix = "x-amz-grant-read-acp";
            String grantReadACP = putBucketAclRequest.getGrantReadACP();
            request.addParameter(prefix, StringUtils.fromString(grantReadACP));
        }
        if (putBucketAclRequest.getGrantWrite() != null) {
            prefix = "x-amz-grant-write";
            String grantWrite = putBucketAclRequest.getGrantWrite();
            request.addParameter(prefix, StringUtils.fromString(grantWrite));
        }
        if (putBucketAclRequest.getGrantWriteACP() != null) {
            prefix = "x-amz-grant-write-acp";
            String grantWriteACP = putBucketAclRequest.getGrantWriteACP();
            request.addParameter(prefix, StringUtils.fromString(grantWriteACP));
        }

        return request;
    }
}
