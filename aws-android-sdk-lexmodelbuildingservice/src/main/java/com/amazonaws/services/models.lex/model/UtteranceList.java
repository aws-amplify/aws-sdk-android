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

/**
 * <p>
 * Provides a list of utterances that have been made to a specific version of
 * your bot. The list contains a maximum of 100 utterances.
 * </p>
 */
public class UtteranceList implements Serializable {
    /**
     * <p>
     * The version of the bot that processed the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     */
    private String botVersion;

    /**
     * <p>
     * One or more <a>UtteranceData</a> objects that contain information about
     * the utterances that have been made to a bot. The maximum number of object
     * is 100.
     * </p>
     */
    private java.util.List<UtteranceData> utterances;

    /**
     * <p>
     * The version of the bot that processed the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @return <p>
     *         The version of the bot that processed the list.
     *         </p>
     */
    public String getBotVersion() {
        return botVersion;
    }

    /**
     * <p>
     * The version of the bot that processed the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @param botVersion <p>
     *            The version of the bot that processed the list.
     *            </p>
     */
    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that processed the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @param botVersion <p>
     *            The version of the bot that processed the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UtteranceList withBotVersion(String botVersion) {
        this.botVersion = botVersion;
        return this;
    }

    /**
     * <p>
     * One or more <a>UtteranceData</a> objects that contain information about
     * the utterances that have been made to a bot. The maximum number of object
     * is 100.
     * </p>
     *
     * @return <p>
     *         One or more <a>UtteranceData</a> objects that contain information
     *         about the utterances that have been made to a bot. The maximum
     *         number of object is 100.
     *         </p>
     */
    public java.util.List<UtteranceData> getUtterances() {
        return utterances;
    }

    /**
     * <p>
     * One or more <a>UtteranceData</a> objects that contain information about
     * the utterances that have been made to a bot. The maximum number of object
     * is 100.
     * </p>
     *
     * @param utterances <p>
     *            One or more <a>UtteranceData</a> objects that contain
     *            information about the utterances that have been made to a bot.
     *            The maximum number of object is 100.
     *            </p>
     */
    public void setUtterances(java.util.Collection<UtteranceData> utterances) {
        if (utterances == null) {
            this.utterances = null;
            return;
        }

        this.utterances = new java.util.ArrayList<UtteranceData>(utterances);
    }

    /**
     * <p>
     * One or more <a>UtteranceData</a> objects that contain information about
     * the utterances that have been made to a bot. The maximum number of object
     * is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param utterances <p>
     *            One or more <a>UtteranceData</a> objects that contain
     *            information about the utterances that have been made to a bot.
     *            The maximum number of object is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UtteranceList withUtterances(UtteranceData... utterances) {
        if (getUtterances() == null) {
            this.utterances = new java.util.ArrayList<UtteranceData>(utterances.length);
        }
        for (UtteranceData value : utterances) {
            this.utterances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more <a>UtteranceData</a> objects that contain information about
     * the utterances that have been made to a bot. The maximum number of object
     * is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param utterances <p>
     *            One or more <a>UtteranceData</a> objects that contain
     *            information about the utterances that have been made to a bot.
     *            The maximum number of object is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UtteranceList withUtterances(java.util.Collection<UtteranceData> utterances) {
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
        if (getBotVersion() != null)
            sb.append("botVersion: " + getBotVersion() + ",");
        if (getUtterances() != null)
            sb.append("utterances: " + getUtterances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getUtterances() == null) ? 0 : getUtterances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UtteranceList == false)
            return false;
        UtteranceList other = (UtteranceList) obj;

        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null
                && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getUtterances() == null ^ this.getUtterances() == null)
            return false;
        if (other.getUtterances() != null
                && other.getUtterances().equals(this.getUtterances()) == false)
            return false;
        return true;
    }
}
