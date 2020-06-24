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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

public class DescribeCopyJobResult implements Serializable {
    /**
     * <p>
     * Contains detailed information about a copy job.
     * </p>
     */
    private CopyJob copyJob;

    /**
     * <p>
     * Contains detailed information about a copy job.
     * </p>
     *
     * @return <p>
     *         Contains detailed information about a copy job.
     *         </p>
     */
    public CopyJob getCopyJob() {
        return copyJob;
    }

    /**
     * <p>
     * Contains detailed information about a copy job.
     * </p>
     *
     * @param copyJob <p>
     *            Contains detailed information about a copy job.
     *            </p>
     */
    public void setCopyJob(CopyJob copyJob) {
        this.copyJob = copyJob;
    }

    /**
     * <p>
     * Contains detailed information about a copy job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyJob <p>
     *            Contains detailed information about a copy job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCopyJobResult withCopyJob(CopyJob copyJob) {
        this.copyJob = copyJob;
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
        if (getCopyJob() != null)
            sb.append("CopyJob: " + getCopyJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCopyJob() == null) ? 0 : getCopyJob().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCopyJobResult == false)
            return false;
        DescribeCopyJobResult other = (DescribeCopyJobResult) obj;

        if (other.getCopyJob() == null ^ this.getCopyJob() == null)
            return false;
        if (other.getCopyJob() != null && other.getCopyJob().equals(this.getCopyJob()) == false)
            return false;
        return true;
    }
}
