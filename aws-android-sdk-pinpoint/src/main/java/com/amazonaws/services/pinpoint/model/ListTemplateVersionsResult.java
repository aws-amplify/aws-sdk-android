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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class ListTemplateVersionsResult implements Serializable {
    /**
     * <p>
     * Provides information about all the versions of a specific message
     * template.
     * </p>
     */
    private TemplateVersionsResponse templateVersionsResponse;

    /**
     * <p>
     * Provides information about all the versions of a specific message
     * template.
     * </p>
     *
     * @return <p>
     *         Provides information about all the versions of a specific message
     *         template.
     *         </p>
     */
    public TemplateVersionsResponse getTemplateVersionsResponse() {
        return templateVersionsResponse;
    }

    /**
     * <p>
     * Provides information about all the versions of a specific message
     * template.
     * </p>
     *
     * @param templateVersionsResponse <p>
     *            Provides information about all the versions of a specific
     *            message template.
     *            </p>
     */
    public void setTemplateVersionsResponse(TemplateVersionsResponse templateVersionsResponse) {
        this.templateVersionsResponse = templateVersionsResponse;
    }

    /**
     * <p>
     * Provides information about all the versions of a specific message
     * template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateVersionsResponse <p>
     *            Provides information about all the versions of a specific
     *            message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplateVersionsResult withTemplateVersionsResponse(
            TemplateVersionsResponse templateVersionsResponse) {
        this.templateVersionsResponse = templateVersionsResponse;
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
        if (getTemplateVersionsResponse() != null)
            sb.append("TemplateVersionsResponse: " + getTemplateVersionsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTemplateVersionsResponse() == null) ? 0 : getTemplateVersionsResponse()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTemplateVersionsResult == false)
            return false;
        ListTemplateVersionsResult other = (ListTemplateVersionsResult) obj;

        if (other.getTemplateVersionsResponse() == null
                ^ this.getTemplateVersionsResponse() == null)
            return false;
        if (other.getTemplateVersionsResponse() != null
                && other.getTemplateVersionsResponse().equals(this.getTemplateVersionsResponse()) == false)
            return false;
        return true;
    }
}
