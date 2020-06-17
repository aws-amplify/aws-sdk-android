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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ListJobsFilterCriteria
 */
class ListJobsFilterCriteriaJsonMarshaller {

    public void marshall(ListJobsFilterCriteria listJobsFilterCriteria, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (listJobsFilterCriteria.getExcludes() != null) {
            java.util.List<ListJobsFilterTerm> excludes = listJobsFilterCriteria.getExcludes();
            jsonWriter.name("excludes");
            jsonWriter.beginArray();
            for (ListJobsFilterTerm excludesItem : excludes) {
                if (excludesItem != null) {
                    ListJobsFilterTermJsonMarshaller.getInstance().marshall(excludesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (listJobsFilterCriteria.getIncludes() != null) {
            java.util.List<ListJobsFilterTerm> includes = listJobsFilterCriteria.getIncludes();
            jsonWriter.name("includes");
            jsonWriter.beginArray();
            for (ListJobsFilterTerm includesItem : includes) {
                if (includesItem != null) {
                    ListJobsFilterTermJsonMarshaller.getInstance().marshall(includesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ListJobsFilterCriteriaJsonMarshaller instance;

    public static ListJobsFilterCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListJobsFilterCriteriaJsonMarshaller();
        return instance;
    }
}
