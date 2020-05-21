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
 * StAX marshaller for POJO InventoryConfiguration
 */
class InventoryConfigurationStaxMarshaller {

    public void marshall(InventoryConfiguration _inventoryConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_inventoryConfiguration.getDestination() != null) {
            prefix = _prefix + "Destination";
            InventoryDestination destination = _inventoryConfiguration.getDestination();
            InventoryDestinationStaxMarshaller.getInstance().marshall(destination, request,
                    prefix + ".");
        }
        if (_inventoryConfiguration.getIsEnabled() != null) {
            prefix = _prefix + "IsEnabled";
            Boolean isEnabled = _inventoryConfiguration.getIsEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(isEnabled));
        }
        if (_inventoryConfiguration.getFilter() != null) {
            prefix = _prefix + "Filter";
            InventoryFilter filter = _inventoryConfiguration.getFilter();
            InventoryFilterStaxMarshaller.getInstance().marshall(filter, request, prefix + ".");
        }
        if (_inventoryConfiguration.getId() != null) {
            prefix = _prefix + "Id";
            String id = _inventoryConfiguration.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_inventoryConfiguration.getIncludedObjectVersions() != null) {
            prefix = _prefix + "IncludedObjectVersions";
            String includedObjectVersions = _inventoryConfiguration.getIncludedObjectVersions();
            request.addParameter(prefix, StringUtils.fromString(includedObjectVersions));
        }
        if (_inventoryConfiguration.getOptionalFields() != null) {
            prefix = _prefix + "OptionalFields";
            java.util.List<String> optionalFields = _inventoryConfiguration.getOptionalFields();
            int optionalFieldsIndex = 1;
            String optionalFieldsPrefix = prefix;
            for (String optionalFieldsItem : optionalFields) {
                prefix = optionalFieldsPrefix + "." + optionalFieldsIndex;
                if (optionalFieldsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(optionalFieldsItem));
                }
                optionalFieldsIndex++;
            }
            prefix = optionalFieldsPrefix;
        }
        if (_inventoryConfiguration.getSchedule() != null) {
            prefix = _prefix + "Schedule";
            InventorySchedule schedule = _inventoryConfiguration.getSchedule();
            InventoryScheduleStaxMarshaller.getInstance().marshall(schedule, request, prefix + ".");
        }
    }

    private static InventoryConfigurationStaxMarshaller instance;

    public static InventoryConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InventoryConfigurationStaxMarshaller();
        return instance;
    }
}
