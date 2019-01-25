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

/**
 * <p>
 * A paginated list of custom verification email templates.
 * </p>
 */
public class ListCustomVerificationEmailTemplatesResult implements Serializable {
    /**
     * <p>
     * A list of the custom verification email templates that exist in your
     * account.
     * </p>
     */
    private java.util.List<CustomVerificationEmailTemplate> customVerificationEmailTemplates = new java.util.ArrayList<CustomVerificationEmailTemplate>();

    /**
     * <p>
     * A token indicating that there are additional custom verification email
     * templates available to be listed. Pass this token to a subsequent call to
     * <code>ListTemplates</code> to retrieve the next 50 custom verification
     * email templates.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the custom verification email templates that exist in your
     * account.
     * </p>
     *
     * @return <p>
     *         A list of the custom verification email templates that exist in
     *         your account.
     *         </p>
     */
    public java.util.List<CustomVerificationEmailTemplate> getCustomVerificationEmailTemplates() {
        return customVerificationEmailTemplates;
    }

    /**
     * <p>
     * A list of the custom verification email templates that exist in your
     * account.
     * </p>
     *
     * @param customVerificationEmailTemplates <p>
     *            A list of the custom verification email templates that exist
     *            in your account.
     *            </p>
     */
    public void setCustomVerificationEmailTemplates(
            java.util.Collection<CustomVerificationEmailTemplate> customVerificationEmailTemplates) {
        if (customVerificationEmailTemplates == null) {
            this.customVerificationEmailTemplates = null;
            return;
        }

        this.customVerificationEmailTemplates = new java.util.ArrayList<CustomVerificationEmailTemplate>(
                customVerificationEmailTemplates);
    }

    /**
     * <p>
     * A list of the custom verification email templates that exist in your
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customVerificationEmailTemplates <p>
     *            A list of the custom verification email templates that exist
     *            in your account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCustomVerificationEmailTemplatesResult withCustomVerificationEmailTemplates(
            CustomVerificationEmailTemplate... customVerificationEmailTemplates) {
        if (getCustomVerificationEmailTemplates() == null) {
            this.customVerificationEmailTemplates = new java.util.ArrayList<CustomVerificationEmailTemplate>(
                    customVerificationEmailTemplates.length);
        }
        for (CustomVerificationEmailTemplate value : customVerificationEmailTemplates) {
            this.customVerificationEmailTemplates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the custom verification email templates that exist in your
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customVerificationEmailTemplates <p>
     *            A list of the custom verification email templates that exist
     *            in your account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCustomVerificationEmailTemplatesResult withCustomVerificationEmailTemplates(
            java.util.Collection<CustomVerificationEmailTemplate> customVerificationEmailTemplates) {
        setCustomVerificationEmailTemplates(customVerificationEmailTemplates);
        return this;
    }

    /**
     * <p>
     * A token indicating that there are additional custom verification email
     * templates available to be listed. Pass this token to a subsequent call to
     * <code>ListTemplates</code> to retrieve the next 50 custom verification
     * email templates.
     * </p>
     *
     * @return <p>
     *         A token indicating that there are additional custom verification
     *         email templates available to be listed. Pass this token to a
     *         subsequent call to <code>ListTemplates</code> to retrieve the
     *         next 50 custom verification email templates.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token indicating that there are additional custom verification email
     * templates available to be listed. Pass this token to a subsequent call to
     * <code>ListTemplates</code> to retrieve the next 50 custom verification
     * email templates.
     * </p>
     *
     * @param nextToken <p>
     *            A token indicating that there are additional custom
     *            verification email templates available to be listed. Pass this
     *            token to a subsequent call to <code>ListTemplates</code> to
     *            retrieve the next 50 custom verification email templates.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token indicating that there are additional custom verification email
     * templates available to be listed. Pass this token to a subsequent call to
     * <code>ListTemplates</code> to retrieve the next 50 custom verification
     * email templates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token indicating that there are additional custom
     *            verification email templates available to be listed. Pass this
     *            token to a subsequent call to <code>ListTemplates</code> to
     *            retrieve the next 50 custom verification email templates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCustomVerificationEmailTemplatesResult withNextToken(String nextToken) {
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
        if (getCustomVerificationEmailTemplates() != null)
            sb.append("CustomVerificationEmailTemplates: " + getCustomVerificationEmailTemplates()
                    + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCustomVerificationEmailTemplates() == null) ? 0
                        : getCustomVerificationEmailTemplates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCustomVerificationEmailTemplatesResult == false)
            return false;
        ListCustomVerificationEmailTemplatesResult other = (ListCustomVerificationEmailTemplatesResult) obj;

        if (other.getCustomVerificationEmailTemplates() == null
                ^ this.getCustomVerificationEmailTemplates() == null)
            return false;
        if (other.getCustomVerificationEmailTemplates() != null
                && other.getCustomVerificationEmailTemplates().equals(
                        this.getCustomVerificationEmailTemplates()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
