/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Enable persistent chats. For more information about enabling persistent chat,
 * and for example use cases and how to configure for them, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html"
 * >Enable persistent chat</a>.
 * </p>
 */
public class PersistentChat implements Serializable {
    /**
     * <p>
     * The contactId that is used for rehydration depends on the rehydration
     * type. RehydrationType is required for persistent chat.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most
     * recently terminated past chat contact of the specified past ended chat
     * session. To use this type, provide the <code>initialContactId</code> of
     * the past ended chat session in the <code>sourceContactId</code> field. In
     * this type, Amazon Connect determines the most recent chat contact on the
     * specified chat session that has ended, and uses it to start a persistent
     * chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact
     * that is specified in the <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of
     * this API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENTIRE_PAST_SESSION, FROM_SEGMENT
     */
    private String rehydrationType;

    /**
     * <p>
     * The contactId from which a persistent chat session must be started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String sourceContactId;

    /**
     * <p>
     * The contactId that is used for rehydration depends on the rehydration
     * type. RehydrationType is required for persistent chat.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most
     * recently terminated past chat contact of the specified past ended chat
     * session. To use this type, provide the <code>initialContactId</code> of
     * the past ended chat session in the <code>sourceContactId</code> field. In
     * this type, Amazon Connect determines the most recent chat contact on the
     * specified chat session that has ended, and uses it to start a persistent
     * chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact
     * that is specified in the <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of
     * this API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENTIRE_PAST_SESSION, FROM_SEGMENT
     *
     * @return <p>
     *         The contactId that is used for rehydration depends on the
     *         rehydration type. RehydrationType is required for persistent
     *         chat.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most
     *         recently terminated past chat contact of the specified past ended
     *         chat session. To use this type, provide the
     *         <code>initialContactId</code> of the past ended chat session in
     *         the <code>sourceContactId</code> field. In this type, Amazon
     *         Connect determines the most recent chat contact on the specified
     *         chat session that has ended, and uses it to start a persistent
     *         chat.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat
     *         contact that is specified in the <code>sourceContactId</code>
     *         field.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The actual contactId used for rehydration is provided in the
     *         response of this API.
     *         </p>
     * @see RehydrationType
     */
    public String getRehydrationType() {
        return rehydrationType;
    }

    /**
     * <p>
     * The contactId that is used for rehydration depends on the rehydration
     * type. RehydrationType is required for persistent chat.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most
     * recently terminated past chat contact of the specified past ended chat
     * session. To use this type, provide the <code>initialContactId</code> of
     * the past ended chat session in the <code>sourceContactId</code> field. In
     * this type, Amazon Connect determines the most recent chat contact on the
     * specified chat session that has ended, and uses it to start a persistent
     * chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact
     * that is specified in the <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of
     * this API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENTIRE_PAST_SESSION, FROM_SEGMENT
     *
     * @param rehydrationType <p>
     *            The contactId that is used for rehydration depends on the
     *            rehydration type. RehydrationType is required for persistent
     *            chat.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the
     *            most recently terminated past chat contact of the specified
     *            past ended chat session. To use this type, provide the
     *            <code>initialContactId</code> of the past ended chat session
     *            in the <code>sourceContactId</code> field. In this type,
     *            Amazon Connect determines the most recent chat contact on the
     *            specified chat session that has ended, and uses it to start a
     *            persistent chat.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FROM_SEGMENT</code>: Rehydrates a chat from the past
     *            chat contact that is specified in the
     *            <code>sourceContactId</code> field.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The actual contactId used for rehydration is provided in the
     *            response of this API.
     *            </p>
     * @see RehydrationType
     */
    public void setRehydrationType(String rehydrationType) {
        this.rehydrationType = rehydrationType;
    }

    /**
     * <p>
     * The contactId that is used for rehydration depends on the rehydration
     * type. RehydrationType is required for persistent chat.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most
     * recently terminated past chat contact of the specified past ended chat
     * session. To use this type, provide the <code>initialContactId</code> of
     * the past ended chat session in the <code>sourceContactId</code> field. In
     * this type, Amazon Connect determines the most recent chat contact on the
     * specified chat session that has ended, and uses it to start a persistent
     * chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact
     * that is specified in the <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of
     * this API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENTIRE_PAST_SESSION, FROM_SEGMENT
     *
     * @param rehydrationType <p>
     *            The contactId that is used for rehydration depends on the
     *            rehydration type. RehydrationType is required for persistent
     *            chat.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the
     *            most recently terminated past chat contact of the specified
     *            past ended chat session. To use this type, provide the
     *            <code>initialContactId</code> of the past ended chat session
     *            in the <code>sourceContactId</code> field. In this type,
     *            Amazon Connect determines the most recent chat contact on the
     *            specified chat session that has ended, and uses it to start a
     *            persistent chat.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FROM_SEGMENT</code>: Rehydrates a chat from the past
     *            chat contact that is specified in the
     *            <code>sourceContactId</code> field.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The actual contactId used for rehydration is provided in the
     *            response of this API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RehydrationType
     */
    public PersistentChat withRehydrationType(String rehydrationType) {
        this.rehydrationType = rehydrationType;
        return this;
    }

