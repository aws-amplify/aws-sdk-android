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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a test case created using a framework such as NUnit or
 * Cucumber. A test case might be a unit test or a configuration test.
 * </p>
 */
public class TestCase implements Serializable {
    /**
     * <p>
     * The ARN of the report to which the test case belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String reportArn;

    /**
     * <p>
     * The path to the raw data file that contains the test result.
     * </p>
     */
    private String testRawDataPath;

    /**
     * <p>
     * A string that is applied to a series of related test cases. CodeBuild
     * generates the prefix. The prefix depends on the framework used to
     * generate the tests.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The name of the test case.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The status returned by the test case after it was run. Valid statuses are
     * <code>SUCCEEDED</code>, <code>FAILED</code>, <code>ERROR</code>,
     * <code>SKIPPED</code>, and <code>UNKNOWN</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The number of nanoseconds it took to run this test case.
     * </p>
     */
    private Long durationInNanoSeconds;

    /**
     * <p>
     * A message associated with a test case. For example, an error message or
     * stack trace.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The date and time a test case expires. A test case expires 30 days after
     * it is created. An expired test case is not available to view in
     * CodeBuild.
     * </p>
     */
    private java.util.Date expired;

    /**
     * <p>
     * The ARN of the report to which the test case belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ARN of the report to which the test case belongs.
     *         </p>
     */
    public String getReportArn() {
        return reportArn;
    }

    /**
     * <p>
     * The ARN of the report to which the test case belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param reportArn <p>
     *            The ARN of the report to which the test case belongs.
     *            </p>
     */
    public void setReportArn(String reportArn) {
        this.reportArn = reportArn;
    }

    /**
     * <p>
     * The ARN of the report to which the test case belongs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param reportArn <p>
     *            The ARN of the report to which the test case belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestCase withReportArn(String reportArn) {
        this.reportArn = reportArn;
        return this;
    }

    /**
     * <p>
     * The path to the raw data file that contains the test result.
     * </p>
     *
     * @return <p>
     *         The path to the raw data file that contains the test result.
     *         </p>
     */
    public String getTestRawDataPath() {
        return testRawDataPath;
    }

    /**
     * <p>
     * The path to the raw data file that contains the test result.
     * </p>
     *
     * @param testRawDataPath <p>
     *            The path to the raw data file that contains the test result.
     *            </p>
     */
    public void setTestRawDataPath(String testRawDataPath) {
        this.testRawDataPath = testRawDataPath;
    }

    /**
     * <p>
     * The path to the raw data file that contains the test result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param testRawDataPath <p>
     *            The path to the raw data file that contains the test result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestCase withTestRawDataPath(String testRawDataPath) {
        this.testRawDataPath = testRawDataPath;
        return this;
    }

    /**
     * <p>
     * A string that is applied to a series of related test cases. CodeBuild
     * generates the prefix. The prefix depends on the framework used to
     * generate the tests.
     * </p>
     *
     * @return <p>
     *         A string that is applied to a series of related test cases.
     *         CodeBuild generates the prefix. The prefix depends on the
     *         framework used to generate the tests.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * A string that is applied to a series of related test cases. CodeBuild
     * generates the prefix. The prefix depends on the framework used to
     * generate the tests.
     * </p>
     *
     * @param prefix <p>
     *            A string that is applied to a series of related test cases.
     *            CodeBuild generates the prefix. The prefix depends on the
     *            framework used to generate the tests.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * A string that is applied to a series of related test cases. CodeBuild
     * generates the prefix. The prefix depends on the framework used to
     * generate the tests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            A string that is applied to a series of related test cases.
     *            CodeBuild generates the prefix. The prefix depends on the
     *            framework used to generate the tests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestCase withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * The name of the test case.
     * </p>
     *
     * @return <p>
     *         The name of the test case.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the test case.
     * </p>
     *
     * @param name <p>
     *            The name of the test case.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the test case.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the test case.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestCase withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The status returned by the test case after it was run. Valid statuses are
     * <code>SUCCEEDED</code>, <code>FAILED</code>, <code>ERROR</code>,
     * <code>SKIPPED</code>, and <code>UNKNOWN</code>.
     * </p>
     *
     * @return <p>
     *         The status returned by the test case after it was run. Valid
     *         statuses are <code>SUCCEEDED</code>, <code>FAILED</code>,
     *         <code>ERROR</code>, <code>SKIPPED</code>, and
     *         <code>UNKNOWN</code>.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status returned by the test case after it was run. Valid statuses are
     * <code>SUCCEEDED</code>, <code>FAILED</code>, <code>ERROR</code>,
     * <code>SKIPPED</code>, and <code>UNKNOWN</code>.
     * </p>
     *
     * @param status <p>
     *            The status returned by the test case after it was run. Valid
     *            statuses are <code>SUCCEEDED</code>, <code>FAILED</code>,
     *            <code>ERROR</code>, <code>SKIPPED</code>, and
     *            <code>UNKNOWN</code>.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status returned by the test case after it was run. Valid statuses are
     * <code>SUCCEEDED</code>, <code>FAILED</code>, <code>ERROR</code>,
     * <code>SKIPPED</code>, and <code>UNKNOWN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status returned by the test case after it was run. Valid
     *            statuses are <code>SUCCEEDED</code>, <code>FAILED</code>,
     *            <code>ERROR</code>, <code>SKIPPED</code>, and
     *            <code>UNKNOWN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestCase withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The number of nanoseconds it took to run this test case.
     * </p>
     *
     * @return <p>
     *         The number of nanoseconds it took to run this test case.
     *         </p>
     */
    public Long getDurationInNanoSeconds() {
        return durationInNanoSeconds;
    }

