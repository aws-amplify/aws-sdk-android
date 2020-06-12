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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes stored utterances.
 * </p>
 * <p>
 * Amazon Lex stores the utterances that users send to your bot. Utterances are
 * stored for 15 days for use with the <a>GetUtterancesView</a> operation, and
 * then stored indefinitely for use in improving the ability of your bot to
 * respond to user input.
 * </p>
 * <p>
 * Use the <code>DeleteUtterances</code> operation to manually delete stored
 * utterances for a specific user. When you use the
 * <code>DeleteUtterances</code> operation, utterances stored for improving your
 * bot's ability to respond to user input are deleted immediately. Utterances
 * stored for use with the <code>GetUtterancesView</code> operation are deleted
 * after 15 days.
 * </p>
 * <p>
 * This operation requires permissions for the <code>lex:DeleteUtterances</code>
 * action.
 * </p>
 */
public class DeleteUtterancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bot that stored the utterances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String botName;

    /**
     * <p>
     * The unique identifier for the user that made the utterances. This is the
     * user ID that was sent in the <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html"
     * >PostContent</a> or <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html"
     * >PostText</a> operation request that contained the utterance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     */
    private String userId;

    /**
     * <p>
     * The name of the bot that stored the utterances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the bot that stored the utterances.
     *         </p>
     */
    public String getBotName() {
        return botName;
    }

    /**
     * <p>
     * The name of the bot that stored the utterances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param botName <p>
     *            The name of the bot that stored the utterances.
     *            </p>
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot that stored the utterances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param botName <p>
     *            The name of the bot that stored the utterances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteUtterancesRequest withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the user that made the utterances. This is the
     * user ID that was sent in the <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html"
     * >PostContent</a> or <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html"
     * >PostText</a> operation request that contained the utterance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     *
     * @return <p>
     *         The unique identifier for the user that made the utterances. This
     *         is the user ID that was sent in the <a href=
     *         "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html"
     *         >PostContent</a> or <a href=
     *         "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html"
     *         >PostText</a> operation request that contained the utterance.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The unique identifier for the user that made the utterances. This is the
     * user ID that was sent in the <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html"
     * >PostContent</a> or <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html"
     * >PostText</a> operation request that contained the utterance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     *
     * @param userId <p>
     *            The unique identifier for the user that made the utterances.
     *            This is the user ID that was sent in the <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html"
     *            >PostContent</a> or <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html"
     *            >PostText</a> operation request that contained the utterance.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The unique identifier for the user that made the utterances. This is the
     * user ID that was sent in the <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html"
     * >PostContent</a> or <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html"
     * >PostText</a> operation request that contained the utterance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     *
     * @param userId <p>
     *            The unique identifier for the user that made the utterances.
     *            This is the user ID that was sent in the <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html"
     *            >PostContent</a> or <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html"
     *            >PostText</a> operation request that contained the utterance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteUtterancesRequest withUserId(String userId) {
        this.userId = userId;
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
        if (getUserId() != null)
            sb.append("userId: " + getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteUtterancesRequest == false)
            return false;
        DeleteUtterancesRequest other = (DeleteUtterancesRequest) obj;

        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }
}
