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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a description of specified virtual tapes in the virtual tape shelf
 * (VTS). This operation is only supported in the tape gateway type.
 * </p>
 * <p>
 * If a specific <code>TapeARN</code> is not specified, AWS Storage Gateway
 * returns a description of all virtual tapes found in the VTS associated with
 * your account.
 * </p>
 */
public class DescribeTapeArchivesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent
     * the virtual tapes you want to describe.
     * </p>
     */
    private java.util.List<String> tapeARNs;

    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing
     * virtual tapes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

    /**
     * <p>
     * Specifies that the number of virtual tapes described be limited to the
     * specified number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer limit;

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent
     * the virtual tapes you want to describe.
     * </p>
     *
     * @return <p>
     *         Specifies one or more unique Amazon Resource Names (ARNs) that
     *         represent the virtual tapes you want to describe.
     *         </p>
     */
    public java.util.List<String> getTapeARNs() {
        return tapeARNs;
    }

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent
     * the virtual tapes you want to describe.
     * </p>
     *
     * @param tapeARNs <p>
     *            Specifies one or more unique Amazon Resource Names (ARNs) that
     *            represent the virtual tapes you want to describe.
     *            </p>
     */
    public void setTapeARNs(java.util.Collection<String> tapeARNs) {
        if (tapeARNs == null) {
            this.tapeARNs = null;
            return;
        }

        this.tapeARNs = new java.util.ArrayList<String>(tapeARNs);
    }

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent
     * the virtual tapes you want to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeARNs <p>
     *            Specifies one or more unique Amazon Resource Names (ARNs) that
     *            represent the virtual tapes you want to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapeArchivesRequest withTapeARNs(String... tapeARNs) {
        if (getTapeARNs() == null) {
            this.tapeARNs = new java.util.ArrayList<String>(tapeARNs.length);
        }
        for (String value : tapeARNs) {
            this.tapeARNs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent
     * the virtual tapes you want to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeARNs <p>
     *            Specifies one or more unique Amazon Resource Names (ARNs) that
     *            represent the virtual tapes you want to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapeArchivesRequest withTapeARNs(java.util.Collection<String> tapeARNs) {
        setTapeARNs(tapeARNs);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing
     * virtual tapes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         An opaque string that indicates the position at which to begin
     *         describing virtual tapes.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing
     * virtual tapes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            An opaque string that indicates the position at which to begin
     *            describing virtual tapes.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing
     * virtual tapes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            An opaque string that indicates the position at which to begin
     *            describing virtual tapes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapeArchivesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Specifies that the number of virtual tapes described be limited to the
     * specified number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         Specifies that the number of virtual tapes described be limited
     *         to the specified number.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * Specifies that the number of virtual tapes described be limited to the
     * specified number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit <p>
     *            Specifies that the number of virtual tapes described be
     *            limited to the specified number.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Specifies that the number of virtual tapes described be limited to the
     * specified number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit <p>
     *            Specifies that the number of virtual tapes described be
     *            limited to the specified number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapeArchivesRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getTapeARNs() != null)
            sb.append("TapeARNs: " + getTapeARNs() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARNs() == null) ? 0 : getTapeARNs().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTapeArchivesRequest == false)
            return false;
        DescribeTapeArchivesRequest other = (DescribeTapeArchivesRequest) obj;

        if (other.getTapeARNs() == null ^ this.getTapeARNs() == null)
            return false;
        if (other.getTapeARNs() != null && other.getTapeARNs().equals(this.getTapeARNs()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }
}
