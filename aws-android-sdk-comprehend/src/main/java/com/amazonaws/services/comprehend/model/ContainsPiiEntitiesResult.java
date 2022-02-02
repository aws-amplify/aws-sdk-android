/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class ContainsPiiEntitiesResult implements Serializable {
    /**
     * <p>
     * The labels used in the document being analyzed. Individual labels
     * represent personally identifiable information (PII) entity types.
     * </p>
     */
    private java.util.List<EntityLabel> labels;

    /**
     * <p>
     * The labels used in the document being analyzed. Individual labels
     * represent personally identifiable information (PII) entity types.
     * </p>
     *
     * @return <p>
     *         The labels used in the document being analyzed. Individual labels
     *         represent personally identifiable information (PII) entity types.
     *         </p>
     */
    public java.util.List<EntityLabel> getLabels() {
        return labels;
    }

    /**
     * <p>
     * The labels used in the document being analyzed. Individual labels
     * represent personally identifiable information (PII) entity types.
     * </p>
     *
     * @param labels <p>
     *            The labels used in the document being analyzed. Individual
     *            labels represent personally identifiable information (PII)
     *            entity types.
     *            </p>
     */
    public void setLabels(java.util.Collection<EntityLabel> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<EntityLabel>(labels);
    }

    /**
     * <p>
     * The labels used in the document being analyzed. Individual labels
     * represent personally identifiable information (PII) entity types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            The labels used in the document being analyzed. Individual
     *            labels represent personally identifiable information (PII)
     *            entity types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainsPiiEntitiesResult withLabels(EntityLabel... labels) {
        if (getLabels() == null) {
            this.labels = new java.util.ArrayList<EntityLabel>(labels.length);
        }
        for (EntityLabel value : labels) {
            this.labels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The labels used in the document being analyzed. Individual labels
     * represent personally identifiable information (PII) entity types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            The labels used in the document being analyzed. Individual
     *            labels represent personally identifiable information (PII)
     *            entity types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainsPiiEntitiesResult withLabels(java.util.Collection<EntityLabel> labels) {
        setLabels(labels);
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
        if (getLabels() != null)
            sb.append("Labels: " + getLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainsPiiEntitiesResult == false)
            return false;
        ContainsPiiEntitiesResult other = (ContainsPiiEntitiesResult) obj;

        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        return true;
    }
}
