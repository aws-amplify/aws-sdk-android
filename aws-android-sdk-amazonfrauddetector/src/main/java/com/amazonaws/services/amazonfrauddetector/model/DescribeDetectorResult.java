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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

public class DescribeDetectorResult implements Serializable {
    /**
     * <p>
     * The detector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The status and description for each detector version.
     * </p>
     */
    private java.util.List<DetectorVersionSummary> detectorVersionSummaries;

    /**
     * <p>
     * The next token to be used for subsequent requests.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The detector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @return <p>
     *         The detector ID.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param detectorId <p>
     *            The detector ID.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param detectorId <p>
     *            The detector ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDetectorResult withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The status and description for each detector version.
     * </p>
     *
     * @return <p>
     *         The status and description for each detector version.
     *         </p>
     */
    public java.util.List<DetectorVersionSummary> getDetectorVersionSummaries() {
        return detectorVersionSummaries;
    }

    /**
     * <p>
     * The status and description for each detector version.
     * </p>
     *
     * @param detectorVersionSummaries <p>
     *            The status and description for each detector version.
     *            </p>
     */
    public void setDetectorVersionSummaries(
            java.util.Collection<DetectorVersionSummary> detectorVersionSummaries) {
        if (detectorVersionSummaries == null) {
            this.detectorVersionSummaries = null;
            return;
        }

        this.detectorVersionSummaries = new java.util.ArrayList<DetectorVersionSummary>(
                detectorVersionSummaries);
    }

    /**
     * <p>
     * The status and description for each detector version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorVersionSummaries <p>
     *            The status and description for each detector version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDetectorResult withDetectorVersionSummaries(
            DetectorVersionSummary... detectorVersionSummaries) {
        if (getDetectorVersionSummaries() == null) {
            this.detectorVersionSummaries = new java.util.ArrayList<DetectorVersionSummary>(
                    detectorVersionSummaries.length);
        }
        for (DetectorVersionSummary value : detectorVersionSummaries) {
            this.detectorVersionSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The status and description for each detector version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorVersionSummaries <p>
     *            The status and description for each detector version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDetectorResult withDetectorVersionSummaries(
            java.util.Collection<DetectorVersionSummary> detectorVersionSummaries) {
        setDetectorVersionSummaries(detectorVersionSummaries);
        return this;
    }

    /**
     * <p>
     * The next token to be used for subsequent requests.
     * </p>
     *
     * @return <p>
     *         The next token to be used for subsequent requests.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next token to be used for subsequent requests.
     * </p>
     *
     * @param nextToken <p>
     *            The next token to be used for subsequent requests.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token to be used for subsequent requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The next token to be used for subsequent requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDetectorResult withNextToken(String nextToken) {
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
        if (getDetectorId() != null)
            sb.append("detectorId: " + getDetectorId() + ",");
        if (getDetectorVersionSummaries() != null)
            sb.append("detectorVersionSummaries: " + getDetectorVersionSummaries() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDetectorVersionSummaries() == null) ? 0 : getDetectorVersionSummaries()
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

        if (obj instanceof DescribeDetectorResult == false)
            return false;
        DescribeDetectorResult other = (DescribeDetectorResult) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDetectorVersionSummaries() == null
                ^ this.getDetectorVersionSummaries() == null)
            return false;
        if (other.getDetectorVersionSummaries() != null
                && other.getDetectorVersionSummaries().equals(this.getDetectorVersionSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
