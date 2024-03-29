/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Deletes the specified IP address filter.
 * </p>
 * <p>
 * For information about managing IP address filters, see the <a href=
 * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-ip-filtering-console-walkthrough.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class DeleteReceiptFilterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the IP address filter to delete.
     * </p>
     */
    private String filterName;

    /**
     * <p>
     * The name of the IP address filter to delete.
     * </p>
     *
     * @return <p>
     *         The name of the IP address filter to delete.
     *         </p>
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * <p>
     * The name of the IP address filter to delete.
     * </p>
     *
     * @param filterName <p>
     *            The name of the IP address filter to delete.
     *            </p>
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * <p>
     * The name of the IP address filter to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterName <p>
     *            The name of the IP address filter to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteReceiptFilterRequest withFilterName(String filterName) {
        this.filterName = filterName;
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
        if (getFilterName() != null)
            sb.append("FilterName: " + getFilterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReceiptFilterRequest == false)
            return false;
        DeleteReceiptFilterRequest other = (DeleteReceiptFilterRequest) obj;

        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null
                && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        return true;
    }
}
