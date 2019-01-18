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

public class ListTemplatesResult implements Serializable {
    /**
     * <p>
     * An array the contains the name and creation time stamp for each template
     * in your Amazon SES account.
     * </p>
     */
    private java.util.List<TemplateMetadata> templatesMetadata = new java.util.ArrayList<TemplateMetadata>();

    /**
     * <p>
     * A token indicating that there are additional email templates available to
     * be listed. Pass this token to a subsequent call to
     * <code>ListTemplates</code> to retrieve the next 50 email templates.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array the contains the name and creation time stamp for each template
     * in your Amazon SES account.
     * </p>
     *
     * @return <p>
     *         An array the contains the name and creation time stamp for each
     *         template in your Amazon SES account.
     *         </p>
     */
    public java.util.List<TemplateMetadata> getTemplatesMetadata() {
        return templatesMetadata;
    }

    /**
     * <p>
     * An array the contains the name and creation time stamp for each template
     * in your Amazon SES account.
     * </p>
     *
     * @param templatesMetadata <p>
     *            An array the contains the name and creation time stamp for
     *            each template in your Amazon SES account.
     *            </p>
     */
    public void setTemplatesMetadata(java.util.Collection<TemplateMetadata> templatesMetadata) {
        if (templatesMetadata == null) {
            this.templatesMetadata = null;
            return;
        }

        this.templatesMetadata = new java.util.ArrayList<TemplateMetadata>(templatesMetadata);
    }

    /**
     * <p>
     * An array the contains the name and creation time stamp for each template
     * in your Amazon SES account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templatesMetadata <p>
     *            An array the contains the name and creation time stamp for
     *            each template in your Amazon SES account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplatesResult withTemplatesMetadata(TemplateMetadata... templatesMetadata) {
        if (getTemplatesMetadata() == null) {
            this.templatesMetadata = new java.util.ArrayList<TemplateMetadata>(
                    templatesMetadata.length);
        }
        for (TemplateMetadata value : templatesMetadata) {
            this.templatesMetadata.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array the contains the name and creation time stamp for each template
     * in your Amazon SES account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templatesMetadata <p>
     *            An array the contains the name and creation time stamp for
     *            each template in your Amazon SES account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplatesResult withTemplatesMetadata(
            java.util.Collection<TemplateMetadata> templatesMetadata) {
        setTemplatesMetadata(templatesMetadata);
        return this;
    }

    /**
     * <p>
     * A token indicating that there are additional email templates available to
     * be listed. Pass this token to a subsequent call to
     * <code>ListTemplates</code> to retrieve the next 50 email templates.
     * </p>
     *
     * @return <p>
     *         A token indicating that there are additional email templates
     *         available to be listed. Pass this token to a subsequent call to
     *         <code>ListTemplates</code> to retrieve the next 50 email
     *         templates.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token indicating that there are additional email templates available to
     * be listed. Pass this token to a subsequent call to
     * <code>ListTemplates</code> to retrieve the next 50 email templates.
     * </p>
     *
     * @param nextToken <p>
     *            A token indicating that there are additional email templates
     *            available to be listed. Pass this token to a subsequent call
     *            to <code>ListTemplates</code> to retrieve the next 50 email
     *            templates.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token indicating that there are additional email templates available to
     * be listed. Pass this token to a subsequent call to
     * <code>ListTemplates</code> to retrieve the next 50 email templates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token indicating that there are additional email templates
     *            available to be listed. Pass this token to a subsequent call
     *            to <code>ListTemplates</code> to retrieve the next 50 email
     *            templates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplatesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getTemplatesMetadata() != null)
            sb.append("TemplatesMetadata: " + getTemplatesMetadata() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTemplatesMetadata() == null) ? 0 : getTemplatesMetadata().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTemplatesResult == false)
            return false;
        ListTemplatesResult other = (ListTemplatesResult) obj;

        if (other.getTemplatesMetadata() == null ^ this.getTemplatesMetadata() == null)
            return false;
        if (other.getTemplatesMetadata() != null
                && other.getTemplatesMetadata().equals(this.getTemplatesMetadata()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
