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
 * JSON marshaller for POJO LteCellDetails
 */
class LteCellDetailsJsonMarshaller {

    public void marshall(LteCellDetails lteCellDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lteCellDetails.getCellId() != null) {
            Integer cellId = lteCellDetails.getCellId();
            jsonWriter.name("CellId");
            jsonWriter.value(cellId);
        }
        if (lteCellDetails.getMcc() != null) {
            Integer mcc = lteCellDetails.getMcc();
            jsonWriter.name("Mcc");
            jsonWriter.value(mcc);
        }
        if (lteCellDetails.getMnc() != null) {
            Integer mnc = lteCellDetails.getMnc();
            jsonWriter.name("Mnc");
            jsonWriter.value(mnc);
        }
        if (lteCellDetails.getLocalId() != null) {
            LteLocalId localId = lteCellDetails.getLocalId();
            jsonWriter.name("LocalId");
            LteLocalIdJsonMarshaller.getInstance().marshall(localId, jsonWriter);
        }
        if (lteCellDetails.getNetworkMeasurements() != null) {
            java.util.List<LteNetworkMeasurements> networkMeasurements = lteCellDetails
                    .getNetworkMeasurements();
            jsonWriter.name("NetworkMeasurements");
            jsonWriter.beginArray();
            for (LteNetworkMeasurements networkMeasurementsItem : networkMeasurements) {
                if (networkMeasurementsItem != null) {
                    LteNetworkMeasurementsJsonMarshaller.getInstance().marshall(
                            networkMeasurementsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (lteCellDetails.getTimingAdvance() != null) {
            Integer timingAdvance = lteCellDetails.getTimingAdvance();
            jsonWriter.name("TimingAdvance");
            jsonWriter.value(timingAdvance);
        }
        if (lteCellDetails.getNrCapable() != null) {
            Boolean nrCapable = lteCellDetails.getNrCapable();
            jsonWriter.name("NrCapable");
            jsonWriter.value(nrCapable);
        }
        if (lteCellDetails.getRsrp() != null) {
            Integer rsrp = lteCellDetails.getRsrp();
            jsonWriter.name("Rsrp");
            jsonWriter.value(rsrp);
        }
        if (lteCellDetails.getRsrq() != null) {
            Float rsrq = lteCellDetails.getRsrq();
            jsonWriter.name("Rsrq");
            jsonWriter.value(rsrq);
        }
        if (lteCellDetails.getTac() != null) {
            Integer tac = lteCellDetails.getTac();
            jsonWriter.name("Tac");
            jsonWriter.value(tac);
        }
        jsonWriter.endObject();
    }

    private static LteCellDetailsJsonMarshaller instance;

    public static LteCellDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LteCellDetailsJsonMarshaller();
        return instance;
    }
}
