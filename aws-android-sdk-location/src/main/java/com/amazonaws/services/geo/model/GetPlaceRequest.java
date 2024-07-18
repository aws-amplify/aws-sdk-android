/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Finds a place by its unique ID. A <code>PlaceId</code> is returned by other
 * search operations.
 * </p>
 * <note>
 * <p>
 * A PlaceId is valid only if all of the following are the same in the original
 * search request and the call to <code>GetPlace</code>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Customer Amazon Web Services account
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Web Services Region
 * </p>
 * </li>
 * <li>
 * <p>
 * Data provider specified in the place index resource
 * </p>
 * </li>
 * </ul>
 * </note>
 */
public class GetPlaceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the place index resource that you want to use for the search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     */
    private String indexName;

    /**
     * <p>
     * The identifier of the place to find.
     * </p>
     */
    private String placeId;

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid
     * <a href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag,
     * for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results, but not the
     * results themselves. If no language is specified, or not supported for a
     * particular result, the partner automatically chooses a language for the
     * result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for a location
     * around Athens, Greece, with the <code>language</code> parameter set to
     * <code>en</code>. The <code>city</code> in the results will most likely be
     * returned as <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for
     * Greek, then the <code>city</code> in the results will more likely be
     * returned as <code>Αθήνα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be
     * in a language that the provider does support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 35<br/>
     */
    private String language;

    /**
     * <p>
     * The optional <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     * >API key</a> to authorize the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String key;

    /**
     * <p>
     * The name of the place index resource that you want to use for the search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @return <p>
     *         The name of the place index resource that you want to use for the
     *         search.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The name of the place index resource that you want to use for the search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param indexName <p>
     *            The name of the place index resource that you want to use for
     *            the search.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the place index resource that you want to use for the search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param indexName <p>
     *            The name of the place index resource that you want to use for
     *            the search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPlaceRequest withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * The identifier of the place to find.
     * </p>
     *
     * @return <p>
     *         The identifier of the place to find.
     *         </p>
     */
    public String getPlaceId() {
        return placeId;
    }

    /**
     * <p>
     * The identifier of the place to find.
     * </p>
     *
     * @param placeId <p>
     *            The identifier of the place to find.
     *            </p>
     */
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    /**
     * <p>
     * The identifier of the place to find.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placeId <p>
     *            The identifier of the place to find.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPlaceRequest withPlaceId(String placeId) {
        this.placeId = placeId;
        return this;
    }

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid
     * <a href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag,
     * for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results, but not the
     * results themselves. If no language is specified, or not supported for a
     * particular result, the partner automatically chooses a language for the
     * result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for a location
     * around Athens, Greece, with the <code>language</code> parameter set to
     * <code>en</code>. The <code>city</code> in the results will most likely be
     * returned as <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for
     * Greek, then the <code>city</code> in the results will more likely be
     * returned as <code>Αθήνα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be
     * in a language that the provider does support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 35<br/>
     *
     * @return <p>
     *         The preferred language used to return results. The value must be
     *         a valid <a href="https://tools.ietf.org/search/bcp47">BCP 47</a>
     *         language tag, for example, <code>en</code> for English.
     *         </p>
     *         <p>
     *         This setting affects the languages used in the results, but not
     *         the results themselves. If no language is specified, or not
     *         supported for a particular result, the partner automatically
     *         chooses a language for the result.
     *         </p>
     *         <p>
     *         For an example, we'll use the Greek language. You search for a
     *         location around Athens, Greece, with the <code>language</code>
     *         parameter set to <code>en</code>. The <code>city</code> in the
     *         results will most likely be returned as <code>Athens</code>.
     *         </p>
     *         <p>
     *         If you set the <code>language</code> parameter to <code>el</code>
     *         , for Greek, then the <code>city</code> in the results will more
     *         likely be returned as <code>Αθήνα</code>.
     *         </p>
     *         <p>
     *         If the data provider does not have a value for Greek, the result
     *         will be in a language that the provider does support.
     *         </p>
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid
     * <a href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag,
     * for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results, but not the
     * results themselves. If no language is specified, or not supported for a
     * particular result, the partner automatically chooses a language for the
     * result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for a location
     * around Athens, Greece, with the <code>language</code> parameter set to
     * <code>en</code>. The <code>city</code> in the results will most likely be
     * returned as <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for
     * Greek, then the <code>city</code> in the results will more likely be
     * returned as <code>Αθήνα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be
     * in a language that the provider does support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 35<br/>
     *
     * @param language <p>
     *            The preferred language used to return results. The value must
     *            be a valid <a href="https://tools.ietf.org/search/bcp47">BCP
     *            47</a> language tag, for example, <code>en</code> for English.
     *            </p>
     *            <p>
     *            This setting affects the languages used in the results, but
     *            not the results themselves. If no language is specified, or
     *            not supported for a particular result, the partner
     *            automatically chooses a language for the result.
     *            </p>
     *            <p>
     *            For an example, we'll use the Greek language. You search for a
     *            location around Athens, Greece, with the <code>language</code>
     *            parameter set to <code>en</code>. The <code>city</code> in the
     *            results will most likely be returned as <code>Athens</code>.
     *            </p>
     *            <p>
     *            If you set the <code>language</code> parameter to
     *            <code>el</code>, for Greek, then the <code>city</code> in the
     *            results will more likely be returned as <code>Αθήνα</code>.
     *            </p>
     *            <p>
     *            If the data provider does not have a value for Greek, the
     *            result will be in a language that the provider does support.
     *            </p>
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid
     * <a href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag,
     * for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results, but not the
     * results themselves. If no language is specified, or not supported for a
     * particular result, the partner automatically chooses a language for the
     * result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for a location
     * around Athens, Greece, with the <code>language</code> parameter set to
     * <code>en</code>. The <code>city</code> in the results will most likely be
     * returned as <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for
     * Greek, then the <code>city</code> in the results will more likely be
     * returned as <code>Αθήνα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be
     * in a language that the provider does support.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 35<br/>
     *
     * @param language <p>
     *            The preferred language used to return results. The value must
     *            be a valid <a href="https://tools.ietf.org/search/bcp47">BCP
     *            47</a> language tag, for example, <code>en</code> for English.
     *            </p>
     *            <p>
     *            This setting affects the languages used in the results, but
     *            not the results themselves. If no language is specified, or
     *            not supported for a particular result, the partner
     *            automatically chooses a language for the result.
     *            </p>
     *            <p>
     *            For an example, we'll use the Greek language. You search for a
     *            location around Athens, Greece, with the <code>language</code>
     *            parameter set to <code>en</code>. The <code>city</code> in the
     *            results will most likely be returned as <code>Athens</code>.
     *            </p>
     *            <p>
     *            If you set the <code>language</code> parameter to
     *            <code>el</code>, for Greek, then the <code>city</code> in the
     *            results will more likely be returned as <code>Αθήνα</code>.
     *            </p>
     *            <p>
     *            If the data provider does not have a value for Greek, the
     *            result will be in a language that the provider does support.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPlaceRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * <p>
     * The optional <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     * >API key</a> to authorize the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         The optional <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     *         >API key</a> to authorize the request.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The optional <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     * >API key</a> to authorize the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param key <p>
     *            The optional <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     *            >API key</a> to authorize the request.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The optional <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     * >API key</a> to authorize the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param key <p>
     *            The optional <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     *            >API key</a> to authorize the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPlaceRequest withKey(String key) {
        this.key = key;
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
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
        if (getPlaceId() != null)
            sb.append("PlaceId: " + getPlaceId() + ",");
        if (getLanguage() != null)
            sb.append("Language: " + getLanguage() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getPlaceId() == null) ? 0 : getPlaceId().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPlaceRequest == false)
            return false;
        GetPlaceRequest other = (GetPlaceRequest) obj;

        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getPlaceId() == null ^ this.getPlaceId() == null)
            return false;
        if (other.getPlaceId() != null && other.getPlaceId().equals(this.getPlaceId()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }
}
