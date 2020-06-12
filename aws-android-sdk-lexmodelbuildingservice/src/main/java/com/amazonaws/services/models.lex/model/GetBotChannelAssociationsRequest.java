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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of all of the channels associated with the specified bot.
 * </p>
 * <p>
 * The <code>GetBotChannelAssociations</code> operation requires permissions for
 * the <code>lex:GetBotChannelAssociations</code> action.
 * </p>
 */
public class GetBotChannelAssociationsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Amazon Lex bot in the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String botName;

    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which
     * this association is being made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(-|^([A-Za-z]_?)+$)$<br/>
     */
    private String botAlias;

    /**
     * <p>
     * A pagination token for fetching the next page of associations. If the
     * response to this call is truncated, Amazon Lex returns a pagination token
     * in the response. To fetch the next page of associations, specify the
     * pagination token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of associations to return in the response. The default
     * is 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Substring to match in channel association names. An association will be
     * returned if any part of its name matches the substring. For example,
     * "xyz" matches both "xyzabc" and "abcxyz." To return all bot channel
     * associations, use a hyphen ("-") as the <code>nameContains</code>
     * parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String nameContains;

    /**
     * <p>
     * The name of the Amazon Lex bot in the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the Amazon Lex bot in the association.
     *         </p>
     */
    public String getBotName() {
        return botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot in the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param botName <p>
     *            The name of the Amazon Lex bot in the association.
     *            </p>
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot in the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param botName <p>
     *            The name of the Amazon Lex bot in the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotChannelAssociationsRequest withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which
     * this association is being made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(-|^([A-Za-z]_?)+$)$<br/>
     *
     * @return <p>
     *         An alias pointing to the specific version of the Amazon Lex bot
     *         to which this association is being made.
     *         </p>
     */
    public String getBotAlias() {
        return botAlias;
    }

    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which
     * this association is being made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(-|^([A-Za-z]_?)+$)$<br/>
     *
     * @param botAlias <p>
     *            An alias pointing to the specific version of the Amazon Lex
     *            bot to which this association is being made.
     *            </p>
     */
    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which
     * this association is being made.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(-|^([A-Za-z]_?)+$)$<br/>
     *
     * @param botAlias <p>
     *            An alias pointing to the specific version of the Amazon Lex
     *            bot to which this association is being made.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotChannelAssociationsRequest withBotAlias(String botAlias) {
        this.botAlias = botAlias;
        return this;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of associations. If the
     * response to this call is truncated, Amazon Lex returns a pagination token
     * in the response. To fetch the next page of associations, specify the
     * pagination token in the next request.
     * </p>
     *
     * @return <p>
     *         A pagination token for fetching the next page of associations. If
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
     * A pagination token for fetching the next page of associations. If the
     * response to this call is truncated, Amazon Lex returns a pagination token
     * in the response. To fetch the next page of associations, specify the
     * pagination token in the next request.
     * </p>
     *
     * @param nextToken <p>
     *            A pagination token for fetching the next page of associations.
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
     * A pagination token for fetching the next page of associations. If the
     * response to this call is truncated, Amazon Lex returns a pagination token
     * in the response. To fetch the next page of associations, specify the
     * pagination token in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A pagination token for fetching the next page of associations.
     *            If the response to this call is truncated, Amazon Lex returns
     *            a pagination token in the response. To fetch the next page of
     *            associations, specify the pagination token in the next
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotChannelAssociationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of associations to return in the response. The default
     * is 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of associations to return in the response. The
     *         default is 50.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of associations to return in the response. The default
     * is 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of associations to return in the response.
     *            The default is 50.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of associations to return in the response. The default
     * is 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of associations to return in the response.
     *            The default is 50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotChannelAssociationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Substring to match in channel association names. An association will be
     * returned if any part of its name matches the substring. For example,
     * "xyz" matches both "xyzabc" and "abcxyz." To return all bot channel
     * associations, use a hyphen ("-") as the <code>nameContains</code>
     * parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         Substring to match in channel association names. An association
     *         will be returned if any part of its name matches the substring.
     *         For example, "xyz" matches both "xyzabc" and "abcxyz." To return
     *         all bot channel associations, use a hyphen ("-") as the
     *         <code>nameContains</code> parameter.
     *         </p>
     */
    public String getNameContains() {
        return nameContains;
    }

    /**
     * <p>
     * Substring to match in channel association names. An association will be
     * returned if any part of its name matches the substring. For example,
     * "xyz" matches both "xyzabc" and "abcxyz." To return all bot channel
     * associations, use a hyphen ("-") as the <code>nameContains</code>
     * parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param nameContains <p>
     *            Substring to match in channel association names. An
     *            association will be returned if any part of its name matches
     *            the substring. For example, "xyz" matches both "xyzabc" and
     *            "abcxyz." To return all bot channel associations, use a hyphen
     *            ("-") as the <code>nameContains</code> parameter.
     *            </p>
     */
    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Substring to match in channel association names. An association will be
     * returned if any part of its name matches the substring. For example,
     * "xyz" matches both "xyzabc" and "abcxyz." To return all bot channel
     * associations, use a hyphen ("-") as the <code>nameContains</code>
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param nameContains <p>
     *            Substring to match in channel association names. An
     *            association will be returned if any part of its name matches
     *            the substring. For example, "xyz" matches both "xyzabc" and
     *            "abcxyz." To return all bot channel associations, use a hyphen
     *            ("-") as the <code>nameContains</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotChannelAssociationsRequest withNameContains(String nameContains) {
        this.nameContains = nameContains;
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
        if (getBotName() != null)
            sb.append("botName: " + getBotName() + ",");
        if (getBotAlias() != null)
            sb.append("botAlias: " + getBotAlias() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNameContains() != null)
            sb.append("nameContains: " + getNameContains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getBotAlias() == null) ? 0 : getBotAlias().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBotChannelAssociationsRequest == false)
            return false;
        GetBotChannelAssociationsRequest other = (GetBotChannelAssociationsRequest) obj;

        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getBotAlias() == null ^ this.getBotAlias() == null)
            return false;
        if (other.getBotAlias() != null && other.getBotAlias().equals(this.getBotAlias()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null
                && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        return true;
    }
}
