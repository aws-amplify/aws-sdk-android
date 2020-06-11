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
 * Gets a list of built-in intents that meet the specified criteria.
 * </p>
 * <p>
 * This operation requires permission for the <code>lex:GetBuiltinIntents</code>
 * action.
 * </p>
 */
public class GetBuiltinIntentsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     */
    private String locale;

    /**
     * <p>
     * Substring to match in built-in intent signatures. An intent will be
     * returned if any part of its signature matches the substring. For example,
     * "xyz" matches both "xyzabc" and "abcxyz." To find the signature for an
     * intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     */
    private String signatureContains;

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If this API
     * call is truncated, Amazon Lex returns a pagination token in the response.
     * To fetch the next page of intents, use the pagination token in the next
     * request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of intents to return in the response. The default is
     * 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @return <p>
     *         A list of locales that the intent supports.
     *         </p>
     * @see Locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            A list of locales that the intent supports.
     *            </p>
     * @see Locale
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            A list of locales that the intent supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Locale
     */
    public GetBuiltinIntentsRequest withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            A list of locales that the intent supports.
     *            </p>
     * @see Locale
     */
    public void setLocale(Locale locale) {
        this.locale = locale.toString();
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            A list of locales that the intent supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Locale
     */
    public GetBuiltinIntentsRequest withLocale(Locale locale) {
        this.locale = locale.toString();
        return this;
    }

    /**
     * <p>
     * Substring to match in built-in intent signatures. An intent will be
     * returned if any part of its signature matches the substring. For example,
     * "xyz" matches both "xyzabc" and "abcxyz." To find the signature for an
     * intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     *
     * @return <p>
     *         Substring to match in built-in intent signatures. An intent will
     *         be returned if any part of its signature matches the substring.
     *         For example, "xyz" matches both "xyzabc" and "abcxyz." To find
     *         the signature for an intent, see <a href=
     *         "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *         >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     *         </p>
     */
    public String getSignatureContains() {
        return signatureContains;
    }

    /**
     * <p>
     * Substring to match in built-in intent signatures. An intent will be
     * returned if any part of its signature matches the substring. For example,
     * "xyz" matches both "xyzabc" and "abcxyz." To find the signature for an
     * intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     *
     * @param signatureContains <p>
     *            Substring to match in built-in intent signatures. An intent
     *            will be returned if any part of its signature matches the
     *            substring. For example, "xyz" matches both "xyzabc" and
     *            "abcxyz." To find the signature for an intent, see <a href=
     *            "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *            >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     *            </p>
     */
    public void setSignatureContains(String signatureContains) {
        this.signatureContains = signatureContains;
    }

    /**
     * <p>
     * Substring to match in built-in intent signatures. An intent will be
     * returned if any part of its signature matches the substring. For example,
     * "xyz" matches both "xyzabc" and "abcxyz." To find the signature for an
     * intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signatureContains <p>
     *            Substring to match in built-in intent signatures. An intent
     *            will be returned if any part of its signature matches the
     *            substring. For example, "xyz" matches both "xyzabc" and
     *            "abcxyz." To find the signature for an intent, see <a href=
     *            "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *            >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinIntentsRequest withSignatureContains(String signatureContains) {
        this.signatureContains = signatureContains;
        return this;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If this API
     * call is truncated, Amazon Lex returns a pagination token in the response.
     * To fetch the next page of intents, use the pagination token in the next
     * request.
     * </p>
     *
     * @return <p>
     *         A pagination token that fetches the next page of intents. If this
     *         API call is truncated, Amazon Lex returns a pagination token in
     *         the response. To fetch the next page of intents, use the
     *         pagination token in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If this API
     * call is truncated, Amazon Lex returns a pagination token in the response.
     * To fetch the next page of intents, use the pagination token in the next
     * request.
     * </p>
     *
     * @param nextToken <p>
     *            A pagination token that fetches the next page of intents. If
     *            this API call is truncated, Amazon Lex returns a pagination
     *            token in the response. To fetch the next page of intents, use
     *            the pagination token in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If this API
     * call is truncated, Amazon Lex returns a pagination token in the response.
     * To fetch the next page of intents, use the pagination token in the next
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A pagination token that fetches the next page of intents. If
     *            this API call is truncated, Amazon Lex returns a pagination
     *            token in the response. To fetch the next page of intents, use
     *            the pagination token in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinIntentsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of intents to return in the response. The default is
     * 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of intents to return in the response. The
     *         default is 10.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of intents to return in the response. The default is
     * 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of intents to return in the response. The
     *            default is 10.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of intents to return in the response. The default is
     * 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of intents to return in the response. The
     *            default is 10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinIntentsRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof GetBuiltinIntentsRequest == false)
            return false;
        GetBuiltinIntentsRequest other = (GetBuiltinIntentsRequest) obj;

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
