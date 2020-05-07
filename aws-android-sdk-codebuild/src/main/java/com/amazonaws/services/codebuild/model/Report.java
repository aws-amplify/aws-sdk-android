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
 * Information about the results from running a series of test cases during the
 * run of a build project. The test cases are specified in the buildspec for the
 * build project using one or more paths to the test case files. You can specify
 * any type of tests you want, such as unit tests, integration tests, and
 * functional tests.
 * </p>
 */
public class Report implements Serializable {
    /**
     * <p>
     * The ARN of the report run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String arn;

    /**
     * <p>
     * The type of the report that was run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     */
    private String type;

    /**
     * <p>
     * The name of the report that was run.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ARN of the report group associated with this report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String reportGroupArn;

    /**
     * <p>
     * The ARN of the build run that generated this report.
     * </p>
     */
    private String executionId;

    /**
     * <p>
     * The status of this report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GENERATING, SUCCEEDED, FAILED, INCOMPLETE,
     * DELETING
     */
    private String status;

    /**
     * <p>
     * The date and time this report run occurred.
     * </p>
     */
    private java.util.Date created;

    /**
     * <p>
     * The date and time a report expires. A report expires 30 days after it is
     * created. An expired report is not available to view in CodeBuild.
     * </p>
     */
    private java.util.Date expired;

    /**
     * <p>
     * Information about where the raw data used to generate this report was
     * exported.
     * </p>
     */
    private ReportExportConfig exportConfig;

    /**
     * <p>
     * A boolean that specifies if this report run is truncated. The list of
     * test cases is truncated after the maximum number of test cases is
     * reached.
     * </p>
     */
    private Boolean truncated;

    /**
     * <p>
     * A <code>TestReportSummary</code> object that contains information about
     * this test report.
     * </p>
     */
    private TestReportSummary testSummary;