    /**
     * <p>
     * The number of nanoseconds it took to run this test case.
     * </p>
     *
     * @param durationInNanoSeconds <p>
     *            The number of nanoseconds it took to run this test case.
     *            </p>
     */
    public void setDurationInNanoSeconds(Long durationInNanoSeconds) {
        this.durationInNanoSeconds = durationInNanoSeconds;
    }

    /**
     * <p>
     * The number of nanoseconds it took to run this test case.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param durationInNanoSeconds <p>
     *            The number of nanoseconds it took to run this test case.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestCase withDurationInNanoSeconds(Long durationInNanoSeconds) {
        this.durationInNanoSeconds = durationInNanoSeconds;
        return this;
    }

    /**
     * <p>
     * A message associated with a test case. For example, an error message or
     * stack trace.
     * </p>
     *
     * @return <p>
     *         A message associated with a test case. For example, an error
     *         message or stack trace.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A message associated with a test case. For example, an error message or
     * stack trace.
     * </p>
     *
     * @param message <p>
     *            A message associated with a test case. For example, an error
     *            message or stack trace.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message associated with a test case. For example, an error message or
     * stack trace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A message associated with a test case. For example, an error
     *            message or stack trace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestCase withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The date and time a test case expires. A test case expires 30 days after
     * it is created. An expired test case is not available to view in
     * CodeBuild.
     * </p>
     *
     * @return <p>
     *         The date and time a test case expires. A test case expires 30
     *         days after it is created. An expired test case is not available
     *         to view in CodeBuild.
     *         </p>
     */
    public java.util.Date getExpired() {
        return expired;
    }

    /**
     * <p>
     * The date and time a test case expires. A test case expires 30 days after
     * it is created. An expired test case is not available to view in
     * CodeBuild.
     * </p>
     *
     * @param expired <p>
     *            The date and time a test case expires. A test case expires 30
     *            days after it is created. An expired test case is not
     *            available to view in CodeBuild.
     *            </p>
     */
    public void setExpired(java.util.Date expired) {
        this.expired = expired;
    }

    /**
     * <p>
     * The date and time a test case expires. A test case expires 30 days after
     * it is created. An expired test case is not available to view in
     * CodeBuild.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expired <p>
     *            The date and time a test case expires. A test case expires 30
     *            days after it is created. An expired test case is not
     *            available to view in CodeBuild.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestCase withExpired(java.util.Date expired) {
        this.expired = expired;
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
        if (getReportArn() != null)
            sb.append("reportArn: " + getReportArn() + ",");
        if (getTestRawDataPath() != null)
            sb.append("testRawDataPath: " + getTestRawDataPath() + ",");
        if (getPrefix() != null)
            sb.append("prefix: " + getPrefix() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getDurationInNanoSeconds() != null)
            sb.append("durationInNanoSeconds: " + getDurationInNanoSeconds() + ",");
        if (getMessage() != null)
            sb.append("message: " + getMessage() + ",");
        if (getExpired() != null)
            sb.append("expired: " + getExpired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportArn() == null) ? 0 : getReportArn().hashCode());
        hashCode = prime * hashCode
                + ((getTestRawDataPath() == null) ? 0 : getTestRawDataPath().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getDurationInNanoSeconds() == null) ? 0 : getDurationInNanoSeconds().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getExpired() == null) ? 0 : getExpired().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestCase == false)
            return false;
        TestCase other = (TestCase) obj;

        if (other.getReportArn() == null ^ this.getReportArn() == null)
            return false;
        if (other.getReportArn() != null
                && other.getReportArn().equals(this.getReportArn()) == false)
            return false;
        if (other.getTestRawDataPath() == null ^ this.getTestRawDataPath() == null)
            return false;
        if (other.getTestRawDataPath() != null
                && other.getTestRawDataPath().equals(this.getTestRawDataPath()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDurationInNanoSeconds() == null ^ this.getDurationInNanoSeconds() == null)
            return false;
        if (other.getDurationInNanoSeconds() != null
                && other.getDurationInNanoSeconds().equals(this.getDurationInNanoSeconds()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getExpired() == null ^ this.getExpired() == null)
            return false;
        if (other.getExpired() != null && other.getExpired().equals(this.getExpired()) == false)
            return false;
        return true;
    }
}
