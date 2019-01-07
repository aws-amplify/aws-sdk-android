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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The output from the ListOutgoingCertificates operation.
 * </p>
 */
public class ListOutgoingCertificatesResult implements Serializable {
    /**
     * <p>
     * The certificates that are being transferred but not yet accepted.
     * </p>
     */
    private java.util.List<OutgoingCertificate> outgoingCertificates;

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * The certificates that are being transferred but not yet accepted.
     * </p>
     *
     * @return <p>
     *         The certificates that are being transferred but not yet accepted.
     *         </p>
     */
    public java.util.List<OutgoingCertificate> getOutgoingCertificates() {
        return outgoingCertificates;
    }

    /**
     * <p>
     * The certificates that are being transferred but not yet accepted.
     * </p>
     *
     * @param outgoingCertificates <p>
     *            The certificates that are being transferred but not yet
     *            accepted.
     *            </p>
     */
    public void setOutgoingCertificates(
            java.util.Collection<OutgoingCertificate> outgoingCertificates) {
        if (outgoingCertificates == null) {
            this.outgoingCertificates = null;
            return;
        }

        this.outgoingCertificates = new java.util.ArrayList<OutgoingCertificate>(
                outgoingCertificates);
    }

    /**
     * <p>
     * The certificates that are being transferred but not yet accepted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outgoingCertificates <p>
     *            The certificates that are being transferred but not yet
     *            accepted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOutgoingCertificatesResult withOutgoingCertificates(
            OutgoingCertificate... outgoingCertificates) {
        if (getOutgoingCertificates() == null) {
            this.outgoingCertificates = new java.util.ArrayList<OutgoingCertificate>(
                    outgoingCertificates.length);
        }
        for (OutgoingCertificate value : outgoingCertificates) {
            this.outgoingCertificates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The certificates that are being transferred but not yet accepted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outgoingCertificates <p>
     *            The certificates that are being transferred but not yet
     *            accepted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOutgoingCertificatesResult withOutgoingCertificates(
            java.util.Collection<OutgoingCertificate> outgoingCertificates) {
        setOutgoingCertificates(outgoingCertificates);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @return <p>
     *         The marker for the next set of results.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param nextMarker <p>
     *            The marker for the next set of results.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param nextMarker <p>
     *            The marker for the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOutgoingCertificatesResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getOutgoingCertificates() != null)
            sb.append("outgoingCertificates: " + getOutgoingCertificates() + ",");
        if (getNextMarker() != null)
            sb.append("nextMarker: " + getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOutgoingCertificates() == null) ? 0 : getOutgoingCertificates().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOutgoingCertificatesResult == false)
            return false;
        ListOutgoingCertificatesResult other = (ListOutgoingCertificatesResult) obj;

        if (other.getOutgoingCertificates() == null ^ this.getOutgoingCertificates() == null)
            return false;
        if (other.getOutgoingCertificates() != null
                && other.getOutgoingCertificates().equals(this.getOutgoingCertificates()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }
}
