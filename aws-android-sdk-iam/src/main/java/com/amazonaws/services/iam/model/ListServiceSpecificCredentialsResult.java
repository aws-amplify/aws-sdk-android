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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

public class ListServiceSpecificCredentialsResult implements Serializable {
    /**
     * <p>
     * A list of structures that each contain details about a service-specific
     * credential.
     * </p>
     */
    private java.util.List<ServiceSpecificCredentialMetadata> serviceSpecificCredentials;

    /**
     * <p>
     * A list of structures that each contain details about a service-specific
     * credential.
     * </p>
     *
     * @return <p>
     *         A list of structures that each contain details about a
     *         service-specific credential.
     *         </p>
     */
    public java.util.List<ServiceSpecificCredentialMetadata> getServiceSpecificCredentials() {
        return serviceSpecificCredentials;
    }

    /**
     * <p>
     * A list of structures that each contain details about a service-specific
     * credential.
     * </p>
     *
     * @param serviceSpecificCredentials <p>
     *            A list of structures that each contain details about a
     *            service-specific credential.
     *            </p>
     */
    public void setServiceSpecificCredentials(
            java.util.Collection<ServiceSpecificCredentialMetadata> serviceSpecificCredentials) {
        if (serviceSpecificCredentials == null) {
            this.serviceSpecificCredentials = null;
            return;
        }

        this.serviceSpecificCredentials = new java.util.ArrayList<ServiceSpecificCredentialMetadata>(
                serviceSpecificCredentials);
    }

    /**
     * <p>
     * A list of structures that each contain details about a service-specific
     * credential.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceSpecificCredentials <p>
     *            A list of structures that each contain details about a
     *            service-specific credential.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListServiceSpecificCredentialsResult withServiceSpecificCredentials(
            ServiceSpecificCredentialMetadata... serviceSpecificCredentials) {
        if (getServiceSpecificCredentials() == null) {
            this.serviceSpecificCredentials = new java.util.ArrayList<ServiceSpecificCredentialMetadata>(
                    serviceSpecificCredentials.length);
        }
        for (ServiceSpecificCredentialMetadata value : serviceSpecificCredentials) {
            this.serviceSpecificCredentials.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of structures that each contain details about a service-specific
     * credential.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceSpecificCredentials <p>
     *            A list of structures that each contain details about a
     *            service-specific credential.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListServiceSpecificCredentialsResult withServiceSpecificCredentials(
            java.util.Collection<ServiceSpecificCredentialMetadata> serviceSpecificCredentials) {
        setServiceSpecificCredentials(serviceSpecificCredentials);
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
        if (getServiceSpecificCredentials() != null)
            sb.append("ServiceSpecificCredentials: " + getServiceSpecificCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getServiceSpecificCredentials() == null) ? 0 : getServiceSpecificCredentials()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceSpecificCredentialsResult == false)
            return false;
        ListServiceSpecificCredentialsResult other = (ListServiceSpecificCredentialsResult) obj;

        if (other.getServiceSpecificCredentials() == null
                ^ this.getServiceSpecificCredentials() == null)
            return false;
        if (other.getServiceSpecificCredentials() != null
                && other.getServiceSpecificCredentials().equals(
                        this.getServiceSpecificCredentials()) == false)
            return false;
        return true;
    }
}
