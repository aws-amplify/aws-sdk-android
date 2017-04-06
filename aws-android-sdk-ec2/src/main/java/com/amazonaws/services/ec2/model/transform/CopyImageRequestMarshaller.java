/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Copy Image Request Marshaller
 */
public class CopyImageRequestMarshaller implements Marshaller<Request<CopyImageRequest>, CopyImageRequest> {

    public Request<CopyImageRequest> marshall(CopyImageRequest copyImageRequest) {

        if (copyImageRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CopyImageRequest> request = new DefaultRequest<CopyImageRequest>(copyImageRequest, "AmazonEC2");
        request.addParameter("Action", "CopyImage");
        request.addParameter("Version", "2015-10-01");

        if (copyImageRequest.getSourceRegion() != null) {
            request.addParameter("SourceRegion", StringUtils.fromString(copyImageRequest.getSourceRegion()));
        }
        if (copyImageRequest.getSourceImageId() != null) {
            request.addParameter("SourceImageId", StringUtils.fromString(copyImageRequest.getSourceImageId()));
        }
        if (copyImageRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(copyImageRequest.getName()));
        }
        if (copyImageRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(copyImageRequest.getDescription()));
        }
        if (copyImageRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(copyImageRequest.getClientToken()));
        }
        if (copyImageRequest.isEncrypted() != null) {
            request.addParameter("Encrypted", StringUtils.fromBoolean(copyImageRequest.isEncrypted()));
        }
        if (copyImageRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(copyImageRequest.getKmsKeyId()));
        }

        return request;
    }
}
