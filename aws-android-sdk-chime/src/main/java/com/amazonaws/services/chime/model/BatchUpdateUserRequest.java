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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates user details within the <a>UpdateUserRequestItem</a> object for up to
 * 20 users for the specified Amazon Chime account. Currently, only
 * <code>LicenseType</code> updates are supported for this action.
 * </p>
 */
public class BatchUpdateUserRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String accountId;

    /**
     * <p>
     * The request containing the user IDs and details to update.
     * </p>
     */
    private java.util.List<UpdateUserRequestItem> updateUserRequestItems;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Chime account ID.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateUserRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The request containing the user IDs and details to update.
     * </p>
     *
     * @return <p>
     *         The request containing the user IDs and details to update.
     *         </p>
     */
    public java.util.List<UpdateUserRequestItem> getUpdateUserRequestItems() {
        return updateUserRequestItems;
    }

    /**
     * <p>
     * The request containing the user IDs and details to update.
     * </p>
     *
     * @param updateUserRequestItems <p>
     *            The request containing the user IDs and details to update.
     *            </p>
     */
    public void setUpdateUserRequestItems(
            java.util.Collection<UpdateUserRequestItem> updateUserRequestItems) {
        if (updateUserRequestItems == null) {
            this.updateUserRequestItems = null;
            return;
        }

        this.updateUserRequestItems = new java.util.ArrayList<UpdateUserRequestItem>(
                updateUserRequestItems);
    }

    /**
     * <p>
     * The request containing the user IDs and details to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateUserRequestItems <p>
     *            The request containing the user IDs and details to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateUserRequest withUpdateUserRequestItems(
            UpdateUserRequestItem... updateUserRequestItems) {
        if (getUpdateUserRequestItems() == null) {
            this.updateUserRequestItems = new java.util.ArrayList<UpdateUserRequestItem>(
                    updateUserRequestItems.length);
        }
        for (UpdateUserRequestItem value : updateUserRequestItems) {
            this.updateUserRequestItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The request containing the user IDs and details to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateUserRequestItems <p>
     *            The request containing the user IDs and details to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateUserRequest withUpdateUserRequestItems(
            java.util.Collection<UpdateUserRequestItem> updateUserRequestItems) {
        setUpdateUserRequestItems(updateUserRequestItems);
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getUpdateUserRequestItems() != null)
            sb.append("UpdateUserRequestItems: " + getUpdateUserRequestItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime
                * hashCode
                + ((getUpdateUserRequestItems() == null) ? 0 : getUpdateUserRequestItems()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateUserRequest == false)
            return false;
        BatchUpdateUserRequest other = (BatchUpdateUserRequest) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getUpdateUserRequestItems() == null ^ this.getUpdateUserRequestItems() == null)
            return false;
        if (other.getUpdateUserRequestItems() != null
                && other.getUpdateUserRequestItems().equals(this.getUpdateUserRequestItems()) == false)
            return false;
        return true;
    }
}
