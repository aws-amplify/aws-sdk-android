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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents the HTTP header in the request.
 * </p>
 */
public class HttpRouteHeader implements Serializable {
    /**
     * <p>
     * Specify <code>True</code> to match anything except the match criteria.
     * The default value is <code>False</code>.
     * </p>
     */
    private Boolean invert;

    /**
     * <p>
     * The <code>HeaderMatchMethod</code> object.
     * </p>
     */
    private HeaderMatchMethod match;

    /**
     * <p>
     * A name for the HTTP header in the client request that will be matched on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String name;

    /**
     * <p>
     * Specify <code>True</code> to match anything except the match criteria.
     * The default value is <code>False</code>.
     * </p>
     *
     * @return <p>
     *         Specify <code>True</code> to match anything except the match
     *         criteria. The default value is <code>False</code>.
     *         </p>
     */
    public Boolean isInvert() {
        return invert;
    }

    /**
     * <p>
     * Specify <code>True</code> to match anything except the match criteria.
     * The default value is <code>False</code>.
     * </p>
     *
     * @return <p>
     *         Specify <code>True</code> to match anything except the match
     *         criteria. The default value is <code>False</code>.
     *         </p>
     */
    public Boolean getInvert() {
        return invert;
    }

    /**
     * <p>
     * Specify <code>True</code> to match anything except the match criteria.
     * The default value is <code>False</code>.
     * </p>
     *
     * @param invert <p>
     *            Specify <code>True</code> to match anything except the match
     *            criteria. The default value is <code>False</code>.
     *            </p>
     */
    public void setInvert(Boolean invert) {
        this.invert = invert;
    }

    /**
     * <p>
     * Specify <code>True</code> to match anything except the match criteria.
     * The default value is <code>False</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invert <p>
     *            Specify <code>True</code> to match anything except the match
     *            criteria. The default value is <code>False</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpRouteHeader withInvert(Boolean invert) {
        this.invert = invert;
        return this;
    }

    /**
     * <p>
     * The <code>HeaderMatchMethod</code> object.
     * </p>
     *
     * @return <p>
     *         The <code>HeaderMatchMethod</code> object.
     *         </p>
     */
    public HeaderMatchMethod getMatch() {
        return match;
    }

    /**
     * <p>
     * The <code>HeaderMatchMethod</code> object.
     * </p>
     *
     * @param match <p>
     *            The <code>HeaderMatchMethod</code> object.
     *            </p>
     */
    public void setMatch(HeaderMatchMethod match) {
        this.match = match;
    }

    /**
     * <p>
     * The <code>HeaderMatchMethod</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param match <p>
     *            The <code>HeaderMatchMethod</code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpRouteHeader withMatch(HeaderMatchMethod match) {
        this.match = match;
        return this;
    }

    /**
     * <p>
     * A name for the HTTP header in the client request that will be matched on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>
     *         A name for the HTTP header in the client request that will be
     *         matched on.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A name for the HTTP header in the client request that will be matched on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param name <p>
     *            A name for the HTTP header in the client request that will be
     *            matched on.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the HTTP header in the client request that will be matched on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param name <p>
     *            A name for the HTTP header in the client request that will be
     *            matched on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpRouteHeader withName(String name) {
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
        if (getInvert() != null)
            sb.append("invert: " + getInvert() + ",");
        if (getMatch() != null)
            sb.append("match: " + getMatch() + ",");
        if (getName() != null)
            sb.append("name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvert() == null) ? 0 : getInvert().hashCode());
        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpRouteHeader == false)
            return false;
        HttpRouteHeader other = (HttpRouteHeader) obj;

        if (other.getInvert() == null ^ this.getInvert() == null)
            return false;
        if (other.getInvert() != null && other.getInvert().equals(this.getInvert()) == false)
            return false;
        if (other.getMatch() == null ^ this.getMatch() == null)
            return false;
        if (other.getMatch() != null && other.getMatch().equals(this.getMatch()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
