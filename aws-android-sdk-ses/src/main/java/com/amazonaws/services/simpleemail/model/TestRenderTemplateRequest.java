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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a preview of the MIME content of an email when provided with a
 * template and a set of replacement data.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class TestRenderTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the template that you want to render.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is
     * a JSON object, typically consisting of key-value pairs in which the keys
     * correspond to replacement tags in the email template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 262144<br/>
     */
    private String templateData;

    /**
     * <p>
     * The name of the template that you want to render.
     * </p>
     *
     * @return <p>
     *         The name of the template that you want to render.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the template that you want to render.
     * </p>
     *
     * @param templateName <p>
     *            The name of the template that you want to render.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the template that you want to render.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateName <p>
     *            The name of the template that you want to render.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestRenderTemplateRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is
     * a JSON object, typically consisting of key-value pairs in which the keys
     * correspond to replacement tags in the email template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 262144<br/>
     *
     * @return <p>
     *         A list of replacement values to apply to the template. This
     *         parameter is a JSON object, typically consisting of key-value
     *         pairs in which the keys correspond to replacement tags in the
     *         email template.
     *         </p>
     */
    public String getTemplateData() {
        return templateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is
     * a JSON object, typically consisting of key-value pairs in which the keys
     * correspond to replacement tags in the email template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 262144<br/>
     *
     * @param templateData <p>
     *            A list of replacement values to apply to the template. This
     *            parameter is a JSON object, typically consisting of key-value
     *            pairs in which the keys correspond to replacement tags in the
     *            email template.
     *            </p>
     */
    public void setTemplateData(String templateData) {
        this.templateData = templateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is
     * a JSON object, typically consisting of key-value pairs in which the keys
     * correspond to replacement tags in the email template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 262144<br/>
     *
     * @param templateData <p>
     *            A list of replacement values to apply to the template. This
     *            parameter is a JSON object, typically consisting of key-value
     *            pairs in which the keys correspond to replacement tags in the
     *            email template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestRenderTemplateRequest withTemplateData(String templateData) {
        this.templateData = templateData;
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
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getTemplateData() != null)
            sb.append("TemplateData: " + getTemplateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateData() == null) ? 0 : getTemplateData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestRenderTemplateRequest == false)
            return false;
        TestRenderTemplateRequest other = (TestRenderTemplateRequest) obj;

        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateData() == null ^ this.getTemplateData() == null)
            return false;
        if (other.getTemplateData() != null
                && other.getTemplateData().equals(this.getTemplateData()) == false)
            return false;
        return true;
    }
}
