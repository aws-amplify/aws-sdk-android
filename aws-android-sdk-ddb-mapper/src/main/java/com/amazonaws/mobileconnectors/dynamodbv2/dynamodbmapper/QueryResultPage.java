/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.util.List;
import java.util.Map;

/**
 * Container for a page of query results
 *
 * @param <T> the typed result.
 */
public class QueryResultPage<T> {

    private List<T> results;
    private Map<String, AttributeValue> lastEvaluatedKey;

    /**
     * Returns all matching items for this page of query results.
     *
     * @return the typed result.
     */
    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    /**
     * Returns the last evaluated key, which can be used as the
     * exclusiveStartKey to fetch the next page of results. Returns null if this
     * is the last page of results.
     *
     * @return The key-value pairs which map from the attribute name of each
     *         component of the primary key to its value.
     */
    public Map<String, AttributeValue> getLastEvaluatedKey() {
        return lastEvaluatedKey;
    }

    public void setLastEvaluatedKey(Map<String, AttributeValue> lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
    }
}
