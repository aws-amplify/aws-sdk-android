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
 * Provides information about a single utterance that was made to your bot.
 * </p>
 */
public class UtteranceData implements Serializable {
    /**
     * <p>
     * The text that was entered by the user or the text representation of an
     * audio clip.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String utteranceString;

    /**
     * <p>
     * The number of times that the utterance was processed.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The total number of individuals that used the utterance.
     * </p>
     */
    private Integer distinctUsers;

    /**
     * <p>
     * The date that the utterance was first recorded.
     * </p>
     */
    private java.util.Date firstUtteredDate;

    /**
     * <p>
     * The date that the utterance was last recorded.
     * </p>
     */
    private java.util.Date lastUtteredDate;

    /**
     * <p>
     * The text that was entered by the user or the text representation of an
     * audio clip.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         The text that was entered by the user or the text representation
     *         of an audio clip.
     *         </p>
     */
    public String getUtteranceString() {
        return utteranceString;
    }

    /**
     * <p>
     * The text that was entered by the user or the text representation of an
     * audio clip.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param utteranceString <p>
     *            The text that was entered by the user or the text
     *            representation of an audio clip.
     *            </p>
     */
    public void setUtteranceString(String utteranceString) {
        this.utteranceString = utteranceString;
    }

    /**
     * <p>
     * The text that was entered by the user or the text representation of an
     * audio clip.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param utteranceString <p>
     *            The text that was entered by the user or the text
     *            representation of an audio clip.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UtteranceData withUtteranceString(String utteranceString) {
        this.utteranceString = utteranceString;
        return this;
    }

    /**
     * <p>
     * The number of times that the utterance was processed.
     * </p>
     *
     * @return <p>
     *         The number of times that the utterance was processed.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The number of times that the utterance was processed.
     * </p>
     *
     * @param count <p>
     *            The number of times that the utterance was processed.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of times that the utterance was processed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The number of times that the utterance was processed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UtteranceData withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * The total number of individuals that used the utterance.
     * </p>
     *
     * @return <p>
     *         The total number of individuals that used the utterance.
     *         </p>
     */
    public Integer getDistinctUsers() {
        return distinctUsers;
    }

    /**
     * <p>
     * The total number of individuals that used the utterance.
     * </p>
     *
     * @param distinctUsers <p>
     *            The total number of individuals that used the utterance.
     *            </p>
     */
    public void setDistinctUsers(Integer distinctUsers) {
        this.distinctUsers = distinctUsers;
    }

    /**
     * <p>
     * The total number of individuals that used the utterance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distinctUsers <p>
     *            The total number of individuals that used the utterance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UtteranceData withDistinctUsers(Integer distinctUsers) {
        this.distinctUsers = distinctUsers;
        return this;
    }

    /**
     * <p>
     * The date that the utterance was first recorded.
     * </p>
     *
     * @return <p>
     *         The date that the utterance was first recorded.
     *         </p>
     */
    public java.util.Date getFirstUtteredDate() {
        return firstUtteredDate;
    }

    /**
     * <p>
     * The date that the utterance was first recorded.
     * </p>
     *
     * @param firstUtteredDate <p>
     *            The date that the utterance was first recorded.
     *            </p>
     */
    public void setFirstUtteredDate(java.util.Date firstUtteredDate) {
        this.firstUtteredDate = firstUtteredDate;
    }

    /**
     * <p>
     * The date that the utterance was first recorded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param firstUtteredDate <p>
     *            The date that the utterance was first recorded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UtteranceData withFirstUtteredDate(java.util.Date firstUtteredDate) {
        this.firstUtteredDate = firstUtteredDate;
        return this;
    }

    /**
     * <p>
     * The date that the utterance was last recorded.
     * </p>
     *
     * @return <p>
     *         The date that the utterance was last recorded.
     *         </p>
     */
    public java.util.Date getLastUtteredDate() {
        return lastUtteredDate;
    }

    /**
     * <p>
     * The date that the utterance was last recorded.
     * </p>
     *
     * @param lastUtteredDate <p>
     *            The date that the utterance was last recorded.
     *            </p>
     */
    public void setLastUtteredDate(java.util.Date lastUtteredDate) {
        this.lastUtteredDate = lastUtteredDate;
    }

    /**
     * <p>
     * The date that the utterance was last recorded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUtteredDate <p>
     *            The date that the utterance was last recorded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UtteranceData withLastUtteredDate(java.util.Date lastUtteredDate) {
        this.lastUtteredDate = lastUtteredDate;
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
        if (getUtteranceString() != null)
            sb.append("utteranceString: " + getUtteranceString() + ",");
        if (getCount() != null)
            sb.append("count: " + getCount() + ",");
        if (getDistinctUsers() != null)
            sb.append("distinctUsers: " + getDistinctUsers() + ",");
        if (getFirstUtteredDate() != null)
            sb.append("firstUtteredDate: " + getFirstUtteredDate() + ",");
        if (getLastUtteredDate() != null)
            sb.append("lastUtteredDate: " + getLastUtteredDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUtteranceString() == null) ? 0 : getUtteranceString().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode
                + ((getDistinctUsers() == null) ? 0 : getDistinctUsers().hashCode());
        hashCode = prime * hashCode
                + ((getFirstUtteredDate() == null) ? 0 : getFirstUtteredDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastUtteredDate() == null) ? 0 : getLastUtteredDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UtteranceData == false)
            return false;
        UtteranceData other = (UtteranceData) obj;

        if (other.getUtteranceString() == null ^ this.getUtteranceString() == null)
            return false;
        if (other.getUtteranceString() != null
                && other.getUtteranceString().equals(this.getUtteranceString()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getDistinctUsers() == null ^ this.getDistinctUsers() == null)
            return false;
        if (other.getDistinctUsers() != null
                && other.getDistinctUsers().equals(this.getDistinctUsers()) == false)
            return false;
        if (other.getFirstUtteredDate() == null ^ this.getFirstUtteredDate() == null)
            return false;
        if (other.getFirstUtteredDate() != null
                && other.getFirstUtteredDate().equals(this.getFirstUtteredDate()) == false)
            return false;
        if (other.getLastUtteredDate() == null ^ this.getLastUtteredDate() == null)
            return false;
        if (other.getLastUtteredDate() != null
                && other.getLastUtteredDate().equals(this.getLastUtteredDate()) == false)
            return false;
        return true;
    }
}
