/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListProvisioningTemplatesResult implements Serializable {
    /**
     * <p>
     * A list of fleet provisioning templates
     * </p>
     */
    private java.util.List<ProvisioningTemplateSummary> templates;

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of fleet provisioning templates
     * </p>
     *
     * @return <p>
     *         A list of fleet provisioning templates
     *         </p>
     */
    public java.util.List<ProvisioningTemplateSummary> getTemplates() {
        return templates;
    }

    /**
     * <p>
     * A list of fleet provisioning templates
     * </p>
     *
     * @param templates <p>
     *            A list of fleet provisioning templates
     *            </p>
     */
    public void setTemplates(java.util.Collection<ProvisioningTemplateSummary> templates) {
        if (templates == null) {
            this.templates = null;
            return;
        }

        this.templates = new java.util.ArrayList<ProvisioningTemplateSummary>(templates);
    }

    /**
     * <p>
     * A list of fleet provisioning templates
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templates <p>
     *            A list of fleet provisioning templates
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProvisioningTemplatesResult withTemplates(ProvisioningTemplateSummary... templates) {
        if (getTemplates() == null) {
            this.templates = new java.util.ArrayList<ProvisioningTemplateSummary>(templates.length);
        }
        for (ProvisioningTemplateSummary value : templates) {
            this.templates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of fleet provisioning templates
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templates <p>
     *            A list of fleet provisioning templates
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProvisioningTemplatesResult withTemplates(
            java.util.Collection<ProvisioningTemplateSummary> templates) {
        setTemplates(templates);
        return this;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     *
     * @return <p>
     *         A token to retrieve the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            A token to retrieve the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token to retrieve the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProvisioningTemplatesResult withNextToken(String nextToken) {
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
        if (getTemplates() != null)
            sb.append("templates: " + getTemplates() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplates() == null) ? 0 : getTemplates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProvisioningTemplatesResult == false)
            return false;
        ListProvisioningTemplatesResult other = (ListProvisioningTemplatesResult) obj;

        if (other.getTemplates() == null ^ this.getTemplates() == null)
            return false;
        if (other.getTemplates() != null
                && other.getTemplates().equals(this.getTemplates()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
