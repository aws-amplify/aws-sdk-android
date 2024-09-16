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

public class SendChatIntegrationEventResult implements Serializable {
    /**
     * <p>
     * Identifier of chat contact used to handle integration event. This may be
     * null if the integration event is not valid without an already existing
     * chat contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String initialContactId;

    /**
     * <p>
     * Whether handling the integration event resulted in creating a new chat or
     * acting on existing chat.
     * </p>
     */
    private Boolean newChatCreated;

    /**
     * <p>
     * Identifier of chat contact used to handle integration event. This may be
     * null if the integration event is not valid without an already existing
     * chat contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         Identifier of chat contact used to handle integration event. This
     *         may be null if the integration event is not valid without an
     *         already existing chat contact.
     *         </p>
     */
    public String getInitialContactId() {
        return initialContactId;
    }

    /**
     * <p>
     * Identifier of chat contact used to handle integration event. This may be
     * null if the integration event is not valid without an already existing
     * chat contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param initialContactId <p>
     *            Identifier of chat contact used to handle integration event.
     *            This may be null if the integration event is not valid without
     *            an already existing chat contact.
     *            </p>
     */
    public void setInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
    }

    /**
     * <p>
     * Identifier of chat contact used to handle integration event. This may be
     * null if the integration event is not valid without an already existing
     * chat contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param initialContactId <p>
     *            Identifier of chat contact used to handle integration event.
     *            This may be null if the integration event is not valid without
     *            an already existing chat contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChatIntegrationEventResult withInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
        return this;
    }

    /**
     * <p>
     * Whether handling the integration event resulted in creating a new chat or
     * acting on existing chat.
     * </p>
     *
     * @return <p>
     *         Whether handling the integration event resulted in creating a new
     *         chat or acting on existing chat.
     *         </p>
     */
    public Boolean isNewChatCreated() {
        return newChatCreated;
    }

    /**
     * <p>
     * Whether handling the integration event resulted in creating a new chat or
     * acting on existing chat.
     * </p>
     *
     * @return <p>
     *         Whether handling the integration event resulted in creating a new
     *         chat or acting on existing chat.
     *         </p>
     */
    public Boolean getNewChatCreated() {
        return newChatCreated;
    }

    /**
     * <p>
     * Whether handling the integration event resulted in creating a new chat or
     * acting on existing chat.
     * </p>
     *
     * @param newChatCreated <p>
     *            Whether handling the integration event resulted in creating a
     *            new chat or acting on existing chat.
     *            </p>
     */
    public void setNewChatCreated(Boolean newChatCreated) {
        this.newChatCreated = newChatCreated;
    }

    /**
     * <p>
     * Whether handling the integration event resulted in creating a new chat or
     * acting on existing chat.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newChatCreated <p>
     *            Whether handling the integration event resulted in creating a
     *            new chat or acting on existing chat.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChatIntegrationEventResult withNewChatCreated(Boolean newChatCreated) {
        this.newChatCreated = newChatCreated;
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
        if (getInitialContactId() != null)
            sb.append("InitialContactId: " + getInitialContactId() + ",");
        if (getNewChatCreated() != null)
            sb.append("NewChatCreated: " + getNewChatCreated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInitialContactId() == null) ? 0 : getInitialContactId().hashCode());
        hashCode = prime * hashCode
                + ((getNewChatCreated() == null) ? 0 : getNewChatCreated().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendChatIntegrationEventResult == false)
            return false;
        SendChatIntegrationEventResult other = (SendChatIntegrationEventResult) obj;

        if (other.getInitialContactId() == null ^ this.getInitialContactId() == null)
            return false;
        if (other.getInitialContactId() != null
                && other.getInitialContactId().equals(this.getInitialContactId()) == false)
            return false;
        if (other.getNewChatCreated() == null ^ this.getNewChatCreated() == null)
            return false;
        if (other.getNewChatCreated() != null
                && other.getNewChatCreated().equals(this.getNewChatCreated()) == false)
            return false;
        return true;
    }
}
