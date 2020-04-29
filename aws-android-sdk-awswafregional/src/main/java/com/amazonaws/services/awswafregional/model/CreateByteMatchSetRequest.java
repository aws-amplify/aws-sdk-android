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
 * Creates a <code>ByteMatchSet</code>. You then use <a>UpdateByteMatchSet</a>
 * to identify the part of a web request that you want AWS WAF to inspect, such
 * as the values of the <code>User-Agent</code> header or the query string. For
 * example, you can create a <code>ByteMatchSet</code> that matches any requests
 * with <code>User-Agent</code> headers that contain the string
 * <code>BadBot</code>. You can then configure AWS WAF to reject those requests.
 * </p>
 * <p>
 * To create and configure a <code>ByteMatchSet</code>, perform the following
 * steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Use <a>GetChangeToken</a> to get the change token that you provide in the
 * <code>ChangeToken</code> parameter of a <code>CreateByteMatchSet</code>
 * request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit a <code>CreateByteMatchSet</code> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <code>GetChangeToken</code> to get the change token that you provide in
 * the <code>ChangeToken</code> parameter of an <code>UpdateByteMatchSet</code>
 * request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit an <a>UpdateByteMatchSet</a> request to specify the part of the
 * request that you want AWS WAF to inspect (for example, the header or the URI)
 * and the value that you want AWS WAF to watch for.
 * </p>
 * </li>
 * </ol>
 * <p>
 * For more information about how to use the AWS WAF API to allow or block HTTP
 * requests, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
 * Developer Guide</a>.
 * </p>
 */
public class CreateByteMatchSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A friendly name or description of the <a>ByteMatchSet</a>. You can't
     * change <code>Name</code> after you create a <code>ByteMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

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
     * A friendly name or description of the <a>ByteMatchSet</a>. You can't
     * change <code>Name</code> after you create a <code>ByteMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description of the <a>ByteMatchSet</a>. You
     *         can't change <code>Name</code> after you create a
     *         <code>ByteMatchSet</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>ByteMatchSet</a>. You can't
     * change <code>Name</code> after you create a <code>ByteMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the <a>ByteMatchSet</a>. You
     *            can't change <code>Name</code> after you create a
     *            <code>ByteMatchSet</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>ByteMatchSet</a>. You can't
     * change <code>Name</code> after you create a <code>ByteMatchSet</code>.
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
     *            A friendly name or description of the <a>ByteMatchSet</a>. You
     *            can't change <code>Name</code> after you create a
     *            <code>ByteMatchSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateByteMatchSetRequest withName(String name) {
        this.name = name;
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
    public CreateByteMatchSetRequest withChangeToken(String changeToken) {
        this.changeToken = changeToken;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: " + getChangeToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateByteMatchSetRequest == false)
            return false;
        CreateByteMatchSetRequest other = (CreateByteMatchSetRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null
                && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        return true;
    }
}
