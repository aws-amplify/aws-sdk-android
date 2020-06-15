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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

public class ListConferenceProvidersResult implements Serializable {
    /**
     * <p>
     * The conference providers.
     * </p>
     */
    private java.util.List<ConferenceProvider> conferenceProviders;

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The conference providers.
     * </p>
     *
     * @return <p>
     *         The conference providers.
     *         </p>
     */
    public java.util.List<ConferenceProvider> getConferenceProviders() {
        return conferenceProviders;
    }

    /**
     * <p>
     * The conference providers.
     * </p>
     *
     * @param conferenceProviders <p>
     *            The conference providers.
     *            </p>
     */
    public void setConferenceProviders(java.util.Collection<ConferenceProvider> conferenceProviders) {
        if (conferenceProviders == null) {
            this.conferenceProviders = null;
            return;
        }

        this.conferenceProviders = new java.util.ArrayList<ConferenceProvider>(conferenceProviders);
    }

    /**
     * <p>
     * The conference providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conferenceProviders <p>
     *            The conference providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListConferenceProvidersResult withConferenceProviders(
            ConferenceProvider... conferenceProviders) {
        if (getConferenceProviders() == null) {
            this.conferenceProviders = new java.util.ArrayList<ConferenceProvider>(
                    conferenceProviders.length);
        }
        for (ConferenceProvider value : conferenceProviders) {
            this.conferenceProviders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The conference providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conferenceProviders <p>
     *            The conference providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListConferenceProvidersResult withConferenceProviders(
            java.util.Collection<ConferenceProvider> conferenceProviders) {
        setConferenceProviders(conferenceProviders);
        return this;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @return <p>
     *         The tokens used for pagination.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The tokens used for pagination.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The tokens used for pagination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListConferenceProvidersResult withNextToken(String nextToken) {
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
        if (getConferenceProviders() != null)
            sb.append("ConferenceProviders: " + getConferenceProviders() + ",");
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
                + ((getConferenceProviders() == null) ? 0 : getConferenceProviders().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConferenceProvidersResult == false)
            return false;
        ListConferenceProvidersResult other = (ListConferenceProvidersResult) obj;

        if (other.getConferenceProviders() == null ^ this.getConferenceProviders() == null)
            return false;
        if (other.getConferenceProviders() != null
                && other.getConferenceProviders().equals(this.getConferenceProviders()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
