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

public class GetBotVersionsResult implements Serializable {
    /**
     * <p>
     * An array of <code>BotMetadata</code> objects, one for each numbered
     * version of the bot plus one for the <code>$LATEST</code> version.
     * </p>
     */
    private java.util.List<BotMetadata> bots;

    /**
     * <p>
     * A pagination token for fetching the next page of bot versions. If the
     * response to this call is truncated, Amazon Lex returns a pagination token
     * in the response. To fetch the next page of versions, specify the
     * pagination token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>BotMetadata</code> objects, one for each numbered
     * version of the bot plus one for the <code>$LATEST</code> version.
     * </p>
     *
     * @return <p>
     *         An array of <code>BotMetadata</code> objects, one for each
     *         numbered version of the bot plus one for the <code>$LATEST</code>
     *         version.
     *         </p>
     */
    public java.util.List<BotMetadata> getBots() {
        return bots;
    }

    /**
     * <p>
     * An array of <code>BotMetadata</code> objects, one for each numbered
     * version of the bot plus one for the <code>$LATEST</code> version.
     * </p>
     *
     * @param bots <p>
     *            An array of <code>BotMetadata</code> objects, one for each
     *            numbered version of the bot plus one for the
     *            <code>$LATEST</code> version.
     *            </p>
     */
    public void setBots(java.util.Collection<BotMetadata> bots) {
        if (bots == null) {
            this.bots = null;
            return;
        }

        this.bots = new java.util.ArrayList<BotMetadata>(bots);
    }

    /**
     * <p>
     * An array of <code>BotMetadata</code> objects, one for each numbered
     * version of the bot plus one for the <code>$LATEST</code> version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bots <p>
     *            An array of <code>BotMetadata</code> objects, one for each
     *            numbered version of the bot plus one for the
     *            <code>$LATEST</code> version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotVersionsResult withBots(BotMetadata... bots) {
        if (getBots() == null) {
            this.bots = new java.util.ArrayList<BotMetadata>(bots.length);
        }
        for (BotMetadata value : bots) {
            this.bots.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BotMetadata</code> objects, one for each numbered
     * version of the bot plus one for the <code>$LATEST</code> version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bots <p>
     *            An array of <code>BotMetadata</code> objects, one for each
     *            numbered version of the bot plus one for the
     *            <code>$LATEST</code> version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotVersionsResult withBots(java.util.Collection<BotMetadata> bots) {
        setBots(bots);
        return this;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of bot versions. If the
     * response to this call is truncated, Amazon Lex returns a pagination token
     * in the response. To fetch the next page of versions, specify the
     * pagination token in the next request.
     * </p>
     *
     * @return <p>
     *         A pagination token for fetching the next page of bot versions. If
     *         the response to this call is truncated, Amazon Lex returns a
     *         pagination token in the response. To fetch the next page of
     *         versions, specify the pagination token in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of bot versions. If the
     * response to this call is truncated, Amazon Lex returns a pagination token
     * in the response. To fetch the next page of versions, specify the
     * pagination token in the next request.
     * </p>
     *
     * @param nextToken <p>
     *            A pagination token for fetching the next page of bot versions.
     *            If the response to this call is truncated, Amazon Lex returns
     *            a pagination token in the response. To fetch the next page of
     *            versions, specify the pagination token in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of bot versions. If the
     * response to this call is truncated, Amazon Lex returns a pagination token
     * in the response. To fetch the next page of versions, specify the
     * pagination token in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A pagination token for fetching the next page of bot versions.
     *            If the response to this call is truncated, Amazon Lex returns
     *            a pagination token in the response. To fetch the next page of
     *            versions, specify the pagination token in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotVersionsResult withNextToken(String nextToken) {
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
            sb.append("bots: " + getBots() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
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

        if (obj instanceof GetBotVersionsResult == false)
            return false;
        GetBotVersionsResult other = (GetBotVersionsResult) obj;

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
