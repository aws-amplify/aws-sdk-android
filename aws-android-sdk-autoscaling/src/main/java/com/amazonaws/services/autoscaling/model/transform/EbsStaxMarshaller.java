/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Ebs
 */
class EbsStaxMarshaller {

    public void marshall(Ebs _ebs, Request<?> request, String _prefix) {
        String prefix;
        if (_ebs.getSnapshotId() != null) {
            prefix = _prefix + "SnapshotId";
            String snapshotId = _ebs.getSnapshotId();
            request.addParameter(prefix, StringUtils.fromString(snapshotId));
        }
        if (_ebs.getVolumeSize() != null) {
            prefix = _prefix + "VolumeSize";
            Integer volumeSize = _ebs.getVolumeSize();
            request.addParameter(prefix, StringUtils.fromInteger(volumeSize));
        }
        if (_ebs.getVolumeType() != null) {
            prefix = _prefix + "VolumeType";
            String volumeType = _ebs.getVolumeType();
            request.addParameter(prefix, StringUtils.fromString(volumeType));
        }
        if (_ebs.getDeleteOnTermination() != null) {
            prefix = _prefix + "DeleteOnTermination";
            Boolean deleteOnTermination = _ebs.getDeleteOnTermination();
            request.addParameter(prefix, StringUtils.fromBoolean(deleteOnTermination));
        }
        if (_ebs.getIops() != null) {
            prefix = _prefix + "Iops";
            Integer iops = _ebs.getIops();
            request.addParameter(prefix, StringUtils.fromInteger(iops));
        }
        if (_ebs.getEncrypted() != null) {
            prefix = _prefix + "Encrypted";
            Boolean encrypted = _ebs.getEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(encrypted));
        }
    }

    private static EbsStaxMarshaller instance;

    public static EbsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EbsStaxMarshaller();
        return instance;
    }
}
