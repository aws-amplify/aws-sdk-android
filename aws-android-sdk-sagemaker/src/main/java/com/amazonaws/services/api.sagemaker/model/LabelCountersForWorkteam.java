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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Provides counts for human-labeled tasks in the labeling job.
 * </p>
 */
public class LabelCountersForWorkteam implements Serializable {
    /**
     * <p>
     * The total number of data objects labeled by a human worker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer humanLabeled;

    /**
     * <p>
     * The total number of data objects that need to be labeled by a human
     * worker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer pendingHuman;

    /**
     * <p>
     * The total number of tasks in the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer total;

    /**
     * <p>
     * The total number of data objects labeled by a human worker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of data objects labeled by a human worker.
     *         </p>
     */
    public Integer getHumanLabeled() {
        return humanLabeled;
    }

    /**
     * <p>
     * The total number of data objects labeled by a human worker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param humanLabeled <p>
     *            The total number of data objects labeled by a human worker.
     *            </p>
     */
    public void setHumanLabeled(Integer humanLabeled) {
        this.humanLabeled = humanLabeled;
    }

    /**
     * <p>
     * The total number of data objects labeled by a human worker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param humanLabeled <p>
     *            The total number of data objects labeled by a human worker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelCountersForWorkteam withHumanLabeled(Integer humanLabeled) {
        this.humanLabeled = humanLabeled;
        return this;
    }

    /**
     * <p>
     * The total number of data objects that need to be labeled by a human
     * worker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of data objects that need to be labeled by a
     *         human worker.
     *         </p>
     */
    public Integer getPendingHuman() {
        return pendingHuman;
    }

    /**
     * <p>
     * The total number of data objects that need to be labeled by a human
     * worker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param pendingHuman <p>
     *            The total number of data objects that need to be labeled by a
     *            human worker.
     *            </p>
     */
    public void setPendingHuman(Integer pendingHuman) {
        this.pendingHuman = pendingHuman;
    }

    /**
     * <p>
     * The total number of data objects that need to be labeled by a human
     * worker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param pendingHuman <p>
     *            The total number of data objects that need to be labeled by a
     *            human worker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelCountersForWorkteam withPendingHuman(Integer pendingHuman) {
        this.pendingHuman = pendingHuman;
        return this;
    }

    /**
     * <p>
     * The total number of tasks in the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of tasks in the labeling job.
     *         </p>
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * <p>
     * The total number of tasks in the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param total <p>
     *            The total number of tasks in the labeling job.
     *            </p>
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * <p>
     * The total number of tasks in the labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param total <p>
     *            The total number of tasks in the labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelCountersForWorkteam withTotal(Integer total) {
        this.total = total;
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
        if (getHumanLabeled() != null)
            sb.append("HumanLabeled: " + getHumanLabeled() + ",");
        if (getPendingHuman() != null)
            sb.append("PendingHuman: " + getPendingHuman() + ",");
        if (getTotal() != null)
            sb.append("Total: " + getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHumanLabeled() == null) ? 0 : getHumanLabeled().hashCode());
        hashCode = prime * hashCode
                + ((getPendingHuman() == null) ? 0 : getPendingHuman().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelCountersForWorkteam == false)
            return false;
        LabelCountersForWorkteam other = (LabelCountersForWorkteam) obj;

        if (other.getHumanLabeled() == null ^ this.getHumanLabeled() == null)
            return false;
        if (other.getHumanLabeled() != null
                && other.getHumanLabeled().equals(this.getHumanLabeled()) == false)
            return false;
        if (other.getPendingHuman() == null ^ this.getPendingHuman() == null)
            return false;
        if (other.getPendingHuman() != null
                && other.getPendingHuman().equals(this.getPendingHuman()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }
}
