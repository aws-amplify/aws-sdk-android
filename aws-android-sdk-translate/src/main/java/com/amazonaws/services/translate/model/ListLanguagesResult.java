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

public class ListLanguagesResult implements Serializable {
    /**
     * <p>
     * The list of supported languages.
     * </p>
     */
    private java.util.List<Language> languages;

    /**
     * <p>
     * The language code passed in with the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>de, en, es, fr, it, ja, ko, pt, zh, zh-TW
     */
    private String displayLanguageCode;

    /**
     * <p>
     * If the response does not include all remaining results, use the NextToken
     * in the next request to fetch the next group of supported languages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list of supported languages.
     * </p>
     *
     * @return <p>
     *         The list of supported languages.
     *         </p>
     */
    public java.util.List<Language> getLanguages() {
        return languages;
    }

    /**
     * <p>
     * The list of supported languages.
     * </p>
     *
     * @param languages <p>
     *            The list of supported languages.
     *            </p>
     */
    public void setLanguages(java.util.Collection<Language> languages) {
        if (languages == null) {
            this.languages = null;
            return;
        }

        this.languages = new java.util.ArrayList<Language>(languages);
    }

    /**
     * <p>
     * The list of supported languages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languages <p>
     *            The list of supported languages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLanguagesResult withLanguages(Language... languages) {
        if (getLanguages() == null) {
            this.languages = new java.util.ArrayList<Language>(languages.length);
        }
        for (Language value : languages) {
            this.languages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of supported languages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languages <p>
     *            The list of supported languages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLanguagesResult withLanguages(java.util.Collection<Language> languages) {
        setLanguages(languages);
        return this;
    }

    /**
     * <p>
     * The language code passed in with the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>de, en, es, fr, it, ja, ko, pt, zh, zh-TW
     *
     * @return <p>
     *         The language code passed in with the request.
     *         </p>
     * @see DisplayLanguageCode
     */
    public String getDisplayLanguageCode() {
        return displayLanguageCode;
    }

    /**
     * <p>
     * The language code passed in with the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>de, en, es, fr, it, ja, ko, pt, zh, zh-TW
     *
     * @param displayLanguageCode <p>
     *            The language code passed in with the request.
     *            </p>
     * @see DisplayLanguageCode
     */
    public void setDisplayLanguageCode(String displayLanguageCode) {
        this.displayLanguageCode = displayLanguageCode;
    }

    /**
     * <p>
     * The language code passed in with the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>de, en, es, fr, it, ja, ko, pt, zh, zh-TW
     *
     * @param displayLanguageCode <p>
     *            The language code passed in with the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DisplayLanguageCode
     */
    public ListLanguagesResult withDisplayLanguageCode(String displayLanguageCode) {
        this.displayLanguageCode = displayLanguageCode;
        return this;
    }

    /**
     * <p>
     * The language code passed in with the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>de, en, es, fr, it, ja, ko, pt, zh, zh-TW
     *
     * @param displayLanguageCode <p>
     *            The language code passed in with the request.
     *            </p>
     * @see DisplayLanguageCode
     */
    public void setDisplayLanguageCode(DisplayLanguageCode displayLanguageCode) {
        this.displayLanguageCode = displayLanguageCode.toString();
    }

    /**
     * <p>
     * The language code passed in with the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>de, en, es, fr, it, ja, ko, pt, zh, zh-TW
     *
     * @param displayLanguageCode <p>
     *            The language code passed in with the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DisplayLanguageCode
     */
    public ListLanguagesResult withDisplayLanguageCode(DisplayLanguageCode displayLanguageCode) {
        this.displayLanguageCode = displayLanguageCode.toString();
        return this;
    }

    /**
     * <p>
     * If the response does not include all remaining results, use the NextToken
     * in the next request to fetch the next group of supported languages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     *
     * @return <p>
     *         If the response does not include all remaining results, use the
     *         NextToken in the next request to fetch the next group of
     *         supported languages.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response does not include all remaining results, use the NextToken
     * in the next request to fetch the next group of supported languages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     *
     * @param nextToken <p>
     *            If the response does not include all remaining results, use
     *            the NextToken in the next request to fetch the next group of
     *            supported languages.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response does not include all remaining results, use the NextToken
     * in the next request to fetch the next group of supported languages.
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
     *            If the response does not include all remaining results, use
     *            the NextToken in the next request to fetch the next group of
     *            supported languages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLanguagesResult withNextToken(String nextToken) {
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
        if (getLanguages() != null)
            sb.append("Languages: " + getLanguages() + ",");
        if (getDisplayLanguageCode() != null)
            sb.append("DisplayLanguageCode: " + getDisplayLanguageCode() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguages() == null) ? 0 : getLanguages().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayLanguageCode() == null) ? 0 : getDisplayLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLanguagesResult == false)
            return false;
        ListLanguagesResult other = (ListLanguagesResult) obj;

        if (other.getLanguages() == null ^ this.getLanguages() == null)
            return false;
        if (other.getLanguages() != null
                && other.getLanguages().equals(this.getLanguages()) == false)
            return false;
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
        return true;
    }
}
