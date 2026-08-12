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

/**
 * <p>
 * Request for which contact was successfully created.
 * </p>
 */
public class SuccessfulRequest implements Serializable {
    /**
     * <p>
     * Request identifier provided in the API call in the ContactDataRequest to
     * create a contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 80<br/>
     */
    private String requestIdentifier;

    /**
     * <p>
     * The contactId of the contact that was created successfully.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String contactId;

    /**
     * <p>
     * Request identifier provided in the API call in the ContactDataRequest to
     * create a contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 80<br/>
     *
     * @return <p>
     *         Request identifier provided in the API call in the
     *         ContactDataRequest to create a contact.
     *         </p>
     */
    public String getRequestIdentifier() {
        return requestIdentifier;
    }

    /**
     * <p>
     * Request identifier provided in the API call in the ContactDataRequest to
     * create a contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 80<br/>
     *
     * @param requestIdentifier <p>
     *            Request identifier provided in the API call in the
     *            ContactDataRequest to create a contact.
     *            </p>
     */
    public void setRequestIdentifier(String requestIdentifier) {
        this.requestIdentifier = requestIdentifier;
    }

    /**
     * <p>
     * Request identifier provided in the API call in the ContactDataRequest to
     * create a contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 80<br/>
     *
     * @param requestIdentifier <p>
     *            Request identifier provided in the API call in the
     *            ContactDataRequest to create a contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SuccessfulRequest withRequestIdentifier(String requestIdentifier) {
        this.requestIdentifier = requestIdentifier;
        return this;
    }

    /**
     * <p>
     * The contactId of the contact that was created successfully.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The contactId of the contact that was created successfully.
     *         </p>
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * <p>
     * The contactId of the contact that was created successfully.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The contactId of the contact that was created successfully.
     *            </p>
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The contactId of the contact that was created successfully.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The contactId of the contact that was created successfully.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SuccessfulRequest withContactId(String contactId) {
        this.contactId = contactId;
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
        if (getRequestIdentifier() != null)
            sb.append("RequestIdentifier: " + getRequestIdentifier() + ",");
        if (getContactId() != null)
            sb.append("ContactId: " + getContactId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRequestIdentifier() == null) ? 0 : getRequestIdentifier().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuccessfulRequest == false)
            return false;
        SuccessfulRequest other = (SuccessfulRequest) obj;

        if (other.getRequestIdentifier() == null ^ this.getRequestIdentifier() == null)
            return false;
        if (other.getRequestIdentifier() != null
                && other.getRequestIdentifier().equals(this.getRequestIdentifier()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null
                && other.getContactId().equals(this.getContactId()) == false)
            return false;
        return true;
    }
}
