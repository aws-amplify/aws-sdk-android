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
 * Inserts or deletes <a>GeoMatchConstraint</a> objects in an
 * <code>GeoMatchSet</code>. For each <code>GeoMatchConstraint</code> object,
 * you specify the following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Whether to insert or delete the object from the array. If you want to change
 * an <code>GeoMatchConstraint</code> object, you delete the existing object and
 * add a new one.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>Type</code>. The only valid value for <code>Type</code> is
 * <code>Country</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>Value</code>, which is a two character code for the country to add
 * to the <code>GeoMatchConstraint</code> object. Valid codes are listed in
 * <a>GeoMatchConstraint$Value</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To create and configure an <code>GeoMatchSet</code>, perform the following
 * steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Submit a <a>CreateGeoMatchSet</a> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <a>GetChangeToken</a> to get the change token that you provide in the
 * <code>ChangeToken</code> parameter of an <a>UpdateGeoMatchSet</a> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit an <code>UpdateGeoMatchSet</code> request to specify the country that
 * you want AWS WAF to watch for.
 * </p>
 * </li>
 * </ol>
 * <p>
 * When you update an <code>GeoMatchSet</code>, you specify the country that you
 * want to add and/or the country that you want to delete. If you want to change
 * a country, you delete the existing country and add the new one.
 * </p>
 * <p>
 * For more information about how to use the AWS WAF API to allow or block HTTP
 * requests, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
 * Developer Guide</a>.
 * </p>
 */
