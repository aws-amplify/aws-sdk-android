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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the Amazon EMR block public access configuration for your AWS account
 * in the current Region. For more information see <a href=
 * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/configure-block-public-access.html"
 * >Configure Block Public Access for Amazon EMR</a> in the <i>Amazon EMR
 * Management Guide</i>.
 * </p>
 */
public class GetBlockPublicAccessConfigurationRequest extends AmazonWebServiceRequest implements
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

        if (obj instanceof GetBlockPublicAccessConfigurationRequest == false)
            return false;
        GetBlockPublicAccessConfigurationRequest other = (GetBlockPublicAccessConfigurationRequest) obj;

        return true;
    }
}
