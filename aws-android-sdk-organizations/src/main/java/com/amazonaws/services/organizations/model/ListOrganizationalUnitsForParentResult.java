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

public class ListOrganizationalUnitsForParentResult implements Serializable {
    /**
     * <p>
     * A list of the OUs in the specified root or parent OU.
     * </p>
     */
    private java.util.List<OrganizationalUnit> organizationalUnits;

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
     * A list of the OUs in the specified root or parent OU.
     * </p>
     *
     * @return <p>
     *         A list of the OUs in the specified root or parent OU.
     *         </p>
     */
    public java.util.List<OrganizationalUnit> getOrganizationalUnits() {
        return organizationalUnits;
    }

    /**
     * <p>
     * A list of the OUs in the specified root or parent OU.
     * </p>
     *
     * @param organizationalUnits <p>
     *            A list of the OUs in the specified root or parent OU.
     *            </p>
     */
    public void setOrganizationalUnits(java.util.Collection<OrganizationalUnit> organizationalUnits) {
        if (organizationalUnits == null) {
            this.organizationalUnits = null;
            return;
        }

        this.organizationalUnits = new java.util.ArrayList<OrganizationalUnit>(organizationalUnits);
    }

    /**
     * <p>
     * A list of the OUs in the specified root or parent OU.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationalUnits <p>
     *            A list of the OUs in the specified root or parent OU.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOrganizationalUnitsForParentResult withOrganizationalUnits(
            OrganizationalUnit... organizationalUnits) {
        if (getOrganizationalUnits() == null) {
            this.organizationalUnits = new java.util.ArrayList<OrganizationalUnit>(
                    organizationalUnits.length);
        }
        for (OrganizationalUnit value : organizationalUnits) {
            this.organizationalUnits.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the OUs in the specified root or parent OU.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationalUnits <p>
     *            A list of the OUs in the specified root or parent OU.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOrganizationalUnitsForParentResult withOrganizationalUnits(
            java.util.Collection<OrganizationalUnit> organizationalUnits) {
        setOrganizationalUnits(organizationalUnits);
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
    public ListOrganizationalUnitsForParentResult withNextToken(String nextToken) {
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
        if (getOrganizationalUnits() != null)
            sb.append("OrganizationalUnits: " + getOrganizationalUnits() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrganizationalUnits() == null) ? 0 : getOrganizationalUnits().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOrganizationalUnitsForParentResult == false)
            return false;
        ListOrganizationalUnitsForParentResult other = (ListOrganizationalUnitsForParentResult) obj;

        if (other.getOrganizationalUnits() == null ^ this.getOrganizationalUnits() == null)
            return false;
        if (other.getOrganizationalUnits() != null
                && other.getOrganizationalUnits().equals(this.getOrganizationalUnits()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
