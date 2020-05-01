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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A parameter label is a user-defined alias to help you manage different
 * versions of a parameter. When you modify a parameter, Systems Manager
 * automatically saves a new version and increments the version number by one. A
 * label can help you remember the purpose of a parameter when there are
 * multiple versions.
 * </p>
 * <p>
 * Parameter labels have the following requirements and restrictions.
 * </p>
 * <ul>
 * <li>
 * <p>
 * A version of a parameter can have a maximum of 10 labels.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can't attach the same label to different versions of the same parameter.
 * For example, if version 1 has the label Production, then you can't attach
 * Production to version 2.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can move a label from one version of a parameter to another.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can't create a label when you create a new parameter. You must attach a
 * label to a specific version of a parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can't delete a parameter label. If you no longer want to use a parameter
 * label, then you must move it to a different version of a parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * A label can have a maximum of 100 characters.
 * </p>
 * </li>
 * <li>
 * <p>
 * Labels can contain letters (case sensitive), numbers, periods (.), hyphens
 * (-), or underscores (_).
 * </p>
 * </li>
 * <li>
 * <p>
 * Labels can't begin with a number, "aws," or "ssm" (not case sensitive). If a
 * label fails to meet these requirements, then the label is not associated with
 * a parameter and the system displays it in the list of InvalidLabels.
 * </p>
 * </li>
 * </ul>
 */
public class LabelParameterVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The parameter name on which you want to attach one or more labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String name;

    /**
     * <p>
     * The specific version of the parameter on which you want to attach one or
     * more labels. If no version is specified, the system attaches the label to
     * the latest version.
     * </p>
     */
    private Long parameterVersion;

    /**
     * <p>
     * One or more labels to attach to the specified parameter version.
     * </p>
     */
    private java.util.List<String> labels;

    /**
     * <p>
     * The parameter name on which you want to attach one or more labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The parameter name on which you want to attach one or more
     *         labels.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The parameter name on which you want to attach one or more labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param name <p>
     *            The parameter name on which you want to attach one or more
     *            labels.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The parameter name on which you want to attach one or more labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param name <p>
     *            The parameter name on which you want to attach one or more
     *            labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelParameterVersionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The specific version of the parameter on which you want to attach one or
     * more labels. If no version is specified, the system attaches the label to
     * the latest version.
     * </p>
     *
     * @return <p>
     *         The specific version of the parameter on which you want to attach
     *         one or more labels. If no version is specified, the system
     *         attaches the label to the latest version.
     *         </p>
     */
    public Long getParameterVersion() {
        return parameterVersion;
    }

    /**
     * <p>
     * The specific version of the parameter on which you want to attach one or
     * more labels. If no version is specified, the system attaches the label to
     * the latest version.
     * </p>
     *
     * @param parameterVersion <p>
     *            The specific version of the parameter on which you want to
     *            attach one or more labels. If no version is specified, the
     *            system attaches the label to the latest version.
     *            </p>
     */
    public void setParameterVersion(Long parameterVersion) {
        this.parameterVersion = parameterVersion;
    }

    /**
     * <p>
     * The specific version of the parameter on which you want to attach one or
     * more labels. If no version is specified, the system attaches the label to
     * the latest version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterVersion <p>
     *            The specific version of the parameter on which you want to
     *            attach one or more labels. If no version is specified, the
     *            system attaches the label to the latest version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelParameterVersionRequest withParameterVersion(Long parameterVersion) {
        this.parameterVersion = parameterVersion;
        return this;
    }

    /**
     * <p>
     * One or more labels to attach to the specified parameter version.
     * </p>
     *
     * @return <p>
     *         One or more labels to attach to the specified parameter version.
     *         </p>
     */
    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * One or more labels to attach to the specified parameter version.
     * </p>
     *
     * @param labels <p>
     *            One or more labels to attach to the specified parameter
     *            version.
     *            </p>
     */
    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<String>(labels);
    }

    /**
     * <p>
     * One or more labels to attach to the specified parameter version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            One or more labels to attach to the specified parameter
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelParameterVersionRequest withLabels(String... labels) {
        if (getLabels() == null) {
            this.labels = new java.util.ArrayList<String>(labels.length);
        }
        for (String value : labels) {
            this.labels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more labels to attach to the specified parameter version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            One or more labels to attach to the specified parameter
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelParameterVersionRequest withLabels(java.util.Collection<String> labels) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getParameterVersion() != null)
            sb.append("ParameterVersion: " + getParameterVersion() + ",");
        if (getLabels() != null)
            sb.append("Labels: " + getLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getParameterVersion() == null) ? 0 : getParameterVersion().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelParameterVersionRequest == false)
            return false;
        LabelParameterVersionRequest other = (LabelParameterVersionRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getParameterVersion() == null ^ this.getParameterVersion() == null)
            return false;
        if (other.getParameterVersion() != null
                && other.getParameterVersion().equals(this.getParameterVersion()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        return true;
    }
}
