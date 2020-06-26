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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a dashboard in an AWS account.
 * </p>
 */
public class UpdateDashboardRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the AWS account that contains the dashboard that you're
     * updating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     */
    private String dashboardId;

    /**
     * <p>
     * The display name of the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String name;

    /**
     * <p>
     * The entity that you are using as a source when you update the dashboard.
     * In <code>SourceEntity</code>, you specify the type of object you're using
     * as source. You can only update a dashboard from a template, so you use a
     * <code>SourceTemplate</code> entity. If you need to update a dashboard
     * from an analysis, first convert the analysis to a template by using the
     * <a>CreateTemplate</a> API operation. For <code>SourceTemplate</code>,
     * specify the Amazon Resource Name (ARN) of the source template. The
     * <code>SourceTemplate</code> ARN can contain any AWS Account and any
     * QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within
     * <code>SourceTemplate</code> to list the replacement datasets for the
     * placeholders listed in the original. The schema in each dataset must
     * match its placeholder.
     * </p>
     */
    private DashboardSourceEntity sourceEntity;

    /**
     * <p>
     * A structure that contains the parameters of the dashboard. These are
     * parameter overrides for a dashboard. A dashboard can have any type of
     * parameters, and some parameters might accept multiple values.
     * </p>
     */
    private Parameters parameters;

    /**
     * <p>
     * A description for the first version of the dashboard being created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String versionDescription;

    /**
     * <p>
     * Options for publishing the dashboard when you create it:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>AdHocFilteringOption</code> -
     * This status can be either <code>ENABLED</code> or <code>DISABLED</code>.
     * When this is set to <code>DISABLED</code>, QuickSight disables the left
     * filter pane on the published dashboard, which can be used for ad hoc
     * (one-time) filtering. This option is <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>ExportToCSVOption</code> - This
     * status can be either <code>ENABLED</code> or <code>DISABLED</code>. The
     * visual option to export data to .csv format isn't enabled when this is
     * set to <code>DISABLED</code>. This option is <code>ENABLED</code> by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityState</code> for <code>SheetControlsOption</code> - This
     * visibility state can be either <code>COLLAPSED</code> or
     * <code>EXPANDED</code>. This option is <code>COLLAPSED</code> by default.
     * </p>
     * </li>
     * </ul>
     */
    private DashboardPublishOptions dashboardPublishOptions;

    /**
     * <p>
     * The ID of the AWS account that contains the dashboard that you're
     * updating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The ID of the AWS account that contains the dashboard that you're
     *         updating.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the dashboard that you're
     * updating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account that contains the dashboard that
     *            you're updating.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the dashboard that you're
     * updating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account that contains the dashboard that
     *            you're updating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @return <p>
     *         The ID for the dashboard.
     *         </p>
     */
    public String getDashboardId() {
        return dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param dashboardId <p>
     *            The ID for the dashboard.
     *            </p>
     */
    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param dashboardId <p>
     *            The ID for the dashboard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardRequest withDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    /**
     * <p>
     * The display name of the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The display name of the dashboard.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The display name of the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param name <p>
     *            The display name of the dashboard.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name of the dashboard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param name <p>
     *            The display name of the dashboard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The entity that you are using as a source when you update the dashboard.
     * In <code>SourceEntity</code>, you specify the type of object you're using
     * as source. You can only update a dashboard from a template, so you use a
     * <code>SourceTemplate</code> entity. If you need to update a dashboard
     * from an analysis, first convert the analysis to a template by using the
     * <a>CreateTemplate</a> API operation. For <code>SourceTemplate</code>,
     * specify the Amazon Resource Name (ARN) of the source template. The
     * <code>SourceTemplate</code> ARN can contain any AWS Account and any
     * QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within
     * <code>SourceTemplate</code> to list the replacement datasets for the
     * placeholders listed in the original. The schema in each dataset must
     * match its placeholder.
     * </p>
     *
     * @return <p>
     *         The entity that you are using as a source when you update the
     *         dashboard. In <code>SourceEntity</code>, you specify the type of
     *         object you're using as source. You can only update a dashboard
     *         from a template, so you use a <code>SourceTemplate</code> entity.
     *         If you need to update a dashboard from an analysis, first convert
     *         the analysis to a template by using the <a>CreateTemplate</a> API
     *         operation. For <code>SourceTemplate</code>, specify the Amazon
     *         Resource Name (ARN) of the source template. The
     *         <code>SourceTemplate</code> ARN can contain any AWS Account and
     *         any QuickSight-supported AWS Region.
     *         </p>
     *         <p>
     *         Use the <code>DataSetReferences</code> entity within
     *         <code>SourceTemplate</code> to list the replacement datasets for
     *         the placeholders listed in the original. The schema in each
     *         dataset must match its placeholder.
     *         </p>
     */
    public DashboardSourceEntity getSourceEntity() {
        return sourceEntity;
    }

    /**
     * <p>
     * The entity that you are using as a source when you update the dashboard.
     * In <code>SourceEntity</code>, you specify the type of object you're using
     * as source. You can only update a dashboard from a template, so you use a
     * <code>SourceTemplate</code> entity. If you need to update a dashboard
     * from an analysis, first convert the analysis to a template by using the
     * <a>CreateTemplate</a> API operation. For <code>SourceTemplate</code>,
     * specify the Amazon Resource Name (ARN) of the source template. The
     * <code>SourceTemplate</code> ARN can contain any AWS Account and any
     * QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within
     * <code>SourceTemplate</code> to list the replacement datasets for the
     * placeholders listed in the original. The schema in each dataset must
     * match its placeholder.
     * </p>
     *
     * @param sourceEntity <p>
     *            The entity that you are using as a source when you update the
     *            dashboard. In <code>SourceEntity</code>, you specify the type
     *            of object you're using as source. You can only update a
     *            dashboard from a template, so you use a
     *            <code>SourceTemplate</code> entity. If you need to update a
     *            dashboard from an analysis, first convert the analysis to a
     *            template by using the <a>CreateTemplate</a> API operation. For
     *            <code>SourceTemplate</code>, specify the Amazon Resource Name
     *            (ARN) of the source template. The <code>SourceTemplate</code>
     *            ARN can contain any AWS Account and any QuickSight-supported
     *            AWS Region.
     *            </p>
     *            <p>
     *            Use the <code>DataSetReferences</code> entity within
     *            <code>SourceTemplate</code> to list the replacement datasets
     *            for the placeholders listed in the original. The schema in
     *            each dataset must match its placeholder.
     *            </p>
     */
    public void setSourceEntity(DashboardSourceEntity sourceEntity) {
        this.sourceEntity = sourceEntity;
    }

    /**
     * <p>
     * The entity that you are using as a source when you update the dashboard.
     * In <code>SourceEntity</code>, you specify the type of object you're using
     * as source. You can only update a dashboard from a template, so you use a
     * <code>SourceTemplate</code> entity. If you need to update a dashboard
     * from an analysis, first convert the analysis to a template by using the
     * <a>CreateTemplate</a> API operation. For <code>SourceTemplate</code>,
     * specify the Amazon Resource Name (ARN) of the source template. The
     * <code>SourceTemplate</code> ARN can contain any AWS Account and any
     * QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within
     * <code>SourceTemplate</code> to list the replacement datasets for the
     * placeholders listed in the original. The schema in each dataset must
     * match its placeholder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceEntity <p>
     *            The entity that you are using as a source when you update the
     *            dashboard. In <code>SourceEntity</code>, you specify the type
     *            of object you're using as source. You can only update a
     *            dashboard from a template, so you use a
     *            <code>SourceTemplate</code> entity. If you need to update a
     *            dashboard from an analysis, first convert the analysis to a
     *            template by using the <a>CreateTemplate</a> API operation. For
     *            <code>SourceTemplate</code>, specify the Amazon Resource Name
     *            (ARN) of the source template. The <code>SourceTemplate</code>
     *            ARN can contain any AWS Account and any QuickSight-supported
     *            AWS Region.
     *            </p>
     *            <p>
     *            Use the <code>DataSetReferences</code> entity within
     *            <code>SourceTemplate</code> to list the replacement datasets
     *            for the placeholders listed in the original. The schema in
     *            each dataset must match its placeholder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardRequest withSourceEntity(DashboardSourceEntity sourceEntity) {
        this.sourceEntity = sourceEntity;
        return this;
    }

    /**
     * <p>
     * A structure that contains the parameters of the dashboard. These are
     * parameter overrides for a dashboard. A dashboard can have any type of
     * parameters, and some parameters might accept multiple values.
     * </p>
     *
     * @return <p>
     *         A structure that contains the parameters of the dashboard. These
     *         are parameter overrides for a dashboard. A dashboard can have any
     *         type of parameters, and some parameters might accept multiple
     *         values.
     *         </p>
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A structure that contains the parameters of the dashboard. These are
     * parameter overrides for a dashboard. A dashboard can have any type of
     * parameters, and some parameters might accept multiple values.
     * </p>
     *
     * @param parameters <p>
     *            A structure that contains the parameters of the dashboard.
     *            These are parameter overrides for a dashboard. A dashboard can
     *            have any type of parameters, and some parameters might accept
     *            multiple values.
     *            </p>
     */
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A structure that contains the parameters of the dashboard. These are
     * parameter overrides for a dashboard. A dashboard can have any type of
     * parameters, and some parameters might accept multiple values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A structure that contains the parameters of the dashboard.
     *            These are parameter overrides for a dashboard. A dashboard can
     *            have any type of parameters, and some parameters might accept
     *            multiple values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardRequest withParameters(Parameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * A description for the first version of the dashboard being created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         A description for the first version of the dashboard being
     *         created.
     *         </p>
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /**
     * <p>
     * A description for the first version of the dashboard being created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param versionDescription <p>
     *            A description for the first version of the dashboard being
     *            created.
     *            </p>
     */
    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * A description for the first version of the dashboard being created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param versionDescription <p>
     *            A description for the first version of the dashboard being
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardRequest withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * <p>
     * Options for publishing the dashboard when you create it:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>AdHocFilteringOption</code> -
     * This status can be either <code>ENABLED</code> or <code>DISABLED</code>.
     * When this is set to <code>DISABLED</code>, QuickSight disables the left
     * filter pane on the published dashboard, which can be used for ad hoc
     * (one-time) filtering. This option is <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>ExportToCSVOption</code> - This
     * status can be either <code>ENABLED</code> or <code>DISABLED</code>. The
     * visual option to export data to .csv format isn't enabled when this is
     * set to <code>DISABLED</code>. This option is <code>ENABLED</code> by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityState</code> for <code>SheetControlsOption</code> - This
     * visibility state can be either <code>COLLAPSED</code> or
     * <code>EXPANDED</code>. This option is <code>COLLAPSED</code> by default.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Options for publishing the dashboard when you create it:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AvailabilityStatus</code> for
     *         <code>AdHocFilteringOption</code> - This status can be either
     *         <code>ENABLED</code> or <code>DISABLED</code>. When this is set
     *         to <code>DISABLED</code>, QuickSight disables the left filter
     *         pane on the published dashboard, which can be used for ad hoc
     *         (one-time) filtering. This option is <code>ENABLED</code> by
     *         default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AvailabilityStatus</code> for
     *         <code>ExportToCSVOption</code> - This status can be either
     *         <code>ENABLED</code> or <code>DISABLED</code>. The visual option
     *         to export data to .csv format isn't enabled when this is set to
     *         <code>DISABLED</code>. This option is <code>ENABLED</code> by
     *         default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VisibilityState</code> for <code>SheetControlsOption</code>
     *         - This visibility state can be either <code>COLLAPSED</code> or
     *         <code>EXPANDED</code>. This option is <code>COLLAPSED</code> by
     *         default.
     *         </p>
     *         </li>
     *         </ul>
     */
    public DashboardPublishOptions getDashboardPublishOptions() {
        return dashboardPublishOptions;
    }

    /**
     * <p>
     * Options for publishing the dashboard when you create it:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>AdHocFilteringOption</code> -
     * This status can be either <code>ENABLED</code> or <code>DISABLED</code>.
     * When this is set to <code>DISABLED</code>, QuickSight disables the left
     * filter pane on the published dashboard, which can be used for ad hoc
     * (one-time) filtering. This option is <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>ExportToCSVOption</code> - This
     * status can be either <code>ENABLED</code> or <code>DISABLED</code>. The
     * visual option to export data to .csv format isn't enabled when this is
     * set to <code>DISABLED</code>. This option is <code>ENABLED</code> by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityState</code> for <code>SheetControlsOption</code> - This
     * visibility state can be either <code>COLLAPSED</code> or
     * <code>EXPANDED</code>. This option is <code>COLLAPSED</code> by default.
     * </p>
     * </li>
     * </ul>
     *
     * @param dashboardPublishOptions <p>
     *            Options for publishing the dashboard when you create it:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AvailabilityStatus</code> for
     *            <code>AdHocFilteringOption</code> - This status can be either
     *            <code>ENABLED</code> or <code>DISABLED</code>. When this is
     *            set to <code>DISABLED</code>, QuickSight disables the left
     *            filter pane on the published dashboard, which can be used for
     *            ad hoc (one-time) filtering. This option is
     *            <code>ENABLED</code> by default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AvailabilityStatus</code> for
     *            <code>ExportToCSVOption</code> - This status can be either
     *            <code>ENABLED</code> or <code>DISABLED</code>. The visual
     *            option to export data to .csv format isn't enabled when this
     *            is set to <code>DISABLED</code>. This option is
     *            <code>ENABLED</code> by default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VisibilityState</code> for
     *            <code>SheetControlsOption</code> - This visibility state can
     *            be either <code>COLLAPSED</code> or <code>EXPANDED</code>.
     *            This option is <code>COLLAPSED</code> by default.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDashboardPublishOptions(DashboardPublishOptions dashboardPublishOptions) {
        this.dashboardPublishOptions = dashboardPublishOptions;
    }

    /**
     * <p>
     * Options for publishing the dashboard when you create it:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>AdHocFilteringOption</code> -
     * This status can be either <code>ENABLED</code> or <code>DISABLED</code>.
     * When this is set to <code>DISABLED</code>, QuickSight disables the left
     * filter pane on the published dashboard, which can be used for ad hoc
     * (one-time) filtering. This option is <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>ExportToCSVOption</code> - This
     * status can be either <code>ENABLED</code> or <code>DISABLED</code>. The
     * visual option to export data to .csv format isn't enabled when this is
     * set to <code>DISABLED</code>. This option is <code>ENABLED</code> by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityState</code> for <code>SheetControlsOption</code> - This
     * visibility state can be either <code>COLLAPSED</code> or
     * <code>EXPANDED</code>. This option is <code>COLLAPSED</code> by default.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dashboardPublishOptions <p>
     *            Options for publishing the dashboard when you create it:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AvailabilityStatus</code> for
     *            <code>AdHocFilteringOption</code> - This status can be either
     *            <code>ENABLED</code> or <code>DISABLED</code>. When this is
     *            set to <code>DISABLED</code>, QuickSight disables the left
     *            filter pane on the published dashboard, which can be used for
     *            ad hoc (one-time) filtering. This option is
     *            <code>ENABLED</code> by default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AvailabilityStatus</code> for
     *            <code>ExportToCSVOption</code> - This status can be either
     *            <code>ENABLED</code> or <code>DISABLED</code>. The visual
     *            option to export data to .csv format isn't enabled when this
     *            is set to <code>DISABLED</code>. This option is
     *            <code>ENABLED</code> by default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VisibilityState</code> for
     *            <code>SheetControlsOption</code> - This visibility state can
     *            be either <code>COLLAPSED</code> or <code>EXPANDED</code>.
     *            This option is <code>COLLAPSED</code> by default.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardRequest withDashboardPublishOptions(
            DashboardPublishOptions dashboardPublishOptions) {
        this.dashboardPublishOptions = dashboardPublishOptions;
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getDashboardId() != null)
            sb.append("DashboardId: " + getDashboardId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getSourceEntity() != null)
            sb.append("SourceEntity: " + getSourceEntity() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: " + getVersionDescription() + ",");
        if (getDashboardPublishOptions() != null)
            sb.append("DashboardPublishOptions: " + getDashboardPublishOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceEntity() == null) ? 0 : getSourceEntity().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getDashboardPublishOptions() == null) ? 0 : getDashboardPublishOptions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDashboardRequest == false)
            return false;
        UpdateDashboardRequest other = (UpdateDashboardRequest) obj;

        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null
                && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSourceEntity() == null ^ this.getSourceEntity() == null)
            return false;
        if (other.getSourceEntity() != null
                && other.getSourceEntity().equals(this.getSourceEntity()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null
                && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getDashboardPublishOptions() == null ^ this.getDashboardPublishOptions() == null)
            return false;
        if (other.getDashboardPublishOptions() != null
                && other.getDashboardPublishOptions().equals(this.getDashboardPublishOptions()) == false)
            return false;
        return true;
    }
}
