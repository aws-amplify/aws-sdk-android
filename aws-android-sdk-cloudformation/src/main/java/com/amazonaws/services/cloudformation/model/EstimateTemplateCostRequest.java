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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the estimated monthly cost of a template. The return value is an AWS
 * Simple Monthly Calculator URL with a query string that describes the
 * resources required to run the template.
 * </p>
 */
public class EstimateTemplateCostRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. (For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateBody</code> or
     * <code>TemplateURL</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String templateBody;

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a
     * template that is located in an Amazon S3 bucket. For more information, go
     * to <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateURL</code> or
     * <code>TemplateBody</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String templateURL;

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input
     * parameters.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. (For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateBody</code> or
     * <code>TemplateURL</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Structure containing the template body with a minimum length of 1
     *         byte and a maximum length of 51,200 bytes. (For more information,
     *         go to <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *         >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     *         </p>
     *         <p>
     *         Conditional: You must pass <code>TemplateBody</code> or
     *         <code>TemplateURL</code>. If both are passed, only
     *         <code>TemplateBody</code> is used.
     *         </p>
     */
    public String getTemplateBody() {
        return templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. (For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateBody</code> or
     * <code>TemplateURL</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody <p>
     *            Structure containing the template body with a minimum length
     *            of 1 byte and a maximum length of 51,200 bytes. (For more
     *            information, go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     *            </p>
     *            <p>
     *            Conditional: You must pass <code>TemplateBody</code> or
     *            <code>TemplateURL</code>. If both are passed, only
     *            <code>TemplateBody</code> is used.
     *            </p>
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. (For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateBody</code> or
     * <code>TemplateURL</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody <p>
     *            Structure containing the template body with a minimum length
     *            of 1 byte and a maximum length of 51,200 bytes. (For more
     *            information, go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     *            </p>
     *            <p>
     *            Conditional: You must pass <code>TemplateBody</code> or
     *            <code>TemplateURL</code>. If both are passed, only
     *            <code>TemplateBody</code> is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EstimateTemplateCostRequest withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a
     * template that is located in an Amazon S3 bucket. For more information, go
     * to <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateURL</code> or
     * <code>TemplateBody</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Location of file containing the template body. The URL must point
     *         to a template that is located in an Amazon S3 bucket. For more
     *         information, go to <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *         >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *         </p>
     *         <p>
     *         Conditional: You must pass <code>TemplateURL</code> or
     *         <code>TemplateBody</code>. If both are passed, only
     *         <code>TemplateBody</code> is used.
     *         </p>
     */
    public String getTemplateURL() {
        return templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a
     * template that is located in an Amazon S3 bucket. For more information, go
     * to <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateURL</code> or
     * <code>TemplateBody</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL <p>
     *            Location of file containing the template body. The URL must
     *            point to a template that is located in an Amazon S3 bucket.
     *            For more information, go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *            </p>
     *            <p>
     *            Conditional: You must pass <code>TemplateURL</code> or
     *            <code>TemplateBody</code>. If both are passed, only
     *            <code>TemplateBody</code> is used.
     *            </p>
     */
    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a
     * template that is located in an Amazon S3 bucket. For more information, go
     * to <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateURL</code> or
     * <code>TemplateBody</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL <p>
     *            Location of file containing the template body. The URL must
     *            point to a template that is located in an Amazon S3 bucket.
     *            For more information, go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *            </p>
     *            <p>
     *            Conditional: You must pass <code>TemplateURL</code> or
     *            <code>TemplateBody</code>. If both are passed, only
     *            <code>TemplateBody</code> is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EstimateTemplateCostRequest withTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input
     * parameters.
     * </p>
     *
     * @return <p>
     *         A list of <code>Parameter</code> structures that specify input
     *         parameters.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input
     * parameters.
     * </p>
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures that specify input
     *            parameters.
     *            </p>
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<Parameter>(parameters);
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input
     * parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures that specify input
     *            parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EstimateTemplateCostRequest withParameters(Parameter... parameters) {
        if (getParameters() == null) {
            this.parameters = new java.util.ArrayList<Parameter>(parameters.length);
        }
        for (Parameter value : parameters) {
            this.parameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input
     * parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures that specify input
     *            parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EstimateTemplateCostRequest withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
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
        if (getTemplateURL() != null)
            sb.append("TemplateURL: " + getTemplateURL() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters());
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
                + ((getTemplateURL() == null) ? 0 : getTemplateURL().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EstimateTemplateCostRequest == false)
            return false;
        EstimateTemplateCostRequest other = (EstimateTemplateCostRequest) obj;

        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null
                && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getTemplateURL() == null ^ this.getTemplateURL() == null)
            return false;
        if (other.getTemplateURL() != null
                && other.getTemplateURL().equals(this.getTemplateURL()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}
