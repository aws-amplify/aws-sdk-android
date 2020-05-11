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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AttributeFilter
 */
class AttributeFilterJsonMarshaller {

    public void marshall(AttributeFilter attributeFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (attributeFilter.getAndAllFilters() != null) {
            java.util.List<AttributeFilter> andAllFilters = attributeFilter.getAndAllFilters();
            jsonWriter.name("AndAllFilters");
            jsonWriter.beginArray();
            for (AttributeFilter andAllFiltersItem : andAllFilters) {
                if (andAllFiltersItem != null) {
                    AttributeFilterJsonMarshaller.getInstance().marshall(andAllFiltersItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (attributeFilter.getOrAllFilters() != null) {
            java.util.List<AttributeFilter> orAllFilters = attributeFilter.getOrAllFilters();
            jsonWriter.name("OrAllFilters");
            jsonWriter.beginArray();
            for (AttributeFilter orAllFiltersItem : orAllFilters) {
                if (orAllFiltersItem != null) {
                    AttributeFilterJsonMarshaller.getInstance().marshall(orAllFiltersItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (attributeFilter.getNotFilter() != null) {
            AttributeFilter notFilter = attributeFilter.getNotFilter();
            jsonWriter.name("NotFilter");
            AttributeFilterJsonMarshaller.getInstance().marshall(notFilter, jsonWriter);
        }
        if (attributeFilter.getEqualsTo() != null) {
            DocumentAttribute equalsTo = attributeFilter.getEqualsTo();
            jsonWriter.name("EqualsTo");
            DocumentAttributeJsonMarshaller.getInstance().marshall(equalsTo, jsonWriter);
        }
        if (attributeFilter.getContainsAll() != null) {
            DocumentAttribute containsAll = attributeFilter.getContainsAll();
            jsonWriter.name("ContainsAll");
            DocumentAttributeJsonMarshaller.getInstance().marshall(containsAll, jsonWriter);
        }
        if (attributeFilter.getContainsAny() != null) {
            DocumentAttribute containsAny = attributeFilter.getContainsAny();
            jsonWriter.name("ContainsAny");
            DocumentAttributeJsonMarshaller.getInstance().marshall(containsAny, jsonWriter);
        }
        if (attributeFilter.getGreaterThan() != null) {
            DocumentAttribute greaterThan = attributeFilter.getGreaterThan();
            jsonWriter.name("GreaterThan");
            DocumentAttributeJsonMarshaller.getInstance().marshall(greaterThan, jsonWriter);
        }
        if (attributeFilter.getGreaterThanOrEquals() != null) {
            DocumentAttribute greaterThanOrEquals = attributeFilter.getGreaterThanOrEquals();
            jsonWriter.name("GreaterThanOrEquals");
            DocumentAttributeJsonMarshaller.getInstance().marshall(greaterThanOrEquals, jsonWriter);
        }
        if (attributeFilter.getLessThan() != null) {
            DocumentAttribute lessThan = attributeFilter.getLessThan();
            jsonWriter.name("LessThan");
            DocumentAttributeJsonMarshaller.getInstance().marshall(lessThan, jsonWriter);
        }
        if (attributeFilter.getLessThanOrEquals() != null) {
            DocumentAttribute lessThanOrEquals = attributeFilter.getLessThanOrEquals();
            jsonWriter.name("LessThanOrEquals");
            DocumentAttributeJsonMarshaller.getInstance().marshall(lessThanOrEquals, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AttributeFilterJsonMarshaller instance;

    public static AttributeFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttributeFilterJsonMarshaller();
        return instance;
    }
}
