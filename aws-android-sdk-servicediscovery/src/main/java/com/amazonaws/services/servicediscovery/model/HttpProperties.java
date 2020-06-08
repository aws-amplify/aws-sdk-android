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

package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the name of an HTTP namespace.
 * </p>
 */
public class HttpProperties implements Serializable {
    /**
     * <p>
     * The name of an HTTP namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String httpName;

    /**
     * <p>
     * The name of an HTTP namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The name of an HTTP namespace.
     *         </p>
     */
    public String getHttpName() {
        return httpName;
    }

    /**
     * <p>
     * The name of an HTTP namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param httpName <p>
     *            The name of an HTTP namespace.
     *            </p>
     */
    public void setHttpName(String httpName) {
        this.httpName = httpName;
    }

    /**
     * <p>
     * The name of an HTTP namespace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param httpName <p>
     *            The name of an HTTP namespace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpProperties withHttpName(String httpName) {
        this.httpName = httpName;
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
        if (getHttpName() != null)
            sb.append("HttpName: " + getHttpName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpName() == null) ? 0 : getHttpName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpProperties == false)
            return false;
        HttpProperties other = (HttpProperties) obj;

        if (other.getHttpName() == null ^ this.getHttpName() == null)
            return false;
        if (other.getHttpName() != null && other.getHttpName().equals(this.getHttpName()) == false)
            return false;
        return true;
    }
}
