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

/**
 * <p>
 * The configuration information for the bucket.
 * </p>
 */
public class CreateBucketConfiguration implements Serializable {
    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you don't
     * specify a Region, the bucket is created in the US East (N. Virginia)
     * Region (us-east-1).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EU, eu-west-1, us-west-1, us-west-2, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1, cn-north-1,
     * eu-central-1
     */
    private String locationConstraint;

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you don't
     * specify a Region, the bucket is created in the US East (N. Virginia)
     * Region (us-east-1).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EU, eu-west-1, us-west-1, us-west-2, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1, cn-north-1,
     * eu-central-1
     *
     * @return <p>
     *         Specifies the Region where the bucket will be created. If you
     *         don't specify a Region, the bucket is created in the US East (N.
     *         Virginia) Region (us-east-1).
     *         </p>
     * @see BucketLocationConstraint
     */
    public String getLocationConstraint() {
        return locationConstraint;
    }

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you don't
     * specify a Region, the bucket is created in the US East (N. Virginia)
     * Region (us-east-1).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EU, eu-west-1, us-west-1, us-west-2, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1, cn-north-1,
     * eu-central-1
     *
     * @param locationConstraint <p>
     *            Specifies the Region where the bucket will be created. If you
     *            don't specify a Region, the bucket is created in the US East
     *            (N. Virginia) Region (us-east-1).
     *            </p>
     * @see BucketLocationConstraint
     */
    public void setLocationConstraint(String locationConstraint) {
        this.locationConstraint = locationConstraint;
    }

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you don't
     * specify a Region, the bucket is created in the US East (N. Virginia)
     * Region (us-east-1).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EU, eu-west-1, us-west-1, us-west-2, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1, cn-north-1,
     * eu-central-1
     *
     * @param locationConstraint <p>
     *            Specifies the Region where the bucket will be created. If you
     *            don't specify a Region, the bucket is created in the US East
     *            (N. Virginia) Region (us-east-1).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BucketLocationConstraint
     */
    public CreateBucketConfiguration withLocationConstraint(String locationConstraint) {
        this.locationConstraint = locationConstraint;
        return this;
    }

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you don't
     * specify a Region, the bucket is created in the US East (N. Virginia)
     * Region (us-east-1).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EU, eu-west-1, us-west-1, us-west-2, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1, cn-north-1,
     * eu-central-1
     *
     * @param locationConstraint <p>
     *            Specifies the Region where the bucket will be created. If you
     *            don't specify a Region, the bucket is created in the US East
     *            (N. Virginia) Region (us-east-1).
     *            </p>
     * @see BucketLocationConstraint
     */
    public void setLocationConstraint(BucketLocationConstraint locationConstraint) {
        this.locationConstraint = locationConstraint.toString();
    }

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you don't
     * specify a Region, the bucket is created in the US East (N. Virginia)
     * Region (us-east-1).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EU, eu-west-1, us-west-1, us-west-2, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1, cn-north-1,
     * eu-central-1
     *
     * @param locationConstraint <p>
     *            Specifies the Region where the bucket will be created. If you
     *            don't specify a Region, the bucket is created in the US East
     *            (N. Virginia) Region (us-east-1).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BucketLocationConstraint
     */
    public CreateBucketConfiguration withLocationConstraint(
            BucketLocationConstraint locationConstraint) {
        this.locationConstraint = locationConstraint.toString();
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
        if (getLocationConstraint() != null)
            sb.append("LocationConstraint: " + getLocationConstraint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLocationConstraint() == null) ? 0 : getLocationConstraint().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBucketConfiguration == false)
            return false;
        CreateBucketConfiguration other = (CreateBucketConfiguration) obj;

        if (other.getLocationConstraint() == null ^ this.getLocationConstraint() == null)
            return false;
        if (other.getLocationConstraint() != null
                && other.getLocationConstraint().equals(this.getLocationConstraint()) == false)
            return false;
        return true;
    }
}
