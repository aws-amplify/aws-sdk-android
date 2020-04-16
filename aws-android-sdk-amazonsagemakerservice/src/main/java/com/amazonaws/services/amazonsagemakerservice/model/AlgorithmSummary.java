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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Provides summary information about an algorithm.
 * </p>
 */
public class AlgorithmSummary implements Serializable {
    /**
     * <p>
     * The name of the algorithm that is described by the summary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String algorithmName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:algorithm/.*<br/>
     */
    private String algorithmArn;

    /**
     * <p>
     * A brief description of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     */
    private String algorithmDescription;

    /**
     * <p>
     * A timestamp that shows when the algorithm was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The overall status of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     */
    private String algorithmStatus;

    /**
     * <p>
     * The name of the algorithm that is described by the summary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the algorithm that is described by the summary.
     *         </p>
     */
    public String getAlgorithmName() {
        return algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm that is described by the summary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param algorithmName <p>
     *            The name of the algorithm that is described by the summary.
     *            </p>
     */
    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm that is described by the summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param algorithmName <p>
     *            The name of the algorithm that is described by the summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmSummary withAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:algorithm/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the algorithm.
     *         </p>
     */
    public String getAlgorithmArn() {
        return algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:algorithm/.*<br/>
     *
     * @param algorithmArn <p>
     *            The Amazon Resource Name (ARN) of the algorithm.
     *            </p>
     */
    public void setAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:algorithm/.*<br/>
     *
     * @param algorithmArn <p>
     *            The Amazon Resource Name (ARN) of the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmSummary withAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
        return this;
    }

    /**
     * <p>
     * A brief description of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @return <p>
     *         A brief description of the algorithm.
     *         </p>
     */
    public String getAlgorithmDescription() {
        return algorithmDescription;
    }

    /**
     * <p>
     * A brief description of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param algorithmDescription <p>
     *            A brief description of the algorithm.
     *            </p>
     */
    public void setAlgorithmDescription(String algorithmDescription) {
        this.algorithmDescription = algorithmDescription;
    }

    /**
     * <p>
     * A brief description of the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param algorithmDescription <p>
     *            A brief description of the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmSummary withAlgorithmDescription(String algorithmDescription) {
        this.algorithmDescription = algorithmDescription;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the algorithm was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the algorithm was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the algorithm was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that shows when the algorithm was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the algorithm was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that shows when the algorithm was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The overall status of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @return <p>
     *         The overall status of the algorithm.
     *         </p>
     * @see AlgorithmStatus
     */
    public String getAlgorithmStatus() {
        return algorithmStatus;
    }

    /**
     * <p>
     * The overall status of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param algorithmStatus <p>
     *            The overall status of the algorithm.
     *            </p>
     * @see AlgorithmStatus
     */
    public void setAlgorithmStatus(String algorithmStatus) {
        this.algorithmStatus = algorithmStatus;
    }

    /**
     * <p>
     * The overall status of the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param algorithmStatus <p>
     *            The overall status of the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AlgorithmStatus
     */
    public AlgorithmSummary withAlgorithmStatus(String algorithmStatus) {
        this.algorithmStatus = algorithmStatus;
        return this;
    }

    /**
     * <p>
     * The overall status of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param algorithmStatus <p>
     *            The overall status of the algorithm.
     *            </p>
     * @see AlgorithmStatus
     */
    public void setAlgorithmStatus(AlgorithmStatus algorithmStatus) {
        this.algorithmStatus = algorithmStatus.toString();
    }

    /**
     * <p>
     * The overall status of the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param algorithmStatus <p>
     *            The overall status of the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AlgorithmStatus
     */
    public AlgorithmSummary withAlgorithmStatus(AlgorithmStatus algorithmStatus) {
        this.algorithmStatus = algorithmStatus.toString();
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
        if (getAlgorithmName() != null)
            sb.append("AlgorithmName: " + getAlgorithmName() + ",");
        if (getAlgorithmArn() != null)
            sb.append("AlgorithmArn: " + getAlgorithmArn() + ",");
        if (getAlgorithmDescription() != null)
            sb.append("AlgorithmDescription: " + getAlgorithmDescription() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getAlgorithmStatus() != null)
            sb.append("AlgorithmStatus: " + getAlgorithmStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAlgorithmName() == null) ? 0 : getAlgorithmName().hashCode());
        hashCode = prime * hashCode
                + ((getAlgorithmArn() == null) ? 0 : getAlgorithmArn().hashCode());
        hashCode = prime * hashCode
                + ((getAlgorithmDescription() == null) ? 0 : getAlgorithmDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getAlgorithmStatus() == null) ? 0 : getAlgorithmStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlgorithmSummary == false)
            return false;
        AlgorithmSummary other = (AlgorithmSummary) obj;

        if (other.getAlgorithmName() == null ^ this.getAlgorithmName() == null)
            return false;
        if (other.getAlgorithmName() != null
                && other.getAlgorithmName().equals(this.getAlgorithmName()) == false)
            return false;
        if (other.getAlgorithmArn() == null ^ this.getAlgorithmArn() == null)
            return false;
        if (other.getAlgorithmArn() != null
                && other.getAlgorithmArn().equals(this.getAlgorithmArn()) == false)
            return false;
        if (other.getAlgorithmDescription() == null ^ this.getAlgorithmDescription() == null)
            return false;
        if (other.getAlgorithmDescription() != null
                && other.getAlgorithmDescription().equals(this.getAlgorithmDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getAlgorithmStatus() == null ^ this.getAlgorithmStatus() == null)
            return false;
        if (other.getAlgorithmStatus() != null
                && other.getAlgorithmStatus().equals(this.getAlgorithmStatus()) == false)
            return false;
        return true;
    }
}
