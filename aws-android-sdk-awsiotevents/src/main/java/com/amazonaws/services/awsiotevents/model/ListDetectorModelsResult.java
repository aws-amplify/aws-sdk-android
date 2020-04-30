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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

public class ListDetectorModelsResult implements Serializable {
    /**
     * <p>
     * Summary information about the detector models.
     * </p>
     */
    private java.util.List<DetectorModelSummary> detectorModelSummaries;

    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if
     * there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about the detector models.
     * </p>
     *
     * @return <p>
     *         Summary information about the detector models.
     *         </p>
     */
    public java.util.List<DetectorModelSummary> getDetectorModelSummaries() {
        return detectorModelSummaries;
    }

    /**
     * <p>
     * Summary information about the detector models.
     * </p>
     *
     * @param detectorModelSummaries <p>
     *            Summary information about the detector models.
     *            </p>
     */
    public void setDetectorModelSummaries(
            java.util.Collection<DetectorModelSummary> detectorModelSummaries) {
        if (detectorModelSummaries == null) {
            this.detectorModelSummaries = null;
            return;
        }

        this.detectorModelSummaries = new java.util.ArrayList<DetectorModelSummary>(
                detectorModelSummaries);
    }

    /**
     * <p>
     * Summary information about the detector models.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorModelSummaries <p>
     *            Summary information about the detector models.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDetectorModelsResult withDetectorModelSummaries(
            DetectorModelSummary... detectorModelSummaries) {
        if (getDetectorModelSummaries() == null) {
            this.detectorModelSummaries = new java.util.ArrayList<DetectorModelSummary>(
                    detectorModelSummaries.length);
        }
        for (DetectorModelSummary value : detectorModelSummaries) {
            this.detectorModelSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the detector models.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorModelSummaries <p>
     *            Summary information about the detector models.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDetectorModelsResult withDetectorModelSummaries(
            java.util.Collection<DetectorModelSummary> detectorModelSummaries) {
        setDetectorModelSummaries(detectorModelSummaries);
        return this;
    }

    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if
     * there are no additional results.
     * </p>
     *
     * @return <p>
     *         A token to retrieve the next set of results, or <code>null</code>
     *         if there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if
     * there are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            A token to retrieve the next set of results, or
     *            <code>null</code> if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if
     * there are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token to retrieve the next set of results, or
     *            <code>null</code> if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDetectorModelsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDetectorModelSummaries() != null)
            sb.append("detectorModelSummaries: " + getDetectorModelSummaries() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDetectorModelSummaries() == null) ? 0 : getDetectorModelSummaries()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDetectorModelsResult == false)
            return false;
        ListDetectorModelsResult other = (ListDetectorModelsResult) obj;

        if (other.getDetectorModelSummaries() == null ^ this.getDetectorModelSummaries() == null)
            return false;
        if (other.getDetectorModelSummaries() != null
                && other.getDetectorModelSummaries().equals(this.getDetectorModelSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
