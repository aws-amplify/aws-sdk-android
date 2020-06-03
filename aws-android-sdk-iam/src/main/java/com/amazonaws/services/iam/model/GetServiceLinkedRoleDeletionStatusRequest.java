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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves the status of your service-linked role deletion. After you use the
 * <a>DeleteServiceLinkedRole</a> API operation to submit a service-linked role
 * for deletion, you can use the <code>DeletionTaskId</code> parameter in
 * <code>GetServiceLinkedRoleDeletionStatus</code> to check the status of the
 * deletion. If the deletion fails, this operation returns the reason that it
 * failed, if that information is returned by the service.
 * </p>
 */
public class GetServiceLinkedRoleDeletionStatusRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The deletion task identifier. This identifier is returned by the
     * <a>DeleteServiceLinkedRole</a> operation in the format
     * <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String deletionTaskId;

    /**
     * <p>
     * The deletion task identifier. This identifier is returned by the
     * <a>DeleteServiceLinkedRole</a> operation in the format
     * <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The deletion task identifier. This identifier is returned by the
     *         <a>DeleteServiceLinkedRole</a> operation in the format
     *         <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>
     *         .
     *         </p>
     */
    public String getDeletionTaskId() {
        return deletionTaskId;
    }

    /**
     * <p>
     * The deletion task identifier. This identifier is returned by the
     * <a>DeleteServiceLinkedRole</a> operation in the format
     * <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param deletionTaskId <p>
     *            The deletion task identifier. This identifier is returned by
     *            the <a>DeleteServiceLinkedRole</a> operation in the format
     *            <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>
     *            .
     *            </p>
     */
    public void setDeletionTaskId(String deletionTaskId) {
        this.deletionTaskId = deletionTaskId;
    }

    /**
     * <p>
     * The deletion task identifier. This identifier is returned by the
     * <a>DeleteServiceLinkedRole</a> operation in the format
     * <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param deletionTaskId <p>
     *            The deletion task identifier. This identifier is returned by
     *            the <a>DeleteServiceLinkedRole</a> operation in the format
     *            <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetServiceLinkedRoleDeletionStatusRequest withDeletionTaskId(String deletionTaskId) {
        this.deletionTaskId = deletionTaskId;
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
        if (getDeletionTaskId() != null)
            sb.append("DeletionTaskId: " + getDeletionTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeletionTaskId() == null) ? 0 : getDeletionTaskId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceLinkedRoleDeletionStatusRequest == false)
            return false;
        GetServiceLinkedRoleDeletionStatusRequest other = (GetServiceLinkedRoleDeletionStatusRequest) obj;

        if (other.getDeletionTaskId() == null ^ this.getDeletionTaskId() == null)
            return false;
        if (other.getDeletionTaskId() != null
                && other.getDeletionTaskId().equals(this.getDeletionTaskId()) == false)
            return false;
        return true;
    }
}
