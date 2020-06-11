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

public class GetUtterancesViewResult implements Serializable {
    /**
     * <p>
     * The name of the bot for which utterance information was returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String botName;

    /**
     * <p>
     * An array of <a>UtteranceList</a> objects, each containing a list of
     * <a>UtteranceData</a> objects describing the utterances that were
     * processed by your bot. The response contains a maximum of 100
     * <code>UtteranceData</code> objects for each version. Amazon Lex returns
     * the most frequent utterances received by the bot in the last 15 days.
     * </p>
     */
    private java.util.List<UtteranceList> utterances;

    /**
     * <p>
     * The name of the bot for which utterance information was returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the bot for which utterance information was returned.
     *         </p>
     */
    public String getBotName() {
        return botName;
    }

    /**
     * <p>
     * The name of the bot for which utterance information was returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param botName <p>
     *            The name of the bot for which utterance information was
     *            returned.
     *            </p>
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot for which utterance information was returned.
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
     *            The name of the bot for which utterance information was
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUtterancesViewResult withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    /**
     * <p>
     * An array of <a>UtteranceList</a> objects, each containing a list of
     * <a>UtteranceData</a> objects describing the utterances that were
     * processed by your bot. The response contains a maximum of 100
     * <code>UtteranceData</code> objects for each version. Amazon Lex returns
     * the most frequent utterances received by the bot in the last 15 days.
     * </p>
     *
     * @return <p>
     *         An array of <a>UtteranceList</a> objects, each containing a list
     *         of <a>UtteranceData</a> objects describing the utterances that
     *         were processed by your bot. The response contains a maximum of
     *         100 <code>UtteranceData</code> objects for each version. Amazon
     *         Lex returns the most frequent utterances received by the bot in
     *         the last 15 days.
     *         </p>
     */
    public java.util.List<UtteranceList> getUtterances() {
        return utterances;
    }

    /**
     * <p>
     * An array of <a>UtteranceList</a> objects, each containing a list of
     * <a>UtteranceData</a> objects describing the utterances that were
     * processed by your bot. The response contains a maximum of 100
     * <code>UtteranceData</code> objects for each version. Amazon Lex returns
     * the most frequent utterances received by the bot in the last 15 days.
     * </p>
     *
     * @param utterances <p>
     *            An array of <a>UtteranceList</a> objects, each containing a
     *            list of <a>UtteranceData</a> objects describing the utterances
     *            that were processed by your bot. The response contains a
     *            maximum of 100 <code>UtteranceData</code> objects for each
     *            version. Amazon Lex returns the most frequent utterances
     *            received by the bot in the last 15 days.
     *            </p>
     */
    public void setUtterances(java.util.Collection<UtteranceList> utterances) {
        if (utterances == null) {
            this.utterances = null;
            return;
        }

        this.utterances = new java.util.ArrayList<UtteranceList>(utterances);
    }

    /**
     * <p>
     * An array of <a>UtteranceList</a> objects, each containing a list of
     * <a>UtteranceData</a> objects describing the utterances that were
     * processed by your bot. The response contains a maximum of 100
     * <code>UtteranceData</code> objects for each version. Amazon Lex returns
     * the most frequent utterances received by the bot in the last 15 days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param utterances <p>
     *            An array of <a>UtteranceList</a> objects, each containing a
     *            list of <a>UtteranceData</a> objects describing the utterances
     *            that were processed by your bot. The response contains a
     *            maximum of 100 <code>UtteranceData</code> objects for each
     *            version. Amazon Lex returns the most frequent utterances
     *            received by the bot in the last 15 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUtterancesViewResult withUtterances(UtteranceList... utterances) {
        if (getUtterances() == null) {
            this.utterances = new java.util.ArrayList<UtteranceList>(utterances.length);
        }
        for (UtteranceList value : utterances) {
            this.utterances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>UtteranceList</a> objects, each containing a list of
     * <a>UtteranceData</a> objects describing the utterances that were
     * processed by your bot. The response contains a maximum of 100
     * <code>UtteranceData</code> objects for each version. Amazon Lex returns
     * the most frequent utterances received by the bot in the last 15 days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param utterances <p>
     *            An array of <a>UtteranceList</a> objects, each containing a
     *            list of <a>UtteranceData</a> objects describing the utterances
     *            that were processed by your bot. The response contains a
     *            maximum of 100 <code>UtteranceData</code> objects for each
     *            version. Amazon Lex returns the most frequent utterances
     *            received by the bot in the last 15 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUtterancesViewResult withUtterances(java.util.Collection<UtteranceList> utterances) {
        setUtterances(utterances);
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
        if (getUtterances() != null)
            sb.append("utterances: " + getUtterances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getUtterances() == null) ? 0 : getUtterances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUtterancesViewResult == false)
            return false;
        GetUtterancesViewResult other = (GetUtterancesViewResult) obj;

        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getUtterances() == null ^ this.getUtterances() == null)
            return false;
        if (other.getUtterances() != null
                && other.getUtterances().equals(this.getUtterances()) == false)
            return false;
        return true;
    }
}
