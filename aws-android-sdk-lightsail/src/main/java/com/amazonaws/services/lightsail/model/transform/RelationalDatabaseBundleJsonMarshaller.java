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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RelationalDatabaseBundle
 */
class RelationalDatabaseBundleJsonMarshaller {

    public void marshall(RelationalDatabaseBundle relationalDatabaseBundle, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (relationalDatabaseBundle.getBundleId() != null) {
            String bundleId = relationalDatabaseBundle.getBundleId();
            jsonWriter.name("bundleId");
            jsonWriter.value(bundleId);
        }
        if (relationalDatabaseBundle.getName() != null) {
            String name = relationalDatabaseBundle.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (relationalDatabaseBundle.getPrice() != null) {
            Float price = relationalDatabaseBundle.getPrice();
            jsonWriter.name("price");
            jsonWriter.value(price);
        }
        if (relationalDatabaseBundle.getRamSizeInGb() != null) {
            Float ramSizeInGb = relationalDatabaseBundle.getRamSizeInGb();
            jsonWriter.name("ramSizeInGb");
            jsonWriter.value(ramSizeInGb);
        }
        if (relationalDatabaseBundle.getDiskSizeInGb() != null) {
            Integer diskSizeInGb = relationalDatabaseBundle.getDiskSizeInGb();
            jsonWriter.name("diskSizeInGb");
            jsonWriter.value(diskSizeInGb);
        }
        if (relationalDatabaseBundle.getTransferPerMonthInGb() != null) {
            Integer transferPerMonthInGb = relationalDatabaseBundle.getTransferPerMonthInGb();
            jsonWriter.name("transferPerMonthInGb");
            jsonWriter.value(transferPerMonthInGb);
        }
        if (relationalDatabaseBundle.getCpuCount() != null) {
            Integer cpuCount = relationalDatabaseBundle.getCpuCount();
            jsonWriter.name("cpuCount");
            jsonWriter.value(cpuCount);
        }
        if (relationalDatabaseBundle.getIsEncrypted() != null) {
            Boolean isEncrypted = relationalDatabaseBundle.getIsEncrypted();
            jsonWriter.name("isEncrypted");
            jsonWriter.value(isEncrypted);
        }
        if (relationalDatabaseBundle.getIsActive() != null) {
            Boolean isActive = relationalDatabaseBundle.getIsActive();
            jsonWriter.name("isActive");
            jsonWriter.value(isActive);
        }
        jsonWriter.endObject();
    }

    private static RelationalDatabaseBundleJsonMarshaller instance;

    public static RelationalDatabaseBundleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseBundleJsonMarshaller();
        return instance;
    }
}
