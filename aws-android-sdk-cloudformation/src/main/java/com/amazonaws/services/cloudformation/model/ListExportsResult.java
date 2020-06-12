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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

public class ListExportsResult implements Serializable {
    /**
     * <p>
     * The output for the <a>ListExports</a> action.
     * </p>
     */
    private java.util.List<Export> exports;

    /**
     * <p>
     * If the output exceeds 100 exported output values, a string that
     * identifies the next page of exports. If there is no additional page, this
     * value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The output for the <a>ListExports</a> action.
     * </p>
     *
     * @return <p>
     *         The output for the <a>ListExports</a> action.
     *         </p>
     */
    public java.util.List<Export> getExports() {
        return exports;
    }

    /**
     * <p>
     * The output for the <a>ListExports</a> action.
     * </p>
     *
     * @param exports <p>
     *            The output for the <a>ListExports</a> action.
     *            </p>
     */
    public void setExports(java.util.Collection<Export> exports) {
        if (exports == null) {
            this.exports = null;
            return;
        }

        this.exports = new java.util.ArrayList<Export>(exports);
    }

    /**
     * <p>
     * The output for the <a>ListExports</a> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exports <p>
     *            The output for the <a>ListExports</a> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListExportsResult withExports(Export... exports) {
        if (getExports() == null) {
            this.exports = new java.util.ArrayList<Export>(exports.length);
        }
        for (Export value : exports) {
            this.exports.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The output for the <a>ListExports</a> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exports <p>
     *            The output for the <a>ListExports</a> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListExportsResult withExports(java.util.Collection<Export> exports) {
        setExports(exports);
        return this;
    }

    /**
     * <p>
     * If the output exceeds 100 exported output values, a string that
     * identifies the next page of exports. If there is no additional page, this
     * value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         If the output exceeds 100 exported output values, a string that
     *         identifies the next page of exports. If there is no additional
     *         page, this value is null.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the output exceeds 100 exported output values, a string that
     * identifies the next page of exports. If there is no additional page, this
     * value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the output exceeds 100 exported output values, a string
     *            that identifies the next page of exports. If there is no
     *            additional page, this value is null.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the output exceeds 100 exported output values, a string that
     * identifies the next page of exports. If there is no additional page, this
     * value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the output exceeds 100 exported output values, a string
     *            that identifies the next page of exports. If there is no
     *            additional page, this value is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListExportsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getExports() != null)
            sb.append("Exports: " + getExports() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExports() == null) ? 0 : getExports().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListExportsResult == false)
            return false;
        ListExportsResult other = (ListExportsResult) obj;

        if (other.getExports() == null ^ this.getExports() == null)
            return false;
        if (other.getExports() != null && other.getExports().equals(this.getExports()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
