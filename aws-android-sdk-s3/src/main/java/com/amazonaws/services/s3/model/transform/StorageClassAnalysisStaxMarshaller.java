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
 * StAX marshaller for POJO StorageClassAnalysis
 */
class StorageClassAnalysisStaxMarshaller {

    public void marshall(StorageClassAnalysis _storageClassAnalysis, Request<?> request,
            String _prefix) {
        String prefix;
        if (_storageClassAnalysis.getDataExport() != null) {
            prefix = _prefix + "DataExport";
            StorageClassAnalysisDataExport dataExport = _storageClassAnalysis.getDataExport();
            StorageClassAnalysisDataExportStaxMarshaller.getInstance().marshall(dataExport,
                    request, prefix + ".");
        }
    }

    private static StorageClassAnalysisStaxMarshaller instance;

    public static StorageClassAnalysisStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StorageClassAnalysisStaxMarshaller();
        return instance;
    }
}
