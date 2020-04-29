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
 * Specifies the <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
 * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, and
 * <a>SizeConstraintSet</a> objects that you want to add to a <code>Rule</code>
 * and, for each object, indicates whether you want to negate the settings, for
 * example, requests that do NOT originate from the IP address 192.0.2.44.
 * </p>
 */
public class Predicate implements Serializable {
    /**
     * <p>
     * Set <code>Negated</code> to <code>False</code> if you want AWS WAF to
     * allow, block, or count requests based on the settings in the specified
     * <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     * <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code> includes
     * the IP address <code>192.0.2.44</code>, AWS WAF will allow or block
     * requests based on that IP address.
     * </p>
     * <p>
     * Set <code>Negated</code> to <code>True</code> if you want AWS WAF to
     * allow or block a request based on the negation of the settings in the
     * <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     * <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code> includes
     * the IP address <code>192.0.2.44</code>, AWS WAF will allow, block, or
     * count requests based on all IP addresses <i>except</i>
     * <code>192.0.2.44</code>.
     * </p>
     */
    private Boolean negated;

    /**
     * <p>
     * The type of predicate in a <code>Rule</code>, such as
     * <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPMatch, ByteMatch, SqlInjectionMatch, GeoMatch,
     * SizeConstraint, XssMatch, RegexMatch
     */
    private String type;

    /**
     * <p>
     * A unique identifier for a predicate in a <code>Rule</code>, such as
     * <code>ByteMatchSetId</code> or <code>IPSetId</code>. The ID is returned
     * by the corresponding <code>Create</code> or <code>List</code> command.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String dataId;

    /**
     * <p>
     * Set <code>Negated</code> to <code>False</code> if you want AWS WAF to
     * allow, block, or count requests based on the settings in the specified
     * <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     * <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code> includes
     * the IP address <code>192.0.2.44</code>, AWS WAF will allow or block
     * requests based on that IP address.
     * </p>
     * <p>
     * Set <code>Negated</code> to <code>True</code> if you want AWS WAF to
     * allow or block a request based on the negation of the settings in the
     * <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     * <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code> includes
     * the IP address <code>192.0.2.44</code>, AWS WAF will allow, block, or
     * count requests based on all IP addresses <i>except</i>
     * <code>192.0.2.44</code>.
     * </p>
     *
     * @return <p>
     *         Set <code>Negated</code> to <code>False</code> if you want AWS
     *         WAF to allow, block, or count requests based on the settings in
     *         the specified <a>ByteMatchSet</a>, <a>IPSet</a>,
     *         <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>,
     *         <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     *         <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code>
     *         includes the IP address <code>192.0.2.44</code>, AWS WAF will
     *         allow or block requests based on that IP address.
     *         </p>
     *         <p>
     *         Set <code>Negated</code> to <code>True</code> if you want AWS WAF
     *         to allow or block a request based on the negation of the settings
     *         in the <a>ByteMatchSet</a>, <a>IPSet</a>,
     *         <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>,
     *         <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     *         <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code>
     *         includes the IP address <code>192.0.2.44</code>, AWS WAF will
     *         allow, block, or count requests based on all IP addresses
     *         <i>except</i> <code>192.0.2.44</code>.
     *         </p>
     */
    public Boolean isNegated() {
        return negated;
    }

    /**
     * <p>
     * Set <code>Negated</code> to <code>False</code> if you want AWS WAF to
     * allow, block, or count requests based on the settings in the specified
     * <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     * <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code> includes
     * the IP address <code>192.0.2.44</code>, AWS WAF will allow or block
     * requests based on that IP address.
     * </p>
     * <p>
     * Set <code>Negated</code> to <code>True</code> if you want AWS WAF to
     * allow or block a request based on the negation of the settings in the
     * <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     * <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code> includes
     * the IP address <code>192.0.2.44</code>, AWS WAF will allow, block, or
     * count requests based on all IP addresses <i>except</i>
     * <code>192.0.2.44</code>.
     * </p>
     *
     * @return <p>
     *         Set <code>Negated</code> to <code>False</code> if you want AWS
     *         WAF to allow, block, or count requests based on the settings in
     *         the specified <a>ByteMatchSet</a>, <a>IPSet</a>,
     *         <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>,
     *         <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     *         <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code>
     *         includes the IP address <code>192.0.2.44</code>, AWS WAF will
     *         allow or block requests based on that IP address.
     *         </p>
     *         <p>
     *         Set <code>Negated</code> to <code>True</code> if you want AWS WAF
     *         to allow or block a request based on the negation of the settings
     *         in the <a>ByteMatchSet</a>, <a>IPSet</a>,
     *         <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>,
     *         <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     *         <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code>
     *         includes the IP address <code>192.0.2.44</code>, AWS WAF will
     *         allow, block, or count requests based on all IP addresses
     *         <i>except</i> <code>192.0.2.44</code>.
     *         </p>
     */
    public Boolean getNegated() {
        return negated;
    }

