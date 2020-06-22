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
 * StAX marshaller for POJO ValidDBInstanceModificationsMessage
 */
class ValidDBInstanceModificationsMessageStaxMarshaller {

    public void marshall(ValidDBInstanceModificationsMessage _validDBInstanceModificationsMessage,
            Request<?> request, String _prefix) {
        String prefix;
        if (_validDBInstanceModificationsMessage.getStorage() != null) {
            prefix = _prefix + "Storage";
            java.util.List<ValidStorageOptions> storage = _validDBInstanceModificationsMessage
                    .getStorage();
            int storageIndex = 1;
            String storagePrefix = prefix;
            for (ValidStorageOptions storageItem : storage) {
                prefix = storagePrefix + "." + storageIndex;
                if (storageItem != null) {
                    ValidStorageOptionsStaxMarshaller.getInstance().marshall(storageItem, request,
                            prefix + ".");
                }
                storageIndex++;
            }
            prefix = storagePrefix;
        }
        if (_validDBInstanceModificationsMessage.getValidProcessorFeatures() != null) {
            prefix = _prefix + "ValidProcessorFeatures";
            java.util.List<AvailableProcessorFeature> validProcessorFeatures = _validDBInstanceModificationsMessage
                    .getValidProcessorFeatures();
            int validProcessorFeaturesIndex = 1;
            String validProcessorFeaturesPrefix = prefix;
            for (AvailableProcessorFeature validProcessorFeaturesItem : validProcessorFeatures) {
                prefix = validProcessorFeaturesPrefix + "." + validProcessorFeaturesIndex;
                if (validProcessorFeaturesItem != null) {
                    AvailableProcessorFeatureStaxMarshaller.getInstance().marshall(
                            validProcessorFeaturesItem, request, prefix + ".");
                }
                validProcessorFeaturesIndex++;
            }
            prefix = validProcessorFeaturesPrefix;
        }
    }

    private static ValidDBInstanceModificationsMessageStaxMarshaller instance;

    public static ValidDBInstanceModificationsMessageStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ValidDBInstanceModificationsMessageStaxMarshaller();
        return instance;
    }
}
