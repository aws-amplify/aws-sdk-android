/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Create Volume Request Marshaller
 */
public class CreateVolumeRequestMarshaller implements Marshaller<Request<CreateVolumeRequest>, CreateVolumeRequest> {

    public Request<CreateVolumeRequest> marshall(CreateVolumeRequest createVolumeRequest) {

        if (createVolumeRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVolumeRequest> request = new DefaultRequest<CreateVolumeRequest>(createVolumeRequest, "AmazonEC2");
        request.addParameter("Action", "CreateVolume");
        request.addParameter("Version", "2015-10-01");

        if (createVolumeRequest.getSize() != null) {
            request.addParameter("Size", StringUtils.fromInteger(createVolumeRequest.getSize()));
        }
        if (createVolumeRequest.getSnapshotId() != null) {
            request.addParameter("SnapshotId", StringUtils.fromString(createVolumeRequest.getSnapshotId()));
        }
        if (createVolumeRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(createVolumeRequest.getAvailabilityZone()));
        }
        if (createVolumeRequest.getVolumeType() != null) {
            request.addParameter("VolumeType", StringUtils.fromString(createVolumeRequest.getVolumeType()));
        }
        if (createVolumeRequest.getIops() != null) {
            request.addParameter("Iops", StringUtils.fromInteger(createVolumeRequest.getIops()));
        }
        if (createVolumeRequest.isEncrypted() != null) {
            request.addParameter("Encrypted", StringUtils.fromBoolean(createVolumeRequest.isEncrypted()));
        }
        if (createVolumeRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(createVolumeRequest.getKmsKeyId()));
        }

        return request;
    }
}