    /**
     * <p>
     * Set <code>Negated</code> to <code>False</code> if you want AWS WAF to
     * allow, block, or count requests based on the settings in the specified
     * <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     * <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code> includes
     * the IP address <code>192.0.2.44</code>, AWS WAF will allow or block
     * requests based on that IP address.
     * </p>
     * <p>
     * Set <code>Negated</code> to <code>True</code> if you want AWS WAF to
     * allow or block a request based on the negation of the settings in the
     * <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     * <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code> includes
     * the IP address <code>192.0.2.44</code>, AWS WAF will allow, block, or
     * count requests based on all IP addresses <i>except</i>
     * <code>192.0.2.44</code>.
     * </p>
     *
     * @param negated <p>
     *            Set <code>Negated</code> to <code>False</code> if you want AWS
     *            WAF to allow, block, or count requests based on the settings
     *            in the specified <a>ByteMatchSet</a>, <a>IPSet</a>,
     *            <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>,
     *            <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     *            <a>SizeConstraintSet</a>. For example, if an
     *            <code>IPSet</code> includes the IP address
     *            <code>192.0.2.44</code>, AWS WAF will allow or block requests
     *            based on that IP address.
     *            </p>
     *            <p>
     *            Set <code>Negated</code> to <code>True</code> if you want AWS
     *            WAF to allow or block a request based on the negation of the
     *            settings in the <a>ByteMatchSet</a>, <a>IPSet</a>,
     *            <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>,
     *            <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     *            <a>SizeConstraintSet</a>. For example, if an
     *            <code>IPSet</code> includes the IP address
     *            <code>192.0.2.44</code>, AWS WAF will allow, block, or count
     *            requests based on all IP addresses <i>except</i>
     *            <code>192.0.2.44</code>.
     *            </p>
     */
    public void setNegated(Boolean negated) {
        this.negated = negated;
    }

