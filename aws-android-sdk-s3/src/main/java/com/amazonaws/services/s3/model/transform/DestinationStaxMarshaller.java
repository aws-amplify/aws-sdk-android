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

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Destination
 */
class DestinationStaxMarshaller {

    public void marshall(Destination _destination, Request<?> request, String _prefix) {
        String prefix;
        if (_destination.getBucket() != null) {
            prefix = _prefix + "Bucket";
            String bucket = _destination.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (_destination.getAccount() != null) {
            prefix = _prefix + "Account";
            String account = _destination.getAccount();
            request.addParameter(prefix, StringUtils.fromString(account));
        }
        if (_destination.getStorageClass() != null) {
            prefix = _prefix + "StorageClass";
            String storageClass = _destination.getStorageClass();
            request.addParameter(prefix, StringUtils.fromString(storageClass));
        }
        if (_destination.getAccessControlTranslation() != null) {
            prefix = _prefix + "AccessControlTranslation";
            AccessControlTranslation accessControlTranslation = _destination
                    .getAccessControlTranslation();
            AccessControlTranslationStaxMarshaller.getInstance().marshall(accessControlTranslation,
                    request, prefix + ".");
        }
        if (_destination.getEncryptionConfiguration() != null) {
            prefix = _prefix + "EncryptionConfiguration";
            EncryptionConfiguration encryptionConfiguration = _destination
                    .getEncryptionConfiguration();
            EncryptionConfigurationStaxMarshaller.getInstance().marshall(encryptionConfiguration,
                    request, prefix + ".");
        }
        if (_destination.getReplicationTime() != null) {
            prefix = _prefix + "ReplicationTime";
            ReplicationTime replicationTime = _destination.getReplicationTime();
            ReplicationTimeStaxMarshaller.getInstance().marshall(replicationTime, request,
                    prefix + ".");
        }
        if (_destination.getMetrics() != null) {
            prefix = _prefix + "Metrics";
            Metrics metrics = _destination.getMetrics();
            MetricsStaxMarshaller.getInstance().marshall(metrics, request, prefix + ".");
        }
    }

    private static DestinationStaxMarshaller instance;

    public static DestinationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DestinationStaxMarshaller();
        return instance;
    }
}
