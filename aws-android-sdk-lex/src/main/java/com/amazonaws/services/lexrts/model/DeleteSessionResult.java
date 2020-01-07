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

package com.amazonaws.services.lexrts.model;

import java.io.Serializable;

public class DeleteSessionResult implements Serializable {
    /**
     * <p>
     * The name of the bot associated with the session data.
     * </p>
     */
    private String botName;

    /**
     * <p>
     * The alias in use for the bot associated with the session data.
     * </p>
     */
    private String botAlias;

    /**
     * <p>
     * The ID of the client application user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     */
    private String userId;

    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     */
    private String sessionId;

    /**
     * <p>
     * The name of the bot associated with the session data.
     * </p>
     *
     * @return <p>
     *         The name of the bot associated with the session data.
     *         </p>
     */
    public String getBotName() {
        return botName;
    }

    /**
     * <p>
     * The name of the bot associated with the session data.
     * </p>
     *
     * @param botName <p>
     *            The name of the bot associated with the session data.
     *            </p>
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot associated with the session data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botName <p>
     *            The name of the bot associated with the session data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteSessionResult withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    /**
     * <p>
     * The alias in use for the bot associated with the session data.
     * </p>
     *
     * @return <p>
     *         The alias in use for the bot associated with the session data.
     *         </p>
     */
    public String getBotAlias() {
        return botAlias;
    }

    /**
     * <p>
     * The alias in use for the bot associated with the session data.
     * </p>
     *
     * @param botAlias <p>
     *            The alias in use for the bot associated with the session data.
     *            </p>
     */
    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * The alias in use for the bot associated with the session data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botAlias <p>
     *            The alias in use for the bot associated with the session data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteSessionResult withBotAlias(String botAlias) {
        this.botAlias = botAlias;
        return this;
    }

    /**
     * <p>
     * The ID of the client application user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @return <p>
     *         The ID of the client application user.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The ID of the client application user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @param userId <p>
     *            The ID of the client application user.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of the client application user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @param userId <p>
     *            The ID of the client application user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteSessionResult withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the session.
     *         </p>
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     *
     * @param sessionId <p>
     *            The unique identifier for the session.
     *            </p>
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionId <p>
     *            The unique identifier for the session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteSessionResult withSessionId(String sessionId) {
        this.sessionId = sessionId;
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
        if (getBotName() != null)
            sb.append("botName: " + getBotName() + ",");
        if (getBotAlias() != null)
            sb.append("botAlias: " + getBotAlias() + ",");
        if (getUserId() != null)
            sb.append("userId: " + getUserId() + ",");
        if (getSessionId() != null)
            sb.append("sessionId: " + getSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getBotAlias() == null) ? 0 : getBotAlias().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSessionResult == false)
            return false;
        DeleteSessionResult other = (DeleteSessionResult) obj;

        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getBotAlias() == null ^ this.getBotAlias() == null)
            return false;
        if (other.getBotAlias() != null && other.getBotAlias().equals(this.getBotAlias()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null
                && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        return true;
    }
}