    /**
     * <p>
     * Set <code>Negated</code> to <code>False</code> if you want AWS WAF to
     * allow, block, or count requests based on the settings in the specified
     * <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     * <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code> includes
     * the IP address <code>192.0.2.44</code>, AWS WAF will allow or block
     * requests based on that IP address.
     * </p>
     * <p>
     * Set <code>Negated</code> to <code>True</code> if you want AWS WAF to
     * allow or block a request based on the negation of the settings in the
     * <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     * <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code> includes
     * the IP address <code>192.0.2.44</code>, AWS WAF will allow, block, or
     * count requests based on all IP addresses <i>except</i>
     * <code>192.0.2.44</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param negated <p>
     *            Set <code>Negated</code> to <code>False</code> if you want AWS
     *            WAF to allow, block, or count requests based on the settings
     *            in the specified <a>ByteMatchSet</a>, <a>IPSet</a>,
     *            <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>,
     *            <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     *            <a>SizeConstraintSet</a>. For example, if an
     *            <code>IPSet</code> includes the IP address
     *            <code>192.0.2.44</code>, AWS WAF will allow or block requests
     *            based on that IP address.
     *            </p>
     *            <p>
     *            Set <code>Negated</code> to <code>True</code> if you want AWS
     *            WAF to allow or block a request based on the negation of the
     *            settings in the <a>ByteMatchSet</a>, <a>IPSet</a>,
     *            <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>,
     *            <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or
     *            <a>SizeConstraintSet</a>. For example, if an
     *            <code>IPSet</code> includes the IP address
     *            <code>192.0.2.44</code>, AWS WAF will allow, block, or count
     *            requests based on all IP addresses <i>except</i>
     *            <code>192.0.2.44</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Predicate withNegated(Boolean negated) {
        this.negated = negated;
        return this;
    }

    /**
     * <p>
     * The type of predicate in a <code>Rule</code>, such as
     * <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPMatch, ByteMatch, SqlInjectionMatch, GeoMatch,
     * SizeConstraint, XssMatch, RegexMatch
     *
     * @return <p>
     *         The type of predicate in a <code>Rule</code>, such as
     *         <code>ByteMatch</code> or <code>IPSet</code>.
     *         </p>
     * @see PredicateType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of predicate in a <code>Rule</code>, such as
     * <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPMatch, ByteMatch, SqlInjectionMatch, GeoMatch,
     * SizeConstraint, XssMatch, RegexMatch
     *
     * @param type <p>
     *            The type of predicate in a <code>Rule</code>, such as
     *            <code>ByteMatch</code> or <code>IPSet</code>.
     *            </p>
     * @see PredicateType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of predicate in a <code>Rule</code>, such as
     * <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPMatch, ByteMatch, SqlInjectionMatch, GeoMatch,
     * SizeConstraint, XssMatch, RegexMatch
     *
     * @param type <p>
     *            The type of predicate in a <code>Rule</code>, such as
     *            <code>ByteMatch</code> or <code>IPSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PredicateType
     */
    public Predicate withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of predicate in a <code>Rule</code>, such as
     * <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPMatch, ByteMatch, SqlInjectionMatch, GeoMatch,
     * SizeConstraint, XssMatch, RegexMatch
     *
     * @param type <p>
     *            The type of predicate in a <code>Rule</code>, such as
     *            <code>ByteMatch</code> or <code>IPSet</code>.
     *            </p>
     * @see PredicateType
     */
    public void setType(PredicateType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of predicate in a <code>Rule</code>, such as
     * <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPMatch, ByteMatch, SqlInjectionMatch, GeoMatch,
     * SizeConstraint, XssMatch, RegexMatch
     *
     * @param type <p>
     *            The type of predicate in a <code>Rule</code>, such as
     *            <code>ByteMatch</code> or <code>IPSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PredicateType
     */
    public Predicate withType(PredicateType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for a predicate in a <code>Rule</code>, such as
     * <code>ByteMatchSetId</code> or <code>IPSetId</code>. The ID is returned
     * by the corresponding <code>Create</code> or <code>List</code> command.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A unique identifier for a predicate in a <code>Rule</code>, such
     *         as <code>ByteMatchSetId</code> or <code>IPSetId</code>. The ID is
     *         returned by the corresponding <code>Create</code> or
     *         <code>List</code> command.
     *         </p>
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * <p>
     * A unique identifier for a predicate in a <code>Rule</code>, such as
     * <code>ByteMatchSetId</code> or <code>IPSetId</code>. The ID is returned
     * by the corresponding <code>Create</code> or <code>List</code> command.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dataId <p>
     *            A unique identifier for a predicate in a <code>Rule</code>,
     *            such as <code>ByteMatchSetId</code> or <code>IPSetId</code>.
     *            The ID is returned by the corresponding <code>Create</code> or
     *            <code>List</code> command.
     *            </p>
     */
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    /**
     * <p>
     * A unique identifier for a predicate in a <code>Rule</code>, such as
     * <code>ByteMatchSetId</code> or <code>IPSetId</code>. The ID is returned
     * by the corresponding <code>Create</code> or <code>List</code> command.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dataId <p>
     *            A unique identifier for a predicate in a <code>Rule</code>,
     *            such as <code>ByteMatchSetId</code> or <code>IPSetId</code>.
     *            The ID is returned by the corresponding <code>Create</code> or
     *            <code>List</code> command.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Predicate withDataId(String dataId) {
        this.dataId = dataId;
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
        if (getNegated() != null)
            sb.append("Negated: " + getNegated() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDataId() != null)
            sb.append("DataId: " + getDataId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNegated() == null) ? 0 : getNegated().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDataId() == null) ? 0 : getDataId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Predicate == false)
            return false;
        Predicate other = (Predicate) obj;

        if (other.getNegated() == null ^ this.getNegated() == null)
            return false;
        if (other.getNegated() != null && other.getNegated().equals(this.getNegated()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDataId() == null ^ this.getDataId() == null)
            return false;
        if (other.getDataId() != null && other.getDataId().equals(this.getDataId()) == false)
            return false;
        return true;
    }
}
