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
 * The response from a <a>GetSampledRequests</a> request includes an
 * <code>HTTPHeader</code> complex type that appears as <code>Headers</code> in
 * the response syntax. <code>HTTPHeader</code> contains the names and values of
 * all of the headers that appear in one of the web requests that were returned
 * by <code>GetSampledRequests</code>.
 * </p>
 */
public class HTTPHeader implements Serializable {
    /**
     * <p>
     * The name of one of the headers in the sampled web request.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The value of one of the headers in the sampled web request.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of one of the headers in the sampled web request.
     * </p>
     *
     * @return <p>
     *         The name of one of the headers in the sampled web request.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of one of the headers in the sampled web request.
     * </p>
     *
     * @param name <p>
     *            The name of one of the headers in the sampled web request.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of one of the headers in the sampled web request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of one of the headers in the sampled web request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HTTPHeader withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The value of one of the headers in the sampled web request.
     * </p>
     *
     * @return <p>
     *         The value of one of the headers in the sampled web request.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of one of the headers in the sampled web request.
     * </p>
     *
     * @param value <p>
     *            The value of one of the headers in the sampled web request.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of one of the headers in the sampled web request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of one of the headers in the sampled web request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HTTPHeader withValue(String value) {
        this.value = value;
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
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HTTPHeader == false)
            return false;
        HTTPHeader other = (HTTPHeader) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
