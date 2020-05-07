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

package com.amazonaws.services.codebuild;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.codebuild.model.*;

/**
 * Interface for accessing AWS CodeBuild <fullname>AWS CodeBuild</fullname>
 * <p>
 * AWS CodeBuild is a fully managed build service in the cloud. AWS CodeBuild
 * compiles your source code, runs unit tests, and produces artifacts that are
 * ready to deploy. AWS CodeBuild eliminates the need to provision, manage, and
 * scale your own build servers. It provides prepackaged build environments for
 * the most popular programming languages and build tools, such as Apache Maven,
 * Gradle, and more. You can also fully customize build environments in AWS
 * CodeBuild to use your own build tools. AWS CodeBuild scales automatically to
 * meet peak build requests. You pay only for the build time you consume. For
 * more information about AWS CodeBuild, see the <i> <a
 * href="https://docs.aws.amazon.com/codebuild/latest/userguide/welcome.html"
 * >AWS CodeBuild User Guide</a>.</i>
 * </p>
 * <p>
 * AWS CodeBuild supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>BatchDeleteBuilds</code>: Deletes one or more builds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetBuilds</code>: Gets information about one or more builds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetProjects</code>: Gets information about one or more build
 * projects. A <i>build project</i> defines how AWS CodeBuild runs a build. This
 * includes information such as where to get the source code to build, the build
 * environment to use, the build commands to run, and where to store the build
 * output. A <i>build environment</i> is a representation of operating system,
 * programming language runtime, and tools that AWS CodeBuild uses to run a
 * build. You can add tags to build projects to help manage your resources and
 * costs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetReportGroups</code>: Returns an array of report groups.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetReports</code>: Returns an array of reports.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateProject</code>: Creates a build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateReportGroup</code>: Creates a report group. A report group
 * contains a collection of reports.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateWebhook</code>: For an existing AWS CodeBuild build project that
 * has its source code stored in a GitHub or Bitbucket repository, enables AWS
 * CodeBuild to start rebuilding the source code every time a code change is
 * pushed to the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteProject</code>: Deletes a build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteReport</code>: Deletes a report.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteReportGroup</code>: Deletes a report group.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteResourcePolicy</code>: Deletes a resource policy that is
 * identified by its resource ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteSourceCredentials</code>: Deletes a set of GitHub, GitHub
 * Enterprise, or Bitbucket source credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteWebhook</code>: For an existing AWS CodeBuild build project that
 * has its source code stored in a GitHub or Bitbucket repository, stops AWS
 * CodeBuild from rebuilding the source code every time a code change is pushed
 * to the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeTestCases</code>: Returns a list of details about test cases
 * for a report.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetResourcePolicy</code>: Gets a resource policy that is identified by
 * its resource ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ImportSourceCredentials</code>: Imports the source repository
 * credentials for an AWS CodeBuild project that has its source code stored in a
 * GitHub, GitHub Enterprise, or Bitbucket repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>InvalidateProjectCache</code>: Resets the cache for a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListBuilds</code>: Gets a list of build IDs, with each build ID
 * representing a single build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListBuildsForProject</code>: Gets a list of build IDs for the specified
 * build project, with each build ID representing a single build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListCuratedEnvironmentImages</code>: Gets information about Docker
 * images that are managed by AWS CodeBuild.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListProjects</code>: Gets a list of build project names, with each
 * build project name representing a single build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListReportGroups</code>: Gets a list ARNs for the report groups in the
 * current AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListReports</code>: Gets a list ARNs for the reports in the current AWS
 * account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListReportsForReportGroup</code>: Returns a list of ARNs for the
 * reports that belong to a <code>ReportGroup</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListSharedProjects</code>: Gets a list of ARNs associated with projects
 * shared with the current AWS account or user.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListSharedReportGroups</code>: Gets a list of ARNs associated with
 * report groups shared with the current AWS account or user
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListSourceCredentials</code>: Returns a list of
 * <code>SourceCredentialsInfo</code> objects. Each
 * <code>SourceCredentialsInfo</code> object includes the authentication type,
 * token ARN, and type of source provider for one set of credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PutResourcePolicy</code>: Stores a resource policy for the ARN of a
 * <code>Project</code> or <code>ReportGroup</code> object.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StartBuild</code>: Starts running a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StopBuild</code>: Attempts to stop running a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateProject</code>: Changes the settings of an existing build
 * project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateReportGroup</code>: Changes a report group.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateWebhook</code>: Changes the settings of an existing webhook.
 * </p>
 * </li>
 * </ul>
 **/
