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
 * Returns an array of <a>GeoMatchSetSummary</a> objects in the response.
 * </p>
 */
public class ListGeoMatchSetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * If you specify a value for <code>Limit</code> and you have more
     * <code>GeoMatchSet</code>s than the value of <code>Limit</code>, AWS WAF
     * returns a <code>NextMarker</code> value in the response that allows you
     * to list another group of <code>GeoMatchSet</code> objects. For the second
     * and subsequent <code>ListGeoMatchSets</code> requests, specify the value
     * of <code>NextMarker</code> from the previous response to get information
     * about another batch of <code>GeoMatchSet</code> objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * Specifies the number of <code>GeoMatchSet</code> objects that you want
     * AWS WAF to return for this request. If you have more
     * <code>GeoMatchSet</code> objects than the number you specify for
     * <code>Limit</code>, the response includes a <code>NextMarker</code> value
     * that you can use to get another batch of <code>GeoMatchSet</code>
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer limit;

    /**
     * <p>
     * If you specify a value for <code>Limit</code> and you have more
     * <code>GeoMatchSet</code>s than the value of <code>Limit</code>, AWS WAF
     * returns a <code>NextMarker</code> value in the response that allows you
     * to list another group of <code>GeoMatchSet</code> objects. For the second
     * and subsequent <code>ListGeoMatchSets</code> requests, specify the value
     * of <code>NextMarker</code> from the previous response to get information
     * about another batch of <code>GeoMatchSet</code> objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If you specify a value for <code>Limit</code> and you have more
     *         <code>GeoMatchSet</code>s than the value of <code>Limit</code>,
     *         AWS WAF returns a <code>NextMarker</code> value in the response
     *         that allows you to list another group of <code>GeoMatchSet</code>
     *         objects. For the second and subsequent
     *         <code>ListGeoMatchSets</code> requests, specify the value of
     *         <code>NextMarker</code> from the previous response to get
     *         information about another batch of <code>GeoMatchSet</code>
     *         objects.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * If you specify a value for <code>Limit</code> and you have more
     * <code>GeoMatchSet</code>s than the value of <code>Limit</code>, AWS WAF
     * returns a <code>NextMarker</code> value in the response that allows you
     * to list another group of <code>GeoMatchSet</code> objects. For the second
     * and subsequent <code>ListGeoMatchSets</code> requests, specify the value
     * of <code>NextMarker</code> from the previous response to get information
     * about another batch of <code>GeoMatchSet</code> objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            If you specify a value for <code>Limit</code> and you have
     *            more <code>GeoMatchSet</code>s than the value of
     *            <code>Limit</code>, AWS WAF returns a <code>NextMarker</code>
     *            value in the response that allows you to list another group of
     *            <code>GeoMatchSet</code> objects. For the second and
     *            subsequent <code>ListGeoMatchSets</code> requests, specify the
     *            value of <code>NextMarker</code> from the previous response to
     *            get information about another batch of
     *            <code>GeoMatchSet</code> objects.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If you specify a value for <code>Limit</code> and you have more
     * <code>GeoMatchSet</code>s than the value of <code>Limit</code>, AWS WAF
     * returns a <code>NextMarker</code> value in the response that allows you
     * to list another group of <code>GeoMatchSet</code> objects. For the second
     * and subsequent <code>ListGeoMatchSets</code> requests, specify the value
     * of <code>NextMarker</code> from the previous response to get information
     * about another batch of <code>GeoMatchSet</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            If you specify a value for <code>Limit</code> and you have
     *            more <code>GeoMatchSet</code>s than the value of
     *            <code>Limit</code>, AWS WAF returns a <code>NextMarker</code>
     *            value in the response that allows you to list another group of
     *            <code>GeoMatchSet</code> objects. For the second and
     *            subsequent <code>ListGeoMatchSets</code> requests, specify the
     *            value of <code>NextMarker</code> from the previous response to
     *            get information about another batch of
     *            <code>GeoMatchSet</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoMatchSetsRequest withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * <p>
     * Specifies the number of <code>GeoMatchSet</code> objects that you want
     * AWS WAF to return for this request. If you have more
     * <code>GeoMatchSet</code> objects than the number you specify for
     * <code>Limit</code>, the response includes a <code>NextMarker</code> value
     * that you can use to get another batch of <code>GeoMatchSet</code>
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         Specifies the number of <code>GeoMatchSet</code> objects that you
     *         want AWS WAF to return for this request. If you have more
     *         <code>GeoMatchSet</code> objects than the number you specify for
     *         <code>Limit</code>, the response includes a
     *         <code>NextMarker</code> value that you can use to get another
     *         batch of <code>GeoMatchSet</code> objects.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * Specifies the number of <code>GeoMatchSet</code> objects that you want
     * AWS WAF to return for this request. If you have more
     * <code>GeoMatchSet</code> objects than the number you specify for
     * <code>Limit</code>, the response includes a <code>NextMarker</code> value
     * that you can use to get another batch of <code>GeoMatchSet</code>
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param limit <p>
     *            Specifies the number of <code>GeoMatchSet</code> objects that
     *            you want AWS WAF to return for this request. If you have more
     *            <code>GeoMatchSet</code> objects than the number you specify
     *            for <code>Limit</code>, the response includes a
     *            <code>NextMarker</code> value that you can use to get another
     *            batch of <code>GeoMatchSet</code> objects.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Specifies the number of <code>GeoMatchSet</code> objects that you want
     * AWS WAF to return for this request. If you have more
     * <code>GeoMatchSet</code> objects than the number you specify for
     * <code>Limit</code>, the response includes a <code>NextMarker</code> value
     * that you can use to get another batch of <code>GeoMatchSet</code>
     * objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param limit <p>
     *            Specifies the number of <code>GeoMatchSet</code> objects that
     *            you want AWS WAF to return for this request. If you have more
     *            <code>GeoMatchSet</code> objects than the number you specify
     *            for <code>Limit</code>, the response includes a
     *            <code>NextMarker</code> value that you can use to get another
     *            batch of <code>GeoMatchSet</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoMatchSetsRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGeoMatchSetsRequest == false)
            return false;
        ListGeoMatchSetsRequest other = (ListGeoMatchSetsRequest) obj;

        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }
}
