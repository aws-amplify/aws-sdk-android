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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class RenderUiTemplateResult implements Serializable {
    /**
     * <p>
     * A Liquid template that renders the HTML for the worker UI.
     * </p>
     */
    private String renderedContent;

    /**
     * <p>
     * A list of one or more <code>RenderingError</code> objects if any were
     * encountered while rendering the template. If there were no errors, the
     * list is empty.
     * </p>
     */
    private java.util.List<RenderingError> errors;

    /**
     * <p>
     * A Liquid template that renders the HTML for the worker UI.
     * </p>
     *
     * @return <p>
     *         A Liquid template that renders the HTML for the worker UI.
     *         </p>
     */
    public String getRenderedContent() {
        return renderedContent;
    }

    /**
     * <p>
     * A Liquid template that renders the HTML for the worker UI.
     * </p>
     *
     * @param renderedContent <p>
     *            A Liquid template that renders the HTML for the worker UI.
     *            </p>
     */
    public void setRenderedContent(String renderedContent) {
        this.renderedContent = renderedContent;
    }

    /**
     * <p>
     * A Liquid template that renders the HTML for the worker UI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param renderedContent <p>
     *            A Liquid template that renders the HTML for the worker UI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RenderUiTemplateResult withRenderedContent(String renderedContent) {
        this.renderedContent = renderedContent;
        return this;
    }

    /**
     * <p>
     * A list of one or more <code>RenderingError</code> objects if any were
     * encountered while rendering the template. If there were no errors, the
     * list is empty.
     * </p>
     *
     * @return <p>
     *         A list of one or more <code>RenderingError</code> objects if any
     *         were encountered while rendering the template. If there were no
     *         errors, the list is empty.
     *         </p>
     */
    public java.util.List<RenderingError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of one or more <code>RenderingError</code> objects if any were
     * encountered while rendering the template. If there were no errors, the
     * list is empty.
     * </p>
     *
     * @param errors <p>
     *            A list of one or more <code>RenderingError</code> objects if
     *            any were encountered while rendering the template. If there
     *            were no errors, the list is empty.
     *            </p>
     */
    public void setErrors(java.util.Collection<RenderingError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<RenderingError>(errors);
    }

    /**
     * <p>
     * A list of one or more <code>RenderingError</code> objects if any were
     * encountered while rendering the template. If there were no errors, the
     * list is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A list of one or more <code>RenderingError</code> objects if
     *            any were encountered while rendering the template. If there
     *            were no errors, the list is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RenderUiTemplateResult withErrors(RenderingError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<RenderingError>(errors.length);
        }
        for (RenderingError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more <code>RenderingError</code> objects if any were
     * encountered while rendering the template. If there were no errors, the
     * list is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A list of one or more <code>RenderingError</code> objects if
     *            any were encountered while rendering the template. If there
     *            were no errors, the list is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RenderUiTemplateResult withErrors(java.util.Collection<RenderingError> errors) {
        setErrors(errors);
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
        if (getRenderedContent() != null)
            sb.append("RenderedContent: " + getRenderedContent() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRenderedContent() == null) ? 0 : getRenderedContent().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenderUiTemplateResult == false)
            return false;
        RenderUiTemplateResult other = (RenderUiTemplateResult) obj;

        if (other.getRenderedContent() == null ^ this.getRenderedContent() == null)
            return false;
        if (other.getRenderedContent() != null
                && other.getRenderedContent().equals(this.getRenderedContent()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
