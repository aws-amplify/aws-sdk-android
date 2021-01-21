/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes identities from an identity pool. You can specify a list of 1-60
 * identities that you want to delete.
 * </p>
 * <p>
 * You must use AWS Developer credentials to call this API.
 * </p>
 */
public class DeleteIdentitiesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of 1-60 identities that you want to delete.
     * </p>
     */
    private java.util.List<String> identityIdsToDelete;

    /**
     * <p>
     * A list of 1-60 identities that you want to delete.
     * </p>
     *
     * @return <p>
     *         A list of 1-60 identities that you want to delete.
     *         </p>
     */
    public java.util.List<String> getIdentityIdsToDelete() {
        return identityIdsToDelete;
    }

    /**
     * <p>
     * A list of 1-60 identities that you want to delete.
     * </p>
     *
     * @param identityIdsToDelete <p>
     *            A list of 1-60 identities that you want to delete.
     *            </p>
     */
    public void setIdentityIdsToDelete(java.util.Collection<String> identityIdsToDelete) {
        if (identityIdsToDelete == null) {
            this.identityIdsToDelete = null;
            return;
        }

        this.identityIdsToDelete = new java.util.ArrayList<String>(identityIdsToDelete);
    }

    /**
     * <p>
     * A list of 1-60 identities that you want to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityIdsToDelete <p>
     *            A list of 1-60 identities that you want to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteIdentitiesRequest withIdentityIdsToDelete(String... identityIdsToDelete) {
        if (getIdentityIdsToDelete() == null) {
            this.identityIdsToDelete = new java.util.ArrayList<String>(identityIdsToDelete.length);
        }
        for (String value : identityIdsToDelete) {
            this.identityIdsToDelete.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of 1-60 identities that you want to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityIdsToDelete <p>
     *            A list of 1-60 identities that you want to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteIdentitiesRequest withIdentityIdsToDelete(
            java.util.Collection<String> identityIdsToDelete) {
        setIdentityIdsToDelete(identityIdsToDelete);
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
        if (getIdentityIdsToDelete() != null)
            sb.append("IdentityIdsToDelete: " + getIdentityIdsToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIdentityIdsToDelete() == null) ? 0 : getIdentityIdsToDelete().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIdentitiesRequest == false)
            return false;
        DeleteIdentitiesRequest other = (DeleteIdentitiesRequest) obj;

        if (other.getIdentityIdsToDelete() == null ^ this.getIdentityIdsToDelete() == null)
            return false;
        if (other.getIdentityIdsToDelete() != null
                && other.getIdentityIdsToDelete().equals(this.getIdentityIdsToDelete()) == false)
            return false;
        return true;
    }
}
