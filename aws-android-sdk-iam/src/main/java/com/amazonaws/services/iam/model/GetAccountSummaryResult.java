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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>GetAccountSummary</a> request.
 * </p>
 */
public class GetAccountSummaryResult implements Serializable {
    /**
     * <p>
     * A set of key–value pairs containing information about IAM entity usage
     * and IAM quotas.
     * </p>
     */
    private java.util.Map<String, Integer> summaryMap;

    /**
     * <p>
     * A set of key–value pairs containing information about IAM entity usage
     * and IAM quotas.
     * </p>
     *
     * @return <p>
     *         A set of key–value pairs containing information about IAM entity
     *         usage and IAM quotas.
     *         </p>
     */
    public java.util.Map<String, Integer> getSummaryMap() {
        return summaryMap;
    }

    /**
     * <p>
     * A set of key–value pairs containing information about IAM entity usage
     * and IAM quotas.
     * </p>
     *
     * @param summaryMap <p>
     *            A set of key–value pairs containing information about IAM
     *            entity usage and IAM quotas.
     *            </p>
     */
    public void setSummaryMap(java.util.Map<String, Integer> summaryMap) {
        this.summaryMap = summaryMap;
    }

    /**
     * <p>
     * A set of key–value pairs containing information about IAM entity usage
     * and IAM quotas.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summaryMap <p>
     *            A set of key–value pairs containing information about IAM
     *            entity usage and IAM quotas.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccountSummaryResult withSummaryMap(java.util.Map<String, Integer> summaryMap) {
        this.summaryMap = summaryMap;
        return this;
    }

    /**
     * <p>
     * A set of key–value pairs containing information about IAM entity usage
     * and IAM quotas.
     * </p>
     * <p>
     * The method adds a new key-value pair into SummaryMap parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into SummaryMap.
     * @param value The corresponding value of the entry to be added into
     *            SummaryMap.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccountSummaryResult addSummaryMapEntry(String key, Integer value) {
        if (null == this.summaryMap) {
            this.summaryMap = new java.util.HashMap<String, Integer>();
        }
        if (this.summaryMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.summaryMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SummaryMap.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetAccountSummaryResult clearSummaryMapEntries() {
        this.summaryMap = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSummaryMap() != null)
            sb.append("SummaryMap: " + getSummaryMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummaryMap() == null) ? 0 : getSummaryMap().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountSummaryResult == false)
            return false;
        GetAccountSummaryResult other = (GetAccountSummaryResult) obj;

        if (other.getSummaryMap() == null ^ this.getSummaryMap() == null)
            return false;
        if (other.getSummaryMap() != null
                && other.getSummaryMap().equals(this.getSummaryMap()) == false)
            return false;
        return true;
    }
}
