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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <important>
 * <p>
 * <code>GetCheckerIpRanges</code> still works, but we recommend that you
 * download ip-ranges.json, which includes IP address ranges for all AWS
 * services. For more information, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/route-53-ip-addresses.html"
 * >IP Address Ranges of Amazon Route 53 Servers</a> in the <i>Amazon Route 53
 * Developer Guide</i>.
 * </p>
 * </important>
 */
public class GetCheckerIpRangesRequest extends AmazonWebServiceRequest implements Serializable {
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

        if (obj instanceof GetCheckerIpRangesRequest == false)
            return false;
        GetCheckerIpRangesRequest other = (GetCheckerIpRangesRequest) obj;

        return true;
    }
}
