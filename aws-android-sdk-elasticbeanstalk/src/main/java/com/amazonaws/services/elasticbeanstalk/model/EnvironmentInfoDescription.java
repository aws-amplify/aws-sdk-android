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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * The information retrieved from the Amazon EC2 instances.
 * </p>
 */
public class EnvironmentInfoDescription implements Serializable {
    /**
     * <p>
     * The type of information retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail, bundle
     */
    private String infoType;

    /**
     * <p>
     * The Amazon EC2 Instance ID for this information.
     * </p>
     */
    private String ec2InstanceId;

    /**
     * <p>
     * The time stamp when this information was retrieved.
     * </p>
     */
    private java.util.Date sampleTimestamp;

    /**
     * <p>
     * The retrieved information. Currently contains a presigned Amazon S3 URL.
     * The files are deleted after 15 minutes.
     * </p>
     * <p>
     * Anyone in possession of this URL can access the files before they are
     * deleted. Make the URL available only to trusted parties.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The type of information retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail, bundle
     *
     * @return <p>
     *         The type of information retrieved.
     *         </p>
     * @see EnvironmentInfoType
     */
    public String getInfoType() {
        return infoType;
    }

    /**
     * <p>
     * The type of information retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail, bundle
     *
     * @param infoType <p>
     *            The type of information retrieved.
     *            </p>
     * @see EnvironmentInfoType
     */
    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    /**
     * <p>
     * The type of information retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail, bundle
     *
     * @param infoType <p>
     *            The type of information retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentInfoType
     */
    public EnvironmentInfoDescription withInfoType(String infoType) {
        this.infoType = infoType;
        return this;
    }

    /**
     * <p>
     * The type of information retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail, bundle
     *
     * @param infoType <p>
     *            The type of information retrieved.
     *            </p>
     * @see EnvironmentInfoType
     */
    public void setInfoType(EnvironmentInfoType infoType) {
        this.infoType = infoType.toString();
    }

    /**
     * <p>
     * The type of information retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail, bundle
     *
     * @param infoType <p>
     *            The type of information retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentInfoType
     */
    public EnvironmentInfoDescription withInfoType(EnvironmentInfoType infoType) {
        this.infoType = infoType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 Instance ID for this information.
     * </p>
     *
     * @return <p>
     *         The Amazon EC2 Instance ID for this information.
     *         </p>
     */
    public String getEc2InstanceId() {
        return ec2InstanceId;
    }

    /**
     * <p>
     * The Amazon EC2 Instance ID for this information.
     * </p>
     *
     * @param ec2InstanceId <p>
     *            The Amazon EC2 Instance ID for this information.
     *            </p>
     */
    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }

    /**
     * <p>
     * The Amazon EC2 Instance ID for this information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2InstanceId <p>
     *            The Amazon EC2 Instance ID for this information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentInfoDescription withEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
        return this;
    }

    /**
     * <p>
     * The time stamp when this information was retrieved.
     * </p>
     *
     * @return <p>
     *         The time stamp when this information was retrieved.
     *         </p>
     */
    public java.util.Date getSampleTimestamp() {
        return sampleTimestamp;
    }

    /**
     * <p>
     * The time stamp when this information was retrieved.
     * </p>
     *
     * @param sampleTimestamp <p>
     *            The time stamp when this information was retrieved.
     *            </p>
     */
    public void setSampleTimestamp(java.util.Date sampleTimestamp) {
        this.sampleTimestamp = sampleTimestamp;
    }

    /**
     * <p>
     * The time stamp when this information was retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleTimestamp <p>
     *            The time stamp when this information was retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentInfoDescription withSampleTimestamp(java.util.Date sampleTimestamp) {
        this.sampleTimestamp = sampleTimestamp;
        return this;
    }

    /**
     * <p>
     * The retrieved information. Currently contains a presigned Amazon S3 URL.
     * The files are deleted after 15 minutes.
     * </p>
     * <p>
     * Anyone in possession of this URL can access the files before they are
     * deleted. Make the URL available only to trusted parties.
     * </p>
     *
     * @return <p>
     *         The retrieved information. Currently contains a presigned Amazon
     *         S3 URL. The files are deleted after 15 minutes.
     *         </p>
     *         <p>
     *         Anyone in possession of this URL can access the files before they
     *         are deleted. Make the URL available only to trusted parties.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The retrieved information. Currently contains a presigned Amazon S3 URL.
     * The files are deleted after 15 minutes.
     * </p>
     * <p>
     * Anyone in possession of this URL can access the files before they are
     * deleted. Make the URL available only to trusted parties.
     * </p>
     *
     * @param message <p>
     *            The retrieved information. Currently contains a presigned
     *            Amazon S3 URL. The files are deleted after 15 minutes.
     *            </p>
     *            <p>
     *            Anyone in possession of this URL can access the files before
     *            they are deleted. Make the URL available only to trusted
     *            parties.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The retrieved information. Currently contains a presigned Amazon S3 URL.
     * The files are deleted after 15 minutes.
     * </p>
     * <p>
     * Anyone in possession of this URL can access the files before they are
     * deleted. Make the URL available only to trusted parties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The retrieved information. Currently contains a presigned
     *            Amazon S3 URL. The files are deleted after 15 minutes.
     *            </p>
     *            <p>
     *            Anyone in possession of this URL can access the files before
     *            they are deleted. Make the URL available only to trusted
     *            parties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentInfoDescription withMessage(String message) {
        this.message = message;
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
        if (getInfoType() != null)
            sb.append("InfoType: " + getInfoType() + ",");
        if (getEc2InstanceId() != null)
            sb.append("Ec2InstanceId: " + getEc2InstanceId() + ",");
        if (getSampleTimestamp() != null)
            sb.append("SampleTimestamp: " + getSampleTimestamp() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInfoType() == null) ? 0 : getInfoType().hashCode());
        hashCode = prime * hashCode
                + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getSampleTimestamp() == null) ? 0 : getSampleTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentInfoDescription == false)
            return false;
        EnvironmentInfoDescription other = (EnvironmentInfoDescription) obj;

        if (other.getInfoType() == null ^ this.getInfoType() == null)
            return false;
        if (other.getInfoType() != null && other.getInfoType().equals(this.getInfoType()) == false)
            return false;
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null)
            return false;
        if (other.getEc2InstanceId() != null
                && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false)
            return false;
        if (other.getSampleTimestamp() == null ^ this.getSampleTimestamp() == null)
            return false;
        if (other.getSampleTimestamp() != null
                && other.getSampleTimestamp().equals(this.getSampleTimestamp()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
