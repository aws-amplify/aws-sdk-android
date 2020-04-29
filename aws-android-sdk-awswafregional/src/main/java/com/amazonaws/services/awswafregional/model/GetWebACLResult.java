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

public class GetWebACLResult implements Serializable {
    /**
     * <p>
     * Information about the <a>WebACL</a> that you specified in the
     * <code>GetWebACL</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>WebACL</a>: Contains <code>DefaultAction</code>,
     * <code>MetricName</code>, <code>Name</code>, an array of <code>Rule</code>
     * objects, and <code>WebACLId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DefaultAction</code> (Data type is <a>WafAction</a>): Contains
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Rules</code>: Contains an array of <code>ActivatedRule</code>
     * objects, which contain <code>Action</code>, <code>Priority</code>, and
     * <code>RuleId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Action</code>: Contains <code>Type</code>
     * </p>
     * </li>
     * </ul>
     */
    private WebACL webACL;

    /**
     * <p>
     * Information about the <a>WebACL</a> that you specified in the
     * <code>GetWebACL</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>WebACL</a>: Contains <code>DefaultAction</code>,
     * <code>MetricName</code>, <code>Name</code>, an array of <code>Rule</code>
     * objects, and <code>WebACLId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DefaultAction</code> (Data type is <a>WafAction</a>): Contains
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Rules</code>: Contains an array of <code>ActivatedRule</code>
     * objects, which contain <code>Action</code>, <code>Priority</code>, and
     * <code>RuleId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Action</code>: Contains <code>Type</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Information about the <a>WebACL</a> that you specified in the
     *         <code>GetWebACL</code> request. For more information, see the
     *         following topics:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>WebACL</a>: Contains <code>DefaultAction</code>,
     *         <code>MetricName</code>, <code>Name</code>, an array of
     *         <code>Rule</code> objects, and <code>WebACLId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DefaultAction</code> (Data type is <a>WafAction</a>):
     *         Contains <code>Type</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Rules</code>: Contains an array of
     *         <code>ActivatedRule</code> objects, which contain
     *         <code>Action</code>, <code>Priority</code>, and
     *         <code>RuleId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Action</code>: Contains <code>Type</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public WebACL getWebACL() {
        return webACL;
    }

    /**
     * <p>
     * Information about the <a>WebACL</a> that you specified in the
     * <code>GetWebACL</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>WebACL</a>: Contains <code>DefaultAction</code>,
     * <code>MetricName</code>, <code>Name</code>, an array of <code>Rule</code>
     * objects, and <code>WebACLId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DefaultAction</code> (Data type is <a>WafAction</a>): Contains
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Rules</code>: Contains an array of <code>ActivatedRule</code>
     * objects, which contain <code>Action</code>, <code>Priority</code>, and
     * <code>RuleId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Action</code>: Contains <code>Type</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param webACL <p>
     *            Information about the <a>WebACL</a> that you specified in the
     *            <code>GetWebACL</code> request. For more information, see the
     *            following topics:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>WebACL</a>: Contains <code>DefaultAction</code>,
     *            <code>MetricName</code>, <code>Name</code>, an array of
     *            <code>Rule</code> objects, and <code>WebACLId</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DefaultAction</code> (Data type is <a>WafAction</a>):
     *            Contains <code>Type</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Rules</code>: Contains an array of
     *            <code>ActivatedRule</code> objects, which contain
     *            <code>Action</code>, <code>Priority</code>, and
     *            <code>RuleId</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Action</code>: Contains <code>Type</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setWebACL(WebACL webACL) {
        this.webACL = webACL;
    }

    /**
     * <p>
     * Information about the <a>WebACL</a> that you specified in the
     * <code>GetWebACL</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>WebACL</a>: Contains <code>DefaultAction</code>,
     * <code>MetricName</code>, <code>Name</code>, an array of <code>Rule</code>
     * objects, and <code>WebACLId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DefaultAction</code> (Data type is <a>WafAction</a>): Contains
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Rules</code>: Contains an array of <code>ActivatedRule</code>
     * objects, which contain <code>Action</code>, <code>Priority</code>, and
     * <code>RuleId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Action</code>: Contains <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param webACL <p>
     *            Information about the <a>WebACL</a> that you specified in the
     *            <code>GetWebACL</code> request. For more information, see the
     *            following topics:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>WebACL</a>: Contains <code>DefaultAction</code>,
     *            <code>MetricName</code>, <code>Name</code>, an array of
     *            <code>Rule</code> objects, and <code>WebACLId</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DefaultAction</code> (Data type is <a>WafAction</a>):
     *            Contains <code>Type</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Rules</code>: Contains an array of
     *            <code>ActivatedRule</code> objects, which contain
     *            <code>Action</code>, <code>Priority</code>, and
     *            <code>RuleId</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Action</code>: Contains <code>Type</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetWebACLResult withWebACL(WebACL webACL) {
        this.webACL = webACL;
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
        if (getWebACL() != null)
            sb.append("WebACL: " + getWebACL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebACL() == null) ? 0 : getWebACL().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWebACLResult == false)
            return false;
        GetWebACLResult other = (GetWebACLResult) obj;

        if (other.getWebACL() == null ^ this.getWebACL() == null)
            return false;
        if (other.getWebACL() != null && other.getWebACL().equals(this.getWebACL()) == false)
            return false;
        return true;
    }
}
