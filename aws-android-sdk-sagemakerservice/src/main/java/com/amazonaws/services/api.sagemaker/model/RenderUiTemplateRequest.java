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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Renders the UI template so that you can preview the worker's experience.
 * </p>
 */
public class RenderUiTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A <code>Template</code> object containing the worker UI template to
     * render.
     * </p>
     */
    private UiTemplate uiTemplate;

    /**
     * <p>
     * A <code>RenderableTask</code> object containing a representative task to
     * render.
     * </p>
     */
    private RenderableTask task;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to the S3 objects that are
     * used by the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     */
    private String roleArn;

    /**
     * <p>
     * A <code>Template</code> object containing the worker UI template to
     * render.
     * </p>
     *
     * @return <p>
     *         A <code>Template</code> object containing the worker UI template
     *         to render.
     *         </p>
     */
    public UiTemplate getUiTemplate() {
        return uiTemplate;
    }

    /**
     * <p>
     * A <code>Template</code> object containing the worker UI template to
     * render.
     * </p>
     *
     * @param uiTemplate <p>
     *            A <code>Template</code> object containing the worker UI
     *            template to render.
     *            </p>
     */
    public void setUiTemplate(UiTemplate uiTemplate) {
        this.uiTemplate = uiTemplate;
    }

    /**
     * <p>
     * A <code>Template</code> object containing the worker UI template to
     * render.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uiTemplate <p>
     *            A <code>Template</code> object containing the worker UI
     *            template to render.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RenderUiTemplateRequest withUiTemplate(UiTemplate uiTemplate) {
        this.uiTemplate = uiTemplate;
        return this;
    }

    /**
     * <p>
     * A <code>RenderableTask</code> object containing a representative task to
     * render.
     * </p>
     *
     * @return <p>
     *         A <code>RenderableTask</code> object containing a representative
     *         task to render.
     *         </p>
     */
    public RenderableTask getTask() {
        return task;
    }

    /**
     * <p>
     * A <code>RenderableTask</code> object containing a representative task to
     * render.
     * </p>
     *
     * @param task <p>
     *            A <code>RenderableTask</code> object containing a
     *            representative task to render.
     *            </p>
     */
    public void setTask(RenderableTask task) {
        this.task = task;
    }

    /**
     * <p>
     * A <code>RenderableTask</code> object containing a representative task to
     * render.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param task <p>
     *            A <code>RenderableTask</code> object containing a
     *            representative task to render.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RenderUiTemplateRequest withTask(RenderableTask task) {
        this.task = task;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to the S3 objects that are
     * used by the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that has access to the S3 objects
     *         that are used by the template.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to the S3 objects that are
     * used by the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) that has access to the S3
     *            objects that are used by the template.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to the S3 objects that are
     * used by the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) that has access to the S3
     *            objects that are used by the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RenderUiTemplateRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getUiTemplate() != null)
            sb.append("UiTemplate: " + getUiTemplate() + ",");
        if (getTask() != null)
            sb.append("Task: " + getTask() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUiTemplate() == null) ? 0 : getUiTemplate().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenderUiTemplateRequest == false)
            return false;
        RenderUiTemplateRequest other = (RenderUiTemplateRequest) obj;

        if (other.getUiTemplate() == null ^ this.getUiTemplate() == null)
            return false;
        if (other.getUiTemplate() != null
                && other.getUiTemplate().equals(this.getUiTemplate()) == false)
            return false;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