public interface AWSCodeBuild {

    /**
     * Overrides the default endpoint for this client
     * ("https://codebuild.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "codebuild.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://codebuild.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint The endpoint (ex: "codebuild.us-east-1.amazonaws.com") or
     *            a full URL, including the protocol (ex:
     *            "https://codebuild.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSCodeBuild#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException If the given region is null,
     *             or if this service isn't available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

    /**
     * <p>
     * Deletes one or more builds.
     * </p>
     * 
     * @param batchDeleteBuildsRequest
     * @return batchDeleteBuildsResult The response from the BatchDeleteBuilds
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchDeleteBuildsResult batchDeleteBuilds(BatchDeleteBuildsRequest batchDeleteBuildsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about one or more builds.
     * </p>
     * 
     * @param batchGetBuildsRequest
     * @return batchGetBuildsResult The response from the BatchGetBuilds service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetBuildsResult batchGetBuilds(BatchGetBuildsRequest batchGetBuildsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about one or more build projects.
     * </p>
     * 
     * @param batchGetProjectsRequest
     * @return batchGetProjectsResult The response from the BatchGetProjects
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetProjectsResult batchGetProjects(BatchGetProjectsRequest batchGetProjectsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of report groups.
     * </p>
     * 
     * @param batchGetReportGroupsRequest
     * @return batchGetReportGroupsResult The response from the
     *         BatchGetReportGroups service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetReportGroupsResult batchGetReportGroups(
            BatchGetReportGroupsRequest batchGetReportGroupsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns an array of reports.
     * </p>
     * 
     * @param batchGetReportsRequest
     * @return batchGetReportsResult The response from the BatchGetReports
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetReportsResult batchGetReports(BatchGetReportsRequest batchGetReportsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a build project.
     * </p>
     * 
     * @param createProjectRequest
     * @return createProjectResult The response from the CreateProject service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws AccountLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateProjectResult createProject(CreateProjectRequest createProjectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a report group. A report group contains a collection of reports.
     * </p>
     * 
     * @param createReportGroupRequest
     * @return createReportGroupResult The response from the CreateReportGroup
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws AccountLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateReportGroupResult createReportGroup(CreateReportGroupRequest createReportGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * For an existing AWS CodeBuild build project that has its source code
     * stored in a GitHub or Bitbucket repository, enables AWS CodeBuild to
     * start rebuilding the source code every time a code change is pushed to
     * the repository.
     * </p>
     * <important>
     * <p>
     * If you enable webhooks for an AWS CodeBuild project, and the project is
     * used as a build step in AWS CodePipeline, then two identical builds are
     * created for each commit. One build is triggered through webhooks, and one
     * through AWS CodePipeline. Because billing is on a per-build basis, you
     * are billed for both builds. Therefore, if you are using AWS CodePipeline,
     * we recommend that you disable webhooks in AWS CodeBuild. In the AWS
     * CodeBuild console, clear the Webhook box. For more information, see step
     * 5 in <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/change-project.html#change-project-console"
     * >Change a Build Project's Settings</a>.
     * </p>
     * </important>
     * 
     * @param createWebhookRequest
     * @return createWebhookResult The response from the CreateWebhook service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws OAuthProviderException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateWebhookResult createWebhook(CreateWebhookRequest createWebhookRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a build project. When you delete a project, its builds are not
     * deleted.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return deleteProjectResult The response from the DeleteProject service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a report.
     * </p>
     * 
     * @param deleteReportRequest
     * @return deleteReportResult The response from the DeleteReport service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteReportResult deleteReport(DeleteReportRequest deleteReportRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * <code>DeleteReportGroup</code>: Deletes a report group. Before you delete
     * a report group, you must delete its reports. Use <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListReportsForReportGroup.html"
     * >ListReportsForReportGroup</a> to get the reports in a report group. Use
     * <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteReport.html"
     * >DeleteReport</a> to delete the reports. If you call
     * <code>DeleteReportGroup</code> for a report group that contains one or
     * more reports, an exception is thrown.
     * </p>
     * 
     * @param deleteReportGroupRequest
     * @return deleteReportGroupResult The response from the DeleteReportGroup
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteReportGroupResult deleteReportGroup(DeleteReportGroupRequest deleteReportGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a resource policy that is identified by its resource ARN.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return deleteResourcePolicyResult The response from the
     *         DeleteResourcePolicy service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteResourcePolicyResult deleteResourcePolicy(
            DeleteResourcePolicyRequest deleteResourcePolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source
     * credentials.
     * </p>
     * 
     * @param deleteSourceCredentialsRequest
     * @return deleteSourceCredentialsResult The response from the
     *         DeleteSourceCredentials service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteSourceCredentialsResult deleteSourceCredentials(
            DeleteSourceCredentialsRequest deleteSourceCredentialsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * For an existing AWS CodeBuild build project that has its source code
     * stored in a GitHub or Bitbucket repository, stops AWS CodeBuild from
     * rebuilding the source code every time a code change is pushed to the
     * repository.
     * </p>
     * 
     * @param deleteWebhookRequest
     * @return deleteWebhookResult The response from the DeleteWebhook service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws OAuthProviderException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteWebhookResult deleteWebhook(DeleteWebhookRequest deleteWebhookRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of details about test cases for a report.
     * </p>
     * 
     * @param describeTestCasesRequest
     * @return describeTestCasesResult The response from the DescribeTestCases
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeTestCasesResult describeTestCases(DescribeTestCasesRequest describeTestCasesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a resource policy that is identified by its resource ARN.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return getResourcePolicyResult The response from the GetResourcePolicy
     *         service method, as returned by AWS CodeBuild.
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Imports the source repository credentials for an AWS CodeBuild project
     * that has its source code stored in a GitHub, GitHub Enterprise, or
     * Bitbucket repository.
     * </p>
     * 
     * @param importSourceCredentialsRequest
     * @return importSourceCredentialsResult The response from the
     *         ImportSourceCredentials service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws AccountLimitExceededException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ImportSourceCredentialsResult importSourceCredentials(
            ImportSourceCredentialsRequest importSourceCredentialsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Resets the cache for a project.
     * </p>
     * 
     * @param invalidateProjectCacheRequest
     * @return invalidateProjectCacheResult The response from the
     *         InvalidateProjectCache service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    InvalidateProjectCacheResult invalidateProjectCache(
            InvalidateProjectCacheRequest invalidateProjectCacheRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of build IDs, with each build ID representing a single build.
     * </p>
     * 
     * @param listBuildsRequest
     * @return listBuildsResult The response from the ListBuilds service method,
     *         as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListBuildsResult listBuilds(ListBuildsRequest listBuildsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a list of build IDs for the specified build project, with each build
     * ID representing a single build.
     * </p>
     * 
     * @param listBuildsForProjectRequest
     * @return listBuildsForProjectResult The response from the
     *         ListBuildsForProject service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListBuildsForProjectResult listBuildsForProject(
            ListBuildsForProjectRequest listBuildsForProjectRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about Docker images that are managed by AWS CodeBuild.
     * </p>
     * 
     * @param listCuratedEnvironmentImagesRequest
     * @return listCuratedEnvironmentImagesResult The response from the
     *         ListCuratedEnvironmentImages service method, as returned by AWS
     *         CodeBuild.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListCuratedEnvironmentImagesResult listCuratedEnvironmentImages(
            ListCuratedEnvironmentImagesRequest listCuratedEnvironmentImagesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of build project names, with each build project name
     * representing a single build project.
     * </p>
     * 
     * @param listProjectsRequest
     * @return listProjectsResult The response from the ListProjects service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list ARNs for the report groups in the current AWS account.
     * </p>
     * 
     * @param listReportGroupsRequest
     * @return listReportGroupsResult The response from the ListReportGroups
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListReportGroupsResult listReportGroups(ListReportGroupsRequest listReportGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of ARNs for the reports in the current AWS account.
     * </p>
     * 
     * @param listReportsRequest
     * @return listReportsResult The response from the ListReports service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListReportsResult listReports(ListReportsRequest listReportsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of ARNs for the reports that belong to a
     * <code>ReportGroup</code>.
     * </p>
     * 
     * @param listReportsForReportGroupRequest
     * @return listReportsForReportGroupResult The response from the
     *         ListReportsForReportGroup service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListReportsForReportGroupResult listReportsForReportGroup(
            ListReportsForReportGroupRequest listReportsForReportGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of projects that are shared with other AWS accounts or users.
     * </p>
     * 
     * @param listSharedProjectsRequest
     * @return listSharedProjectsResult The response from the ListSharedProjects
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListSharedProjectsResult listSharedProjects(ListSharedProjectsRequest listSharedProjectsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of report groups that are shared with other AWS accounts or
     * users.
     * </p>
     * 
     * @param listSharedReportGroupsRequest
     * @return listSharedReportGroupsResult The response from the
     *         ListSharedReportGroups service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListSharedReportGroupsResult listSharedReportGroups(
            ListSharedReportGroupsRequest listSharedReportGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of <code>SourceCredentialsInfo</code> objects.
     * </p>
     * 
     * @param listSourceCredentialsRequest
     * @return listSourceCredentialsResult The response from the
     *         ListSourceCredentials service method, as returned by AWS
     *         CodeBuild.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListSourceCredentialsResult listSourceCredentials(
            ListSourceCredentialsRequest listSourceCredentialsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stores a resource policy for the ARN of a <code>Project</code> or
     * <code>ReportGroup</code> object.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return putResourcePolicyResult The response from the PutResourcePolicy
     *         service method, as returned by AWS CodeBuild.
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts running a build.
     * </p>
     * 
     * @param startBuildRequest
     * @return startBuildResult The response from the StartBuild service method,
     *         as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AccountLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartBuildResult startBuild(StartBuildRequest startBuildRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Attempts to stop running a build.
     * </p>
     * 
     * @param stopBuildRequest
     * @return stopBuildResult The response from the StopBuild service method,
     *         as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StopBuildResult stopBuild(StopBuildRequest stopBuildRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Changes the settings of a build project.
     * </p>
     * 
     * @param updateProjectRequest
     * @return updateProjectResult The response from the UpdateProject service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a report group.
     * </p>
     * 
     * @param updateReportGroupRequest
     * @return updateReportGroupResult The response from the UpdateReportGroup
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateReportGroupResult updateReportGroup(UpdateReportGroupRequest updateReportGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the webhook associated with an AWS CodeBuild build project.
     * </p>
     * <note>
     * <p>
     * If you use Bitbucket for your repository, <code>rotateSecret</code> is
     * ignored.
     * </p>
     * </note>
     * 
     * @param updateWebhookRequest
     * @return updateWebhookResult The response from the UpdateWebhook service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws OAuthProviderException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateWebhookResult updateWebhook(UpdateWebhookRequest updateWebhookRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request The originally executed request.
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
