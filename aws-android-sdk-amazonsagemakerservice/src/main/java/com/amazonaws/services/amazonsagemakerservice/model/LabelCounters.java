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
 * Provides a breakdown of the number of objects labeled.
 * </p>
 */
public class LabelCounters implements Serializable {
    /**
     * <p>
     * The total number of objects labeled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer totalLabeled;

    /**
     * <p>
     * The total number of objects labeled by a human worker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer humanLabeled;

    /**
     * <p>
     * The total number of objects labeled by automated data labeling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer machineLabeled;

    /**
     * <p>
     * The total number of objects that could not be labeled due to an error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer failedNonRetryableError;

    /**
     * <p>
     * The total number of objects not yet labeled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer unlabeled;

    /**
     * <p>
     * The total number of objects labeled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of objects labeled.
     *         </p>
     */
    public Integer getTotalLabeled() {
        return totalLabeled;
    }

    /**
     * <p>
     * The total number of objects labeled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param totalLabeled <p>
     *            The total number of objects labeled.
     *            </p>
     */
    public void setTotalLabeled(Integer totalLabeled) {
        this.totalLabeled = totalLabeled;
    }

    /**
     * <p>
     * The total number of objects labeled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param totalLabeled <p>
     *            The total number of objects labeled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelCounters withTotalLabeled(Integer totalLabeled) {
        this.totalLabeled = totalLabeled;
        return this;
    }

    /**
     * <p>
     * The total number of objects labeled by a human worker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of objects labeled by a human worker.
     *         </p>
     */
    public Integer getHumanLabeled() {
        return humanLabeled;
    }

    /**
     * <p>
     * The total number of objects labeled by a human worker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param humanLabeled <p>
     *            The total number of objects labeled by a human worker.
     *            </p>
     */
    public void setHumanLabeled(Integer humanLabeled) {
        this.humanLabeled = humanLabeled;
    }

    /**
     * <p>
     * The total number of objects labeled by a human worker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param humanLabeled <p>
     *            The total number of objects labeled by a human worker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelCounters withHumanLabeled(Integer humanLabeled) {
        this.humanLabeled = humanLabeled;
        return this;
    }

    /**
     * <p>
     * The total number of objects labeled by automated data labeling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of objects labeled by automated data labeling.
     *         </p>
     */
    public Integer getMachineLabeled() {
        return machineLabeled;
    }

    /**
     * <p>
     * The total number of objects labeled by automated data labeling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param machineLabeled <p>
     *            The total number of objects labeled by automated data
     *            labeling.
     *            </p>
     */
    public void setMachineLabeled(Integer machineLabeled) {
        this.machineLabeled = machineLabeled;
    }

    /**
     * <p>
     * The total number of objects labeled by automated data labeling.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param machineLabeled <p>
     *            The total number of objects labeled by automated data
     *            labeling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelCounters withMachineLabeled(Integer machineLabeled) {
        this.machineLabeled = machineLabeled;
        return this;
    }

    /**
     * <p>
     * The total number of objects that could not be labeled due to an error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of objects that could not be labeled due to an
     *         error.
     *         </p>
     */
    public Integer getFailedNonRetryableError() {
        return failedNonRetryableError;
    }

    /**
     * <p>
     * The total number of objects that could not be labeled due to an error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param failedNonRetryableError <p>
     *            The total number of objects that could not be labeled due to
     *            an error.
     *            </p>
     */
    public void setFailedNonRetryableError(Integer failedNonRetryableError) {
        this.failedNonRetryableError = failedNonRetryableError;
    }

    /**
     * <p>
     * The total number of objects that could not be labeled due to an error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param failedNonRetryableError <p>
     *            The total number of objects that could not be labeled due to
     *            an error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelCounters withFailedNonRetryableError(Integer failedNonRetryableError) {
        this.failedNonRetryableError = failedNonRetryableError;
        return this;
    }

    /**
     * <p>
     * The total number of objects not yet labeled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of objects not yet labeled.
     *         </p>
     */
    public Integer getUnlabeled() {
        return unlabeled;
    }

    /**
     * <p>
     * The total number of objects not yet labeled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param unlabeled <p>
     *            The total number of objects not yet labeled.
     *            </p>
     */
    public void setUnlabeled(Integer unlabeled) {
        this.unlabeled = unlabeled;
    }

    /**
     * <p>
     * The total number of objects not yet labeled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param unlabeled <p>
     *            The total number of objects not yet labeled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelCounters withUnlabeled(Integer unlabeled) {
        this.unlabeled = unlabeled;
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
        if (getTotalLabeled() != null)
            sb.append("TotalLabeled: " + getTotalLabeled() + ",");
        if (getHumanLabeled() != null)
            sb.append("HumanLabeled: " + getHumanLabeled() + ",");
        if (getMachineLabeled() != null)
            sb.append("MachineLabeled: " + getMachineLabeled() + ",");
        if (getFailedNonRetryableError() != null)
            sb.append("FailedNonRetryableError: " + getFailedNonRetryableError() + ",");
        if (getUnlabeled() != null)
            sb.append("Unlabeled: " + getUnlabeled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTotalLabeled() == null) ? 0 : getTotalLabeled().hashCode());
        hashCode = prime * hashCode
                + ((getHumanLabeled() == null) ? 0 : getHumanLabeled().hashCode());
        hashCode = prime * hashCode
                + ((getMachineLabeled() == null) ? 0 : getMachineLabeled().hashCode());
        hashCode = prime
                * hashCode
                + ((getFailedNonRetryableError() == null) ? 0 : getFailedNonRetryableError()
                        .hashCode());
        hashCode = prime * hashCode + ((getUnlabeled() == null) ? 0 : getUnlabeled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelCounters == false)
            return false;
        LabelCounters other = (LabelCounters) obj;

        if (other.getTotalLabeled() == null ^ this.getTotalLabeled() == null)
            return false;
        if (other.getTotalLabeled() != null
                && other.getTotalLabeled().equals(this.getTotalLabeled()) == false)
            return false;
        if (other.getHumanLabeled() == null ^ this.getHumanLabeled() == null)
            return false;
        if (other.getHumanLabeled() != null
                && other.getHumanLabeled().equals(this.getHumanLabeled()) == false)
            return false;
        if (other.getMachineLabeled() == null ^ this.getMachineLabeled() == null)
            return false;
        if (other.getMachineLabeled() != null
                && other.getMachineLabeled().equals(this.getMachineLabeled()) == false)
            return false;
        if (other.getFailedNonRetryableError() == null ^ this.getFailedNonRetryableError() == null)
            return false;
        if (other.getFailedNonRetryableError() != null
                && other.getFailedNonRetryableError().equals(this.getFailedNonRetryableError()) == false)
            return false;
        if (other.getUnlabeled() == null ^ this.getUnlabeled() == null)
            return false;
        if (other.getUnlabeled() != null
                && other.getUnlabeled().equals(this.getUnlabeled()) == false)
            return false;
        return true;
    }
}
