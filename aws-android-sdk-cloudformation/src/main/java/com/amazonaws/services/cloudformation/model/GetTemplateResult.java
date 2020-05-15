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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The output for <a>GetTemplate</a> action.
 * </p>
 */
public class GetTemplateResult implements Serializable {
    /**
     * <p>
     * Structure containing the template body. (For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * AWS CloudFormation returns the same template that was used when the stack
     * was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String templateBody;

    /**
     * <p>
     * The stage of the template that you can retrieve. For stacks, the
     * <code>Original</code> and <code>Processed</code> templates are always
     * available. For change sets, the <code>Original</code> template is always
     * available. After AWS CloudFormation finishes creating the change set, the
     * <code>Processed</code> template becomes available.
     * </p>
     */
    private java.util.List<String> stagesAvailable;

    /**
     * <p>
     * Structure containing the template body. (For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * AWS CloudFormation returns the same template that was used when the stack
     * was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Structure containing the template body. (For more information, go
     *         to <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *         >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     *         </p>
     *         <p>
     *         AWS CloudFormation returns the same template that was used when
     *         the stack was created.
     *         </p>
     */
    public String getTemplateBody() {
        return templateBody;
    }

    /**
     * <p>
     * Structure containing the template body. (For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * AWS CloudFormation returns the same template that was used when the stack
     * was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody <p>
     *            Structure containing the template body. (For more information,
     *            go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     *            </p>
     *            <p>
     *            AWS CloudFormation returns the same template that was used
     *            when the stack was created.
     *            </p>
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * Structure containing the template body. (For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * AWS CloudFormation returns the same template that was used when the stack
     * was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody <p>
     *            Structure containing the template body. (For more information,
     *            go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     *            </p>
     *            <p>
     *            AWS CloudFormation returns the same template that was used
     *            when the stack was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateResult withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * <p>
     * The stage of the template that you can retrieve. For stacks, the
     * <code>Original</code> and <code>Processed</code> templates are always
     * available. For change sets, the <code>Original</code> template is always
     * available. After AWS CloudFormation finishes creating the change set, the
     * <code>Processed</code> template becomes available.
     * </p>
     *
     * @return <p>
     *         The stage of the template that you can retrieve. For stacks, the
     *         <code>Original</code> and <code>Processed</code> templates are
     *         always available. For change sets, the <code>Original</code>
     *         template is always available. After AWS CloudFormation finishes
     *         creating the change set, the <code>Processed</code> template
     *         becomes available.
     *         </p>
     */
    public java.util.List<String> getStagesAvailable() {
        return stagesAvailable;
    }

    /**
     * <p>
     * The stage of the template that you can retrieve. For stacks, the
     * <code>Original</code> and <code>Processed</code> templates are always
     * available. For change sets, the <code>Original</code> template is always
     * available. After AWS CloudFormation finishes creating the change set, the
     * <code>Processed</code> template becomes available.
     * </p>
     *
     * @param stagesAvailable <p>
     *            The stage of the template that you can retrieve. For stacks,
     *            the <code>Original</code> and <code>Processed</code> templates
     *            are always available. For change sets, the
     *            <code>Original</code> template is always available. After AWS
     *            CloudFormation finishes creating the change set, the
     *            <code>Processed</code> template becomes available.
     *            </p>
     */
    public void setStagesAvailable(java.util.Collection<String> stagesAvailable) {
        if (stagesAvailable == null) {
            this.stagesAvailable = null;
            return;
        }

        this.stagesAvailable = new java.util.ArrayList<String>(stagesAvailable);
    }

    /**
     * <p>
     * The stage of the template that you can retrieve. For stacks, the
     * <code>Original</code> and <code>Processed</code> templates are always
     * available. For change sets, the <code>Original</code> template is always
     * available. After AWS CloudFormation finishes creating the change set, the
     * <code>Processed</code> template becomes available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stagesAvailable <p>
     *            The stage of the template that you can retrieve. For stacks,
     *            the <code>Original</code> and <code>Processed</code> templates
     *            are always available. For change sets, the
     *            <code>Original</code> template is always available. After AWS
     *            CloudFormation finishes creating the change set, the
     *            <code>Processed</code> template becomes available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateResult withStagesAvailable(String... stagesAvailable) {
        if (getStagesAvailable() == null) {
            this.stagesAvailable = new java.util.ArrayList<String>(stagesAvailable.length);
        }
        for (String value : stagesAvailable) {
            this.stagesAvailable.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The stage of the template that you can retrieve. For stacks, the
     * <code>Original</code> and <code>Processed</code> templates are always
     * available. For change sets, the <code>Original</code> template is always
     * available. After AWS CloudFormation finishes creating the change set, the
     * <code>Processed</code> template becomes available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stagesAvailable <p>
     *            The stage of the template that you can retrieve. For stacks,
     *            the <code>Original</code> and <code>Processed</code> templates
     *            are always available. For change sets, the
     *            <code>Original</code> template is always available. After AWS
     *            CloudFormation finishes creating the change set, the
     *            <code>Processed</code> template becomes available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateResult withStagesAvailable(java.util.Collection<String> stagesAvailable) {
        setStagesAvailable(stagesAvailable);
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
        if (getTemplateBody() != null)
            sb.append("TemplateBody: " + getTemplateBody() + ",");
        if (getStagesAvailable() != null)
            sb.append("StagesAvailable: " + getStagesAvailable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode
                + ((getStagesAvailable() == null) ? 0 : getStagesAvailable().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTemplateResult == false)
            return false;
        GetTemplateResult other = (GetTemplateResult) obj;

        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null
                && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getStagesAvailable() == null ^ this.getStagesAvailable() == null)
            return false;
        if (other.getStagesAvailable() != null
                && other.getStagesAvailable().equals(this.getStagesAvailable()) == false)
            return false;
        return true;
    }
}
