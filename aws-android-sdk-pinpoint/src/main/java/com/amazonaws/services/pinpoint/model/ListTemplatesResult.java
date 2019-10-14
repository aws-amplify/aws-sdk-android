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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class ListTemplatesResult implements Serializable {
    /**
     * <p>
     * Provides information about all the message templates that are associated
     * with your Amazon Pinpoint account.
     * </p>
     */
    private TemplatesResponse templatesResponse;

    /**
     * <p>
     * Provides information about all the message templates that are associated
     * with your Amazon Pinpoint account.
     * </p>
     *
     * @return <p>
     *         Provides information about all the message templates that are
     *         associated with your Amazon Pinpoint account.
     *         </p>
     */
    public TemplatesResponse getTemplatesResponse() {
        return templatesResponse;
    }

    /**
     * <p>
     * Provides information about all the message templates that are associated
     * with your Amazon Pinpoint account.
     * </p>
     *
     * @param templatesResponse <p>
     *            Provides information about all the message templates that are
     *            associated with your Amazon Pinpoint account.
     *            </p>
     */
    public void setTemplatesResponse(TemplatesResponse templatesResponse) {
        this.templatesResponse = templatesResponse;
    }

    /**
     * <p>
     * Provides information about all the message templates that are associated
     * with your Amazon Pinpoint account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templatesResponse <p>
     *            Provides information about all the message templates that are
     *            associated with your Amazon Pinpoint account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplatesResult withTemplatesResponse(TemplatesResponse templatesResponse) {
        this.templatesResponse = templatesResponse;
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
        if (getTemplatesResponse() != null)
            sb.append("TemplatesResponse: " + getTemplatesResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTemplatesResponse() == null) ? 0 : getTemplatesResponse().hashCode());
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

        if (other.getTemplatesResponse() == null ^ this.getTemplatesResponse() == null)
            return false;
        if (other.getTemplatesResponse() != null
                && other.getTemplatesResponse().equals(this.getTemplatesResponse()) == false)
            return false;
        return true;
    }
}
