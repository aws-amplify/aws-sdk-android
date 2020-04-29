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
 * Specifies the type of update to perform to an <a>GeoMatchSet</a> with
 * <a>UpdateGeoMatchSet</a>.
 * </p>
 */
public class GeoMatchSetUpdate implements Serializable {
    /**
     * <p>
     * Specifies whether to insert or delete a country with
     * <a>UpdateGeoMatchSet</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     */
    private String action;

    /**
     * <p>
     * The country from which web requests originate that you want AWS WAF to
     * search for.
     * </p>
     */
    private GeoMatchConstraint geoMatchConstraint;

    /**
     * <p>
     * Specifies whether to insert or delete a country with
     * <a>UpdateGeoMatchSet</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @return <p>
     *         Specifies whether to insert or delete a country with
     *         <a>UpdateGeoMatchSet</a>.
     *         </p>
     * @see ChangeAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a country with
     * <a>UpdateGeoMatchSet</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert or delete a country with
     *            <a>UpdateGeoMatchSet</a>.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a country with
     * <a>UpdateGeoMatchSet</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert or delete a country with
     *            <a>UpdateGeoMatchSet</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public GeoMatchSetUpdate withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a country with
     * <a>UpdateGeoMatchSet</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert or delete a country with
     *            <a>UpdateGeoMatchSet</a>.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * Specifies whether to insert or delete a country with
     * <a>UpdateGeoMatchSet</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert or delete a country with
     *            <a>UpdateGeoMatchSet</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public GeoMatchSetUpdate withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The country from which web requests originate that you want AWS WAF to
     * search for.
     * </p>
     *
     * @return <p>
     *         The country from which web requests originate that you want AWS
     *         WAF to search for.
     *         </p>
     */
    public GeoMatchConstraint getGeoMatchConstraint() {
        return geoMatchConstraint;
    }

    /**
     * <p>
     * The country from which web requests originate that you want AWS WAF to
     * search for.
     * </p>
     *
     * @param geoMatchConstraint <p>
     *            The country from which web requests originate that you want
     *            AWS WAF to search for.
     *            </p>
     */
    public void setGeoMatchConstraint(GeoMatchConstraint geoMatchConstraint) {
        this.geoMatchConstraint = geoMatchConstraint;
    }

    /**
     * <p>
     * The country from which web requests originate that you want AWS WAF to
     * search for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geoMatchConstraint <p>
     *            The country from which web requests originate that you want
     *            AWS WAF to search for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoMatchSetUpdate withGeoMatchConstraint(GeoMatchConstraint geoMatchConstraint) {
        this.geoMatchConstraint = geoMatchConstraint;
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getGeoMatchConstraint() != null)
            sb.append("GeoMatchConstraint: " + getGeoMatchConstraint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getGeoMatchConstraint() == null) ? 0 : getGeoMatchConstraint().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoMatchSetUpdate == false)
            return false;
        GeoMatchSetUpdate other = (GeoMatchSetUpdate) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getGeoMatchConstraint() == null ^ this.getGeoMatchConstraint() == null)
            return false;
        if (other.getGeoMatchConstraint() != null
                && other.getGeoMatchConstraint().equals(this.getGeoMatchConstraint()) == false)
            return false;
        return true;
    }
}
