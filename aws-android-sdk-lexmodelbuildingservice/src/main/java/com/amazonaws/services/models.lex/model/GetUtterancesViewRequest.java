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
 * Use the <code>GetUtterancesView</code> operation to get information about the
 * utterances that your users have made to your bot. You can use this list to
 * tune the utterances that your bot responds to.
 * </p>
 * <p>
 * For example, say that you have created a bot to order flowers. After your
 * users have used your bot for a while, use the <code>GetUtterancesView</code>
 * operation to see the requests that they have made and whether they have been
 * successful. You might find that the utterance "I want flowers" is not being
 * recognized. You could add this utterance to the <code>OrderFlowers</code>
 * intent so that your bot recognizes that utterance.
 * </p>
 * <p>
 * After you publish a new version of a bot, you can get information about the
 * old version and the new so that you can compare the performance across the
 * two versions.
 * </p>
 * <p>
 * Utterance statistics are generated once a day. Data is available for the last
 * 15 days. You can request information for up to 5 versions of your bot in each
 * request. Amazon Lex returns the most frequent utterances received by the bot
 * in the last 15 days. The response contains information about a maximum of 100
 * utterances for each version.
 * </p>
 * <p>
 * If you set <code>childDirected</code> field to true when you created your
 * bot, or if you opted out of participating in improving Amazon Lex, utterances
 * are not available.
 * </p>
 * <p>
 * This operation requires permissions for the
 * <code>lex:GetUtterancesView</code> action.
 * </p>
 */
public class GetUtterancesViewRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bot for which utterance information should be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String botName;

    /**
     * <p>
     * An array of bot versions for which utterance information should be
     * returned. The limit is 5 versions per request.
     * </p>
     */
    private java.util.List<String> botVersions;

    /**
     * <p>
     * To return utterances that were recognized and handled, use
     * <code>Detected</code>. To return utterances that were not recognized, use
     * <code>Missed</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Detected, Missed
     */
    private String statusType;

    /**
     * <p>
     * The name of the bot for which utterance information should be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the bot for which utterance information should be
     *         returned.
     *         </p>
     */
    public String getBotName() {
        return botName;
    }

    /**
     * <p>
     * The name of the bot for which utterance information should be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param botName <p>
     *            The name of the bot for which utterance information should be
     *            returned.
     *            </p>
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot for which utterance information should be returned.
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
     *            The name of the bot for which utterance information should be
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUtterancesViewRequest withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    /**
     * <p>
     * An array of bot versions for which utterance information should be
     * returned. The limit is 5 versions per request.
     * </p>
     *
     * @return <p>
     *         An array of bot versions for which utterance information should
     *         be returned. The limit is 5 versions per request.
     *         </p>
     */
    public java.util.List<String> getBotVersions() {
        return botVersions;
    }

    /**
     * <p>
     * An array of bot versions for which utterance information should be
     * returned. The limit is 5 versions per request.
     * </p>
     *
     * @param botVersions <p>
     *            An array of bot versions for which utterance information
     *            should be returned. The limit is 5 versions per request.
     *            </p>
     */
    public void setBotVersions(java.util.Collection<String> botVersions) {
        if (botVersions == null) {
            this.botVersions = null;
            return;
        }

        this.botVersions = new java.util.ArrayList<String>(botVersions);
    }

    /**
     * <p>
     * An array of bot versions for which utterance information should be
     * returned. The limit is 5 versions per request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botVersions <p>
     *            An array of bot versions for which utterance information
     *            should be returned. The limit is 5 versions per request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUtterancesViewRequest withBotVersions(String... botVersions) {
        if (getBotVersions() == null) {
            this.botVersions = new java.util.ArrayList<String>(botVersions.length);
        }
        for (String value : botVersions) {
            this.botVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of bot versions for which utterance information should be
     * returned. The limit is 5 versions per request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botVersions <p>
     *            An array of bot versions for which utterance information
     *            should be returned. The limit is 5 versions per request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUtterancesViewRequest withBotVersions(java.util.Collection<String> botVersions) {
        setBotVersions(botVersions);
        return this;
    }

    /**
     * <p>
     * To return utterances that were recognized and handled, use
     * <code>Detected</code>. To return utterances that were not recognized, use
     * <code>Missed</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Detected, Missed
     *
     * @return <p>
     *         To return utterances that were recognized and handled, use
     *         <code>Detected</code>. To return utterances that were not
     *         recognized, use <code>Missed</code>.
     *         </p>
     * @see StatusType
     */
    public String getStatusType() {
        return statusType;
    }

    /**
     * <p>
     * To return utterances that were recognized and handled, use
     * <code>Detected</code>. To return utterances that were not recognized, use
     * <code>Missed</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Detected, Missed
     *
     * @param statusType <p>
     *            To return utterances that were recognized and handled, use
     *            <code>Detected</code>. To return utterances that were not
     *            recognized, use <code>Missed</code>.
     *            </p>
     * @see StatusType
     */
    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    /**
     * <p>
     * To return utterances that were recognized and handled, use
     * <code>Detected</code>. To return utterances that were not recognized, use
     * <code>Missed</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Detected, Missed
     *
     * @param statusType <p>
     *            To return utterances that were recognized and handled, use
     *            <code>Detected</code>. To return utterances that were not
     *            recognized, use <code>Missed</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public GetUtterancesViewRequest withStatusType(String statusType) {
        this.statusType = statusType;
        return this;
    }

    /**
     * <p>
     * To return utterances that were recognized and handled, use
     * <code>Detected</code>. To return utterances that were not recognized, use
     * <code>Missed</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Detected, Missed
     *
     * @param statusType <p>
     *            To return utterances that were recognized and handled, use
     *            <code>Detected</code>. To return utterances that were not
     *            recognized, use <code>Missed</code>.
     *            </p>
     * @see StatusType
     */
    public void setStatusType(StatusType statusType) {
        this.statusType = statusType.toString();
    }

    /**
     * <p>
     * To return utterances that were recognized and handled, use
     * <code>Detected</code>. To return utterances that were not recognized, use
     * <code>Missed</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Detected, Missed
     *
     * @param statusType <p>
     *            To return utterances that were recognized and handled, use
     *            <code>Detected</code>. To return utterances that were not
     *            recognized, use <code>Missed</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public GetUtterancesViewRequest withStatusType(StatusType statusType) {
        this.statusType = statusType.toString();
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
        if (getBotVersions() != null)
            sb.append("botVersions: " + getBotVersions() + ",");
        if (getStatusType() != null)
            sb.append("statusType: " + getStatusType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode
                + ((getBotVersions() == null) ? 0 : getBotVersions().hashCode());
        hashCode = prime * hashCode + ((getStatusType() == null) ? 0 : getStatusType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUtterancesViewRequest == false)
            return false;
        GetUtterancesViewRequest other = (GetUtterancesViewRequest) obj;

        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getBotVersions() == null ^ this.getBotVersions() == null)
            return false;
        if (other.getBotVersions() != null
                && other.getBotVersions().equals(this.getBotVersions()) == false)
            return false;
        if (other.getStatusType() == null ^ this.getStatusType() == null)
            return false;
        if (other.getStatusType() != null
                && other.getStatusType().equals(this.getStatusType()) == false)
            return false;
        return true;
    }
}
