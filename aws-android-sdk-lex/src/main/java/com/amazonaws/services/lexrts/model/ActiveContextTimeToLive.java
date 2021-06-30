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

/**
 * <p>
 * The length of time or number of turns that a context remains active.
 * </p>
 */
public class ActiveContextTimeToLive implements Serializable {
    /**
     * <p>
     * The number of seconds that the context should be active after it is first
     * sent in a <code>PostContent</code> or <code>PostText</code> response. You
     * can set the value between 5 and 86,400 seconds (24 hours).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 86400<br/>
     */
    private Integer timeToLiveInSeconds;

    /**
     * <p>
     * The number of conversation turns that the context should be active. A
     * conversation turn is one <code>PostContent</code> or
     * <code>PostText</code> request and the corresponding response from Amazon
     * Lex.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     */
    private Integer turnsToLive;

    /**
     * <p>
     * The number of seconds that the context should be active after it is first
     * sent in a <code>PostContent</code> or <code>PostText</code> response. You
     * can set the value between 5 and 86,400 seconds (24 hours).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 86400<br/>
     *
     * @return <p>
     *         The number of seconds that the context should be active after it
     *         is first sent in a <code>PostContent</code> or
     *         <code>PostText</code> response. You can set the value between 5
     *         and 86,400 seconds (24 hours).
     *         </p>
     */
    public Integer getTimeToLiveInSeconds() {
        return timeToLiveInSeconds;
    }

    /**
     * <p>
     * The number of seconds that the context should be active after it is first
     * sent in a <code>PostContent</code> or <code>PostText</code> response. You
     * can set the value between 5 and 86,400 seconds (24 hours).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 86400<br/>
     *
     * @param timeToLiveInSeconds <p>
     *            The number of seconds that the context should be active after
     *            it is first sent in a <code>PostContent</code> or
     *            <code>PostText</code> response. You can set the value between
     *            5 and 86,400 seconds (24 hours).
     *            </p>
     */
    public void setTimeToLiveInSeconds(Integer timeToLiveInSeconds) {
        this.timeToLiveInSeconds = timeToLiveInSeconds;
    }

    /**
     * <p>
     * The number of seconds that the context should be active after it is first
     * sent in a <code>PostContent</code> or <code>PostText</code> response. You
     * can set the value between 5 and 86,400 seconds (24 hours).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 86400<br/>
     *
     * @param timeToLiveInSeconds <p>
     *            The number of seconds that the context should be active after
     *            it is first sent in a <code>PostContent</code> or
     *            <code>PostText</code> response. You can set the value between
     *            5 and 86,400 seconds (24 hours).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveContextTimeToLive withTimeToLiveInSeconds(Integer timeToLiveInSeconds) {
        this.timeToLiveInSeconds = timeToLiveInSeconds;
        return this;
    }

    /**
     * <p>
     * The number of conversation turns that the context should be active. A
     * conversation turn is one <code>PostContent</code> or
     * <code>PostText</code> request and the corresponding response from Amazon
     * Lex.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @return <p>
     *         The number of conversation turns that the context should be
     *         active. A conversation turn is one <code>PostContent</code> or
     *         <code>PostText</code> request and the corresponding response from
     *         Amazon Lex.
     *         </p>
     */
    public Integer getTurnsToLive() {
        return turnsToLive;
    }

    /**
     * <p>
     * The number of conversation turns that the context should be active. A
     * conversation turn is one <code>PostContent</code> or
     * <code>PostText</code> request and the corresponding response from Amazon
     * Lex.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param turnsToLive <p>
     *            The number of conversation turns that the context should be
     *            active. A conversation turn is one <code>PostContent</code> or
     *            <code>PostText</code> request and the corresponding response
     *            from Amazon Lex.
     *            </p>
     */
    public void setTurnsToLive(Integer turnsToLive) {
        this.turnsToLive = turnsToLive;
    }

    /**
     * <p>
     * The number of conversation turns that the context should be active. A
     * conversation turn is one <code>PostContent</code> or
     * <code>PostText</code> request and the corresponding response from Amazon
     * Lex.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param turnsToLive <p>
     *            The number of conversation turns that the context should be
     *            active. A conversation turn is one <code>PostContent</code> or
     *            <code>PostText</code> request and the corresponding response
     *            from Amazon Lex.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveContextTimeToLive withTurnsToLive(Integer turnsToLive) {
        this.turnsToLive = turnsToLive;
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
        if (getTimeToLiveInSeconds() != null)
            sb.append("timeToLiveInSeconds: " + getTimeToLiveInSeconds() + ",");
        if (getTurnsToLive() != null)
            sb.append("turnsToLive: " + getTurnsToLive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTimeToLiveInSeconds() == null) ? 0 : getTimeToLiveInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getTurnsToLive() == null) ? 0 : getTurnsToLive().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActiveContextTimeToLive == false)
            return false;
        ActiveContextTimeToLive other = (ActiveContextTimeToLive) obj;

        if (other.getTimeToLiveInSeconds() == null ^ this.getTimeToLiveInSeconds() == null)
            return false;
        if (other.getTimeToLiveInSeconds() != null
                && other.getTimeToLiveInSeconds().equals(this.getTimeToLiveInSeconds()) == false)
            return false;
        if (other.getTurnsToLive() == null ^ this.getTurnsToLive() == null)
            return false;
        if (other.getTurnsToLive() != null
                && other.getTurnsToLive().equals(this.getTurnsToLive()) == false)
            return false;
        return true;
    }
}
