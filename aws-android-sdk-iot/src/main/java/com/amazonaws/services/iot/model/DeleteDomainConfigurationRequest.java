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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the specified domain configuration.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >DeleteDomainConfiguration</a> action.
 * </p>
 */
public class DeleteDomainConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the domain configuration to be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.-]+<br/>
     */
    private String domainConfigurationName;

    /**
     * <p>
     * The name of the domain configuration to be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.-]+<br/>
     *
     * @return <p>
     *         The name of the domain configuration to be deleted.
     *         </p>
     */
    public String getDomainConfigurationName() {
        return domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration to be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.-]+<br/>
     *
     * @param domainConfigurationName <p>
     *            The name of the domain configuration to be deleted.
     *            </p>
     */
    public void setDomainConfigurationName(String domainConfigurationName) {
        this.domainConfigurationName = domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration to be deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.-]+<br/>
     *
     * @param domainConfigurationName <p>
     *            The name of the domain configuration to be deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDomainConfigurationRequest withDomainConfigurationName(
            String domainConfigurationName) {
        this.domainConfigurationName = domainConfigurationName;
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
        if (getDomainConfigurationName() != null)
            sb.append("domainConfigurationName: " + getDomainConfigurationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDomainConfigurationName() == null) ? 0 : getDomainConfigurationName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDomainConfigurationRequest == false)
            return false;
        DeleteDomainConfigurationRequest other = (DeleteDomainConfigurationRequest) obj;

        if (other.getDomainConfigurationName() == null ^ this.getDomainConfigurationName() == null)
            return false;
        if (other.getDomainConfigurationName() != null
                && other.getDomainConfigurationName().equals(this.getDomainConfigurationName()) == false)
            return false;
        return true;
    }
}
