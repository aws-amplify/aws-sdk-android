/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

public class TestRenderTemplateResult implements Serializable {
    /**
     * <p>
     * The complete MIME message rendered by applying the data in the
     * TemplateData parameter to the template specified in the TemplateName
     * parameter.
     * </p>
     */
    private String renderedTemplate;

    /**
     * <p>
     * The complete MIME message rendered by applying the data in the
     * TemplateData parameter to the template specified in the TemplateName
     * parameter.
     * </p>
     *
     * @return <p>
     *         The complete MIME message rendered by applying the data in the
     *         TemplateData parameter to the template specified in the
     *         TemplateName parameter.
     *         </p>
     */
    public String getRenderedTemplate() {
        return renderedTemplate;
    }

    /**
     * <p>
     * The complete MIME message rendered by applying the data in the
     * TemplateData parameter to the template specified in the TemplateName
     * parameter.
     * </p>
     *
     * @param renderedTemplate <p>
     *            The complete MIME message rendered by applying the data in the
     *            TemplateData parameter to the template specified in the
     *            TemplateName parameter.
     *            </p>
     */
    public void setRenderedTemplate(String renderedTemplate) {
        this.renderedTemplate = renderedTemplate;
    }

    /**
     * <p>
     * The complete MIME message rendered by applying the data in the
     * TemplateData parameter to the template specified in the TemplateName
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param renderedTemplate <p>
     *            The complete MIME message rendered by applying the data in the
     *            TemplateData parameter to the template specified in the
     *            TemplateName parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestRenderTemplateResult withRenderedTemplate(String renderedTemplate) {
        this.renderedTemplate = renderedTemplate;
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
        if (getRenderedTemplate() != null)
            sb.append("RenderedTemplate: " + getRenderedTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRenderedTemplate() == null) ? 0 : getRenderedTemplate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestRenderTemplateResult == false)
            return false;
        TestRenderTemplateResult other = (TestRenderTemplateResult) obj;

        if (other.getRenderedTemplate() == null ^ this.getRenderedTemplate() == null)
            return false;
        if (other.getRenderedTemplate() != null
                && other.getRenderedTemplate().equals(this.getRenderedTemplate()) == false)
            return false;
        return true;
    }
}
