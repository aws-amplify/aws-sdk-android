/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LteNetworkMeasurements
 */
class LteNetworkMeasurementsJsonMarshaller {

    public void marshall(LteNetworkMeasurements lteNetworkMeasurements, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (lteNetworkMeasurements.getEarfcn() != null) {
            Integer earfcn = lteNetworkMeasurements.getEarfcn();
            jsonWriter.name("Earfcn");
            jsonWriter.value(earfcn);
        }
        if (lteNetworkMeasurements.getCellId() != null) {
            Integer cellId = lteNetworkMeasurements.getCellId();
            jsonWriter.name("CellId");
            jsonWriter.value(cellId);
        }
        if (lteNetworkMeasurements.getPci() != null) {
            Integer pci = lteNetworkMeasurements.getPci();
            jsonWriter.name("Pci");
            jsonWriter.value(pci);
        }
        if (lteNetworkMeasurements.getRsrp() != null) {
            Integer rsrp = lteNetworkMeasurements.getRsrp();
            jsonWriter.name("Rsrp");
            jsonWriter.value(rsrp);
        }
        if (lteNetworkMeasurements.getRsrq() != null) {
            Float rsrq = lteNetworkMeasurements.getRsrq();
            jsonWriter.name("Rsrq");
            jsonWriter.value(rsrq);
        }
        jsonWriter.endObject();
    }

    private static LteNetworkMeasurementsJsonMarshaller instance;

    public static LteNetworkMeasurementsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LteNetworkMeasurementsJsonMarshaller();
        return instance;
    }
}
