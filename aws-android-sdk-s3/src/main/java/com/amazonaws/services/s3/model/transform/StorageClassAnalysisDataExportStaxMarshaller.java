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
 * StAX marshaller for POJO StorageClassAnalysisDataExport
 */
class StorageClassAnalysisDataExportStaxMarshaller {

    public void marshall(StorageClassAnalysisDataExport _storageClassAnalysisDataExport,
            Request<?> request, String _prefix) {
        String prefix;
        if (_storageClassAnalysisDataExport.getOutputSchemaVersion() != null) {
            prefix = _prefix + "OutputSchemaVersion";
            String outputSchemaVersion = _storageClassAnalysisDataExport.getOutputSchemaVersion();
            request.addParameter(prefix, StringUtils.fromString(outputSchemaVersion));
        }
        if (_storageClassAnalysisDataExport.getDestination() != null) {
            prefix = _prefix + "Destination";
            AnalyticsExportDestination destination = _storageClassAnalysisDataExport
                    .getDestination();
            AnalyticsExportDestinationStaxMarshaller.getInstance().marshall(destination, request,
                    prefix + ".");
        }
    }

    private static StorageClassAnalysisDataExportStaxMarshaller instance;

    public static StorageClassAnalysisDataExportStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StorageClassAnalysisDataExportStaxMarshaller();
        return instance;
    }
}