    /**
     * <p>
     * The ARN of the report run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ARN of the report run.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN of the report run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param arn <p>
     *            The ARN of the report run.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the report run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param arn <p>
     *            The ARN of the report run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Report withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The type of the report that was run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @return <p>
     *         The type of the report that was run.
     *         </p>
     * @see ReportType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the report that was run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @param type <p>
     *            The type of the report that was run.
     *            </p>
     * @see ReportType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the report that was run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @param type <p>
     *            The type of the report that was run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportType
     */
    public Report withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the report that was run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @param type <p>
     *            The type of the report that was run.
     *            </p>
     * @see ReportType
     */
    public void setType(ReportType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the report that was run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @param type <p>
     *            The type of the report that was run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportType
     */
    public Report withType(ReportType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the report that was run.
     * </p>
     *
     * @return <p>
     *         The name of the report that was run.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the report that was run.
     * </p>
     *
     * @param name <p>
     *            The name of the report that was run.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the report that was run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the report that was run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Report withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ARN of the report group associated with this report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ARN of the report group associated with this report.
     *         </p>
     */
    public String getReportGroupArn() {
        return reportGroupArn;
    }

    /**
     * <p>
     * The ARN of the report group associated with this report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param reportGroupArn <p>
     *            The ARN of the report group associated with this report.
     *            </p>
     */
    public void setReportGroupArn(String reportGroupArn) {
        this.reportGroupArn = reportGroupArn;
    }

    /**
     * <p>
     * The ARN of the report group associated with this report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param reportGroupArn <p>
     *            The ARN of the report group associated with this report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Report withReportGroupArn(String reportGroupArn) {
        this.reportGroupArn = reportGroupArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the build run that generated this report.
     * </p>
     *
     * @return <p>
     *         The ARN of the build run that generated this report.
     *         </p>
     */
    public String getExecutionId() {
        return executionId;
    }

    /**
     * <p>
     * The ARN of the build run that generated this report.
     * </p>
     *
     * @param executionId <p>
     *            The ARN of the build run that generated this report.
     *            </p>
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * The ARN of the build run that generated this report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionId <p>
     *            The ARN of the build run that generated this report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Report withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * <p>
     * The status of this report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GENERATING, SUCCEEDED, FAILED, INCOMPLETE,
     * DELETING
     *
     * @return <p>
     *         The status of this report.
     *         </p>
     * @see ReportStatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of this report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GENERATING, SUCCEEDED, FAILED, INCOMPLETE,
     * DELETING
     *
     * @param status <p>
     *            The status of this report.
     *            </p>
     * @see ReportStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GENERATING, SUCCEEDED, FAILED, INCOMPLETE,
     * DELETING
     *
     * @param status <p>
     *            The status of this report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportStatusType
     */
    public Report withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of this report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GENERATING, SUCCEEDED, FAILED, INCOMPLETE,
     * DELETING
     *
     * @param status <p>
     *            The status of this report.
     *            </p>
     * @see ReportStatusType
     */
    public void setStatus(ReportStatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of this report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GENERATING, SUCCEEDED, FAILED, INCOMPLETE,
     * DELETING
     *
     * @param status <p>
     *            The status of this report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportStatusType
     */
    public Report withStatus(ReportStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time this report run occurred.
     * </p>
     *
     * @return <p>
     *         The date and time this report run occurred.
     *         </p>
     */
    public java.util.Date getCreated() {
        return created;
    }

    /**
     * <p>
     * The date and time this report run occurred.
     * </p>
     *
     * @param created <p>
     *            The date and time this report run occurred.
     *            </p>
     */
    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time this report run occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param created <p>
     *            The date and time this report run occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Report withCreated(java.util.Date created) {
        this.created = created;
        return this;
    }

    /**
     * <p>
     * The date and time a report expires. A report expires 30 days after it is
     * created. An expired report is not available to view in CodeBuild.
     * </p>
     *
     * @return <p>
     *         The date and time a report expires. A report expires 30 days
     *         after it is created. An expired report is not available to view
     *         in CodeBuild.
     *         </p>
     */
    public java.util.Date getExpired() {
        return expired;
    }

    /**
     * <p>
     * The date and time a report expires. A report expires 30 days after it is
     * created. An expired report is not available to view in CodeBuild.
     * </p>
     *
     * @param expired <p>
     *            The date and time a report expires. A report expires 30 days
     *            after it is created. An expired report is not available to
     *            view in CodeBuild.
     *            </p>
     */
    public void setExpired(java.util.Date expired) {
        this.expired = expired;
    }

    /**
     * <p>
     * The date and time a report expires. A report expires 30 days after it is
     * created. An expired report is not available to view in CodeBuild.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expired <p>
     *            The date and time a report expires. A report expires 30 days
     *            after it is created. An expired report is not available to
     *            view in CodeBuild.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Report withExpired(java.util.Date expired) {
        this.expired = expired;
        return this;
    }

    /**
     * <p>
     * Information about where the raw data used to generate this report was
     * exported.
     * </p>
     *
     * @return <p>
     *         Information about where the raw data used to generate this report
     *         was exported.
     *         </p>
     */
    public ReportExportConfig getExportConfig() {
        return exportConfig;
    }

    /**
     * <p>
     * Information about where the raw data used to generate this report was
     * exported.
     * </p>
     *
     * @param exportConfig <p>
     *            Information about where the raw data used to generate this
     *            report was exported.
     *            </p>
     */
    public void setExportConfig(ReportExportConfig exportConfig) {
        this.exportConfig = exportConfig;
    }

    /**
     * <p>
     * Information about where the raw data used to generate this report was
     * exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportConfig <p>
     *            Information about where the raw data used to generate this
     *            report was exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Report withExportConfig(ReportExportConfig exportConfig) {
        this.exportConfig = exportConfig;
        return this;
    }

    /**
     * <p>
     * A boolean that specifies if this report run is truncated. The list of
     * test cases is truncated after the maximum number of test cases is
     * reached.
     * </p>
     *
     * @return <p>
     *         A boolean that specifies if this report run is truncated. The
     *         list of test cases is truncated after the maximum number of test
     *         cases is reached.
     *         </p>
     */
    public Boolean isTruncated() {
        return truncated;
    }

    /**
     * <p>
     * A boolean that specifies if this report run is truncated. The list of
     * test cases is truncated after the maximum number of test cases is
     * reached.
     * </p>
     *
     * @return <p>
     *         A boolean that specifies if this report run is truncated. The
     *         list of test cases is truncated after the maximum number of test
     *         cases is reached.
     *         </p>
     */
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * <p>
     * A boolean that specifies if this report run is truncated. The list of
     * test cases is truncated after the maximum number of test cases is
     * reached.
     * </p>
     *
     * @param truncated <p>
     *            A boolean that specifies if this report run is truncated. The
     *            list of test cases is truncated after the maximum number of
     *            test cases is reached.
     *            </p>
     */
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * <p>
     * A boolean that specifies if this report run is truncated. The list of
     * test cases is truncated after the maximum number of test cases is
     * reached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param truncated <p>
     *            A boolean that specifies if this report run is truncated. The
     *            list of test cases is truncated after the maximum number of
     *            test cases is reached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Report withTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    /**
     * <p>
     * A <code>TestReportSummary</code> object that contains information about
     * this test report.
     * </p>
     *
     * @return <p>
     *         A <code>TestReportSummary</code> object that contains information
     *         about this test report.
     *         </p>
     */
    public TestReportSummary getTestSummary() {
        return testSummary;
    }

    /**
     * <p>
     * A <code>TestReportSummary</code> object that contains information about
     * this test report.
     * </p>
     *
     * @param testSummary <p>
     *            A <code>TestReportSummary</code> object that contains
     *            information about this test report.
     *            </p>
     */
    public void setTestSummary(TestReportSummary testSummary) {
        this.testSummary = testSummary;
    }

    /**
     * <p>
     * A <code>TestReportSummary</code> object that contains information about
     * this test report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param testSummary <p>
     *            A <code>TestReportSummary</code> object that contains
     *            information about this test report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Report withTestSummary(TestReportSummary testSummary) {
        this.testSummary = testSummary;
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getReportGroupArn() != null)
            sb.append("reportGroupArn: " + getReportGroupArn() + ",");
        if (getExecutionId() != null)
            sb.append("executionId: " + getExecutionId() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getCreated() != null)
            sb.append("created: " + getCreated() + ",");
        if (getExpired() != null)
            sb.append("expired: " + getExpired() + ",");
        if (getExportConfig() != null)
            sb.append("exportConfig: " + getExportConfig() + ",");
        if (getTruncated() != null)
            sb.append("truncated: " + getTruncated() + ",");
        if (getTestSummary() != null)
            sb.append("testSummary: " + getTestSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getReportGroupArn() == null) ? 0 : getReportGroupArn().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getExpired() == null) ? 0 : getExpired().hashCode());
        hashCode = prime * hashCode
                + ((getExportConfig() == null) ? 0 : getExportConfig().hashCode());
        hashCode = prime * hashCode + ((getTruncated() == null) ? 0 : getTruncated().hashCode());
        hashCode = prime * hashCode
                + ((getTestSummary() == null) ? 0 : getTestSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Report == false)
            return false;
        Report other = (Report) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReportGroupArn() == null ^ this.getReportGroupArn() == null)
            return false;
        if (other.getReportGroupArn() != null
                && other.getReportGroupArn().equals(this.getReportGroupArn()) == false)
            return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null
                && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getExpired() == null ^ this.getExpired() == null)
            return false;
        if (other.getExpired() != null && other.getExpired().equals(this.getExpired()) == false)
            return false;
        if (other.getExportConfig() == null ^ this.getExportConfig() == null)
            return false;
        if (other.getExportConfig() != null
                && other.getExportConfig().equals(this.getExportConfig()) == false)
            return false;
        if (other.getTruncated() == null ^ this.getTruncated() == null)
            return false;
        if (other.getTruncated() != null
                && other.getTruncated().equals(this.getTruncated()) == false)
            return false;
        if (other.getTestSummary() == null ^ this.getTestSummary() == null)
            return false;
        if (other.getTestSummary() != null
                && other.getTestSummary().equals(this.getTestSummary()) == false)
            return false;
        return true;
    }
}
