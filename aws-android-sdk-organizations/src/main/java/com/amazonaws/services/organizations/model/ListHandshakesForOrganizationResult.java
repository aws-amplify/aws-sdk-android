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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

public class ListHandshakesForOrganizationResult implements Serializable {
    /**
     * <p>
     * A list of <a>Handshake</a> objects with details about each of the
     * handshakes that are associated with an organization.
     * </p>
     */
    private java.util.List<Handshake> handshakes;

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <a>Handshake</a> objects with details about each of the
     * handshakes that are associated with an organization.
     * </p>
     *
     * @return <p>
     *         A list of <a>Handshake</a> objects with details about each of the
     *         handshakes that are associated with an organization.
     *         </p>
     */
    public java.util.List<Handshake> getHandshakes() {
        return handshakes;
    }

    /**
     * <p>
     * A list of <a>Handshake</a> objects with details about each of the
     * handshakes that are associated with an organization.
     * </p>
     *
     * @param handshakes <p>
     *            A list of <a>Handshake</a> objects with details about each of
     *            the handshakes that are associated with an organization.
     *            </p>
     */
    public void setHandshakes(java.util.Collection<Handshake> handshakes) {
        if (handshakes == null) {
            this.handshakes = null;
            return;
        }

        this.handshakes = new java.util.ArrayList<Handshake>(handshakes);
    }

    /**
     * <p>
     * A list of <a>Handshake</a> objects with details about each of the
     * handshakes that are associated with an organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param handshakes <p>
     *            A list of <a>Handshake</a> objects with details about each of
     *            the handshakes that are associated with an organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHandshakesForOrganizationResult withHandshakes(Handshake... handshakes) {
        if (getHandshakes() == null) {
            this.handshakes = new java.util.ArrayList<Handshake>(handshakes.length);
        }
        for (Handshake value : handshakes) {
            this.handshakes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>Handshake</a> objects with details about each of the
     * handshakes that are associated with an organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param handshakes <p>
     *            A list of <a>Handshake</a> objects with details about each of
     *            the handshakes that are associated with an organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHandshakesForOrganizationResult withHandshakes(
            java.util.Collection<Handshake> handshakes) {
        setHandshakes(handshakes);
        return this;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         If present, indicates that more output is available than is
     *         included in the current response. Use this value in the
     *         <code>NextToken</code> request parameter in a subsequent call to
     *         the operation to get the next part of the output. You should
     *         repeat this until the <code>NextToken</code> response element
     *         comes back as <code>null</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param nextToken <p>
     *            If present, indicates that more output is available than is
     *            included in the current response. Use this value in the
     *            <code>NextToken</code> request parameter in a subsequent call
     *            to the operation to get the next part of the output. You
     *            should repeat this until the <code>NextToken</code> response
     *            element comes back as <code>null</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param nextToken <p>
     *            If present, indicates that more output is available than is
     *            included in the current response. Use this value in the
     *            <code>NextToken</code> request parameter in a subsequent call
     *            to the operation to get the next part of the output. You
     *            should repeat this until the <code>NextToken</code> response
     *            element comes back as <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHandshakesForOrganizationResult withNextToken(String nextToken) {
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
        if (getHandshakes() != null)
            sb.append("Handshakes: " + getHandshakes() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHandshakes() == null) ? 0 : getHandshakes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHandshakesForOrganizationResult == false)
            return false;
        ListHandshakesForOrganizationResult other = (ListHandshakesForOrganizationResult) obj;

        if (other.getHandshakes() == null ^ this.getHandshakes() == null)
            return false;
        if (other.getHandshakes() != null
                && other.getHandshakes().equals(this.getHandshakes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
