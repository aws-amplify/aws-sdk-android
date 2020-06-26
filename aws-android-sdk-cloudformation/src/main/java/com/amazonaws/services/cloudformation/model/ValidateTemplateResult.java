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
 * The output for <a>ValidateTemplate</a> action.
 * </p>
 */
public class ValidateTemplateResult implements Serializable {
    /**
     * <p>
     * A list of <code>TemplateParameter</code> structures.
     * </p>
     */
    private java.util.List<TemplateParameter> parameters;

    /**
     * <p>
     * The description found within the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions
     * return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     */
    private java.util.List<String> capabilities;

    /**
     * <p>
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     * </p>
     */
    private String capabilitiesReason;

    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     */
    private java.util.List<String> declaredTransforms;

    /**
     * <p>
     * A list of <code>TemplateParameter</code> structures.
     * </p>
     *
     * @return <p>
     *         A list of <code>TemplateParameter</code> structures.
     *         </p>
     */
    public java.util.List<TemplateParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of <code>TemplateParameter</code> structures.
     * </p>
     *
     * @param parameters <p>
     *            A list of <code>TemplateParameter</code> structures.
     *            </p>
     */
    public void setParameters(java.util.Collection<TemplateParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<TemplateParameter>(parameters);
    }

    /**
     * <p>
     * A list of <code>TemplateParameter</code> structures.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of <code>TemplateParameter</code> structures.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidateTemplateResult withParameters(TemplateParameter... parameters) {
        if (getParameters() == null) {
            this.parameters = new java.util.ArrayList<TemplateParameter>(parameters.length);
        }
        for (TemplateParameter value : parameters) {
            this.parameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>TemplateParameter</code> structures.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of <code>TemplateParameter</code> structures.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidateTemplateResult withParameters(java.util.Collection<TemplateParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The description found within the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The description found within the template.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description found within the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description found within the template.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description found within the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description found within the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidateTemplateResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions
     * return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     *
     * @return <p>
     *         The capabilities found within the template. If your template
     *         contains IAM resources, you must specify the CAPABILITY_IAM or
     *         CAPABILITY_NAMED_IAM value for this parameter when you use the
     *         <a>CreateStack</a> or <a>UpdateStack</a> actions with your
     *         template; otherwise, those actions return an
     *         InsufficientCapabilities error.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *         >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     *         </p>
     */
    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions
     * return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     *
     * @param capabilities <p>
     *            The capabilities found within the template. If your template
     *            contains IAM resources, you must specify the CAPABILITY_IAM or
     *            CAPABILITY_NAMED_IAM value for this parameter when you use the
     *            <a>CreateStack</a> or <a>UpdateStack</a> actions with your
     *            template; otherwise, those actions return an
     *            InsufficientCapabilities error.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *            >Acknowledging IAM Resources in AWS CloudFormation
     *            Templates</a>.
     *            </p>
     */
    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions
     * return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            The capabilities found within the template. If your template
     *            contains IAM resources, you must specify the CAPABILITY_IAM or
     *            CAPABILITY_NAMED_IAM value for this parameter when you use the
     *            <a>CreateStack</a> or <a>UpdateStack</a> actions with your
     *            template; otherwise, those actions return an
     *            InsufficientCapabilities error.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *            >Acknowledging IAM Resources in AWS CloudFormation
     *            Templates</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidateTemplateResult withCapabilities(String... capabilities) {
        if (getCapabilities() == null) {
            this.capabilities = new java.util.ArrayList<String>(capabilities.length);
        }
        for (String value : capabilities) {
            this.capabilities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions
     * return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            The capabilities found within the template. If your template
     *            contains IAM resources, you must specify the CAPABILITY_IAM or
     *            CAPABILITY_NAMED_IAM value for this parameter when you use the
     *            <a>CreateStack</a> or <a>UpdateStack</a> actions with your
     *            template; otherwise, those actions return an
     *            InsufficientCapabilities error.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *            >Acknowledging IAM Resources in AWS CloudFormation
     *            Templates</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidateTemplateResult withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     * </p>
     *
     * @return <p>
     *         The list of resources that generated the values in the
     *         <code>Capabilities</code> response element.
     *         </p>
     */
    public String getCapabilitiesReason() {
        return capabilitiesReason;
    }

    /**
     * <p>
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     * </p>
     *
     * @param capabilitiesReason <p>
     *            The list of resources that generated the values in the
     *            <code>Capabilities</code> response element.
     *            </p>
     */
    public void setCapabilitiesReason(String capabilitiesReason) {
        this.capabilitiesReason = capabilitiesReason;
    }

    /**
     * <p>
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilitiesReason <p>
     *            The list of resources that generated the values in the
     *            <code>Capabilities</code> response element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidateTemplateResult withCapabilitiesReason(String capabilitiesReason) {
        this.capabilitiesReason = capabilitiesReason;
        return this;
    }

    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     *
     * @return <p>
     *         A list of the transforms that are declared in the template.
     *         </p>
     */
    public java.util.List<String> getDeclaredTransforms() {
        return declaredTransforms;
    }

    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     *
     * @param declaredTransforms <p>
     *            A list of the transforms that are declared in the template.
     *            </p>
     */
    public void setDeclaredTransforms(java.util.Collection<String> declaredTransforms) {
        if (declaredTransforms == null) {
            this.declaredTransforms = null;
            return;
        }

        this.declaredTransforms = new java.util.ArrayList<String>(declaredTransforms);
    }

    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param declaredTransforms <p>
     *            A list of the transforms that are declared in the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidateTemplateResult withDeclaredTransforms(String... declaredTransforms) {
        if (getDeclaredTransforms() == null) {
            this.declaredTransforms = new java.util.ArrayList<String>(declaredTransforms.length);
        }
        for (String value : declaredTransforms) {
            this.declaredTransforms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param declaredTransforms <p>
     *            A list of the transforms that are declared in the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidateTemplateResult withDeclaredTransforms(
            java.util.Collection<String> declaredTransforms) {
        setDeclaredTransforms(declaredTransforms);
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
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCapabilities() != null)
            sb.append("Capabilities: " + getCapabilities() + ",");
        if (getCapabilitiesReason() != null)
            sb.append("CapabilitiesReason: " + getCapabilitiesReason() + ",");
        if (getDeclaredTransforms() != null)
            sb.append("DeclaredTransforms: " + getDeclaredTransforms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilitiesReason() == null) ? 0 : getCapabilitiesReason().hashCode());
        hashCode = prime * hashCode
                + ((getDeclaredTransforms() == null) ? 0 : getDeclaredTransforms().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateTemplateResult == false)
            return false;
        ValidateTemplateResult other = (ValidateTemplateResult) obj;

        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null
                && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getCapabilitiesReason() == null ^ this.getCapabilitiesReason() == null)
            return false;
        if (other.getCapabilitiesReason() != null
                && other.getCapabilitiesReason().equals(this.getCapabilitiesReason()) == false)
            return false;
        if (other.getDeclaredTransforms() == null ^ this.getDeclaredTransforms() == null)
            return false;
        if (other.getDeclaredTransforms() != null
                && other.getDeclaredTransforms().equals(this.getDeclaredTransforms()) == false)
            return false;
        return true;
    }
}
