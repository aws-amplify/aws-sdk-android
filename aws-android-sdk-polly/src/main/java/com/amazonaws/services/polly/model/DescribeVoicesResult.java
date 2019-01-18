/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.polly.model;

import java.io.Serializable;

public class DescribeVoicesResult implements Serializable {
    /**
     * <p>
     * A list of voices with their properties.
     * </p>
     */
    private java.util.List<Voice> voices;

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing
     * of voices. <code>NextToken</code> is returned only if the response is
     * truncated.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of voices with their properties.
     * </p>
     *
     * @return <p>
     *         A list of voices with their properties.
     *         </p>
     */
    public java.util.List<Voice> getVoices() {
        return voices;
    }

    /**
     * <p>
     * A list of voices with their properties.
     * </p>
     *
     * @param voices <p>
     *            A list of voices with their properties.
     *            </p>
     */
    public void setVoices(java.util.Collection<Voice> voices) {
        if (voices == null) {
            this.voices = null;
            return;
        }

        this.voices = new java.util.ArrayList<Voice>(voices);
    }

    /**
     * <p>
     * A list of voices with their properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voices <p>
     *            A list of voices with their properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVoicesResult withVoices(Voice... voices) {
        if (getVoices() == null) {
            this.voices = new java.util.ArrayList<Voice>(voices.length);
        }
        for (Voice value : voices) {
            this.voices.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of voices with their properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voices <p>
     *            A list of voices with their properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVoicesResult withVoices(java.util.Collection<Voice> voices) {
        setVoices(voices);
        return this;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing
     * of voices. <code>NextToken</code> is returned only if the response is
     * truncated.
     * </p>
     *
     * @return <p>
     *         The pagination token to use in the next request to continue the
     *         listing of voices. <code>NextToken</code> is returned only if the
     *         response is truncated.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing
     * of voices. <code>NextToken</code> is returned only if the response is
     * truncated.
     * </p>
     *
     * @param nextToken <p>
     *            The pagination token to use in the next request to continue
     *            the listing of voices. <code>NextToken</code> is returned only
     *            if the response is truncated.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing
     * of voices. <code>NextToken</code> is returned only if the response is
     * truncated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The pagination token to use in the next request to continue
     *            the listing of voices. <code>NextToken</code> is returned only
     *            if the response is truncated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVoicesResult withNextToken(String nextToken) {
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
        if (getVoices() != null)
            sb.append("Voices: " + getVoices() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoices() == null) ? 0 : getVoices().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVoicesResult == false)
            return false;
        DescribeVoicesResult other = (DescribeVoicesResult) obj;

        if (other.getVoices() == null ^ this.getVoices() == null)
            return false;
        if (other.getVoices() != null && other.getVoices().equals(this.getVoices()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
