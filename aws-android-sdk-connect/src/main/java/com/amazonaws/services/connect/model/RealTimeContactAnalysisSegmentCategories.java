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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * The matched category rules.
 * </p>
 */
public class RealTimeContactAnalysisSegmentCategories implements Serializable {
    /**
     * <p>
     * Map between the name of the matched rule and
     * RealTimeContactAnalysisCategoryDetails.
     * </p>
     */
    private java.util.Map<String, RealTimeContactAnalysisCategoryDetails> matchedDetails;

    /**
     * <p>
     * Map between the name of the matched rule and
     * RealTimeContactAnalysisCategoryDetails.
     * </p>
     *
     * @return <p>
     *         Map between the name of the matched rule and
     *         RealTimeContactAnalysisCategoryDetails.
     *         </p>
     */
    public java.util.Map<String, RealTimeContactAnalysisCategoryDetails> getMatchedDetails() {
        return matchedDetails;
    }

    /**
     * <p>
     * Map between the name of the matched rule and
     * RealTimeContactAnalysisCategoryDetails.
     * </p>
     *
     * @param matchedDetails <p>
     *            Map between the name of the matched rule and
     *            RealTimeContactAnalysisCategoryDetails.
     *            </p>
     */
    public void setMatchedDetails(
            java.util.Map<String, RealTimeContactAnalysisCategoryDetails> matchedDetails) {
        this.matchedDetails = matchedDetails;
    }

    /**
     * <p>
     * Map between the name of the matched rule and
     * RealTimeContactAnalysisCategoryDetails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchedDetails <p>
     *            Map between the name of the matched rule and
     *            RealTimeContactAnalysisCategoryDetails.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentCategories withMatchedDetails(
            java.util.Map<String, RealTimeContactAnalysisCategoryDetails> matchedDetails) {
        this.matchedDetails = matchedDetails;
        return this;
    }

    /**
     * <p>
     * Map between the name of the matched rule and
     * RealTimeContactAnalysisCategoryDetails.
     * </p>
     * <p>
     * The method adds a new key-value pair into MatchedDetails parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into MatchedDetails.
     * @param value The corresponding value of the entry to be added into
     *            MatchedDetails.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentCategories addMatchedDetailsEntry(String key,
            RealTimeContactAnalysisCategoryDetails value) {
        if (null == this.matchedDetails) {
            this.matchedDetails = new java.util.HashMap<String, RealTimeContactAnalysisCategoryDetails>();
        }
        if (this.matchedDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.matchedDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MatchedDetails.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public RealTimeContactAnalysisSegmentCategories clearMatchedDetailsEntries() {
        this.matchedDetails = null;
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
        if (getMatchedDetails() != null)
            sb.append("MatchedDetails: " + getMatchedDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMatchedDetails() == null) ? 0 : getMatchedDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisSegmentCategories == false)
            return false;
        RealTimeContactAnalysisSegmentCategories other = (RealTimeContactAnalysisSegmentCategories) obj;

        if (other.getMatchedDetails() == null ^ this.getMatchedDetails() == null)
            return false;
        if (other.getMatchedDetails() != null
                && other.getMatchedDetails().equals(this.getMatchedDetails()) == false)
            return false;
        return true;
    }
}
