/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class GetSegmentsResult implements Serializable {
    /**
     * Segments in your account.
     */
    private SegmentsResponse segmentsResponse;

    /**
     * Segments in your account.
     *
     * @return Segments in your account.
     */
    public SegmentsResponse getSegmentsResponse() {
        return segmentsResponse;
    }

    /**
     * Segments in your account.
     *
     * @param segmentsResponse Segments in your account.
     */
    public void setSegmentsResponse(SegmentsResponse segmentsResponse) {
        this.segmentsResponse = segmentsResponse;
    }

    /**
     * Segments in your account.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentsResponse Segments in your account.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentsResult withSegmentsResponse(SegmentsResponse segmentsResponse) {
        this.segmentsResponse = segmentsResponse;
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
        if (getSegmentsResponse() != null)
            sb.append("SegmentsResponse: " + getSegmentsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSegmentsResponse() == null) ? 0 : getSegmentsResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSegmentsResult == false)
            return false;
        GetSegmentsResult other = (GetSegmentsResult) obj;

        if (other.getSegmentsResponse() == null ^ this.getSegmentsResponse() == null)
            return false;
        if (other.getSegmentsResponse() != null
                && other.getSegmentsResponse().equals(this.getSegmentsResponse()) == false)
            return false;
        return true;
    }
}
