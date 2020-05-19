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

public class ListVoiceConnectorsResult implements Serializable {
    /**
     * <p>
     * The details of the Amazon Chime Voice Connectors.
     * </p>
     */
    private java.util.List<VoiceConnector> voiceConnectors;

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The details of the Amazon Chime Voice Connectors.
     * </p>
     *
     * @return <p>
     *         The details of the Amazon Chime Voice Connectors.
     *         </p>
     */
    public java.util.List<VoiceConnector> getVoiceConnectors() {
        return voiceConnectors;
    }

    /**
     * <p>
     * The details of the Amazon Chime Voice Connectors.
     * </p>
     *
     * @param voiceConnectors <p>
     *            The details of the Amazon Chime Voice Connectors.
     *            </p>
     */
    public void setVoiceConnectors(java.util.Collection<VoiceConnector> voiceConnectors) {
        if (voiceConnectors == null) {
            this.voiceConnectors = null;
            return;
        }

        this.voiceConnectors = new java.util.ArrayList<VoiceConnector>(voiceConnectors);
    }

    /**
     * <p>
     * The details of the Amazon Chime Voice Connectors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceConnectors <p>
     *            The details of the Amazon Chime Voice Connectors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVoiceConnectorsResult withVoiceConnectors(VoiceConnector... voiceConnectors) {
        if (getVoiceConnectors() == null) {
            this.voiceConnectors = new java.util.ArrayList<VoiceConnector>(voiceConnectors.length);
        }
        for (VoiceConnector value : voiceConnectors) {
            this.voiceConnectors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The details of the Amazon Chime Voice Connectors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceConnectors <p>
     *            The details of the Amazon Chime Voice Connectors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVoiceConnectorsResult withVoiceConnectors(
            java.util.Collection<VoiceConnector> voiceConnectors) {
        setVoiceConnectors(voiceConnectors);
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
    public ListVoiceConnectorsResult withNextToken(String nextToken) {
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
        if (getVoiceConnectors() != null)
            sb.append("VoiceConnectors: " + getVoiceConnectors() + ",");
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
                + ((getVoiceConnectors() == null) ? 0 : getVoiceConnectors().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVoiceConnectorsResult == false)
            return false;
        ListVoiceConnectorsResult other = (ListVoiceConnectorsResult) obj;

        if (other.getVoiceConnectors() == null ^ this.getVoiceConnectors() == null)
            return false;
        if (other.getVoiceConnectors() != null
                && other.getVoiceConnectors().equals(this.getVoiceConnectors()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
