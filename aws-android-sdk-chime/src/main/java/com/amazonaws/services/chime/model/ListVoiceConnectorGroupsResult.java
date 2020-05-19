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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

public class ListVoiceConnectorGroupsResult implements Serializable {
    /**
     * <p>
     * The details of the Amazon Chime Voice Connector groups.
     * </p>
     */
    private java.util.List<VoiceConnectorGroup> voiceConnectorGroups;

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The details of the Amazon Chime Voice Connector groups.
     * </p>
     *
     * @return <p>
     *         The details of the Amazon Chime Voice Connector groups.
     *         </p>
     */
    public java.util.List<VoiceConnectorGroup> getVoiceConnectorGroups() {
        return voiceConnectorGroups;
    }

    /**
     * <p>
     * The details of the Amazon Chime Voice Connector groups.
     * </p>
     *
     * @param voiceConnectorGroups <p>
     *            The details of the Amazon Chime Voice Connector groups.
     *            </p>
     */
    public void setVoiceConnectorGroups(
            java.util.Collection<VoiceConnectorGroup> voiceConnectorGroups) {
        if (voiceConnectorGroups == null) {
            this.voiceConnectorGroups = null;
            return;
        }

        this.voiceConnectorGroups = new java.util.ArrayList<VoiceConnectorGroup>(
                voiceConnectorGroups);
    }

    /**
     * <p>
     * The details of the Amazon Chime Voice Connector groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceConnectorGroups <p>
     *            The details of the Amazon Chime Voice Connector groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVoiceConnectorGroupsResult withVoiceConnectorGroups(
            VoiceConnectorGroup... voiceConnectorGroups) {
        if (getVoiceConnectorGroups() == null) {
            this.voiceConnectorGroups = new java.util.ArrayList<VoiceConnectorGroup>(
                    voiceConnectorGroups.length);
        }
        for (VoiceConnectorGroup value : voiceConnectorGroups) {
            this.voiceConnectorGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The details of the Amazon Chime Voice Connector groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceConnectorGroups <p>
     *            The details of the Amazon Chime Voice Connector groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVoiceConnectorGroupsResult withVoiceConnectorGroups(
            java.util.Collection<VoiceConnectorGroup> voiceConnectorGroups) {
        setVoiceConnectorGroups(voiceConnectorGroups);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVoiceConnectorGroupsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getVoiceConnectorGroups() != null)
            sb.append("VoiceConnectorGroups: " + getVoiceConnectorGroups() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVoiceConnectorGroups() == null) ? 0 : getVoiceConnectorGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVoiceConnectorGroupsResult == false)
            return false;
        ListVoiceConnectorGroupsResult other = (ListVoiceConnectorGroupsResult) obj;

        if (other.getVoiceConnectorGroups() == null ^ this.getVoiceConnectorGroups() == null)
            return false;
        if (other.getVoiceConnectorGroups() != null
                && other.getVoiceConnectorGroups().equals(this.getVoiceConnectorGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
