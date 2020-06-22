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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ValidStorageOptions
 */
class ValidStorageOptionsStaxMarshaller {

    public void marshall(ValidStorageOptions _validStorageOptions, Request<?> request,
            String _prefix) {
        String prefix;
        if (_validStorageOptions.getStorageType() != null) {
            prefix = _prefix + "StorageType";
            String storageType = _validStorageOptions.getStorageType();
            request.addParameter(prefix, StringUtils.fromString(storageType));
        }
        if (_validStorageOptions.getStorageSize() != null) {
            prefix = _prefix + "StorageSize";
            java.util.List<Range> storageSize = _validStorageOptions.getStorageSize();
            int storageSizeIndex = 1;
            String storageSizePrefix = prefix;
            for (Range storageSizeItem : storageSize) {
                prefix = storageSizePrefix + "." + storageSizeIndex;
                if (storageSizeItem != null) {
                    RangeStaxMarshaller.getInstance().marshall(storageSizeItem, request,
                            prefix + ".");
                }
                storageSizeIndex++;
            }
            prefix = storageSizePrefix;
        }
        if (_validStorageOptions.getProvisionedIops() != null) {
            prefix = _prefix + "ProvisionedIops";
            java.util.List<Range> provisionedIops = _validStorageOptions.getProvisionedIops();
            int provisionedIopsIndex = 1;
            String provisionedIopsPrefix = prefix;
            for (Range provisionedIopsItem : provisionedIops) {
                prefix = provisionedIopsPrefix + "." + provisionedIopsIndex;
                if (provisionedIopsItem != null) {
                    RangeStaxMarshaller.getInstance().marshall(provisionedIopsItem, request,
                            prefix + ".");
                }
                provisionedIopsIndex++;
            }
            prefix = provisionedIopsPrefix;
        }
        if (_validStorageOptions.getIopsToStorageRatio() != null) {
            prefix = _prefix + "IopsToStorageRatio";
            java.util.List<DoubleRange> iopsToStorageRatio = _validStorageOptions
                    .getIopsToStorageRatio();
            int iopsToStorageRatioIndex = 1;
            String iopsToStorageRatioPrefix = prefix;
            for (DoubleRange iopsToStorageRatioItem : iopsToStorageRatio) {
                prefix = iopsToStorageRatioPrefix + "." + iopsToStorageRatioIndex;
                if (iopsToStorageRatioItem != null) {
                    DoubleRangeStaxMarshaller.getInstance().marshall(iopsToStorageRatioItem,
                            request, prefix + ".");
                }
                iopsToStorageRatioIndex++;
            }
            prefix = iopsToStorageRatioPrefix;
        }
        if (_validStorageOptions.getSupportsStorageAutoscaling() != null) {
            prefix = _prefix + "SupportsStorageAutoscaling";
            Boolean supportsStorageAutoscaling = _validStorageOptions
                    .getSupportsStorageAutoscaling();
            request.addParameter(prefix, StringUtils.fromBoolean(supportsStorageAutoscaling));
        }
    }

    private static ValidStorageOptionsStaxMarshaller instance;

    public static ValidStorageOptionsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ValidStorageOptionsStaxMarshaller();
        return instance;
    }
}
