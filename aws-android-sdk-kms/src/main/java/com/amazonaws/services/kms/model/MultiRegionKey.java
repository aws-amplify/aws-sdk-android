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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the primary or replica key in a multi-Region key.
 * </p>
 */
public class MultiRegionKey implements Serializable {
    /**
     * <p>
     * Displays the key ARN of a primary or replica key of a multi-Region key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * <p>
     * Displays the Amazon Web Services Region of a primary or replica key in a
     * multi-Region key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([a-z]+-){2,3}\d+$<br/>
     */
    private String region;

    /**
     * <p>
     * Displays the key ARN of a primary or replica key of a multi-Region key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         Displays the key ARN of a primary or replica key of a
     *         multi-Region key.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * Displays the key ARN of a primary or replica key of a multi-Region key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            Displays the key ARN of a primary or replica key of a
     *            multi-Region key.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Displays the key ARN of a primary or replica key of a multi-Region key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            Displays the key ARN of a primary or replica key of a
     *            multi-Region key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiRegionKey withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * Displays the Amazon Web Services Region of a primary or replica key in a
     * multi-Region key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([a-z]+-){2,3}\d+$<br/>
     *
     * @return <p>
     *         Displays the Amazon Web Services Region of a primary or replica
     *         key in a multi-Region key.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * Displays the Amazon Web Services Region of a primary or replica key in a
     * multi-Region key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([a-z]+-){2,3}\d+$<br/>
     *
     * @param region <p>
     *            Displays the Amazon Web Services Region of a primary or
     *            replica key in a multi-Region key.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * Displays the Amazon Web Services Region of a primary or replica key in a
     * multi-Region key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([a-z]+-){2,3}\d+$<br/>
     *
     * @param region <p>
     *            Displays the Amazon Web Services Region of a primary or
     *            replica key in a multi-Region key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiRegionKey withRegion(String region) {
        this.region = region;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiRegionKey == false)
            return false;
        MultiRegionKey other = (MultiRegionKey) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }
}
