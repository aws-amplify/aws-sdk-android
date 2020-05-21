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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class GetBucketCorsResult implements Serializable {
    /**
     * <p>
     * A set of origins and methods (cross-origin access that you want to
     * allow). You can add up to 100 rules to the configuration.
     * </p>
     */
    private java.util.List<CORSRule> cORSRules;

    /**
     * <p>
     * A set of origins and methods (cross-origin access that you want to
     * allow). You can add up to 100 rules to the configuration.
     * </p>
     *
     * @return <p>
     *         A set of origins and methods (cross-origin access that you want
     *         to allow). You can add up to 100 rules to the configuration.
     *         </p>
     */
    public java.util.List<CORSRule> getCORSRules() {
        return cORSRules;
    }

    /**
     * <p>
     * A set of origins and methods (cross-origin access that you want to
     * allow). You can add up to 100 rules to the configuration.
     * </p>
     *
     * @param cORSRules <p>
     *            A set of origins and methods (cross-origin access that you
     *            want to allow). You can add up to 100 rules to the
     *            configuration.
     *            </p>
     */
    public void setCORSRules(java.util.Collection<CORSRule> cORSRules) {
        if (cORSRules == null) {
            this.cORSRules = null;
            return;
        }

        this.cORSRules = new java.util.ArrayList<CORSRule>(cORSRules);
    }

    /**
     * <p>
     * A set of origins and methods (cross-origin access that you want to
     * allow). You can add up to 100 rules to the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cORSRules <p>
     *            A set of origins and methods (cross-origin access that you
     *            want to allow). You can add up to 100 rules to the
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketCorsResult withCORSRules(CORSRule... cORSRules) {
        if (getCORSRules() == null) {
            this.cORSRules = new java.util.ArrayList<CORSRule>(cORSRules.length);
        }
        for (CORSRule value : cORSRules) {
            this.cORSRules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A set of origins and methods (cross-origin access that you want to
     * allow). You can add up to 100 rules to the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cORSRules <p>
     *            A set of origins and methods (cross-origin access that you
     *            want to allow). You can add up to 100 rules to the
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketCorsResult withCORSRules(java.util.Collection<CORSRule> cORSRules) {
        setCORSRules(cORSRules);
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
        if (getCORSRules() != null)
            sb.append("CORSRules: " + getCORSRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCORSRules() == null) ? 0 : getCORSRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketCorsResult == false)
            return false;
        GetBucketCorsResult other = (GetBucketCorsResult) obj;

        if (other.getCORSRules() == null ^ this.getCORSRules() == null)
            return false;
        if (other.getCORSRules() != null
                && other.getCORSRules().equals(this.getCORSRules()) == false)
            return false;
        return true;
    }
}
