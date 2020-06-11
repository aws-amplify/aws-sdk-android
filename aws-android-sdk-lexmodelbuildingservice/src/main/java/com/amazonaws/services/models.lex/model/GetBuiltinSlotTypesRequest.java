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
 * Gets a list of built-in slot types that meet the specified criteria.
 * </p>
 * <p>
 * For a list of built-in slot types, see <a href=
 * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
 * >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lex:GetBuiltInSlotTypes</code> action.
 * </p>
 */
public class GetBuiltinSlotTypesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of locales that the slot type supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     */
    private String locale;

    /**
     * <p>
     * Substring to match in built-in slot type signatures. A slot type will be
     * returned if any part of its signature matches the substring. For example,
     * "xyz" matches both "xyzabc" and "abcxyz."
     * </p>
     */
    private String signatureContains;

    /**
     * <p>
     * A pagination token that fetches the next page of slot types. If the
     * response to this API call is truncated, Amazon Lex returns a pagination
     * token in the response. To fetch the next page of slot types, specify the
     * pagination token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of slot types to return in the response. The default
     * is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A list of locales that the slot type supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @return <p>
     *         A list of locales that the slot type supports.
     *         </p>
     * @see Locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * <p>
     * A list of locales that the slot type supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            A list of locales that the slot type supports.
     *            </p>
     * @see Locale
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * A list of locales that the slot type supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            A list of locales that the slot type supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Locale
     */
    public GetBuiltinSlotTypesRequest withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * <p>
     * A list of locales that the slot type supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            A list of locales that the slot type supports.
     *            </p>
     * @see Locale
     */
    public void setLocale(Locale locale) {
        this.locale = locale.toString();
    }

    /**
     * <p>
     * A list of locales that the slot type supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            A list of locales that the slot type supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Locale
     */
    public GetBuiltinSlotTypesRequest withLocale(Locale locale) {
        this.locale = locale.toString();
        return this;
    }

    /**
     * <p>
     * Substring to match in built-in slot type signatures. A slot type will be
     * returned if any part of its signature matches the substring. For example,
     * "xyz" matches both "xyzabc" and "abcxyz."
     * </p>
     *
     * @return <p>
     *         Substring to match in built-in slot type signatures. A slot type
     *         will be returned if any part of its signature matches the
     *         substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
     *         </p>
     */
    public String getSignatureContains() {
        return signatureContains;
    }

    /**
     * <p>
     * Substring to match in built-in slot type signatures. A slot type will be
     * returned if any part of its signature matches the substring. For example,
     * "xyz" matches both "xyzabc" and "abcxyz."
     * </p>
     *
     * @param signatureContains <p>
     *            Substring to match in built-in slot type signatures. A slot
     *            type will be returned if any part of its signature matches the
     *            substring. For example, "xyz" matches both "xyzabc" and
     *            "abcxyz."
     *            </p>
     */
    public void setSignatureContains(String signatureContains) {
        this.signatureContains = signatureContains;
    }

    /**
     * <p>
     * Substring to match in built-in slot type signatures. A slot type will be
     * returned if any part of its signature matches the substring. For example,
     * "xyz" matches both "xyzabc" and "abcxyz."
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signatureContains <p>
     *            Substring to match in built-in slot type signatures. A slot
     *            type will be returned if any part of its signature matches the
     *            substring. For example, "xyz" matches both "xyzabc" and
     *            "abcxyz."
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinSlotTypesRequest withSignatureContains(String signatureContains) {
        this.signatureContains = signatureContains;
        return this;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of slot types. If the
     * response to this API call is truncated, Amazon Lex returns a pagination
     * token in the response. To fetch the next page of slot types, specify the
     * pagination token in the next request.
     * </p>
     *
     * @return <p>
     *         A pagination token that fetches the next page of slot types. If
     *         the response to this API call is truncated, Amazon Lex returns a
     *         pagination token in the response. To fetch the next page of slot
     *         types, specify the pagination token in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of slot types. If the
     * response to this API call is truncated, Amazon Lex returns a pagination
     * token in the response. To fetch the next page of slot types, specify the
     * pagination token in the next request.
     * </p>
     *
     * @param nextToken <p>
     *            A pagination token that fetches the next page of slot types.
     *            If the response to this API call is truncated, Amazon Lex
     *            returns a pagination token in the response. To fetch the next
     *            page of slot types, specify the pagination token in the next
     *            request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of slot types. If the
     * response to this API call is truncated, Amazon Lex returns a pagination
     * token in the response. To fetch the next page of slot types, specify the
     * pagination token in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A pagination token that fetches the next page of slot types.
     *            If the response to this API call is truncated, Amazon Lex
     *            returns a pagination token in the response. To fetch the next
     *            page of slot types, specify the pagination token in the next
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinSlotTypesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of slot types to return in the response. The default
     * is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of slot types to return in the response. The
     *         default is 10.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of slot types to return in the response. The default
     * is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of slot types to return in the response.
     *            The default is 10.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of slot types to return in the response. The default
     * is 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of slot types to return in the response.
     *            The default is 10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinSlotTypesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getLocale() != null)
            sb.append("locale: " + getLocale() + ",");
        if (getSignatureContains() != null)
            sb.append("signatureContains: " + getSignatureContains() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode
                + ((getSignatureContains() == null) ? 0 : getSignatureContains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBuiltinSlotTypesRequest == false)
            return false;
        GetBuiltinSlotTypesRequest other = (GetBuiltinSlotTypesRequest) obj;

        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getSignatureContains() == null ^ this.getSignatureContains() == null)
            return false;
        if (other.getSignatureContains() != null
                && other.getSignatureContains().equals(this.getSignatureContains()) == false)
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
        return true;
    }
}
