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

public class ListBotsResult implements Serializable {
    /**
     * <p>
     * List of bots and bot details.
     * </p>
     */
    private java.util.List<Bot> bots;

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of bots and bot details.
     * </p>
     *
     * @return <p>
     *         List of bots and bot details.
     *         </p>
     */
    public java.util.List<Bot> getBots() {
        return bots;
    }

    /**
     * <p>
     * List of bots and bot details.
     * </p>
     *
     * @param bots <p>
     *            List of bots and bot details.
     *            </p>
     */
    public void setBots(java.util.Collection<Bot> bots) {
        if (bots == null) {
            this.bots = null;
            return;
        }

        this.bots = new java.util.ArrayList<Bot>(bots);
    }

    /**
     * <p>
     * List of bots and bot details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bots <p>
     *            List of bots and bot details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBotsResult withBots(Bot... bots) {
        if (getBots() == null) {
            this.bots = new java.util.ArrayList<Bot>(bots.length);
        }
        for (Bot value : bots) {
            this.bots.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of bots and bot details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bots <p>
     *            List of bots and bot details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBotsResult withBots(java.util.Collection<Bot> bots) {
        setBots(bots);
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
    public ListBotsResult withNextToken(String nextToken) {
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
        if (getBots() != null)
            sb.append("Bots: " + getBots() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBots() == null) ? 0 : getBots().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBotsResult == false)
            return false;
        ListBotsResult other = (ListBotsResult) obj;

        if (other.getBots() == null ^ this.getBots() == null)
            return false;
        if (other.getBots() != null && other.getBots().equals(this.getBots()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
