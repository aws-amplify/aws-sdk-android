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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

public class ExportApiResult implements Serializable {
    /**
     * <p>
     * Represents an exported definition of an API in a particular output
     * format, for example, YAML. The API is serialized to the requested
     * specification, for example, OpenAPI 3.0.
     * </p>
     */
    private java.nio.ByteBuffer body;

    /**
     * <p>
     * Represents an exported definition of an API in a particular output
     * format, for example, YAML. The API is serialized to the requested
     * specification, for example, OpenAPI 3.0.
     * </p>
     *
     * @return <p>
     *         Represents an exported definition of an API in a particular
     *         output format, for example, YAML. The API is serialized to the
     *         requested specification, for example, OpenAPI 3.0.
     *         </p>
     */
    public java.nio.ByteBuffer getBody() {
        return body;
    }

    /**
     * <p>
     * Represents an exported definition of an API in a particular output
     * format, for example, YAML. The API is serialized to the requested
     * specification, for example, OpenAPI 3.0.
     * </p>
     *
     * @param body <p>
     *            Represents an exported definition of an API in a particular
     *            output format, for example, YAML. The API is serialized to the
     *            requested specification, for example, OpenAPI 3.0.
     *            </p>
     */
    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * Represents an exported definition of an API in a particular output
     * format, for example, YAML. The API is serialized to the requested
     * specification, for example, OpenAPI 3.0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            Represents an exported definition of an API in a particular
     *            output format, for example, YAML. The API is serialized to the
     *            requested specification, for example, OpenAPI 3.0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportApiResult withBody(java.nio.ByteBuffer body) {
        this.body = body;
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
        if (getBody() != null)
            sb.append("body: " + getBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportApiResult == false)
            return false;
        ExportApiResult other = (ExportApiResult) obj;

        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        return true;
    }
}
