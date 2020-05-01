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
 * Shares a Systems Manager document publicly or privately. If you share a
 * document privately, you must specify the AWS user account IDs for those
 * people who can use the document. If you share a document publicly, you must
 * specify <i>All</i> as the account ID.
 * </p>
 */
public class ModifyDocumentPermissionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the document that you want to share.
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
     * The AWS user accounts that should have access to the document. The
     * account IDs can either be a group of account IDs or <i>All</i>.
     * </p>
     */
    private java.util.List<String> accountIdsToAdd;

    /**
     * <p>
     * The AWS user accounts that should no longer have access to the document.
     * The AWS user account can either be a group of account IDs or <i>All</i>.
     * This action has a higher priority than <i>AccountIdsToAdd</i>. If you
     * specify an account ID to add and the same ID to remove, the system
     * removes access to the document.
     * </p>
     */
    private java.util.List<String> accountIdsToRemove;

    /**
     * <p>
     * (Optional) The version of the document to share. If it's not specified,
     * the system choose the <code>Default</code> version to share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8<br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|[$]ALL)<br/>
     */
    private String sharedDocumentVersion;

    /**
     * <p>
     * The name of the document that you want to share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the document that you want to share.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the document that you want to share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the document that you want to share.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the document that you want to share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the document that you want to share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDocumentPermissionRequest withName(String name) {
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
    public ModifyDocumentPermissionRequest withPermissionType(String permissionType) {
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
    public ModifyDocumentPermissionRequest withPermissionType(DocumentPermissionType permissionType) {
        this.permissionType = permissionType.toString();
        return this;
    }

    /**
     * <p>
     * The AWS user accounts that should have access to the document. The
     * account IDs can either be a group of account IDs or <i>All</i>.
     * </p>
     *
     * @return <p>
     *         The AWS user accounts that should have access to the document.
     *         The account IDs can either be a group of account IDs or
     *         <i>All</i>.
     *         </p>
     */
    public java.util.List<String> getAccountIdsToAdd() {
        return accountIdsToAdd;
    }

    /**
     * <p>
     * The AWS user accounts that should have access to the document. The
     * account IDs can either be a group of account IDs or <i>All</i>.
     * </p>
     *
     * @param accountIdsToAdd <p>
     *            The AWS user accounts that should have access to the document.
     *            The account IDs can either be a group of account IDs or
     *            <i>All</i>.
     *            </p>
     */
    public void setAccountIdsToAdd(java.util.Collection<String> accountIdsToAdd) {
        if (accountIdsToAdd == null) {
            this.accountIdsToAdd = null;
            return;
        }

        this.accountIdsToAdd = new java.util.ArrayList<String>(accountIdsToAdd);
    }

    /**
     * <p>
     * The AWS user accounts that should have access to the document. The
     * account IDs can either be a group of account IDs or <i>All</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIdsToAdd <p>
     *            The AWS user accounts that should have access to the document.
     *            The account IDs can either be a group of account IDs or
     *            <i>All</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDocumentPermissionRequest withAccountIdsToAdd(String... accountIdsToAdd) {
        if (getAccountIdsToAdd() == null) {
            this.accountIdsToAdd = new java.util.ArrayList<String>(accountIdsToAdd.length);
        }
        for (String value : accountIdsToAdd) {
            this.accountIdsToAdd.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The AWS user accounts that should have access to the document. The
     * account IDs can either be a group of account IDs or <i>All</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIdsToAdd <p>
     *            The AWS user accounts that should have access to the document.
     *            The account IDs can either be a group of account IDs or
     *            <i>All</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDocumentPermissionRequest withAccountIdsToAdd(
            java.util.Collection<String> accountIdsToAdd) {
        setAccountIdsToAdd(accountIdsToAdd);
        return this;
    }

    /**
     * <p>
     * The AWS user accounts that should no longer have access to the document.
     * The AWS user account can either be a group of account IDs or <i>All</i>.
     * This action has a higher priority than <i>AccountIdsToAdd</i>. If you
     * specify an account ID to add and the same ID to remove, the system
     * removes access to the document.
     * </p>
     *
     * @return <p>
     *         The AWS user accounts that should no longer have access to the
     *         document. The AWS user account can either be a group of account
     *         IDs or <i>All</i>. This action has a higher priority than
     *         <i>AccountIdsToAdd</i>. If you specify an account ID to add and
     *         the same ID to remove, the system removes access to the document.
     *         </p>
     */
    public java.util.List<String> getAccountIdsToRemove() {
        return accountIdsToRemove;
    }

    /**
     * <p>
     * The AWS user accounts that should no longer have access to the document.
     * The AWS user account can either be a group of account IDs or <i>All</i>.
     * This action has a higher priority than <i>AccountIdsToAdd</i>. If you
     * specify an account ID to add and the same ID to remove, the system
     * removes access to the document.
     * </p>
     *
     * @param accountIdsToRemove <p>
     *            The AWS user accounts that should no longer have access to the
     *            document. The AWS user account can either be a group of
     *            account IDs or <i>All</i>. This action has a higher priority
     *            than <i>AccountIdsToAdd</i>. If you specify an account ID to
     *            add and the same ID to remove, the system removes access to
     *            the document.
     *            </p>
     */
    public void setAccountIdsToRemove(java.util.Collection<String> accountIdsToRemove) {
        if (accountIdsToRemove == null) {
            this.accountIdsToRemove = null;
            return;
        }

        this.accountIdsToRemove = new java.util.ArrayList<String>(accountIdsToRemove);
    }

    /**
     * <p>
     * The AWS user accounts that should no longer have access to the document.
     * The AWS user account can either be a group of account IDs or <i>All</i>.
     * This action has a higher priority than <i>AccountIdsToAdd</i>. If you
     * specify an account ID to add and the same ID to remove, the system
     * removes access to the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIdsToRemove <p>
     *            The AWS user accounts that should no longer have access to the
     *            document. The AWS user account can either be a group of
     *            account IDs or <i>All</i>. This action has a higher priority
     *            than <i>AccountIdsToAdd</i>. If you specify an account ID to
     *            add and the same ID to remove, the system removes access to
     *            the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDocumentPermissionRequest withAccountIdsToRemove(String... accountIdsToRemove) {
        if (getAccountIdsToRemove() == null) {
            this.accountIdsToRemove = new java.util.ArrayList<String>(accountIdsToRemove.length);
        }
        for (String value : accountIdsToRemove) {
            this.accountIdsToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The AWS user accounts that should no longer have access to the document.
     * The AWS user account can either be a group of account IDs or <i>All</i>.
     * This action has a higher priority than <i>AccountIdsToAdd</i>. If you
     * specify an account ID to add and the same ID to remove, the system
     * removes access to the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIdsToRemove <p>
     *            The AWS user accounts that should no longer have access to the
     *            document. The AWS user account can either be a group of
     *            account IDs or <i>All</i>. This action has a higher priority
     *            than <i>AccountIdsToAdd</i>. If you specify an account ID to
     *            add and the same ID to remove, the system removes access to
     *            the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDocumentPermissionRequest withAccountIdsToRemove(
            java.util.Collection<String> accountIdsToRemove) {
        setAccountIdsToRemove(accountIdsToRemove);
        return this;
    }

    /**
     * <p>
     * (Optional) The version of the document to share. If it's not specified,
     * the system choose the <code>Default</code> version to share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8<br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|[$]ALL)<br/>
     *
     * @return <p>
     *         (Optional) The version of the document to share. If it's not
     *         specified, the system choose the <code>Default</code> version to
     *         share.
     *         </p>
     */
    public String getSharedDocumentVersion() {
        return sharedDocumentVersion;
    }

    /**
     * <p>
     * (Optional) The version of the document to share. If it's not specified,
     * the system choose the <code>Default</code> version to share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8<br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|[$]ALL)<br/>
     *
     * @param sharedDocumentVersion <p>
     *            (Optional) The version of the document to share. If it's not
     *            specified, the system choose the <code>Default</code> version
     *            to share.
     *            </p>
     */
    public void setSharedDocumentVersion(String sharedDocumentVersion) {
        this.sharedDocumentVersion = sharedDocumentVersion;
    }

    /**
     * <p>
     * (Optional) The version of the document to share. If it's not specified,
     * the system choose the <code>Default</code> version to share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8<br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|[$]ALL)<br/>
     *
     * @param sharedDocumentVersion <p>
     *            (Optional) The version of the document to share. If it's not
     *            specified, the system choose the <code>Default</code> version
     *            to share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDocumentPermissionRequest withSharedDocumentVersion(String sharedDocumentVersion) {
        this.sharedDocumentVersion = sharedDocumentVersion;
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
            sb.append("PermissionType: " + getPermissionType() + ",");
        if (getAccountIdsToAdd() != null)
            sb.append("AccountIdsToAdd: " + getAccountIdsToAdd() + ",");
        if (getAccountIdsToRemove() != null)
            sb.append("AccountIdsToRemove: " + getAccountIdsToRemove() + ",");
        if (getSharedDocumentVersion() != null)
            sb.append("SharedDocumentVersion: " + getSharedDocumentVersion());
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
        hashCode = prime * hashCode
                + ((getAccountIdsToAdd() == null) ? 0 : getAccountIdsToAdd().hashCode());
        hashCode = prime * hashCode
                + ((getAccountIdsToRemove() == null) ? 0 : getAccountIdsToRemove().hashCode());
        hashCode = prime
                * hashCode
                + ((getSharedDocumentVersion() == null) ? 0 : getSharedDocumentVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDocumentPermissionRequest == false)
            return false;
        ModifyDocumentPermissionRequest other = (ModifyDocumentPermissionRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPermissionType() == null ^ this.getPermissionType() == null)
            return false;
        if (other.getPermissionType() != null
                && other.getPermissionType().equals(this.getPermissionType()) == false)
            return false;
        if (other.getAccountIdsToAdd() == null ^ this.getAccountIdsToAdd() == null)
            return false;
        if (other.getAccountIdsToAdd() != null
                && other.getAccountIdsToAdd().equals(this.getAccountIdsToAdd()) == false)
            return false;
        if (other.getAccountIdsToRemove() == null ^ this.getAccountIdsToRemove() == null)
            return false;
        if (other.getAccountIdsToRemove() != null
                && other.getAccountIdsToRemove().equals(this.getAccountIdsToRemove()) == false)
            return false;
        if (other.getSharedDocumentVersion() == null ^ this.getSharedDocumentVersion() == null)
            return false;
        if (other.getSharedDocumentVersion() != null
                && other.getSharedDocumentVersion().equals(this.getSharedDocumentVersion()) == false)
            return false;
        return true;
    }
}
