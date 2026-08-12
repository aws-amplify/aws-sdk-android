/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class CreatePersistentContactAssociationResult implements Serializable {
    /**
     * <p>
     * The contactId from which a persistent chat session is started. This field
     * is populated only for persistent chat.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String continuedFromContactId;

    /**
     * <p>
     * The contactId from which a persistent chat session is started. This field
     * is populated only for persistent chat.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The contactId from which a persistent chat session is started.
     *         This field is populated only for persistent chat.
     *         </p>
     */
    public String getContinuedFromContactId() {
        return continuedFromContactId;
    }

    /**
     * <p>
     * The contactId from which a persistent chat session is started. This field
     * is populated only for persistent chat.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param continuedFromContactId <p>
     *            The contactId from which a persistent chat session is started.
     *            This field is populated only for persistent chat.
     *            </p>
     */
    public void setContinuedFromContactId(String continuedFromContactId) {
        this.continuedFromContactId = continuedFromContactId;
    }

    /**
     * <p>
     * The contactId from which a persistent chat session is started. This field
     * is populated only for persistent chat.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param continuedFromContactId <p>
     *            The contactId from which a persistent chat session is started.
     *            This field is populated only for persistent chat.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePersistentContactAssociationResult withContinuedFromContactId(
            String continuedFromContactId) {
        this.continuedFromContactId = continuedFromContactId;
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
        if (getContinuedFromContactId() != null)
            sb.append("ContinuedFromContactId: " + getContinuedFromContactId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getContinuedFromContactId() == null) ? 0 : getContinuedFromContactId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePersistentContactAssociationResult == false)
            return false;
        CreatePersistentContactAssociationResult other = (CreatePersistentContactAssociationResult) obj;

        if (other.getContinuedFromContactId() == null ^ this.getContinuedFromContactId() == null)
            return false;
        if (other.getContinuedFromContactId() != null
                && other.getContinuedFromContactId().equals(this.getContinuedFromContactId()) == false)
            return false;
        return true;
    }
}
