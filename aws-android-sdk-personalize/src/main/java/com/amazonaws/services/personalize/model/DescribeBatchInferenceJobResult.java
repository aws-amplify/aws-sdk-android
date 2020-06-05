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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

public class DescribeBatchInferenceJobResult implements Serializable {
    /**
     * <p>
     * Information on the specified batch inference job.
     * </p>
     */
    private BatchInferenceJob batchInferenceJob;

    /**
     * <p>
     * Information on the specified batch inference job.
     * </p>
     *
     * @return <p>
     *         Information on the specified batch inference job.
     *         </p>
     */
    public BatchInferenceJob getBatchInferenceJob() {
        return batchInferenceJob;
    }

    /**
     * <p>
     * Information on the specified batch inference job.
     * </p>
     *
     * @param batchInferenceJob <p>
     *            Information on the specified batch inference job.
     *            </p>
     */
    public void setBatchInferenceJob(BatchInferenceJob batchInferenceJob) {
        this.batchInferenceJob = batchInferenceJob;
    }

    /**
     * <p>
     * Information on the specified batch inference job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param batchInferenceJob <p>
     *            Information on the specified batch inference job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBatchInferenceJobResult withBatchInferenceJob(BatchInferenceJob batchInferenceJob) {
        this.batchInferenceJob = batchInferenceJob;
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
        if (getBatchInferenceJob() != null)
            sb.append("batchInferenceJob: " + getBatchInferenceJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBatchInferenceJob() == null) ? 0 : getBatchInferenceJob().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBatchInferenceJobResult == false)
            return false;
        DescribeBatchInferenceJobResult other = (DescribeBatchInferenceJobResult) obj;

        if (other.getBatchInferenceJob() == null ^ this.getBatchInferenceJob() == null)
            return false;
        if (other.getBatchInferenceJob() != null
                && other.getBatchInferenceJob().equals(this.getBatchInferenceJob()) == false)
            return false;
        return true;
    }
}
