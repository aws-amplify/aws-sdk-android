/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;

/**
 * <p>
 * View content containing all content necessary to render a view except for
 * runtime input data.
 * </p>
 */
public class ViewContent implements Serializable {
    /**
     * <p>
     * The schema representing the input data that the view template must be
     * supplied to render.
     * </p>
     */
    private String inputSchema;

    /**
     * <p>
     * The view template representing the structure of the view.
     * </p>
     */
    private String template;

    /**
     * <p>
     * A list of actions possible from the view
     * </p>
     */
    private java.util.List<String> actions;

    /**
     * <p>
     * The schema representing the input data that the view template must be
     * supplied to render.
     * </p>
     *
     * @return <p>
     *         The schema representing the input data that the view template
     *         must be supplied to render.
     *         </p>
     */
    public String getInputSchema() {
        return inputSchema;
    }

    /**
     * <p>
     * The schema representing the input data that the view template must be
     * supplied to render.
     * </p>
     *
     * @param inputSchema <p>
     *            The schema representing the input data that the view template
     *            must be supplied to render.
     *            </p>
     */
    public void setInputSchema(String inputSchema) {
        this.inputSchema = inputSchema;
    }

    /**
     * <p>
     * The schema representing the input data that the view template must be
     * supplied to render.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputSchema <p>
     *            The schema representing the input data that the view template
     *            must be supplied to render.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewContent withInputSchema(String inputSchema) {
        this.inputSchema = inputSchema;
        return this;
    }

    /**
     * <p>
     * The view template representing the structure of the view.
     * </p>
     *
     * @return <p>
     *         The view template representing the structure of the view.
     *         </p>
     */
    public String getTemplate() {
        return template;
    }

    /**
     * <p>
     * The view template representing the structure of the view.
     * </p>
     *
     * @param template <p>
     *            The view template representing the structure of the view.
     *            </p>
     */
    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * <p>
     * The view template representing the structure of the view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param template <p>
     *            The view template representing the structure of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewContent withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * <p>
     * A list of actions possible from the view
     * </p>
     *
     * @return <p>
     *         A list of actions possible from the view
     *         </p>
     */
    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * A list of actions possible from the view
     * </p>
     *
     * @param actions <p>
     *            A list of actions possible from the view
     *            </p>
     */
    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * A list of actions possible from the view
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            A list of actions possible from the view
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewContent withActions(String... actions) {
        if (getActions() == null) {
            this.actions = new java.util.ArrayList<String>(actions.length);
        }
        for (String value : actions) {
            this.actions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of actions possible from the view
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            A list of actions possible from the view
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewContent withActions(java.util.Collection<String> actions) {
        setActions(actions);
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
        if (getInputSchema() != null)
            sb.append("InputSchema: " + getInputSchema() + ",");
        if (getTemplate() != null)
            sb.append("Template: " + getTemplate() + ",");
        if (getActions() != null)
            sb.append("Actions: " + getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInputSchema() == null) ? 0 : getInputSchema().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewContent == false)
            return false;
        ViewContent other = (ViewContent) obj;

        if (other.getInputSchema() == null ^ this.getInputSchema() == null)
            return false;
        if (other.getInputSchema() != null
                && other.getInputSchema().equals(this.getInputSchema()) == false)
            return false;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }
}
