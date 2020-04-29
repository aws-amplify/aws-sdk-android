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

public class GetIPSetResult implements Serializable {
    /**
     * <p>
     * Information about the <a>IPSet</a> that you specified in the
     * <code>GetIPSet</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>IPSet</a>: Contains <code>IPSetDescriptors</code>,
     * <code>IPSetId</code>, and <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IPSetDescriptors</code>: Contains an array of
     * <a>IPSetDescriptor</a> objects. Each <code>IPSetDescriptor</code> object
     * contains <code>Type</code> and <code>Value</code>
     * </p>
     * </li>
     * </ul>
     */
    private IPSet iPSet;

    /**
     * <p>
     * Information about the <a>IPSet</a> that you specified in the
     * <code>GetIPSet</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>IPSet</a>: Contains <code>IPSetDescriptors</code>,
     * <code>IPSetId</code>, and <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IPSetDescriptors</code>: Contains an array of
     * <a>IPSetDescriptor</a> objects. Each <code>IPSetDescriptor</code> object
     * contains <code>Type</code> and <code>Value</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Information about the <a>IPSet</a> that you specified in the
     *         <code>GetIPSet</code> request. For more information, see the
     *         following topics:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>IPSet</a>: Contains <code>IPSetDescriptors</code>,
     *         <code>IPSetId</code>, and <code>Name</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IPSetDescriptors</code>: Contains an array of
     *         <a>IPSetDescriptor</a> objects. Each <code>IPSetDescriptor</code>
     *         object contains <code>Type</code> and <code>Value</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public IPSet getIPSet() {
        return iPSet;
    }

    /**
     * <p>
     * Information about the <a>IPSet</a> that you specified in the
     * <code>GetIPSet</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>IPSet</a>: Contains <code>IPSetDescriptors</code>,
     * <code>IPSetId</code>, and <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IPSetDescriptors</code>: Contains an array of
     * <a>IPSetDescriptor</a> objects. Each <code>IPSetDescriptor</code> object
     * contains <code>Type</code> and <code>Value</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param iPSet <p>
     *            Information about the <a>IPSet</a> that you specified in the
     *            <code>GetIPSet</code> request. For more information, see the
     *            following topics:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>IPSet</a>: Contains <code>IPSetDescriptors</code>,
     *            <code>IPSetId</code>, and <code>Name</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IPSetDescriptors</code>: Contains an array of
     *            <a>IPSetDescriptor</a> objects. Each
     *            <code>IPSetDescriptor</code> object contains <code>Type</code>
     *            and <code>Value</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setIPSet(IPSet iPSet) {
        this.iPSet = iPSet;
    }

    /**
     * <p>
     * Information about the <a>IPSet</a> that you specified in the
     * <code>GetIPSet</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>IPSet</a>: Contains <code>IPSetDescriptors</code>,
     * <code>IPSetId</code>, and <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IPSetDescriptors</code>: Contains an array of
     * <a>IPSetDescriptor</a> objects. Each <code>IPSetDescriptor</code> object
     * contains <code>Type</code> and <code>Value</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iPSet <p>
     *            Information about the <a>IPSet</a> that you specified in the
     *            <code>GetIPSet</code> request. For more information, see the
     *            following topics:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>IPSet</a>: Contains <code>IPSetDescriptors</code>,
     *            <code>IPSetId</code>, and <code>Name</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IPSetDescriptors</code>: Contains an array of
     *            <a>IPSetDescriptor</a> objects. Each
     *            <code>IPSetDescriptor</code> object contains <code>Type</code>
     *            and <code>Value</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIPSetResult withIPSet(IPSet iPSet) {
        this.iPSet = iPSet;
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
        if (getIPSet() != null)
            sb.append("IPSet: " + getIPSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIPSet() == null) ? 0 : getIPSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIPSetResult == false)
            return false;
        GetIPSetResult other = (GetIPSetResult) obj;

        if (other.getIPSet() == null ^ this.getIPSet() == null)
            return false;
        if (other.getIPSet() != null && other.getIPSet().equals(this.getIPSet()) == false)
            return false;
        return true;
    }
}
