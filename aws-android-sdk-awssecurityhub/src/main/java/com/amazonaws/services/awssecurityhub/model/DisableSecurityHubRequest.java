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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disables Security Hub in your account only in the current Region. To disable
 * Security Hub in all Regions, you must submit one request per Region where you
 * have enabled Security Hub.
 * </p>
 * <p>
 * When you disable Security Hub for a master account, it doesn't disable
 * Security Hub for any associated member accounts.
 * </p>
 * <p>
 * When you disable Security Hub, your existing findings and insights and any
 * Security Hub configuration settings are deleted after 90 days and cannot be
 * recovered. Any standards that were enabled are disabled, and your master and
 * member account associations are removed.
 * </p>
 * <p>
 * If you want to save your existing findings, you must export them before you
 * disable Security Hub.
 * </p>
 */
public class DisableSecurityHubRequest extends AmazonWebServiceRequest implements Serializable {
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

        if (obj instanceof DisableSecurityHubRequest == false)
            return false;
        DisableSecurityHubRequest other = (DisableSecurityHubRequest) obj;

        return true;
    }
}
