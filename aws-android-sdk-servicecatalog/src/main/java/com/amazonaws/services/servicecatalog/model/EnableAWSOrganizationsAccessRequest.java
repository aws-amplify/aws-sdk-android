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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enable portfolio sharing feature through AWS Organizations. This API will
 * allow Service Catalog to receive updates on your organization in order to
 * sync your shares with the current structure. This API can only be called by
 * the master account in the organization.
 * </p>
 * <p>
 * By calling this API Service Catalog will make a call to
 * organizations:EnableAWSServiceAccess on your behalf so that your shares can
 * be in sync with any changes in your AWS Organizations structure.
 * </p>
 */
public class EnableAWSOrganizationsAccessRequest extends AmazonWebServiceRequest implements
        Serializable {
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
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableAWSOrganizationsAccessRequest == false)
            return false;
        EnableAWSOrganizationsAccessRequest other = (EnableAWSOrganizationsAccessRequest) obj;

        return true;
    }
}
