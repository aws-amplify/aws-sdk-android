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

package com.amazonaws.services.awswaf.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <note>
 * <p>
 * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the
 * <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>. With the latest version, AWS WAF has a single set of
 * endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * Returns the <a>GeoMatchSet</a> that is specified by
 * <code>GeoMatchSetId</code>.
 * </p>
 */
public class GetGeoMatchSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to
     * get. <code>GeoMatchSetId</code> is returned by <a>CreateGeoMatchSet</a>
     * and by <a>ListGeoMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String geoMatchSetId;

    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to
     * get. <code>GeoMatchSetId</code> is returned by <a>CreateGeoMatchSet</a>
     * and by <a>ListGeoMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you
     *         want to get. <code>GeoMatchSetId</code> is returned by
     *         <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     *         </p>
     */
    public String getGeoMatchSetId() {
        return geoMatchSetId;
    }

    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to
     * get. <code>GeoMatchSetId</code> is returned by <a>CreateGeoMatchSet</a>
     * and by <a>ListGeoMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param geoMatchSetId <p>
     *            The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that
     *            you want to get. <code>GeoMatchSetId</code> is returned by
     *            <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     *            </p>
     */
    public void setGeoMatchSetId(String geoMatchSetId) {
        this.geoMatchSetId = geoMatchSetId;
    }

    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to
     * get. <code>GeoMatchSetId</code> is returned by <a>CreateGeoMatchSet</a>
     * and by <a>ListGeoMatchSets</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param geoMatchSetId <p>
     *            The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that
     *            you want to get. <code>GeoMatchSetId</code> is returned by
     *            <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetGeoMatchSetRequest withGeoMatchSetId(String geoMatchSetId) {
        this.geoMatchSetId = geoMatchSetId;
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
        if (getGeoMatchSetId() != null)
            sb.append("GeoMatchSetId: " + getGeoMatchSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGeoMatchSetId() == null) ? 0 : getGeoMatchSetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGeoMatchSetRequest == false)
            return false;
        GetGeoMatchSetRequest other = (GetGeoMatchSetRequest) obj;

        if (other.getGeoMatchSetId() == null ^ this.getGeoMatchSetId() == null)
            return false;
        if (other.getGeoMatchSetId() != null
                && other.getGeoMatchSetId().equals(this.getGeoMatchSetId()) == false)
            return false;
        return true;
    }
}