public class UpdateGeoMatchSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to
     * update. <code>GeoMatchSetId</code> is returned by
     * <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String geoMatchSetId;

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String changeToken;

    /**
     * <p>
     * An array of <code>GeoMatchSetUpdate</code> objects that you want to
     * insert into or delete from an <a>GeoMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>GeoMatchConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GeoMatchConstraint</a>: Contains <code>Type</code> and
     * <code>Value</code>
     * </p>
     * <p>
     * You can have only one <code>Type</code> and <code>Value</code> per
     * <code>GeoMatchConstraint</code>. To add multiple countries, include
     * multiple <code>GeoMatchSetUpdate</code> objects in your request.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<GeoMatchSetUpdate> updates;

    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to
     * update. <code>GeoMatchSetId</code> is returned by
     * <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you
     *         want to update. <code>GeoMatchSetId</code> is returned by
     *         <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     *         </p>
     */
    public String getGeoMatchSetId() {
        return geoMatchSetId;
    }

    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to
     * update. <code>GeoMatchSetId</code> is returned by
     * <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param geoMatchSetId <p>
     *            The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that
     *            you want to update. <code>GeoMatchSetId</code> is returned by
     *            <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     *            </p>
     */
    public void setGeoMatchSetId(String geoMatchSetId) {
        this.geoMatchSetId = geoMatchSetId;
    }

    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to
     * update. <code>GeoMatchSetId</code> is returned by
     * <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
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
     *            you want to update. <code>GeoMatchSetId</code> is returned by
     *            <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGeoMatchSetRequest withGeoMatchSetId(String geoMatchSetId) {
        this.geoMatchSetId = geoMatchSetId;
        return this;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The value returned by the most recent call to
     *         <a>GetChangeToken</a>.
     *         </p>
     */
    public String getChangeToken() {
        return changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param changeToken <p>
     *            The value returned by the most recent call to
     *            <a>GetChangeToken</a>.
     *            </p>
     */
    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param changeToken <p>
     *            The value returned by the most recent call to
     *            <a>GetChangeToken</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGeoMatchSetRequest withChangeToken(String changeToken) {
        this.changeToken = changeToken;
        return this;
    }

    /**
     * <p>
     * An array of <code>GeoMatchSetUpdate</code> objects that you want to
     * insert into or delete from an <a>GeoMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>GeoMatchConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GeoMatchConstraint</a>: Contains <code>Type</code> and
     * <code>Value</code>
     * </p>
     * <p>
     * You can have only one <code>Type</code> and <code>Value</code> per
     * <code>GeoMatchConstraint</code>. To add multiple countries, include
     * multiple <code>GeoMatchSetUpdate</code> objects in your request.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         An array of <code>GeoMatchSetUpdate</code> objects that you want
     *         to insert into or delete from an <a>GeoMatchSet</a>. For more
     *         information, see the applicable data types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and
     *         <code>GeoMatchConstraint</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>GeoMatchConstraint</a>: Contains <code>Type</code> and
     *         <code>Value</code>
     *         </p>
     *         <p>
     *         You can have only one <code>Type</code> and <code>Value</code>
     *         per <code>GeoMatchConstraint</code>. To add multiple countries,
     *         include multiple <code>GeoMatchSetUpdate</code> objects in your
     *         request.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<GeoMatchSetUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>GeoMatchSetUpdate</code> objects that you want to
     * insert into or delete from an <a>GeoMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>GeoMatchConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GeoMatchConstraint</a>: Contains <code>Type</code> and
     * <code>Value</code>
     * </p>
     * <p>
     * You can have only one <code>Type</code> and <code>Value</code> per
     * <code>GeoMatchConstraint</code>. To add multiple countries, include
     * multiple <code>GeoMatchSetUpdate</code> objects in your request.
     * </p>
     * </li>
     * </ul>
     *
     * @param updates <p>
     *            An array of <code>GeoMatchSetUpdate</code> objects that you
     *            want to insert into or delete from an <a>GeoMatchSet</a>. For
     *            more information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and
     *            <code>GeoMatchConstraint</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>GeoMatchConstraint</a>: Contains <code>Type</code> and
     *            <code>Value</code>
     *            </p>
     *            <p>
     *            You can have only one <code>Type</code> and <code>Value</code>
     *            per <code>GeoMatchConstraint</code>. To add multiple
     *            countries, include multiple <code>GeoMatchSetUpdate</code>
     *            objects in your request.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setUpdates(java.util.Collection<GeoMatchSetUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<GeoMatchSetUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>GeoMatchSetUpdate</code> objects that you want to
     * insert into or delete from an <a>GeoMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>GeoMatchConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GeoMatchConstraint</a>: Contains <code>Type</code> and
     * <code>Value</code>
     * </p>
     * <p>
     * You can have only one <code>Type</code> and <code>Value</code> per
     * <code>GeoMatchConstraint</code>. To add multiple countries, include
     * multiple <code>GeoMatchSetUpdate</code> objects in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>GeoMatchSetUpdate</code> objects that you
     *            want to insert into or delete from an <a>GeoMatchSet</a>. For
     *            more information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and
     *            <code>GeoMatchConstraint</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>GeoMatchConstraint</a>: Contains <code>Type</code> and
     *            <code>Value</code>
     *            </p>
     *            <p>
     *            You can have only one <code>Type</code> and <code>Value</code>
     *            per <code>GeoMatchConstraint</code>. To add multiple
     *            countries, include multiple <code>GeoMatchSetUpdate</code>
     *            objects in your request.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGeoMatchSetRequest withUpdates(GeoMatchSetUpdate... updates) {
        if (getUpdates() == null) {
            this.updates = new java.util.ArrayList<GeoMatchSetUpdate>(updates.length);
        }
        for (GeoMatchSetUpdate value : updates) {
            this.updates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>GeoMatchSetUpdate</code> objects that you want to
     * insert into or delete from an <a>GeoMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>GeoMatchConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GeoMatchConstraint</a>: Contains <code>Type</code> and
     * <code>Value</code>
     * </p>
     * <p>
     * You can have only one <code>Type</code> and <code>Value</code> per
     * <code>GeoMatchConstraint</code>. To add multiple countries, include
     * multiple <code>GeoMatchSetUpdate</code> objects in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>GeoMatchSetUpdate</code> objects that you
     *            want to insert into or delete from an <a>GeoMatchSet</a>. For
     *            more information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>GeoMatchSetUpdate</a>: Contains <code>Action</code> and
     *            <code>GeoMatchConstraint</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>GeoMatchConstraint</a>: Contains <code>Type</code> and
     *            <code>Value</code>
     *            </p>
     *            <p>
     *            You can have only one <code>Type</code> and <code>Value</code>
     *            per <code>GeoMatchConstraint</code>. To add multiple
     *            countries, include multiple <code>GeoMatchSetUpdate</code>
     *            objects in your request.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGeoMatchSetRequest withUpdates(java.util.Collection<GeoMatchSetUpdate> updates) {
        setUpdates(updates);
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
        if (getChangeToken() != null)
            sb.append("ChangeToken: " + getChangeToken() + ",");
        if (getUpdates() != null)
            sb.append("Updates: " + getUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGeoMatchSetId() == null) ? 0 : getGeoMatchSetId().hashCode());
        hashCode = prime * hashCode
                + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGeoMatchSetRequest == false)
            return false;
        UpdateGeoMatchSetRequest other = (UpdateGeoMatchSetRequest) obj;

        if (other.getGeoMatchSetId() == null ^ this.getGeoMatchSetId() == null)
            return false;
        if (other.getGeoMatchSetId() != null
                && other.getGeoMatchSetId().equals(this.getGeoMatchSetId()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null
                && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        return true;
    }
}
