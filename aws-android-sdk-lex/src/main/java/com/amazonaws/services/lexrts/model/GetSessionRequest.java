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

package com.amazonaws.services.lexrts.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns session information for a specified bot, alias, and user ID.
 * </p>
 */
public class GetSessionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bot that contains the session data.
     * </p>
     */
    private String botName;

    /**
     * <p>
     * The alias in use for the bot that contains the session data.
     * </p>
     */
    private String botAlias;

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a
     * user's conversation with your bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     */
    private String userId;

    /**
     * <p>
     * A string used to filter the intents returned in the
     * <code>recentIntentSummaryView</code> structure.
     * </p>
     * <p>
     * When you specify a filter, only intents with their
     * <code>checkpointLabel</code> field set to that string are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     */
    private String checkpointLabelFilter;

    /**
     * <p>
     * The name of the bot that contains the session data.
     * </p>
     *
     * @return <p>
     *         The name of the bot that contains the session data.
     *         </p>
     */
    public String getBotName() {
        return botName;
    }

    /**
     * <p>
     * The name of the bot that contains the session data.
     * </p>
     *
     * @param botName <p>
     *            The name of the bot that contains the session data.
     *            </p>
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot that contains the session data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botName <p>
     *            The name of the bot that contains the session data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionRequest withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    /**
     * <p>
     * The alias in use for the bot that contains the session data.
     * </p>
     *
     * @return <p>
     *         The alias in use for the bot that contains the session data.
     *         </p>
     */
    public String getBotAlias() {
        return botAlias;
    }

    /**
     * <p>
     * The alias in use for the bot that contains the session data.
     * </p>
     *
     * @param botAlias <p>
     *            The alias in use for the bot that contains the session data.
     *            </p>
     */
    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * The alias in use for the bot that contains the session data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botAlias <p>
     *            The alias in use for the bot that contains the session data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionRequest withBotAlias(String botAlias) {
        this.botAlias = botAlias;
        return this;
    }

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a
     * user's conversation with your bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @return <p>
     *         The ID of the client application user. Amazon Lex uses this to
     *         identify a user's conversation with your bot.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a
     * user's conversation with your bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @param userId <p>
     *            The ID of the client application user. Amazon Lex uses this to
     *            identify a user's conversation with your bot.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a
     * user's conversation with your bot.
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
     *            The ID of the client application user. Amazon Lex uses this to
     *            identify a user's conversation with your bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * A string used to filter the intents returned in the
     * <code>recentIntentSummaryView</code> structure.
     * </p>
     * <p>
     * When you specify a filter, only intents with their
     * <code>checkpointLabel</code> field set to that string are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @return <p>
     *         A string used to filter the intents returned in the
     *         <code>recentIntentSummaryView</code> structure.
     *         </p>
     *         <p>
     *         When you specify a filter, only intents with their
     *         <code>checkpointLabel</code> field set to that string are
     *         returned.
     *         </p>
     */
    public String getCheckpointLabelFilter() {
        return checkpointLabelFilter;
    }

    /**
     * <p>
     * A string used to filter the intents returned in the
     * <code>recentIntentSummaryView</code> structure.
     * </p>
     * <p>
     * When you specify a filter, only intents with their
     * <code>checkpointLabel</code> field set to that string are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @param checkpointLabelFilter <p>
     *            A string used to filter the intents returned in the
     *            <code>recentIntentSummaryView</code> structure.
     *            </p>
     *            <p>
     *            When you specify a filter, only intents with their
     *            <code>checkpointLabel</code> field set to that string are
     *            returned.
     *            </p>
     */
    public void setCheckpointLabelFilter(String checkpointLabelFilter) {
        this.checkpointLabelFilter = checkpointLabelFilter;
    }

    /**
     * <p>
     * A string used to filter the intents returned in the
     * <code>recentIntentSummaryView</code> structure.
     * </p>
     * <p>
     * When you specify a filter, only intents with their
     * <code>checkpointLabel</code> field set to that string are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @param checkpointLabelFilter <p>
     *            A string used to filter the intents returned in the
     *            <code>recentIntentSummaryView</code> structure.
     *            </p>
     *            <p>
     *            When you specify a filter, only intents with their
     *            <code>checkpointLabel</code> field set to that string are
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionRequest withCheckpointLabelFilter(String checkpointLabelFilter) {
        this.checkpointLabelFilter = checkpointLabelFilter;
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
        if (getCheckpointLabelFilter() != null)
            sb.append("checkpointLabelFilter: " + getCheckpointLabelFilter());
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
        hashCode = prime
                * hashCode
                + ((getCheckpointLabelFilter() == null) ? 0 : getCheckpointLabelFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSessionRequest == false)
            return false;
        GetSessionRequest other = (GetSessionRequest) obj;

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
        if (other.getCheckpointLabelFilter() == null ^ this.getCheckpointLabelFilter() == null)
            return false;
        if (other.getCheckpointLabelFilter() != null
                && other.getCheckpointLabelFilter().equals(this.getCheckpointLabelFilter()) == false)
            return false;
        return true;
    }
}