    /**
     * <p>
     * The contactId that is used for rehydration depends on the rehydration
     * type. RehydrationType is required for persistent chat.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most
     * recently terminated past chat contact of the specified past ended chat
     * session. To use this type, provide the <code>initialContactId</code> of
     * the past ended chat session in the <code>sourceContactId</code> field. In
     * this type, Amazon Connect determines the most recent chat contact on the
     * specified chat session that has ended, and uses it to start a persistent
     * chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact
     * that is specified in the <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of
     * this API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENTIRE_PAST_SESSION, FROM_SEGMENT
     *
     * @param rehydrationType <p>
     *            The contactId that is used for rehydration depends on the
     *            rehydration type. RehydrationType is required for persistent
     *            chat.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the
     *            most recently terminated past chat contact of the specified
     *            past ended chat session. To use this type, provide the
     *            <code>initialContactId</code> of the past ended chat session
     *            in the <code>sourceContactId</code> field. In this type,
     *            Amazon Connect determines the most recent chat contact on the
     *            specified chat session that has ended, and uses it to start a
     *            persistent chat.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FROM_SEGMENT</code>: Rehydrates a chat from the past
     *            chat contact that is specified in the
     *            <code>sourceContactId</code> field.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The actual contactId used for rehydration is provided in the
     *            response of this API.
     *            </p>
     * @see RehydrationType
     */
    public void setRehydrationType(RehydrationType rehydrationType) {
        this.rehydrationType = rehydrationType.toString();
    }

    /**
     * <p>
     * The contactId that is used for rehydration depends on the rehydration
     * type. RehydrationType is required for persistent chat.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most
     * recently terminated past chat contact of the specified past ended chat
     * session. To use this type, provide the <code>initialContactId</code> of
     * the past ended chat session in the <code>sourceContactId</code> field. In
     * this type, Amazon Connect determines the most recent chat contact on the
     * specified chat session that has ended, and uses it to start a persistent
     * chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact
     * that is specified in the <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of
     * this API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENTIRE_PAST_SESSION, FROM_SEGMENT
     *
     * @param rehydrationType <p>
     *            The contactId that is used for rehydration depends on the
     *            rehydration type. RehydrationType is required for persistent
     *            chat.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the
     *            most recently terminated past chat contact of the specified
     *            past ended chat session. To use this type, provide the
     *            <code>initialContactId</code> of the past ended chat session
     *            in the <code>sourceContactId</code> field. In this type,
     *            Amazon Connect determines the most recent chat contact on the
     *            specified chat session that has ended, and uses it to start a
     *            persistent chat.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FROM_SEGMENT</code>: Rehydrates a chat from the past
     *            chat contact that is specified in the
     *            <code>sourceContactId</code> field.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The actual contactId used for rehydration is provided in the
     *            response of this API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RehydrationType
     */
    public PersistentChat withRehydrationType(RehydrationType rehydrationType) {
        this.rehydrationType = rehydrationType.toString();
        return this;
    }

    /**
     * <p>
     * The contactId from which a persistent chat session must be started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The contactId from which a persistent chat session must be
     *         started.
     *         </p>
     */
    public String getSourceContactId() {
        return sourceContactId;
    }

    /**
     * <p>
     * The contactId from which a persistent chat session must be started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param sourceContactId <p>
     *            The contactId from which a persistent chat session must be
     *            started.
     *            </p>
     */
    public void setSourceContactId(String sourceContactId) {
        this.sourceContactId = sourceContactId;
    }

    /**
     * <p>
     * The contactId from which a persistent chat session must be started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param sourceContactId <p>
     *            The contactId from which a persistent chat session must be
     *            started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PersistentChat withSourceContactId(String sourceContactId) {
        this.sourceContactId = sourceContactId;
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
        if (getRehydrationType() != null)
            sb.append("RehydrationType: " + getRehydrationType() + ",");
        if (getSourceContactId() != null)
            sb.append("SourceContactId: " + getSourceContactId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRehydrationType() == null) ? 0 : getRehydrationType().hashCode());
        hashCode = prime * hashCode
                + ((getSourceContactId() == null) ? 0 : getSourceContactId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PersistentChat == false)
            return false;
        PersistentChat other = (PersistentChat) obj;

        if (other.getRehydrationType() == null ^ this.getRehydrationType() == null)
            return false;
        if (other.getRehydrationType() != null
                && other.getRehydrationType().equals(this.getRehydrationType()) == false)
            return false;
        if (other.getSourceContactId() == null ^ this.getSourceContactId() == null)
            return false;
        if (other.getSourceContactId() != null
                && other.getSourceContactId().equals(this.getSourceContactId()) == false)
            return false;
        return true;
    }
}
