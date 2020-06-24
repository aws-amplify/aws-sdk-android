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

public class CreateServiceSpecificCredentialResult implements Serializable {
    /**
     * <p>
     * A structure that contains information about the newly created
     * service-specific credential.
     * </p>
     * <important>
     * <p>
     * This is the only time that the password for this credential set is
     * available. It cannot be recovered later. Instead, you must reset the
     * password with <a>ResetServiceSpecificCredential</a>.
     * </p>
     * </important>
     */
    private ServiceSpecificCredential serviceSpecificCredential;

    /**
     * <p>
     * A structure that contains information about the newly created
     * service-specific credential.
     * </p>
     * <important>
     * <p>
     * This is the only time that the password for this credential set is
     * available. It cannot be recovered later. Instead, you must reset the
     * password with <a>ResetServiceSpecificCredential</a>.
     * </p>
     * </important>
     *
     * @return <p>
     *         A structure that contains information about the newly created
     *         service-specific credential.
     *         </p>
     *         <important>
     *         <p>
     *         This is the only time that the password for this credential set
     *         is available. It cannot be recovered later. Instead, you must
     *         reset the password with <a>ResetServiceSpecificCredential</a>.
     *         </p>
     *         </important>
     */
    public ServiceSpecificCredential getServiceSpecificCredential() {
        return serviceSpecificCredential;
    }

    /**
     * <p>
     * A structure that contains information about the newly created
     * service-specific credential.
     * </p>
     * <important>
     * <p>
     * This is the only time that the password for this credential set is
     * available. It cannot be recovered later. Instead, you must reset the
     * password with <a>ResetServiceSpecificCredential</a>.
     * </p>
     * </important>
     *
     * @param serviceSpecificCredential <p>
     *            A structure that contains information about the newly created
     *            service-specific credential.
     *            </p>
     *            <important>
     *            <p>
     *            This is the only time that the password for this credential
     *            set is available. It cannot be recovered later. Instead, you
     *            must reset the password with
     *            <a>ResetServiceSpecificCredential</a>.
     *            </p>
     *            </important>
     */
    public void setServiceSpecificCredential(ServiceSpecificCredential serviceSpecificCredential) {
        this.serviceSpecificCredential = serviceSpecificCredential;
    }

    /**
     * <p>
     * A structure that contains information about the newly created
     * service-specific credential.
     * </p>
     * <important>
     * <p>
     * This is the only time that the password for this credential set is
     * available. It cannot be recovered later. Instead, you must reset the
     * password with <a>ResetServiceSpecificCredential</a>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceSpecificCredential <p>
     *            A structure that contains information about the newly created
     *            service-specific credential.
     *            </p>
     *            <important>
     *            <p>
     *            This is the only time that the password for this credential
     *            set is available. It cannot be recovered later. Instead, you
     *            must reset the password with
     *            <a>ResetServiceSpecificCredential</a>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceSpecificCredentialResult withServiceSpecificCredential(
            ServiceSpecificCredential serviceSpecificCredential) {
        this.serviceSpecificCredential = serviceSpecificCredential;
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
        if (getServiceSpecificCredential() != null)
            sb.append("ServiceSpecificCredential: " + getServiceSpecificCredential());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getServiceSpecificCredential() == null) ? 0 : getServiceSpecificCredential()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceSpecificCredentialResult == false)
            return false;
        CreateServiceSpecificCredentialResult other = (CreateServiceSpecificCredentialResult) obj;

        if (other.getServiceSpecificCredential() == null
                ^ this.getServiceSpecificCredential() == null)
            return false;
        if (other.getServiceSpecificCredential() != null
                && other.getServiceSpecificCredential().equals(this.getServiceSpecificCredential()) == false)
            return false;
        return true;
    }
}
