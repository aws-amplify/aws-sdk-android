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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * An edge represents a directed connection between two AWS Glue components
 * which are part of the workflow the edge belongs to.
 * </p>
 */
public class Edge implements Serializable {
    /**
     * <p>
     * The unique of the node within the workflow where the edge starts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String sourceId;

    /**
     * <p>
     * The unique of the node within the workflow where the edge ends.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String destinationId;

    /**
     * <p>
     * The unique of the node within the workflow where the edge starts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The unique of the node within the workflow where the edge starts.
     *         </p>
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * <p>
     * The unique of the node within the workflow where the edge starts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param sourceId <p>
     *            The unique of the node within the workflow where the edge
     *            starts.
     *            </p>
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * The unique of the node within the workflow where the edge starts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param sourceId <p>
     *            The unique of the node within the workflow where the edge
     *            starts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Edge withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * <p>
     * The unique of the node within the workflow where the edge ends.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The unique of the node within the workflow where the edge ends.
     *         </p>
     */
    public String getDestinationId() {
        return destinationId;
    }

    /**
     * <p>
     * The unique of the node within the workflow where the edge ends.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param destinationId <p>
     *            The unique of the node within the workflow where the edge
     *            ends.
     *            </p>
     */
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * <p>
     * The unique of the node within the workflow where the edge ends.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param destinationId <p>
     *            The unique of the node within the workflow where the edge
     *            ends.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Edge withDestinationId(String destinationId) {
        this.destinationId = destinationId;
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
        if (getSourceId() != null)
            sb.append("SourceId: " + getSourceId() + ",");
        if (getDestinationId() != null)
            sb.append("DestinationId: " + getDestinationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationId() == null) ? 0 : getDestinationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Edge == false)
            return false;
        Edge other = (Edge) obj;

        if (other.getSourceId() == null ^ this.getSourceId() == null)
            return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false)
            return false;
        if (other.getDestinationId() == null ^ this.getDestinationId() == null)
            return false;
        if (other.getDestinationId() != null
                && other.getDestinationId().equals(this.getDestinationId()) == false)
            return false;
        return true;
    }
}
