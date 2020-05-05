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

package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * The communications returned by the <a>DescribeCommunications</a> operation.
 * </p>
 */
public class DescribeCommunicationsResult implements Serializable {
    /**
     * <p>
     * The communications for the case.
     * </p>
     */
    private java.util.List<Communication> communications;

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The communications for the case.
     * </p>
     *
     * @return <p>
     *         The communications for the case.
     *         </p>
     */
    public java.util.List<Communication> getCommunications() {
        return communications;
    }

    /**
     * <p>
     * The communications for the case.
     * </p>
     *
     * @param communications <p>
     *            The communications for the case.
     *            </p>
     */
    public void setCommunications(java.util.Collection<Communication> communications) {
        if (communications == null) {
            this.communications = null;
            return;
        }

        this.communications = new java.util.ArrayList<Communication>(communications);
    }

    /**
     * <p>
     * The communications for the case.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param communications <p>
     *            The communications for the case.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCommunicationsResult withCommunications(Communication... communications) {
        if (getCommunications() == null) {
            this.communications = new java.util.ArrayList<Communication>(communications.length);
        }
        for (Communication value : communications) {
            this.communications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The communications for the case.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param communications <p>
     *            The communications for the case.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCommunicationsResult withCommunications(
            java.util.Collection<Communication> communications) {
        setCommunications(communications);
        return this;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     *
     * @return <p>
     *         A resumption point for pagination.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     *
     * @param nextToken <p>
     *            A resumption point for pagination.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A resumption point for pagination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCommunicationsResult withNextToken(String nextToken) {
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
        if (getCommunications() != null)
            sb.append("communications: " + getCommunications() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCommunications() == null) ? 0 : getCommunications().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCommunicationsResult == false)
            return false;
        DescribeCommunicationsResult other = (DescribeCommunicationsResult) obj;

        if (other.getCommunications() == null ^ this.getCommunications() == null)
            return false;
        if (other.getCommunications() != null
                && other.getCommunications().equals(this.getCommunications()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
