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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class ExportTransitGatewayRoutesResult implements Serializable {
    /**
     * <p>
     * The URL of the exported file in Amazon S3. For example,
     * s3://<i>bucket_name
     * </i>/VPCTransitGateway/TransitGatewayRouteTables/<i>file_name</i>.
     * </p>
     */
    private String s3Location;

    /**
     * <p>
     * The URL of the exported file in Amazon S3. For example,
     * s3://<i>bucket_name
     * </i>/VPCTransitGateway/TransitGatewayRouteTables/<i>file_name</i>.
     * </p>
     *
     * @return <p>
     *         The URL of the exported file in Amazon S3. For example,
     *         s3://<i>bucket_name
     *         </i>/VPCTransitGateway/TransitGatewayRouteTables
     *         /<i>file_name</i>.
     *         </p>
     */
    public String getS3Location() {
        return s3Location;
    }

    /**
     * <p>
     * The URL of the exported file in Amazon S3. For example,
     * s3://<i>bucket_name
     * </i>/VPCTransitGateway/TransitGatewayRouteTables/<i>file_name</i>.
     * </p>
     *
     * @param s3Location <p>
     *            The URL of the exported file in Amazon S3. For example,
     *            s3://<i
     *            >bucket_name</i>/VPCTransitGateway/TransitGatewayRouteTables
     *            /<i>file_name</i>.
     *            </p>
     */
    public void setS3Location(String s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * The URL of the exported file in Amazon S3. For example,
     * s3://<i>bucket_name
     * </i>/VPCTransitGateway/TransitGatewayRouteTables/<i>file_name</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Location <p>
     *            The URL of the exported file in Amazon S3. For example,
     *            s3://<i
     *            >bucket_name</i>/VPCTransitGateway/TransitGatewayRouteTables
     *            /<i>file_name</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTransitGatewayRoutesResult withS3Location(String s3Location) {
        this.s3Location = s3Location;
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
        if (getS3Location() != null)
            sb.append("S3Location: " + getS3Location());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTransitGatewayRoutesResult == false)
            return false;
        ExportTransitGatewayRoutesResult other = (ExportTransitGatewayRoutesResult) obj;

        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null
                && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        return true;
    }
}
