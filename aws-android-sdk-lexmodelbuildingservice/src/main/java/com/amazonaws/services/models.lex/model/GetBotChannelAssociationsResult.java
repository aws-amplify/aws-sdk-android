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

public class GetBotChannelAssociationsResult implements Serializable {
    /**
     * <p>
     * An array of objects, one for each association, that provides information
     * about the Amazon Lex bot and its association with the channel.
     * </p>
     */
    private java.util.List<BotChannelAssociation> botChannelAssociations;

    /**
     * <p>
     * A pagination token that fetches the next page of associations. If the
     * response to this call is truncated, Amazon Lex returns a pagination token
     * in the response. To fetch the next page of associations, specify the
     * pagination token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects, one for each association, that provides information
     * about the Amazon Lex bot and its association with the channel.
     * </p>
     *
     * @return <p>
     *         An array of objects, one for each association, that provides
     *         information about the Amazon Lex bot and its association with the
     *         channel.
     *         </p>
     */
    public java.util.List<BotChannelAssociation> getBotChannelAssociations() {
        return botChannelAssociations;
    }

    /**
     * <p>
     * An array of objects, one for each association, that provides information
     * about the Amazon Lex bot and its association with the channel.
     * </p>
     *
     * @param botChannelAssociations <p>
     *            An array of objects, one for each association, that provides
     *            information about the Amazon Lex bot and its association with
     *            the channel.
     *            </p>
     */
    public void setBotChannelAssociations(
            java.util.Collection<BotChannelAssociation> botChannelAssociations) {
        if (botChannelAssociations == null) {
            this.botChannelAssociations = null;
            return;
        }

        this.botChannelAssociations = new java.util.ArrayList<BotChannelAssociation>(
                botChannelAssociations);
    }

    /**
     * <p>
     * An array of objects, one for each association, that provides information
     * about the Amazon Lex bot and its association with the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botChannelAssociations <p>
     *            An array of objects, one for each association, that provides
     *            information about the Amazon Lex bot and its association with
     *            the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotChannelAssociationsResult withBotChannelAssociations(
            BotChannelAssociation... botChannelAssociations) {
        if (getBotChannelAssociations() == null) {
            this.botChannelAssociations = new java.util.ArrayList<BotChannelAssociation>(
                    botChannelAssociations.length);
        }
        for (BotChannelAssociation value : botChannelAssociations) {
            this.botChannelAssociations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each association, that provides information
     * about the Amazon Lex bot and its association with the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botChannelAssociations <p>
     *            An array of objects, one for each association, that provides
     *            information about the Amazon Lex bot and its association with
     *            the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotChannelAssociationsResult withBotChannelAssociations(
            java.util.Collection<BotChannelAssociation> botChannelAssociations) {
        setBotChannelAssociations(botChannelAssociations);
        return this;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of associations. If the
     * response to this call is truncated, Amazon Lex returns a pagination token
     * in the response. To fetch the next page of associations, specify the
     * pagination token in the next request.
     * </p>
     *
     * @return <p>
     *         A pagination token that fetches the next page of associations. If
     *         the response to this call is truncated, Amazon Lex returns a
     *         pagination token in the response. To fetch the next page of
     *         associations, specify the pagination token in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of associations. If the
     * response to this call is truncated, Amazon Lex returns a pagination token
     * in the response. To fetch the next page of associations, specify the
     * pagination token in the next request.
     * </p>
     *
     * @param nextToken <p>
     *            A pagination token that fetches the next page of associations.
     *            If the response to this call is truncated, Amazon Lex returns
     *            a pagination token in the response. To fetch the next page of
     *            associations, specify the pagination token in the next
     *            request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of associations. If the
     * response to this call is truncated, Amazon Lex returns a pagination token
     * in the response. To fetch the next page of associations, specify the
     * pagination token in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A pagination token that fetches the next page of associations.
     *            If the response to this call is truncated, Amazon Lex returns
     *            a pagination token in the response. To fetch the next page of
     *            associations, specify the pagination token in the next
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotChannelAssociationsResult withNextToken(String nextToken) {
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
        if (getBotChannelAssociations() != null)
            sb.append("botChannelAssociations: " + getBotChannelAssociations() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getBotChannelAssociations() == null) ? 0 : getBotChannelAssociations()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBotChannelAssociationsResult == false)
            return false;
        GetBotChannelAssociationsResult other = (GetBotChannelAssociationsResult) obj;

        if (other.getBotChannelAssociations() == null ^ this.getBotChannelAssociations() == null)
            return false;
        if (other.getBotChannelAssociations() != null
                && other.getBotChannelAssociations().equals(this.getBotChannelAssociations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
