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
 * Updates phone number product types or calling names. You can update one
 * attribute at a time for each <code>UpdatePhoneNumberRequestItem</code>. For
 * example, you can update either the product type or the calling name.
 * </p>
 * <p>
 * For product types, choose from Amazon Chime Business Calling and Amazon Chime
 * Voice Connector. For toll-free numbers, you must use the Amazon Chime Voice
 * Connector product type.
 * </p>
 * <p>
 * Updates to outbound calling names can take up to 72 hours to complete.
 * Pending updates to outbound calling names must be complete before you can
 * request another update.
 * </p>
 */
public class BatchUpdatePhoneNumberRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The request containing the phone number IDs and product types or calling
     * names to update.
     * </p>
     */
    private java.util.List<UpdatePhoneNumberRequestItem> updatePhoneNumberRequestItems;

    /**
     * <p>
     * The request containing the phone number IDs and product types or calling
     * names to update.
     * </p>
     *
     * @return <p>
     *         The request containing the phone number IDs and product types or
     *         calling names to update.
     *         </p>
     */
    public java.util.List<UpdatePhoneNumberRequestItem> getUpdatePhoneNumberRequestItems() {
        return updatePhoneNumberRequestItems;
    }

    /**
     * <p>
     * The request containing the phone number IDs and product types or calling
     * names to update.
     * </p>
     *
     * @param updatePhoneNumberRequestItems <p>
     *            The request containing the phone number IDs and product types
     *            or calling names to update.
     *            </p>
     */
    public void setUpdatePhoneNumberRequestItems(
            java.util.Collection<UpdatePhoneNumberRequestItem> updatePhoneNumberRequestItems) {
        if (updatePhoneNumberRequestItems == null) {
            this.updatePhoneNumberRequestItems = null;
            return;
        }

        this.updatePhoneNumberRequestItems = new java.util.ArrayList<UpdatePhoneNumberRequestItem>(
                updatePhoneNumberRequestItems);
    }

    /**
     * <p>
     * The request containing the phone number IDs and product types or calling
     * names to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatePhoneNumberRequestItems <p>
     *            The request containing the phone number IDs and product types
     *            or calling names to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdatePhoneNumberRequest withUpdatePhoneNumberRequestItems(
            UpdatePhoneNumberRequestItem... updatePhoneNumberRequestItems) {
        if (getUpdatePhoneNumberRequestItems() == null) {
            this.updatePhoneNumberRequestItems = new java.util.ArrayList<UpdatePhoneNumberRequestItem>(
                    updatePhoneNumberRequestItems.length);
        }
        for (UpdatePhoneNumberRequestItem value : updatePhoneNumberRequestItems) {
            this.updatePhoneNumberRequestItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The request containing the phone number IDs and product types or calling
     * names to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatePhoneNumberRequestItems <p>
     *            The request containing the phone number IDs and product types
     *            or calling names to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdatePhoneNumberRequest withUpdatePhoneNumberRequestItems(
            java.util.Collection<UpdatePhoneNumberRequestItem> updatePhoneNumberRequestItems) {
        setUpdatePhoneNumberRequestItems(updatePhoneNumberRequestItems);
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
        if (getUpdatePhoneNumberRequestItems() != null)
            sb.append("UpdatePhoneNumberRequestItems: " + getUpdatePhoneNumberRequestItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getUpdatePhoneNumberRequestItems() == null) ? 0
                        : getUpdatePhoneNumberRequestItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdatePhoneNumberRequest == false)
            return false;
        BatchUpdatePhoneNumberRequest other = (BatchUpdatePhoneNumberRequest) obj;

        if (other.getUpdatePhoneNumberRequestItems() == null
                ^ this.getUpdatePhoneNumberRequestItems() == null)
            return false;
        if (other.getUpdatePhoneNumberRequestItems() != null
                && other.getUpdatePhoneNumberRequestItems().equals(
                        this.getUpdatePhoneNumberRequestItems()) == false)
            return false;
        return true;
    }
}
