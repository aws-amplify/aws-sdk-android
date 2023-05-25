/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides a list of languages (RFC-5646 codes and names) that Amazon Translate
 * supports.
 * </p>
 */
public class ListLanguagesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The language code for the language to use to display the language names
     * in the response. The language code is <code>en</code> by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>de, en, es, fr, it, ja, ko, pt, zh, zh-TW
     */
    private String displayLanguageCode;

    /**
     * <p>
     * Include the NextToken value to fetch the next group of supported
     * languages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return in each response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The language code for the language to use to display the language names
     * in the response. The language code is <code>en</code> by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>de, en, es, fr, it, ja, ko, pt, zh, zh-TW
     *
     * @return <p>
     *         The language code for the language to use to display the language
     *         names in the response. The language code is <code>en</code> by
     *         default.
     *         </p>
     * @see DisplayLanguageCode
     */
    public String getDisplayLanguageCode() {
        return displayLanguageCode;
    }

    /**
     * <p>
     * The language code for the language to use to display the language names
     * in the response. The language code is <code>en</code> by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>de, en, es, fr, it, ja, ko, pt, zh, zh-TW
     *
     * @param displayLanguageCode <p>
     *            The language code for the language to use to display the
     *            language names in the response. The language code is
     *            <code>en</code> by default.
     *            </p>
     * @see DisplayLanguageCode
     */
    public void setDisplayLanguageCode(String displayLanguageCode) {
        this.displayLanguageCode = displayLanguageCode;
    }

    /**
     * <p>
     * The language code for the language to use to display the language names
     * in the response. The language code is <code>en</code> by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>de, en, es, fr, it, ja, ko, pt, zh, zh-TW
     *
     * @param displayLanguageCode <p>
     *            The language code for the language to use to display the
     *            language names in the response. The language code is
     *            <code>en</code> by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DisplayLanguageCode
     */
    public ListLanguagesRequest withDisplayLanguageCode(String displayLanguageCode) {
        this.displayLanguageCode = displayLanguageCode;
        return this;
    }

    /**
     * <p>
     * The language code for the language to use to display the language names
     * in the response. The language code is <code>en</code> by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>de, en, es, fr, it, ja, ko, pt, zh, zh-TW
     *
     * @param displayLanguageCode <p>
     *            The language code for the language to use to display the
     *            language names in the response. The language code is
     *            <code>en</code> by default.
     *            </p>
     * @see DisplayLanguageCode
     */
    public void setDisplayLanguageCode(DisplayLanguageCode displayLanguageCode) {
        this.displayLanguageCode = displayLanguageCode.toString();
    }

    /**
     * <p>
     * The language code for the language to use to display the language names
     * in the response. The language code is <code>en</code> by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>de, en, es, fr, it, ja, ko, pt, zh, zh-TW
     *
     * @param displayLanguageCode <p>
     *            The language code for the language to use to display the
     *            language names in the response. The language code is
     *            <code>en</code> by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DisplayLanguageCode
     */
    public ListLanguagesRequest withDisplayLanguageCode(DisplayLanguageCode displayLanguageCode) {
        this.displayLanguageCode = displayLanguageCode.toString();
        return this;
    }

    /**
     * <p>
     * Include the NextToken value to fetch the next group of supported
     * languages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     *
     * @return <p>
     *         Include the NextToken value to fetch the next group of supported
     *         languages.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Include the NextToken value to fetch the next group of supported
     * languages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     *
     * @param nextToken <p>
     *            Include the NextToken value to fetch the next group of
     *            supported languages.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Include the NextToken value to fetch the next group of supported
     * languages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     *
     * @param nextToken <p>
     *            Include the NextToken value to fetch the next group of
     *            supported languages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLanguagesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in each response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @return <p>
     *         The maximum number of results to return in each response.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in each response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in each response.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in each response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in each response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLanguagesRequest withMaxResults(Integer maxResults) {
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
        if (getDisplayLanguageCode() != null)
            sb.append("DisplayLanguageCode: " + getDisplayLanguageCode() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDisplayLanguageCode() == null) ? 0 : getDisplayLanguageCode().hashCode());
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

        if (obj instanceof ListLanguagesRequest == false)
            return false;
        ListLanguagesRequest other = (ListLanguagesRequest) obj;

        if (other.getDisplayLanguageCode() == null ^ this.getDisplayLanguageCode() == null)
            return false;
        if (other.getDisplayLanguageCode() != null
                && other.getDisplayLanguageCode().equals(this.getDisplayLanguageCode()) == false)
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
