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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

public class UpdateServiceActionResult implements Serializable {
    /**
     * <p>
     * Detailed information about the self-service action.
     * </p>
     */
    private ServiceActionDetail serviceActionDetail;

    /**
     * <p>
     * Detailed information about the self-service action.
     * </p>
     *
     * @return <p>
     *         Detailed information about the self-service action.
     *         </p>
     */
    public ServiceActionDetail getServiceActionDetail() {
        return serviceActionDetail;
    }

    /**
     * <p>
     * Detailed information about the self-service action.
     * </p>
     *
     * @param serviceActionDetail <p>
     *            Detailed information about the self-service action.
     *            </p>
     */
    public void setServiceActionDetail(ServiceActionDetail serviceActionDetail) {
        this.serviceActionDetail = serviceActionDetail;
    }

    /**
     * <p>
     * Detailed information about the self-service action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceActionDetail <p>
     *            Detailed information about the self-service action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceActionResult withServiceActionDetail(ServiceActionDetail serviceActionDetail) {
        this.serviceActionDetail = serviceActionDetail;
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
        if (getServiceActionDetail() != null)
            sb.append("ServiceActionDetail: " + getServiceActionDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceActionDetail() == null) ? 0 : getServiceActionDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceActionResult == false)
            return false;
        UpdateServiceActionResult other = (UpdateServiceActionResult) obj;

        if (other.getServiceActionDetail() == null ^ this.getServiceActionDetail() == null)
            return false;
        if (other.getServiceActionDetail() != null
                && other.getServiceActionDetail().equals(this.getServiceActionDetail()) == false)
            return false;
        return true;
    }
}
