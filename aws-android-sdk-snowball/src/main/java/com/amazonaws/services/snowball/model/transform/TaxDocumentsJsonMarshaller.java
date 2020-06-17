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

package com.amazonaws.services.snowball.model.transform;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TaxDocuments
 */
class TaxDocumentsJsonMarshaller {

    public void marshall(TaxDocuments taxDocuments, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (taxDocuments.getIND() != null) {
            INDTaxDocuments iND = taxDocuments.getIND();
            jsonWriter.name("IND");
            INDTaxDocumentsJsonMarshaller.getInstance().marshall(iND, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TaxDocumentsJsonMarshaller instance;

    public static TaxDocumentsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaxDocumentsJsonMarshaller();
        return instance;
    }
}
