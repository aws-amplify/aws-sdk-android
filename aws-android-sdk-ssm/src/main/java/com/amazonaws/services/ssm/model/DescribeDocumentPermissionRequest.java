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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the permissions for a Systems Manager document. If you created the
 * document, you are the owner. If a document is shared, it can either be shared
 * privately (by specifying a user's AWS account ID) or publicly (<i>All</i>).
 * </p>
 */
public class DescribeDocumentPermissionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the document for which you are the owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * The permission type for the document. The permission type can be
     * <i>Share</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Share
     */
    private String permissionType;

    /**
     * <p>
     * The name of the document for which you are the owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the document for which you are the owner.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the document for which you are the owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the document for which you are the owner.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the document for which you are the owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the document for which you are the owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDocumentPermissionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be
     * <i>Share</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Share
     *
     * @return <p>
     *         The permission type for the document. The permission type can be
     *         <i>Share</i>.
     *         </p>
     * @see DocumentPermissionType
     */
    public String getPermissionType() {
        return permissionType;
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be
     * <i>Share</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Share
     *
     * @param permissionType <p>
     *            The permission type for the document. The permission type can
     *            be <i>Share</i>.
     *            </p>
     * @see DocumentPermissionType
     */
    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be
     * <i>Share</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Share
     *
     * @param permissionType <p>
     *            The permission type for the document. The permission type can
     *            be <i>Share</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentPermissionType
     */
    public DescribeDocumentPermissionRequest withPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be
     * <i>Share</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Share
     *
     * @param permissionType <p>
     *            The permission type for the document. The permission type can
     *            be <i>Share</i>.
     *            </p>
     * @see DocumentPermissionType
     */
    public void setPermissionType(DocumentPermissionType permissionType) {
        this.permissionType = permissionType.toString();
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be
     * <i>Share</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Share
     *
     * @param permissionType <p>
     *            The permission type for the document. The permission type can
     *            be <i>Share</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentPermissionType
     */
    public DescribeDocumentPermissionRequest withPermissionType(
            DocumentPermissionType permissionType) {
        this.permissionType = permissionType.toString();
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPermissionType() != null)
            sb.append("PermissionType: " + getPermissionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionType() == null) ? 0 : getPermissionType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDocumentPermissionRequest == false)
            return false;
        DescribeDocumentPermissionRequest other = (DescribeDocumentPermissionRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPermissionType() == null ^ this.getPermissionType() == null)
            return false;
        if (other.getPermissionType() != null
                && other.getPermissionType().equals(this.getPermissionType()) == false)
            return false;
        return true;
    }
}
