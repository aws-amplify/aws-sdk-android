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

package com.amazonaws.services.awswafregional.model.transform;

import com.amazonaws.services.awswafregional.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SqlInjectionMatchSet
 */
class SqlInjectionMatchSetJsonMarshaller {

    public void marshall(SqlInjectionMatchSet sqlInjectionMatchSet, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sqlInjectionMatchSet.getSqlInjectionMatchSetId() != null) {
            String sqlInjectionMatchSetId = sqlInjectionMatchSet.getSqlInjectionMatchSetId();
            jsonWriter.name("SqlInjectionMatchSetId");
            jsonWriter.value(sqlInjectionMatchSetId);
        }
        if (sqlInjectionMatchSet.getName() != null) {
            String name = sqlInjectionMatchSet.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (sqlInjectionMatchSet.getSqlInjectionMatchTuples() != null) {
            java.util.List<SqlInjectionMatchTuple> sqlInjectionMatchTuples = sqlInjectionMatchSet
                    .getSqlInjectionMatchTuples();
            jsonWriter.name("SqlInjectionMatchTuples");
            jsonWriter.beginArray();
            for (SqlInjectionMatchTuple sqlInjectionMatchTuplesItem : sqlInjectionMatchTuples) {
                if (sqlInjectionMatchTuplesItem != null) {
                    SqlInjectionMatchTupleJsonMarshaller.getInstance().marshall(
                            sqlInjectionMatchTuplesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SqlInjectionMatchSetJsonMarshaller instance;

    public static SqlInjectionMatchSetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SqlInjectionMatchSetJsonMarshaller();
        return instance;
    }
}
