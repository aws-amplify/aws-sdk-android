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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * A Sagemaker Groundtruth format manifest file representing the dataset used
 * for testing.
 * </p>
 */
public class TestingDataResult implements Serializable {
    /**
     * <p>
     * The testing dataset that was supplied for training.
     * </p>
     */
    private TestingData input;

    /**
     * <p>
     * The subset of the dataset that was actually tested. Some images (assets)
     * might not be tested due to file formatting and other issues.
     * </p>
     */
    private TestingData output;

    /**
     * <p>
     * The testing dataset that was supplied for training.
     * </p>
     *
     * @return <p>
     *         The testing dataset that was supplied for training.
     *         </p>
     */
    public TestingData getInput() {
        return input;
    }

    /**
     * <p>
     * The testing dataset that was supplied for training.
     * </p>
     *
     * @param input <p>
     *            The testing dataset that was supplied for training.
     *            </p>
     */
    public void setInput(TestingData input) {
        this.input = input;
    }

    /**
     * <p>
     * The testing dataset that was supplied for training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param input <p>
     *            The testing dataset that was supplied for training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestingDataResult withInput(TestingData input) {
        this.input = input;
        return this;
    }

    /**
     * <p>
     * The subset of the dataset that was actually tested. Some images (assets)
     * might not be tested due to file formatting and other issues.
     * </p>
     *
     * @return <p>
     *         The subset of the dataset that was actually tested. Some images
     *         (assets) might not be tested due to file formatting and other
     *         issues.
     *         </p>
     */
    public TestingData getOutput() {
        return output;
    }

    /**
     * <p>
     * The subset of the dataset that was actually tested. Some images (assets)
     * might not be tested due to file formatting and other issues.
     * </p>
     *
     * @param output <p>
     *            The subset of the dataset that was actually tested. Some
     *            images (assets) might not be tested due to file formatting and
     *            other issues.
     *            </p>
     */
    public void setOutput(TestingData output) {
        this.output = output;
    }

    /**
     * <p>
     * The subset of the dataset that was actually tested. Some images (assets)
     * might not be tested due to file formatting and other issues.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param output <p>
     *            The subset of the dataset that was actually tested. Some
     *            images (assets) might not be tested due to file formatting and
     *            other issues.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestingDataResult withOutput(TestingData output) {
        this.output = output;
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
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getOutput() != null)
            sb.append("Output: " + getOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestingDataResult == false)
            return false;
        TestingDataResult other = (TestingDataResult) obj;

        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        return true;
    }
}
