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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

public class GetInsightResultsResult implements Serializable {
    /**
     * <p>
     * The insight results returned by the operation.
     * </p>
     */
    private InsightResults insightResults;

    /**
     * <p>
     * The insight results returned by the operation.
     * </p>
     *
     * @return <p>
     *         The insight results returned by the operation.
     *         </p>
     */
    public InsightResults getInsightResults() {
        return insightResults;
    }

    /**
     * <p>
     * The insight results returned by the operation.
     * </p>
     *
     * @param insightResults <p>
     *            The insight results returned by the operation.
     *            </p>
     */
    public void setInsightResults(InsightResults insightResults) {
        this.insightResults = insightResults;
    }

    /**
     * <p>
     * The insight results returned by the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param insightResults <p>
     *            The insight results returned by the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInsightResultsResult withInsightResults(InsightResults insightResults) {
        this.insightResults = insightResults;
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
        if (getInsightResults() != null)
            sb.append("InsightResults: " + getInsightResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInsightResults() == null) ? 0 : getInsightResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInsightResultsResult == false)
            return false;
        GetInsightResultsResult other = (GetInsightResultsResult) obj;

        if (other.getInsightResults() == null ^ this.getInsightResults() == null)
            return false;
        if (other.getInsightResults() != null
                && other.getInsightResults().equals(this.getInsightResults()) == false)
            return false;
        return true;
    }
}
