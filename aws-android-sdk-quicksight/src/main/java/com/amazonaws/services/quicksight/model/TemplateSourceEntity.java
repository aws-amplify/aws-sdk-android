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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * The source entity of the template.
 * </p>
 */
public class TemplateSourceEntity implements Serializable {
    /**
     * <p>
     * The source analysis, if it is based on an analysis.
     * </p>
     */
    private TemplateSourceAnalysis sourceAnalysis;

    /**
     * <p>
     * The source template, if it is based on an template.
     * </p>
     */
    private TemplateSourceTemplate sourceTemplate;

    /**
     * <p>
     * The source analysis, if it is based on an analysis.
     * </p>
     *
     * @return <p>
     *         The source analysis, if it is based on an analysis.
     *         </p>
     */
    public TemplateSourceAnalysis getSourceAnalysis() {
        return sourceAnalysis;
    }

    /**
     * <p>
     * The source analysis, if it is based on an analysis.
     * </p>
     *
     * @param sourceAnalysis <p>
     *            The source analysis, if it is based on an analysis.
     *            </p>
     */
    public void setSourceAnalysis(TemplateSourceAnalysis sourceAnalysis) {
        this.sourceAnalysis = sourceAnalysis;
    }

    /**
     * <p>
     * The source analysis, if it is based on an analysis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceAnalysis <p>
     *            The source analysis, if it is based on an analysis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateSourceEntity withSourceAnalysis(TemplateSourceAnalysis sourceAnalysis) {
        this.sourceAnalysis = sourceAnalysis;
        return this;
    }

    /**
     * <p>
     * The source template, if it is based on an template.
     * </p>
     *
     * @return <p>
     *         The source template, if it is based on an template.
     *         </p>
     */
    public TemplateSourceTemplate getSourceTemplate() {
        return sourceTemplate;
    }

    /**
     * <p>
     * The source template, if it is based on an template.
     * </p>
     *
     * @param sourceTemplate <p>
     *            The source template, if it is based on an template.
     *            </p>
     */
    public void setSourceTemplate(TemplateSourceTemplate sourceTemplate) {
        this.sourceTemplate = sourceTemplate;
    }

    /**
     * <p>
     * The source template, if it is based on an template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceTemplate <p>
     *            The source template, if it is based on an template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateSourceEntity withSourceTemplate(TemplateSourceTemplate sourceTemplate) {
        this.sourceTemplate = sourceTemplate;
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
        if (getSourceAnalysis() != null)
            sb.append("SourceAnalysis: " + getSourceAnalysis() + ",");
        if (getSourceTemplate() != null)
            sb.append("SourceTemplate: " + getSourceTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceAnalysis() == null) ? 0 : getSourceAnalysis().hashCode());
        hashCode = prime * hashCode
                + ((getSourceTemplate() == null) ? 0 : getSourceTemplate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateSourceEntity == false)
            return false;
        TemplateSourceEntity other = (TemplateSourceEntity) obj;

        if (other.getSourceAnalysis() == null ^ this.getSourceAnalysis() == null)
            return false;
        if (other.getSourceAnalysis() != null
                && other.getSourceAnalysis().equals(this.getSourceAnalysis()) == false)
            return false;
        if (other.getSourceTemplate() == null ^ this.getSourceTemplate() == null)
            return false;
        if (other.getSourceTemplate() != null
                && other.getSourceTemplate().equals(this.getSourceTemplate()) == false)
            return false;
        return true;
    }
}
