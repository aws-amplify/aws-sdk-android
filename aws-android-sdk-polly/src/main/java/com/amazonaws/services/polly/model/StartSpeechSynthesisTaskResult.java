/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.polly.model;

import java.io.Serializable;

public class StartSpeechSynthesisTaskResult implements Serializable {
    /**
     * <p>
     * SynthesisTask object that provides information and attributes about a
     * newly submitted speech synthesis task.
     * </p>
     */
    private SynthesisTask synthesisTask;

    /**
     * <p>
     * SynthesisTask object that provides information and attributes about a
     * newly submitted speech synthesis task.
     * </p>
     *
     * @return <p>
     *         SynthesisTask object that provides information and attributes
     *         about a newly submitted speech synthesis task.
     *         </p>
     */
    public SynthesisTask getSynthesisTask() {
        return synthesisTask;
    }

    /**
     * <p>
     * SynthesisTask object that provides information and attributes about a
     * newly submitted speech synthesis task.
     * </p>
     *
     * @param synthesisTask <p>
     *            SynthesisTask object that provides information and attributes
     *            about a newly submitted speech synthesis task.
     *            </p>
     */
    public void setSynthesisTask(SynthesisTask synthesisTask) {
        this.synthesisTask = synthesisTask;
    }

    /**
     * <p>
     * SynthesisTask object that provides information and attributes about a
     * newly submitted speech synthesis task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param synthesisTask <p>
     *            SynthesisTask object that provides information and attributes
     *            about a newly submitted speech synthesis task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSpeechSynthesisTaskResult withSynthesisTask(SynthesisTask synthesisTask) {
        this.synthesisTask = synthesisTask;
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
        if (getSynthesisTask() != null)
            sb.append("SynthesisTask: " + getSynthesisTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSynthesisTask() == null) ? 0 : getSynthesisTask().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSpeechSynthesisTaskResult == false)
            return false;
        StartSpeechSynthesisTaskResult other = (StartSpeechSynthesisTaskResult) obj;

        if (other.getSynthesisTask() == null ^ this.getSynthesisTask() == null)
            return false;
        if (other.getSynthesisTask() != null
                && other.getSynthesisTask().equals(this.getSynthesisTask()) == false)
            return false;
        return true;
    }
}
