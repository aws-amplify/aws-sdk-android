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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an Amazon FPGA Image (AFI) from the specified design checkpoint
 * (DCP).
 * </p>
 * <p>
 * The create operation is asynchronous. To verify that the AFI is ready for
 * use, check the output logs.
 * </p>
 * <p>
 * An AFI contains the FPGA bitstream that is ready to download to an FPGA. You
 * can securely deploy an AFI on multiple FPGA-accelerated instances. For more
 * information, see the <a href="https://github.com/aws/aws-fpga/">AWS FPGA
 * Hardware Development Kit</a>.
 * </p>
 */
public class CreateFpgaImageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The location of the encrypted design checkpoint in Amazon S3. The input
     * must be a tarball.
     * </p>
     */
    private StorageLocation inputStorageLocation;

    /**
     * <p>
     * The location in Amazon S3 for the output logs.
     * </p>
     */
    private StorageLocation logsStorageLocation;

    /**
     * <p>
     * A description for the AFI.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A name for the AFI.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The tags to apply to the FPGA image during creation.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFpgaImageRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The location of the encrypted design checkpoint in Amazon S3. The input
     * must be a tarball.
     * </p>
     *
     * @return <p>
     *         The location of the encrypted design checkpoint in Amazon S3. The
     *         input must be a tarball.
     *         </p>
     */
    public StorageLocation getInputStorageLocation() {
        return inputStorageLocation;
    }

    /**
     * <p>
     * The location of the encrypted design checkpoint in Amazon S3. The input
     * must be a tarball.
     * </p>
     *
     * @param inputStorageLocation <p>
     *            The location of the encrypted design checkpoint in Amazon S3.
     *            The input must be a tarball.
     *            </p>
     */
    public void setInputStorageLocation(StorageLocation inputStorageLocation) {
        this.inputStorageLocation = inputStorageLocation;
    }

    /**
     * <p>
     * The location of the encrypted design checkpoint in Amazon S3. The input
     * must be a tarball.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputStorageLocation <p>
     *            The location of the encrypted design checkpoint in Amazon S3.
     *            The input must be a tarball.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFpgaImageRequest withInputStorageLocation(StorageLocation inputStorageLocation) {
        this.inputStorageLocation = inputStorageLocation;
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 for the output logs.
     * </p>
     *
     * @return <p>
     *         The location in Amazon S3 for the output logs.
     *         </p>
     */
    public StorageLocation getLogsStorageLocation() {
        return logsStorageLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 for the output logs.
     * </p>
     *
     * @param logsStorageLocation <p>
     *            The location in Amazon S3 for the output logs.
     *            </p>
     */
    public void setLogsStorageLocation(StorageLocation logsStorageLocation) {
        this.logsStorageLocation = logsStorageLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 for the output logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logsStorageLocation <p>
     *            The location in Amazon S3 for the output logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFpgaImageRequest withLogsStorageLocation(StorageLocation logsStorageLocation) {
        this.logsStorageLocation = logsStorageLocation;
        return this;
    }

    /**
     * <p>
     * A description for the AFI.
     * </p>
     *
     * @return <p>
     *         A description for the AFI.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the AFI.
     * </p>
     *
     * @param description <p>
     *            A description for the AFI.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFpgaImageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A name for the AFI.
     * </p>
     *
     * @return <p>
     *         A name for the AFI.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A name for the AFI.
     * </p>
     *
     * @param name <p>
     *            A name for the AFI.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            A name for the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFpgaImageRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     *         >Ensuring Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFpgaImageRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the FPGA image during creation.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the FPGA image during creation.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the FPGA image during creation.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the FPGA image during creation.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the FPGA image during creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the FPGA image during creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFpgaImageRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the FPGA image during creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the FPGA image during creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFpgaImageRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getInputStorageLocation() != null)
            sb.append("InputStorageLocation: " + getInputStorageLocation() + ",");
        if (getLogsStorageLocation() != null)
            sb.append("LogsStorageLocation: " + getLogsStorageLocation() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getInputStorageLocation() == null) ? 0 : getInputStorageLocation().hashCode());
        hashCode = prime * hashCode
                + ((getLogsStorageLocation() == null) ? 0 : getLogsStorageLocation().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFpgaImageRequest == false)
            return false;
        CreateFpgaImageRequest other = (CreateFpgaImageRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getInputStorageLocation() == null ^ this.getInputStorageLocation() == null)
            return false;
        if (other.getInputStorageLocation() != null
                && other.getInputStorageLocation().equals(this.getInputStorageLocation()) == false)
            return false;
        if (other.getLogsStorageLocation() == null ^ this.getLogsStorageLocation() == null)
            return false;
        if (other.getLogsStorageLocation() != null
                && other.getLogsStorageLocation().equals(this.getLogsStorageLocation()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }
}
