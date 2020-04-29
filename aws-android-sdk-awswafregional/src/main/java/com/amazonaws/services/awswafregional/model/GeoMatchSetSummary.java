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

package com.amazonaws.services.awswafregional.model;

import java.io.Serializable;

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
 * Contains the identifier and the name of the <code>GeoMatchSet</code>.
 * </p>
 */
public class GeoMatchSetSummary implements Serializable {
    /**
     * <p>
     * The <code>GeoMatchSetId</code> for an <a>GeoMatchSet</a>. You can use
     * <code>GeoMatchSetId</code> in a <a>GetGeoMatchSet</a> request to get
     * detailed information about an <a>GeoMatchSet</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String geoMatchSetId;

    /**
     * <p>
     * A friendly name or description of the <a>GeoMatchSet</a>. You can't
     * change the name of an <code>GeoMatchSet</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * The <code>GeoMatchSetId</code> for an <a>GeoMatchSet</a>. You can use
     * <code>GeoMatchSetId</code> in a <a>GetGeoMatchSet</a> request to get
     * detailed information about an <a>GeoMatchSet</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>GeoMatchSetId</code> for an <a>GeoMatchSet</a>. You can
     *         use <code>GeoMatchSetId</code> in a <a>GetGeoMatchSet</a> request
     *         to get detailed information about an <a>GeoMatchSet</a>.
     *         </p>
     */
    public String getGeoMatchSetId() {
        return geoMatchSetId;
    }

    /**
     * <p>
     * The <code>GeoMatchSetId</code> for an <a>GeoMatchSet</a>. You can use
     * <code>GeoMatchSetId</code> in a <a>GetGeoMatchSet</a> request to get
     * detailed information about an <a>GeoMatchSet</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param geoMatchSetId <p>
     *            The <code>GeoMatchSetId</code> for an <a>GeoMatchSet</a>. You
     *            can use <code>GeoMatchSetId</code> in a <a>GetGeoMatchSet</a>
     *            request to get detailed information about an
     *            <a>GeoMatchSet</a>.
     *            </p>
     */
    public void setGeoMatchSetId(String geoMatchSetId) {
        this.geoMatchSetId = geoMatchSetId;
    }

    /**
     * <p>
     * The <code>GeoMatchSetId</code> for an <a>GeoMatchSet</a>. You can use
     * <code>GeoMatchSetId</code> in a <a>GetGeoMatchSet</a> request to get
     * detailed information about an <a>GeoMatchSet</a>.
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
     *            The <code>GeoMatchSetId</code> for an <a>GeoMatchSet</a>. You
     *            can use <code>GeoMatchSetId</code> in a <a>GetGeoMatchSet</a>
     *            request to get detailed information about an
     *            <a>GeoMatchSet</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoMatchSetSummary withGeoMatchSetId(String geoMatchSetId) {
        this.geoMatchSetId = geoMatchSetId;
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <a>GeoMatchSet</a>. You can't
     * change the name of an <code>GeoMatchSet</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description of the <a>GeoMatchSet</a>. You
     *         can't change the name of an <code>GeoMatchSet</code> after you
     *         create it.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>GeoMatchSet</a>. You can't
     * change the name of an <code>GeoMatchSet</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the <a>GeoMatchSet</a>. You
     *            can't change the name of an <code>GeoMatchSet</code> after you
     *            create it.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>GeoMatchSet</a>. You can't
     * change the name of an <code>GeoMatchSet</code> after you create it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the <a>GeoMatchSet</a>. You
     *            can't change the name of an <code>GeoMatchSet</code> after you
     *            create it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoMatchSetSummary withName(String name) {
        this.name = name;
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
            sb.append("GeoMatchSetId: " + getGeoMatchSetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGeoMatchSetId() == null) ? 0 : getGeoMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoMatchSetSummary == false)
            return false;
        GeoMatchSetSummary other = (GeoMatchSetSummary) obj;

        if (other.getGeoMatchSetId() == null ^ this.getGeoMatchSetId() == null)
            return false;
        if (other.getGeoMatchSetId() != null
                && other.getGeoMatchSetId().equals(this.getGeoMatchSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
