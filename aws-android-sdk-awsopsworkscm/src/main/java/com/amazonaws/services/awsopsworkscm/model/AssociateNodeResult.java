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

package com.amazonaws.services.awsopsworkscm.model;

import java.io.Serializable;

public class AssociateNodeResult implements Serializable {
    /**
     * <p>
     * Contains a token which can be passed to the
     * <code>DescribeNodeAssociationStatus</code> API call to get the status of
     * the association request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String nodeAssociationStatusToken;

    /**
     * <p>
     * Contains a token which can be passed to the
     * <code>DescribeNodeAssociationStatus</code> API call to get the status of
     * the association request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         Contains a token which can be passed to the
     *         <code>DescribeNodeAssociationStatus</code> API call to get the
     *         status of the association request.
     *         </p>
     */
    public String getNodeAssociationStatusToken() {
        return nodeAssociationStatusToken;
    }

    /**
     * <p>
     * Contains a token which can be passed to the
     * <code>DescribeNodeAssociationStatus</code> API call to get the status of
     * the association request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param nodeAssociationStatusToken <p>
     *            Contains a token which can be passed to the
     *            <code>DescribeNodeAssociationStatus</code> API call to get the
     *            status of the association request.
     *            </p>
     */
    public void setNodeAssociationStatusToken(String nodeAssociationStatusToken) {
        this.nodeAssociationStatusToken = nodeAssociationStatusToken;
    }

    /**
     * <p>
     * Contains a token which can be passed to the
     * <code>DescribeNodeAssociationStatus</code> API call to get the status of
     * the association request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param nodeAssociationStatusToken <p>
     *            Contains a token which can be passed to the
     *            <code>DescribeNodeAssociationStatus</code> API call to get the
     *            status of the association request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateNodeResult withNodeAssociationStatusToken(String nodeAssociationStatusToken) {
        this.nodeAssociationStatusToken = nodeAssociationStatusToken;
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
        if (getNodeAssociationStatusToken() != null)
            sb.append("NodeAssociationStatusToken: " + getNodeAssociationStatusToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNodeAssociationStatusToken() == null) ? 0 : getNodeAssociationStatusToken()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateNodeResult == false)
            return false;
        AssociateNodeResult other = (AssociateNodeResult) obj;

        if (other.getNodeAssociationStatusToken() == null
                ^ this.getNodeAssociationStatusToken() == null)
            return false;
        if (other.getNodeAssociationStatusToken() != null
                && other.getNodeAssociationStatusToken().equals(
                        this.getNodeAssociationStatusToken()) == false)
            return false;
        return true;
    }
}
