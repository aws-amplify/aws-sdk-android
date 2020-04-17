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

public class GetDetectorsResult implements Serializable {
    /**
     * <p>
     * The detectors.
     * </p>
     */
    private java.util.List<Detector> detectors;

    /**
     * <p>
     * The next page token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The detectors.
     * </p>
     *
     * @return <p>
     *         The detectors.
     *         </p>
     */
    public java.util.List<Detector> getDetectors() {
        return detectors;
    }

    /**
     * <p>
     * The detectors.
     * </p>
     *
     * @param detectors <p>
     *            The detectors.
     *            </p>
     */
    public void setDetectors(java.util.Collection<Detector> detectors) {
        if (detectors == null) {
            this.detectors = null;
            return;
        }

        this.detectors = new java.util.ArrayList<Detector>(detectors);
    }

    /**
     * <p>
     * The detectors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectors <p>
     *            The detectors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDetectorsResult withDetectors(Detector... detectors) {
        if (getDetectors() == null) {
            this.detectors = new java.util.ArrayList<Detector>(detectors.length);
        }
        for (Detector value : detectors) {
            this.detectors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The detectors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectors <p>
     *            The detectors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDetectorsResult withDetectors(java.util.Collection<Detector> detectors) {
        setDetectors(detectors);
        return this;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     *
     * @return <p>
     *         The next page token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     *
     * @param nextToken <p>
     *            The next page token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The next page token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDetectorsResult withNextToken(String nextToken) {
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
        if (getDetectors() != null)
            sb.append("detectors: " + getDetectors() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectors() == null) ? 0 : getDetectors().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDetectorsResult == false)
            return false;
        GetDetectorsResult other = (GetDetectorsResult) obj;

        if (other.getDetectors() == null ^ this.getDetectors() == null)
            return false;
        if (other.getDetectors() != null
                && other.getDetectors().equals(this.getDetectors()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
