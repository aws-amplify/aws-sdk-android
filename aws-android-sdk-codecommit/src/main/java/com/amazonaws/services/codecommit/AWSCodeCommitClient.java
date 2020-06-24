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

package com.amazonaws.services.codecommit;

import java.util.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.services.codecommit.model.transform.*;

/**
 * Client for accessing AWS CodeCommit. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS CodeCommit</fullname>
 * <p>
 * This is the <i>AWS CodeCommit API Reference</i>. This reference provides
 * descriptions of the operations and data types for AWS CodeCommit API along
 * with usage examples.
 * </p>
 * <p>
 * You can use the AWS CodeCommit API to work with the following objects:
 * </p>
 * <p>
 * Repositories, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>BatchGetRepositories</a>, which returns information about one or more
 * repositories associated with your AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateRepository</a>, which creates an AWS CodeCommit repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteRepository</a>, which deletes an AWS CodeCommit repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetRepository</a>, which returns information about a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListRepositories</a>, which lists all AWS CodeCommit repositories
 * associated with your AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateRepositoryDescription</a>, which sets or updates the description of
 * the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateRepositoryName</a>, which changes the name of the repository. If you
 * change the name of a repository, no other users of that repository can access
 * it until you send them the new HTTPS or SSH URL to use.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Branches, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateBranch</a>, which creates a branch in a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBranch</a>, which deletes the specified branch in a repository
 * unless it is the default branch.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBranch</a>, which returns information about a specified branch.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListBranches</a>, which lists all branches for a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateDefaultBranch</a>, which changes the default branch for a
 * repository.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Files, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteFile</a>, which deletes the content of a specified file from a
 * specified branch.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBlob</a>, which returns the base-64 encoded content of an individual
 * Git blob object in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetFile</a>, which returns the base-64 encoded content of a specified
 * file.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetFolder</a>, which returns the contents of a specified folder or
 * directory.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutFile</a>, which adds or modifies a single file in a specified
 * repository and branch.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Commits, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>BatchGetCommits</a>, which returns information about one or more commits
 * in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateCommit</a>, which creates a commit for changes to a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommit</a>, which returns information about a commit, including commit
 * messages and author and committer information.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetDifferences</a>, which returns information about the differences in a
 * valid commit specifier (such as a branch, tag, HEAD, commit ID, or other
 * fully qualified reference).
 * </p>
 * </li>
 * </ul>
 * <p>
 * Merges, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>BatchDescribeMergeConflicts</a>, which returns information about conflicts
 * in a merge between commits in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateUnreferencedMergeCommit</a>, which creates an unreferenced commit
 * between two branches or commits for the purpose of comparing them and
 * identifying any potential conflicts.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeMergeConflicts</a>, which returns information about merge
 * conflicts between the base, source, and destination versions of a file in a
 * potential merge.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetMergeCommit</a>, which returns information about the merge between a
 * source and destination commit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetMergeConflicts</a>, which returns information about merge conflicts
 * between the source and destination branch in a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetMergeOptions</a>, which returns information about the available merge
 * options between two branches or commit specifiers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergeBranchesByFastForward</a>, which merges two branches using the
 * fast-forward merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergeBranchesBySquash</a>, which merges two branches using the squash
 * merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergeBranchesByThreeWay</a>, which merges two branches using the three-way
 * merge option.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Pull requests, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreatePullRequest</a>, which creates a pull request in a specified
 * repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreatePullRequestApprovalRule</a>, which creates an approval rule for a
 * specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeletePullRequestApprovalRule</a>, which deletes an approval rule for a
 * specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribePullRequestEvents</a>, which returns information about one or more
 * pull request events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>EvaluatePullRequestApprovalRules</a>, which evaluates whether a pull
 * request has met all the conditions specified in its associated approval
 * rules.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommentsForPullRequest</a>, which returns information about comments on
 * a specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPullRequest</a>, which returns information about a specified pull
 * request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPullRequestApprovalStates</a>, which returns information about the
 * approval states for a specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPullRequestOverrideState</a>, which returns information about whether
 * approval rules have been set aside (overriden) for a pull request, and if so,
 * the Amazon Resource Name (ARN) of the user or identity that overrode the
 * rules and their requirements for the pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListPullRequests</a>, which lists all pull requests for a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergePullRequestByFastForward</a>, which merges the source destination
 * branch of a pull request into the specified destination branch for that pull
 * request using the fast-forward merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergePullRequestBySquash</a>, which merges the source destination branch
 * of a pull request into the specified destination branch for that pull request
 * using the squash merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergePullRequestByThreeWay</a>. which merges the source destination branch
 * of a pull request into the specified destination branch for that pull request
 * using the three-way merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>OverridePullRequestApprovalRules</a>, which sets aside all approval rule
 * requirements for a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PostCommentForPullRequest</a>, which posts a comment to a pull request at
 * the specified line, file, or request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestApprovalRuleContent</a>, which updates the structure of
 * an approval rule for a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestApprovalState</a>, which updates the state of an approval
 * on a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestDescription</a>, which updates the description of a pull
 * request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestStatus</a>, which updates the status of a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestTitle</a>, which updates the title of a pull request.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Approval rule templates, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>AssociateApprovalRuleTemplateWithRepository</a>, which associates a
 * template with a specified repository. After the template is associated with a
 * repository, AWS CodeCommit creates approval rules that match the template
 * conditions on every pull request created in the specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>BatchAssociateApprovalRuleTemplateWithRepositories</a>, which associates a
 * template with one or more specified repositories. After the template is
 * associated with a repository, AWS CodeCommit creates approval rules that
 * match the template conditions on every pull request created in the specified
 * repositories.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>BatchDisassociateApprovalRuleTemplateFromRepositories</a>, which removes
 * the association between a template and specified repositories so that
 * approval rules based on the template are not automatically created when pull
 * requests are created in those repositories.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateApprovalRuleTemplate</a>, which creates a template for approval
 * rules that can then be associated with one or more repositories in your AWS
 * account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteApprovalRuleTemplate</a>, which deletes the specified template. It
 * does not remove approval rules on pull requests already created with the
 * template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisassociateApprovalRuleTemplateFromRepository</a>, which removes the
 * association between a template and a repository so that approval rules based
 * on the template are not automatically created when pull requests are created
 * in the specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetApprovalRuleTemplate</a>, which returns information about an approval
 * rule template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListApprovalRuleTemplates</a>, which lists all approval rule templates in
 * the AWS Region in your AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListAssociatedApprovalRuleTemplatesForRepository</a>, which lists all
 * approval rule templates that are associated with a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListRepositoriesForApprovalRuleTemplate</a>, which lists all repositories
 * associated with the specified approval rule template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateApprovalRuleTemplateDescription</a>, which updates the description
 * of an approval rule template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateApprovalRuleTemplateName</a>, which updates the name of an approval
 * rule template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateApprovalRuleTemplateContent</a>, which updates the content of an
 * approval rule template.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Comments in a repository, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteCommentContent</a>, which deletes the content of a comment on a
 * commit in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetComment</a>, which returns information about a comment on a commit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommentReactions</a>, which returns information about emoji reactions
 * to comments.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommentsForComparedCommit</a>, which returns information about comments
 * on the comparison between two commit specifiers in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PostCommentForComparedCommit</a>, which creates a comment on the
 * comparison between two commit specifiers in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PostCommentReply</a>, which creates a reply to a comment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutCommentReaction</a>, which creates or updates an emoji reaction to a
 * comment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateComment</a>, which updates the content of a comment on a commit in a
 * repository.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Tags used to tag resources in AWS CodeCommit (not Git tags), by calling the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a>, which gets information about AWS tags for a
 * specified Amazon Resource Name (ARN) in AWS CodeCommit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a>, which adds or updates tags for a resource in AWS
 * CodeCommit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a>, which removes tags for a resource in AWS CodeCommit.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Triggers, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetRepositoryTriggers</a>, which returns information about triggers
 * configured for a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutRepositoryTriggers</a>, which replaces all triggers for a repository
 * and can be used to create or delete triggers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TestRepositoryTriggers</a>, which tests the functionality of a repository
 * trigger by sending data to the trigger target.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about how to use AWS CodeCommit, see the <a
 * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
 * >AWS CodeCommit User Guide</a>.
 * </p>
 */
public class AWSCodeCommitClient extends AmazonWebServiceClient implements AWSCodeCommit {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS CodeCommit exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSCodeCommit. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSCodeCommitClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeCommit. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSCodeCommit (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSCodeCommitClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeCommit using
     * the specified AWS account credentials.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSCodeCommitClient client = new AWSCodeCommitClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AWSCodeCommitClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeCommit using
     * the specified AWS account credentials and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSCodeCommitClient client = new AWSCodeCommitClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSCodeCommit (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSCodeCommitClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeCommit using
     * the specified AWS account credentials provider.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSCodeCommitClient client = new AWSCodeCommitClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AWSCodeCommitClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeCommit using
     * the specified AWS account credentials provider and client configuration
     * options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSCodeCommitClient client = new AWSCodeCommitClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSCodeCommit (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSCodeCommitClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeCommit using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSCodeCommit (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSCodeCommitClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeCommit using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSCodeCommitClient client = new AWSCodeCommitClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSCodeCommit (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSCodeCommitClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ActorDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApprovalRuleContentRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApprovalRuleDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApprovalRuleNameAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApprovalRuleNameRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApprovalRuleTemplateContentRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApprovalRuleTemplateDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApprovalRuleTemplateInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new ApprovalRuleTemplateNameAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApprovalRuleTemplateNameRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApprovalStateRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AuthorDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new BeforeCommitIdAndAfterCommitIdAreSameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BlobIdDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BlobIdRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BranchDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BranchNameExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BranchNameIsTagNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BranchNameRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CannotDeleteApprovalRuleFromTemplateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CannotModifyApprovalRuleFromTemplateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ClientRequestTokenRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CommentContentRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CommentContentSizeLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CommentDeletedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CommentDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CommentIdRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CommentNotCreatedByCallerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CommitDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CommitIdDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CommitIdRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CommitIdsLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CommitIdsListRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CommitMessageLengthExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CommitRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConcurrentReferenceUpdateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DefaultBranchCannotBeDeletedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DirectoryNameConflictsWithFileNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EncryptionIntegrityChecksFailedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EncryptionKeyAccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EncryptionKeyDisabledExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EncryptionKeyNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EncryptionKeyUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FileContentAndSourceFileSpecifiedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FileContentRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FileContentSizeLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FileDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FileEntryRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FileModeRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FileNameConflictsWithDirectoryNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FilePathConflictsWithSubmodulePathExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FileTooLargeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FolderContentSizeLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FolderDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IdempotencyParameterMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidActorArnExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidApprovalRuleContentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidApprovalRuleNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidApprovalRuleTemplateContentExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new InvalidApprovalRuleTemplateDescriptionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidApprovalRuleTemplateNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidApprovalStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAuthorArnExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidBlobIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidBranchNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidClientRequestTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidCommentIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidCommitExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidCommitIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidConflictDetailLevelExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidConflictResolutionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidConflictResolutionStrategyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidContinuationTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeletionParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDescriptionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDestinationCommitSpecifierExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidEmailExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidFileLocationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidFileModeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidFilePositionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidMaxConflictFilesExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidMaxMergeHunksExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidMaxResultsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidMergeOptionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidOrderExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidOverrideStatusExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParentCommitIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPathExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPullRequestEventTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPullRequestIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPullRequestStatusExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPullRequestStatusUpdateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidReactionUserArnExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidReactionValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidReferenceNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRelativeFileVersionEnumExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidReplacementContentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidReplacementTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRepositoryDescriptionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRepositoryNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRepositoryTriggerBranchNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRepositoryTriggerCustomDataExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new InvalidRepositoryTriggerDestinationArnExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRepositoryTriggerEventsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRepositoryTriggerNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRepositoryTriggerRegionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidResourceArnExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRevisionIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRuleContentSha256ExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSortByExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSourceCommitSpecifierExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSystemTagUsageExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTagKeysListExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTagsMapExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTargetBranchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTargetExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTargetsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTitleExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ManualMergeRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MaximumBranchesExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new MaximumConflictResolutionEntriesExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MaximumFileContentToLoadExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MaximumFileEntriesExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MaximumItemsToCompareExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MaximumNumberOfApprovalsExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MaximumOpenPullRequestsExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MaximumRepositoryNamesExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MaximumRepositoryTriggersExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new MaximumRuleTemplatesAssociatedWithRepositoryExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MergeOptionRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MultipleConflictResolutionEntriesExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MultipleRepositoriesInPullRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NameLengthExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NoChangeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NumberOfRuleTemplatesExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NumberOfRulesExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OverrideAlreadySetExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OverrideStatusRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ParentCommitDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ParentCommitIdOutdatedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ParentCommitIdRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PathDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PathRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PullRequestAlreadyClosedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PullRequestApprovalRulesNotSatisfiedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PullRequestCannotBeApprovedByAuthorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PullRequestDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PullRequestIdRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PullRequestStatusRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PutFileEntryConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ReactionLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ReactionValueRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ReferenceDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ReferenceNameRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ReferenceTypeNotSupportedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ReplacementContentRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ReplacementTypeRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RepositoryDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RepositoryLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RepositoryNameExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RepositoryNameRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RepositoryNamesRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new RepositoryNotAssociatedWithPullRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new RepositoryTriggerBranchNameListRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new RepositoryTriggerDestinationArnRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RepositoryTriggerEventsListRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RepositoryTriggerNameRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RepositoryTriggersListRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceArnRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RestrictedSourceFileExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RevisionIdRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RevisionNotCurrentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SameFileContentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SamePathRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SourceAndDestinationAreSameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SourceFileOrContentRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TagKeysListRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TagPolicyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TagsMapRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TargetRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TargetsRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TipOfSourceReferenceIsDifferentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TipsDivergenceExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TitleRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("codecommit.us-east-1.amazonaws.com");
        this.endpointPrefix = "codecommit";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/codecommit/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/codecommit/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates an association between an approval rule template and a specified
     * repository. Then, the next time a pull request is created in the
     * repository where the destination reference (if specified) matches the
     * destination reference (branch) for the pull request, an approval rule
     * that matches the template conditions is automatically created for that
     * pull request. If no destination references are specified in the template,
     * an approval rule that matches the template contents is created for all
     * pull requests in that repository.
     * </p>
     * 
     * @param associateApprovalRuleTemplateWithRepositoryRequest
     * @throws ApprovalRuleTemplateNameRequiredException
     * @throws InvalidApprovalRuleTemplateNameException
     * @throws ApprovalRuleTemplateDoesNotExistException
     * @throws MaximumRuleTemplatesAssociatedWithRepositoryException
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void associateApprovalRuleTemplateWithRepository(
            AssociateApprovalRuleTemplateWithRepositoryRequest associateApprovalRuleTemplateWithRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateApprovalRuleTemplateWithRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateApprovalRuleTemplateWithRepositoryRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateApprovalRuleTemplateWithRepositoryRequestMarshaller()
                        .marshall(associateApprovalRuleTemplateWithRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an association between an approval rule template and one or more
     * specified repositories.
     * </p>
     * 
     * @param batchAssociateApprovalRuleTemplateWithRepositoriesRequest
     * @return batchAssociateApprovalRuleTemplateWithRepositoriesResult The
     *         response from the
     *         BatchAssociateApprovalRuleTemplateWithRepositories service
     *         method, as returned by AWS CodeCommit.
     * @throws ApprovalRuleTemplateNameRequiredException
     * @throws InvalidApprovalRuleTemplateNameException
     * @throws ApprovalRuleTemplateDoesNotExistException
     * @throws RepositoryNamesRequiredException
     * @throws MaximumRepositoryNamesExceededException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchAssociateApprovalRuleTemplateWithRepositoriesResult batchAssociateApprovalRuleTemplateWithRepositories(
            BatchAssociateApprovalRuleTemplateWithRepositoriesRequest batchAssociateApprovalRuleTemplateWithRepositoriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchAssociateApprovalRuleTemplateWithRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchAssociateApprovalRuleTemplateWithRepositoriesRequest> request = null;
        Response<BatchAssociateApprovalRuleTemplateWithRepositoriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchAssociateApprovalRuleTemplateWithRepositoriesRequestMarshaller()
                        .marshall(batchAssociateApprovalRuleTemplateWithRepositoriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchAssociateApprovalRuleTemplateWithRepositoriesResult, JsonUnmarshallerContext> unmarshaller = new BatchAssociateApprovalRuleTemplateWithRepositoriesResultJsonUnmarshaller();
            JsonResponseHandler<BatchAssociateApprovalRuleTemplateWithRepositoriesResult> responseHandler = new JsonResponseHandler<BatchAssociateApprovalRuleTemplateWithRepositoriesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about one or more merge conflicts in the attempted
     * merge of two commit specifiers using the squash or three-way merge
     * strategy.
     * </p>
     * 
     * @param batchDescribeMergeConflictsRequest
     * @return batchDescribeMergeConflictsResult The response from the
     *         BatchDescribeMergeConflicts service method, as returned by AWS
     *         CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws MergeOptionRequiredException
     * @throws InvalidMergeOptionException
     * @throws InvalidContinuationTokenException
     * @throws CommitRequiredException
     * @throws CommitDoesNotExistException
     * @throws InvalidCommitException
     * @throws TipsDivergenceExceededException
     * @throws InvalidMaxConflictFilesException
     * @throws InvalidMaxMergeHunksException
     * @throws InvalidConflictDetailLevelException
     * @throws InvalidConflictResolutionStrategyException
     * @throws MaximumFileContentToLoadExceededException
     * @throws MaximumItemsToCompareExceededException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDescribeMergeConflictsResult batchDescribeMergeConflicts(
            BatchDescribeMergeConflictsRequest batchDescribeMergeConflictsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDescribeMergeConflictsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDescribeMergeConflictsRequest> request = null;
        Response<BatchDescribeMergeConflictsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDescribeMergeConflictsRequestMarshaller()
                        .marshall(batchDescribeMergeConflictsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDescribeMergeConflictsResult, JsonUnmarshallerContext> unmarshaller = new BatchDescribeMergeConflictsResultJsonUnmarshaller();
            JsonResponseHandler<BatchDescribeMergeConflictsResult> responseHandler = new JsonResponseHandler<BatchDescribeMergeConflictsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes the association between an approval rule template and one or more
     * specified repositories.
     * </p>
     * 
     * @param batchDisassociateApprovalRuleTemplateFromRepositoriesRequest
     * @return batchDisassociateApprovalRuleTemplateFromRepositoriesResult The
     *         response from the
     *         BatchDisassociateApprovalRuleTemplateFromRepositories service
     *         method, as returned by AWS CodeCommit.
     * @throws ApprovalRuleTemplateNameRequiredException
     * @throws InvalidApprovalRuleTemplateNameException
     * @throws ApprovalRuleTemplateDoesNotExistException
     * @throws RepositoryNamesRequiredException
     * @throws MaximumRepositoryNamesExceededException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDisassociateApprovalRuleTemplateFromRepositoriesResult batchDisassociateApprovalRuleTemplateFromRepositories(
            BatchDisassociateApprovalRuleTemplateFromRepositoriesRequest batchDisassociateApprovalRuleTemplateFromRepositoriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDisassociateApprovalRuleTemplateFromRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDisassociateApprovalRuleTemplateFromRepositoriesRequest> request = null;
        Response<BatchDisassociateApprovalRuleTemplateFromRepositoriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDisassociateApprovalRuleTemplateFromRepositoriesRequestMarshaller()
                        .marshall(batchDisassociateApprovalRuleTemplateFromRepositoriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDisassociateApprovalRuleTemplateFromRepositoriesResult, JsonUnmarshallerContext> unmarshaller = new BatchDisassociateApprovalRuleTemplateFromRepositoriesResultJsonUnmarshaller();
            JsonResponseHandler<BatchDisassociateApprovalRuleTemplateFromRepositoriesResult> responseHandler = new JsonResponseHandler<BatchDisassociateApprovalRuleTemplateFromRepositoriesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the contents of one or more commits in a
     * repository.
     * </p>
     * 
     * @param batchGetCommitsRequest
     * @return batchGetCommitsResult The response from the BatchGetCommits
     *         service method, as returned by AWS CodeCommit.
     * @throws CommitIdsListRequiredException
     * @throws CommitIdsLimitExceededException
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetCommitsResult batchGetCommits(BatchGetCommitsRequest batchGetCommitsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetCommitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetCommitsRequest> request = null;
        Response<BatchGetCommitsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetCommitsRequestMarshaller().marshall(batchGetCommitsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetCommitsResult, JsonUnmarshallerContext> unmarshaller = new BatchGetCommitsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetCommitsResult> responseHandler = new JsonResponseHandler<BatchGetCommitsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about one or more repositories.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and
     * all valid Unicode characters. Applications that do not HTML-encode the
     * description and display it in a webpage can expose users to potentially
     * malicious code. Make sure that you HTML-encode the description field in
     * any application that uses this API to display the repository description
     * on a webpage.
     * </p>
     * </note>
     * 
     * @param batchGetRepositoriesRequest <p>
     *            Represents the input of a batch get repositories operation.
     *            </p>
     * @return batchGetRepositoriesResult The response from the
     *         BatchGetRepositories service method, as returned by AWS
     *         CodeCommit.
     * @throws RepositoryNamesRequiredException
     * @throws MaximumRepositoryNamesExceededException
     * @throws InvalidRepositoryNameException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetRepositoriesResult batchGetRepositories(
            BatchGetRepositoriesRequest batchGetRepositoriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetRepositoriesRequest> request = null;
        Response<BatchGetRepositoriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetRepositoriesRequestMarshaller()
                        .marshall(batchGetRepositoriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetRepositoriesResult, JsonUnmarshallerContext> unmarshaller = new BatchGetRepositoriesResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetRepositoriesResult> responseHandler = new JsonResponseHandler<BatchGetRepositoriesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a template for approval rules that can then be associated with
     * one or more repositories in your AWS account. When you associate a
     * template with a repository, AWS CodeCommit creates an approval rule that
     * matches the conditions of the template for all pull requests that meet
     * the conditions of the template. For more information, see
     * <a>AssociateApprovalRuleTemplateWithRepository</a>.
     * </p>
     * 
     * @param createApprovalRuleTemplateRequest
     * @return createApprovalRuleTemplateResult The response from the
     *         CreateApprovalRuleTemplate service method, as returned by AWS
     *         CodeCommit.
     * @throws ApprovalRuleTemplateNameRequiredException
     * @throws InvalidApprovalRuleTemplateNameException
     * @throws ApprovalRuleTemplateNameAlreadyExistsException
     * @throws ApprovalRuleTemplateContentRequiredException
     * @throws InvalidApprovalRuleTemplateContentException
     * @throws InvalidApprovalRuleTemplateDescriptionException
     * @throws NumberOfRuleTemplatesExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateApprovalRuleTemplateResult createApprovalRuleTemplate(
            CreateApprovalRuleTemplateRequest createApprovalRuleTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createApprovalRuleTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApprovalRuleTemplateRequest> request = null;
        Response<CreateApprovalRuleTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApprovalRuleTemplateRequestMarshaller()
                        .marshall(createApprovalRuleTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateApprovalRuleTemplateResult, JsonUnmarshallerContext> unmarshaller = new CreateApprovalRuleTemplateResultJsonUnmarshaller();
            JsonResponseHandler<CreateApprovalRuleTemplateResult> responseHandler = new JsonResponseHandler<CreateApprovalRuleTemplateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a branch in a repository and points the branch to a commit.
     * </p>
     * <note>
     * <p>
     * Calling the create branch operation does not set a repository's default
     * branch. To do this, call the update default branch operation.
     * </p>
     * </note>
     * 
     * @param createBranchRequest <p>
     *            Represents the input of a create branch operation.
     *            </p>
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws BranchNameRequiredException
     * @throws BranchNameExistsException
     * @throws InvalidBranchNameException
     * @throws CommitIdRequiredException
     * @throws CommitDoesNotExistException
     * @throws InvalidCommitIdException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void createBranch(CreateBranchRequest createBranchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBranchRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBranchRequestMarshaller().marshall(createBranchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a commit for a repository on the tip of a specified branch.
     * </p>
     * 
     * @param createCommitRequest
     * @return createCommitResult The response from the CreateCommit service
     *         method, as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws ParentCommitIdRequiredException
     * @throws InvalidParentCommitIdException
     * @throws ParentCommitDoesNotExistException
     * @throws ParentCommitIdOutdatedException
     * @throws BranchNameRequiredException
     * @throws InvalidBranchNameException
     * @throws BranchDoesNotExistException
     * @throws BranchNameIsTagNameException
     * @throws FileEntryRequiredException
     * @throws MaximumFileEntriesExceededException
     * @throws PutFileEntryConflictException
     * @throws SourceFileOrContentRequiredException
     * @throws FileContentAndSourceFileSpecifiedException
     * @throws PathRequiredException
     * @throws InvalidPathException
     * @throws SamePathRequestException
     * @throws FileDoesNotExistException
     * @throws FileContentSizeLimitExceededException
     * @throws FolderContentSizeLimitExceededException
     * @throws InvalidDeletionParameterException
     * @throws RestrictedSourceFileException
     * @throws FileModeRequiredException
     * @throws InvalidFileModeException
     * @throws NameLengthExceededException
     * @throws InvalidEmailException
     * @throws CommitMessageLengthExceededException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws NoChangeException
     * @throws FileNameConflictsWithDirectoryNameException
     * @throws DirectoryNameConflictsWithFileNameException
     * @throws FilePathConflictsWithSubmodulePathException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateCommitResult createCommit(CreateCommitRequest createCommitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCommitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCommitRequest> request = null;
        Response<CreateCommitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCommitRequestMarshaller().marshall(createCommitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCommitResult, JsonUnmarshallerContext> unmarshaller = new CreateCommitResultJsonUnmarshaller();
            JsonResponseHandler<CreateCommitResult> responseHandler = new JsonResponseHandler<CreateCommitResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a pull request in the specified repository.
     * </p>
     * 
     * @param createPullRequestRequest
     * @return createPullRequestResult The response from the CreatePullRequest
     *         service method, as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws ClientRequestTokenRequiredException
     * @throws InvalidClientRequestTokenException
     * @throws IdempotencyParameterMismatchException
     * @throws ReferenceNameRequiredException
     * @throws InvalidReferenceNameException
     * @throws ReferenceDoesNotExistException
     * @throws ReferenceTypeNotSupportedException
     * @throws TitleRequiredException
     * @throws InvalidTitleException
     * @throws InvalidDescriptionException
     * @throws TargetsRequiredException
     * @throws InvalidTargetsException
     * @throws TargetRequiredException
     * @throws InvalidTargetException
     * @throws MultipleRepositoriesInPullRequestException
     * @throws MaximumOpenPullRequestsExceededException
     * @throws SourceAndDestinationAreSameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreatePullRequestResult createPullRequest(
            CreatePullRequestRequest createPullRequestRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPullRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePullRequestRequest> request = null;
        Response<CreatePullRequestResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePullRequestRequestMarshaller()
                        .marshall(createPullRequestRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePullRequestResult, JsonUnmarshallerContext> unmarshaller = new CreatePullRequestResultJsonUnmarshaller();
            JsonResponseHandler<CreatePullRequestResult> responseHandler = new JsonResponseHandler<CreatePullRequestResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an approval rule for a pull request.
     * </p>
     * 
     * @param createPullRequestApprovalRuleRequest
     * @return createPullRequestApprovalRuleResult The response from the
     *         CreatePullRequestApprovalRule service method, as returned by AWS
     *         CodeCommit.
     * @throws ApprovalRuleNameRequiredException
     * @throws InvalidApprovalRuleNameException
     * @throws ApprovalRuleNameAlreadyExistsException
     * @throws ApprovalRuleContentRequiredException
     * @throws InvalidApprovalRuleContentException
     * @throws NumberOfRulesExceededException
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws PullRequestAlreadyClosedException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreatePullRequestApprovalRuleResult createPullRequestApprovalRule(
            CreatePullRequestApprovalRuleRequest createPullRequestApprovalRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPullRequestApprovalRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePullRequestApprovalRuleRequest> request = null;
        Response<CreatePullRequestApprovalRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePullRequestApprovalRuleRequestMarshaller()
                        .marshall(createPullRequestApprovalRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePullRequestApprovalRuleResult, JsonUnmarshallerContext> unmarshaller = new CreatePullRequestApprovalRuleResultJsonUnmarshaller();
            JsonResponseHandler<CreatePullRequestApprovalRuleResult> responseHandler = new JsonResponseHandler<CreatePullRequestApprovalRuleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new, empty repository.
     * </p>
     * 
     * @param createRepositoryRequest <p>
     *            Represents the input of a create repository operation.
     *            </p>
     * @return createRepositoryResult The response from the CreateRepository
     *         service method, as returned by AWS CodeCommit.
     * @throws RepositoryNameExistsException
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws InvalidRepositoryDescriptionException
     * @throws RepositoryLimitExceededException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws InvalidTagsMapException
     * @throws TooManyTagsException
     * @throws InvalidSystemTagUsageException
     * @throws TagPolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRepositoryResult createRepository(CreateRepositoryRequest createRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRepositoryRequest> request = null;
        Response<CreateRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRepositoryRequestMarshaller().marshall(createRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRepositoryResult, JsonUnmarshallerContext> unmarshaller = new CreateRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<CreateRepositoryResult> responseHandler = new JsonResponseHandler<CreateRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an unreferenced commit that represents the result of merging two
     * branches using a specified merge strategy. This can help you determine
     * the outcome of a potential merge. This API cannot be used with the
     * fast-forward merge strategy because that strategy does not create a merge
     * commit.
     * </p>
     * <note>
     * <p>
     * This unreferenced merge commit can only be accessed using the GetCommit
     * API or through git commands such as git fetch. To retrieve this commit,
     * you must specify its commit ID or otherwise reference it.
     * </p>
     * </note>
     * 
     * @param createUnreferencedMergeCommitRequest
     * @return createUnreferencedMergeCommitResult The response from the
     *         CreateUnreferencedMergeCommit service method, as returned by AWS
     *         CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws TipsDivergenceExceededException
     * @throws CommitRequiredException
     * @throws InvalidCommitException
     * @throws CommitDoesNotExistException
     * @throws MergeOptionRequiredException
     * @throws InvalidMergeOptionException
     * @throws InvalidConflictDetailLevelException
     * @throws InvalidConflictResolutionStrategyException
     * @throws InvalidConflictResolutionException
     * @throws ManualMergeRequiredException
     * @throws MaximumConflictResolutionEntriesExceededException
     * @throws MultipleConflictResolutionEntriesException
     * @throws ReplacementTypeRequiredException
     * @throws InvalidReplacementTypeException
     * @throws ReplacementContentRequiredException
     * @throws InvalidReplacementContentException
     * @throws PathRequiredException
     * @throws InvalidPathException
     * @throws FileContentSizeLimitExceededException
     * @throws FolderContentSizeLimitExceededException
     * @throws MaximumFileContentToLoadExceededException
     * @throws MaximumItemsToCompareExceededException
     * @throws ConcurrentReferenceUpdateException
     * @throws FileModeRequiredException
     * @throws InvalidFileModeException
     * @throws NameLengthExceededException
     * @throws InvalidEmailException
     * @throws CommitMessageLengthExceededException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateUnreferencedMergeCommitResult createUnreferencedMergeCommit(
            CreateUnreferencedMergeCommitRequest createUnreferencedMergeCommitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createUnreferencedMergeCommitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUnreferencedMergeCommitRequest> request = null;
        Response<CreateUnreferencedMergeCommitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUnreferencedMergeCommitRequestMarshaller()
                        .marshall(createUnreferencedMergeCommitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateUnreferencedMergeCommitResult, JsonUnmarshallerContext> unmarshaller = new CreateUnreferencedMergeCommitResultJsonUnmarshaller();
            JsonResponseHandler<CreateUnreferencedMergeCommitResult> responseHandler = new JsonResponseHandler<CreateUnreferencedMergeCommitResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a specified approval rule template. Deleting a template does not
     * remove approval rules on pull requests already created with the template.
     * </p>
     * 
     * @param deleteApprovalRuleTemplateRequest
     * @return deleteApprovalRuleTemplateResult The response from the
     *         DeleteApprovalRuleTemplate service method, as returned by AWS
     *         CodeCommit.
     * @throws ApprovalRuleTemplateNameRequiredException
     * @throws InvalidApprovalRuleTemplateNameException
     * @throws ApprovalRuleTemplateInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteApprovalRuleTemplateResult deleteApprovalRuleTemplate(
            DeleteApprovalRuleTemplateRequest deleteApprovalRuleTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteApprovalRuleTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApprovalRuleTemplateRequest> request = null;
        Response<DeleteApprovalRuleTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApprovalRuleTemplateRequestMarshaller()
                        .marshall(deleteApprovalRuleTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteApprovalRuleTemplateResult, JsonUnmarshallerContext> unmarshaller = new DeleteApprovalRuleTemplateResultJsonUnmarshaller();
            JsonResponseHandler<DeleteApprovalRuleTemplateResult> responseHandler = new JsonResponseHandler<DeleteApprovalRuleTemplateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a branch from a repository, unless that branch is the default
     * branch for the repository.
     * </p>
     * 
     * @param deleteBranchRequest <p>
     *            Represents the input of a delete branch operation.
     *            </p>
     * @return deleteBranchResult The response from the DeleteBranch service
     *         method, as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidRepositoryNameException
     * @throws BranchNameRequiredException
     * @throws InvalidBranchNameException
     * @throws DefaultBranchCannotBeDeletedException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteBranchResult deleteBranch(DeleteBranchRequest deleteBranchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBranchRequest> request = null;
        Response<DeleteBranchResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBranchRequestMarshaller().marshall(deleteBranchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteBranchResult, JsonUnmarshallerContext> unmarshaller = new DeleteBranchResultJsonUnmarshaller();
            JsonResponseHandler<DeleteBranchResult> responseHandler = new JsonResponseHandler<DeleteBranchResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the content of a comment made on a change, file, or commit in a
     * repository.
     * </p>
     * 
     * @param deleteCommentContentRequest
     * @return deleteCommentContentResult The response from the
     *         DeleteCommentContent service method, as returned by AWS
     *         CodeCommit.
     * @throws CommentDoesNotExistException
     * @throws CommentIdRequiredException
     * @throws InvalidCommentIdException
     * @throws CommentDeletedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteCommentContentResult deleteCommentContent(
            DeleteCommentContentRequest deleteCommentContentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCommentContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCommentContentRequest> request = null;
        Response<DeleteCommentContentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCommentContentRequestMarshaller()
                        .marshall(deleteCommentContentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteCommentContentResult, JsonUnmarshallerContext> unmarshaller = new DeleteCommentContentResultJsonUnmarshaller();
            JsonResponseHandler<DeleteCommentContentResult> responseHandler = new JsonResponseHandler<DeleteCommentContentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a specified file from a specified branch. A commit is created on
     * the branch that contains the revision. The file still exists in the
     * commits earlier to the commit that contains the deletion.
     * </p>
     * 
     * @param deleteFileRequest
     * @return deleteFileResult The response from the DeleteFile service method,
     *         as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws ParentCommitIdRequiredException
     * @throws InvalidParentCommitIdException
     * @throws ParentCommitDoesNotExistException
     * @throws ParentCommitIdOutdatedException
     * @throws PathRequiredException
     * @throws InvalidPathException
     * @throws FileDoesNotExistException
     * @throws BranchNameRequiredException
     * @throws InvalidBranchNameException
     * @throws BranchDoesNotExistException
     * @throws BranchNameIsTagNameException
     * @throws NameLengthExceededException
     * @throws InvalidEmailException
     * @throws CommitMessageLengthExceededException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteFileResult deleteFile(DeleteFileRequest deleteFileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteFileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFileRequest> request = null;
        Response<DeleteFileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFileRequestMarshaller().marshall(deleteFileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteFileResult, JsonUnmarshallerContext> unmarshaller = new DeleteFileResultJsonUnmarshaller();
            JsonResponseHandler<DeleteFileResult> responseHandler = new JsonResponseHandler<DeleteFileResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes an approval rule from a specified pull request. Approval rules
     * can be deleted from a pull request only if the pull request is open, and
     * if the approval rule was created specifically for a pull request and not
     * generated from an approval rule template associated with the repository
     * where the pull request was created. You cannot delete an approval rule
     * from a merged or closed pull request.
     * </p>
     * 
     * @param deletePullRequestApprovalRuleRequest
     * @return deletePullRequestApprovalRuleResult The response from the
     *         DeletePullRequestApprovalRule service method, as returned by AWS
     *         CodeCommit.
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws PullRequestAlreadyClosedException
     * @throws ApprovalRuleNameRequiredException
     * @throws InvalidApprovalRuleNameException
     * @throws CannotDeleteApprovalRuleFromTemplateException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeletePullRequestApprovalRuleResult deletePullRequestApprovalRule(
            DeletePullRequestApprovalRuleRequest deletePullRequestApprovalRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePullRequestApprovalRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePullRequestApprovalRuleRequest> request = null;
        Response<DeletePullRequestApprovalRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePullRequestApprovalRuleRequestMarshaller()
                        .marshall(deletePullRequestApprovalRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeletePullRequestApprovalRuleResult, JsonUnmarshallerContext> unmarshaller = new DeletePullRequestApprovalRuleResultJsonUnmarshaller();
            JsonResponseHandler<DeletePullRequestApprovalRuleResult> responseHandler = new JsonResponseHandler<DeletePullRequestApprovalRuleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a repository. If a specified repository was already deleted, a
     * null repository ID is returned.
     * </p>
     * <important>
     * <p>
     * Deleting a repository also deletes all associated objects and metadata.
     * After a repository is deleted, all future push calls to the deleted
     * repository fail.
     * </p>
     * </important>
     * 
     * @param deleteRepositoryRequest <p>
     *            Represents the input of a delete repository operation.
     *            </p>
     * @return deleteRepositoryResult The response from the DeleteRepository
     *         service method, as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest deleteRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryRequest> request = null;
        Response<DeleteRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryRequestMarshaller().marshall(deleteRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRepositoryResult, JsonUnmarshallerContext> unmarshaller = new DeleteRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRepositoryResult> responseHandler = new JsonResponseHandler<DeleteRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about one or more merge conflicts in the attempted
     * merge of two commit specifiers using the squash or three-way merge
     * strategy. If the merge option for the attempted merge is specified as
     * FAST_FORWARD_MERGE, an exception is thrown.
     * </p>
     * 
     * @param describeMergeConflictsRequest
     * @return describeMergeConflictsResult The response from the
     *         DescribeMergeConflicts service method, as returned by AWS
     *         CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws MergeOptionRequiredException
     * @throws InvalidMergeOptionException
     * @throws InvalidContinuationTokenException
     * @throws CommitRequiredException
     * @throws CommitDoesNotExistException
     * @throws InvalidCommitException
     * @throws TipsDivergenceExceededException
     * @throws PathRequiredException
     * @throws InvalidPathException
     * @throws FileDoesNotExistException
     * @throws InvalidMaxMergeHunksException
     * @throws InvalidConflictDetailLevelException
     * @throws InvalidConflictResolutionStrategyException
     * @throws MaximumFileContentToLoadExceededException
     * @throws MaximumItemsToCompareExceededException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeMergeConflictsResult describeMergeConflicts(
            DescribeMergeConflictsRequest describeMergeConflictsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMergeConflictsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMergeConflictsRequest> request = null;
        Response<DescribeMergeConflictsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMergeConflictsRequestMarshaller()
                        .marshall(describeMergeConflictsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMergeConflictsResult, JsonUnmarshallerContext> unmarshaller = new DescribeMergeConflictsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMergeConflictsResult> responseHandler = new JsonResponseHandler<DescribeMergeConflictsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about one or more pull request events.
     * </p>
     * 
     * @param describePullRequestEventsRequest
     * @return describePullRequestEventsResult The response from the
     *         DescribePullRequestEvents service method, as returned by AWS
     *         CodeCommit.
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws InvalidPullRequestEventTypeException
     * @throws InvalidActorArnException
     * @throws ActorDoesNotExistException
     * @throws InvalidMaxResultsException
     * @throws InvalidContinuationTokenException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribePullRequestEventsResult describePullRequestEvents(
            DescribePullRequestEventsRequest describePullRequestEventsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePullRequestEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePullRequestEventsRequest> request = null;
        Response<DescribePullRequestEventsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePullRequestEventsRequestMarshaller()
                        .marshall(describePullRequestEventsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePullRequestEventsResult, JsonUnmarshallerContext> unmarshaller = new DescribePullRequestEventsResultJsonUnmarshaller();
            JsonResponseHandler<DescribePullRequestEventsResult> responseHandler = new JsonResponseHandler<DescribePullRequestEventsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes the association between a template and a repository so that
     * approval rules based on the template are not automatically created when
     * pull requests are created in the specified repository. This does not
     * delete any approval rules previously created for pull requests through
     * the template association.
     * </p>
     * 
     * @param disassociateApprovalRuleTemplateFromRepositoryRequest
     * @throws ApprovalRuleTemplateNameRequiredException
     * @throws InvalidApprovalRuleTemplateNameException
     * @throws ApprovalRuleTemplateDoesNotExistException
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void disassociateApprovalRuleTemplateFromRepository(
            DisassociateApprovalRuleTemplateFromRepositoryRequest disassociateApprovalRuleTemplateFromRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateApprovalRuleTemplateFromRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateApprovalRuleTemplateFromRepositoryRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateApprovalRuleTemplateFromRepositoryRequestMarshaller()
                        .marshall(disassociateApprovalRuleTemplateFromRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Evaluates whether a pull request has met all the conditions specified in
     * its associated approval rules.
     * </p>
     * 
     * @param evaluatePullRequestApprovalRulesRequest
     * @return evaluatePullRequestApprovalRulesResult The response from the
     *         EvaluatePullRequestApprovalRules service method, as returned by
     *         AWS CodeCommit.
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws InvalidRevisionIdException
     * @throws RevisionIdRequiredException
     * @throws RevisionNotCurrentException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public EvaluatePullRequestApprovalRulesResult evaluatePullRequestApprovalRules(
            EvaluatePullRequestApprovalRulesRequest evaluatePullRequestApprovalRulesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(evaluatePullRequestApprovalRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EvaluatePullRequestApprovalRulesRequest> request = null;
        Response<EvaluatePullRequestApprovalRulesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EvaluatePullRequestApprovalRulesRequestMarshaller()
                        .marshall(evaluatePullRequestApprovalRulesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EvaluatePullRequestApprovalRulesResult, JsonUnmarshallerContext> unmarshaller = new EvaluatePullRequestApprovalRulesResultJsonUnmarshaller();
            JsonResponseHandler<EvaluatePullRequestApprovalRulesResult> responseHandler = new JsonResponseHandler<EvaluatePullRequestApprovalRulesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a specified approval rule template.
     * </p>
     * 
     * @param getApprovalRuleTemplateRequest
     * @return getApprovalRuleTemplateResult The response from the
     *         GetApprovalRuleTemplate service method, as returned by AWS
     *         CodeCommit.
     * @throws ApprovalRuleTemplateNameRequiredException
     * @throws InvalidApprovalRuleTemplateNameException
     * @throws ApprovalRuleTemplateDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetApprovalRuleTemplateResult getApprovalRuleTemplate(
            GetApprovalRuleTemplateRequest getApprovalRuleTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getApprovalRuleTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApprovalRuleTemplateRequest> request = null;
        Response<GetApprovalRuleTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApprovalRuleTemplateRequestMarshaller()
                        .marshall(getApprovalRuleTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApprovalRuleTemplateResult, JsonUnmarshallerContext> unmarshaller = new GetApprovalRuleTemplateResultJsonUnmarshaller();
            JsonResponseHandler<GetApprovalRuleTemplateResult> responseHandler = new JsonResponseHandler<GetApprovalRuleTemplateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the base-64 encoded content of an individual blob in a
     * repository.
     * </p>
     * 
     * @param getBlobRequest <p>
     *            Represents the input of a get blob operation.
     *            </p>
     * @return getBlobResult The response from the GetBlob service method, as
     *         returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws BlobIdRequiredException
     * @throws InvalidBlobIdException
     * @throws BlobIdDoesNotExistException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws FileTooLargeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBlobResult getBlob(GetBlobRequest getBlobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBlobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBlobRequest> request = null;
        Response<GetBlobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBlobRequestMarshaller().marshall(getBlobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBlobResult, JsonUnmarshallerContext> unmarshaller = new GetBlobResultJsonUnmarshaller();
            JsonResponseHandler<GetBlobResult> responseHandler = new JsonResponseHandler<GetBlobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a repository branch, including its name and the
     * last commit ID.
     * </p>
     * 
     * @param getBranchRequest <p>
     *            Represents the input of a get branch operation.
     *            </p>
     * @return getBranchResult The response from the GetBranch service method,
     *         as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidRepositoryNameException
     * @throws BranchNameRequiredException
     * @throws InvalidBranchNameException
     * @throws BranchDoesNotExistException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBranchResult getBranch(GetBranchRequest getBranchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBranchRequest> request = null;
        Response<GetBranchResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBranchRequestMarshaller().marshall(getBranchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBranchResult, JsonUnmarshallerContext> unmarshaller = new GetBranchResultJsonUnmarshaller();
            JsonResponseHandler<GetBranchResult> responseHandler = new JsonResponseHandler<GetBranchResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the content of a comment made on a change, file, or commit in a
     * repository.
     * </p>
     * <note>
     * <p>
     * Reaction counts might include numbers from user identities who were
     * deleted after the reaction was made. For a count of reactions from active
     * identities, use GetCommentReactions.
     * </p>
     * </note>
     * 
     * @param getCommentRequest
     * @return getCommentResult The response from the GetComment service method,
     *         as returned by AWS CodeCommit.
     * @throws CommentDoesNotExistException
     * @throws CommentDeletedException
     * @throws CommentIdRequiredException
     * @throws InvalidCommentIdException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCommentResult getComment(GetCommentRequest getCommentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCommentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCommentRequest> request = null;
        Response<GetCommentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCommentRequestMarshaller().marshall(getCommentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCommentResult, JsonUnmarshallerContext> unmarshaller = new GetCommentResultJsonUnmarshaller();
            JsonResponseHandler<GetCommentResult> responseHandler = new JsonResponseHandler<GetCommentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about reactions to a specified comment ID. Reactions
     * from users who have been deleted will not be included in the count.
     * </p>
     * 
     * @param getCommentReactionsRequest
     * @return getCommentReactionsResult The response from the
     *         GetCommentReactions service method, as returned by AWS
     *         CodeCommit.
     * @throws CommentDoesNotExistException
     * @throws CommentIdRequiredException
     * @throws InvalidCommentIdException
     * @throws InvalidReactionUserArnException
     * @throws InvalidMaxResultsException
     * @throws InvalidContinuationTokenException
     * @throws CommentDeletedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCommentReactionsResult getCommentReactions(
            GetCommentReactionsRequest getCommentReactionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCommentReactionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCommentReactionsRequest> request = null;
        Response<GetCommentReactionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCommentReactionsRequestMarshaller()
                        .marshall(getCommentReactionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCommentReactionsResult, JsonUnmarshallerContext> unmarshaller = new GetCommentReactionsResultJsonUnmarshaller();
            JsonResponseHandler<GetCommentReactionsResult> responseHandler = new JsonResponseHandler<GetCommentReactionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about comments made on the comparison between two
     * commits.
     * </p>
     * <note>
     * <p>
     * Reaction counts might include numbers from user identities who were
     * deleted after the reaction was made. For a count of reactions from active
     * identities, use GetCommentReactions.
     * </p>
     * </note>
     * 
     * @param getCommentsForComparedCommitRequest
     * @return getCommentsForComparedCommitResult The response from the
     *         GetCommentsForComparedCommit service method, as returned by AWS
     *         CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidRepositoryNameException
     * @throws CommitIdRequiredException
     * @throws InvalidCommitIdException
     * @throws CommitDoesNotExistException
     * @throws InvalidMaxResultsException
     * @throws InvalidContinuationTokenException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCommentsForComparedCommitResult getCommentsForComparedCommit(
            GetCommentsForComparedCommitRequest getCommentsForComparedCommitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCommentsForComparedCommitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCommentsForComparedCommitRequest> request = null;
        Response<GetCommentsForComparedCommitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCommentsForComparedCommitRequestMarshaller()
                        .marshall(getCommentsForComparedCommitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCommentsForComparedCommitResult, JsonUnmarshallerContext> unmarshaller = new GetCommentsForComparedCommitResultJsonUnmarshaller();
            JsonResponseHandler<GetCommentsForComparedCommitResult> responseHandler = new JsonResponseHandler<GetCommentsForComparedCommitResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns comments made on a pull request.
     * </p>
     * <note>
     * <p>
     * Reaction counts might include numbers from user identities who were
     * deleted after the reaction was made. For a count of reactions from active
     * identities, use GetCommentReactions.
     * </p>
     * </note>
     * 
     * @param getCommentsForPullRequestRequest
     * @return getCommentsForPullRequestResult The response from the
     *         GetCommentsForPullRequest service method, as returned by AWS
     *         CodeCommit.
     * @throws PullRequestIdRequiredException
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws RepositoryNameRequiredException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidRepositoryNameException
     * @throws CommitIdRequiredException
     * @throws InvalidCommitIdException
     * @throws CommitDoesNotExistException
     * @throws InvalidMaxResultsException
     * @throws InvalidContinuationTokenException
     * @throws RepositoryNotAssociatedWithPullRequestException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCommentsForPullRequestResult getCommentsForPullRequest(
            GetCommentsForPullRequestRequest getCommentsForPullRequestRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCommentsForPullRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCommentsForPullRequestRequest> request = null;
        Response<GetCommentsForPullRequestResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCommentsForPullRequestRequestMarshaller()
                        .marshall(getCommentsForPullRequestRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCommentsForPullRequestResult, JsonUnmarshallerContext> unmarshaller = new GetCommentsForPullRequestResultJsonUnmarshaller();
            JsonResponseHandler<GetCommentsForPullRequestResult> responseHandler = new JsonResponseHandler<GetCommentsForPullRequestResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a commit, including commit message and
     * committer information.
     * </p>
     * 
     * @param getCommitRequest <p>
     *            Represents the input of a get commit operation.
     *            </p>
     * @return getCommitResult The response from the GetCommit service method,
     *         as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws CommitIdRequiredException
     * @throws InvalidCommitIdException
     * @throws CommitIdDoesNotExistException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCommitResult getCommit(GetCommitRequest getCommitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCommitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCommitRequest> request = null;
        Response<GetCommitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCommitRequestMarshaller().marshall(getCommitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCommitResult, JsonUnmarshallerContext> unmarshaller = new GetCommitResultJsonUnmarshaller();
            JsonResponseHandler<GetCommitResult> responseHandler = new JsonResponseHandler<GetCommitResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the differences in a valid commit specifier
     * (such as a branch, tag, HEAD, commit ID, or other fully qualified
     * reference). Results can be limited to a specified path.
     * </p>
     * 
     * @param getDifferencesRequest
     * @return getDifferencesResult The response from the GetDifferences service
     *         method, as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidRepositoryNameException
     * @throws InvalidContinuationTokenException
     * @throws InvalidMaxResultsException
     * @throws InvalidCommitIdException
     * @throws CommitRequiredException
     * @throws InvalidCommitException
     * @throws CommitDoesNotExistException
     * @throws InvalidPathException
     * @throws PathDoesNotExistException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDifferencesResult getDifferences(GetDifferencesRequest getDifferencesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDifferencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDifferencesRequest> request = null;
        Response<GetDifferencesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDifferencesRequestMarshaller().marshall(getDifferencesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDifferencesResult, JsonUnmarshallerContext> unmarshaller = new GetDifferencesResultJsonUnmarshaller();
            JsonResponseHandler<GetDifferencesResult> responseHandler = new JsonResponseHandler<GetDifferencesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the base-64 encoded contents of a specified file and its
     * metadata.
     * </p>
     * 
     * @param getFileRequest
     * @return getFileResult The response from the GetFile service method, as
     *         returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidCommitException
     * @throws CommitDoesNotExistException
     * @throws PathRequiredException
     * @throws InvalidPathException
     * @throws FileDoesNotExistException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws FileTooLargeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFileResult getFile(GetFileRequest getFileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFileRequest> request = null;
        Response<GetFileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFileRequestMarshaller().marshall(getFileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetFileResult, JsonUnmarshallerContext> unmarshaller = new GetFileResultJsonUnmarshaller();
            JsonResponseHandler<GetFileResult> responseHandler = new JsonResponseHandler<GetFileResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the contents of a specified folder in a repository.
     * </p>
     * 
     * @param getFolderRequest
     * @return getFolderResult The response from the GetFolder service method,
     *         as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidCommitException
     * @throws CommitDoesNotExistException
     * @throws PathRequiredException
     * @throws InvalidPathException
     * @throws FolderDoesNotExistException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFolderResult getFolder(GetFolderRequest getFolderRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFolderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFolderRequest> request = null;
        Response<GetFolderResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFolderRequestMarshaller().marshall(getFolderRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetFolderResult, JsonUnmarshallerContext> unmarshaller = new GetFolderResultJsonUnmarshaller();
            JsonResponseHandler<GetFolderResult> responseHandler = new JsonResponseHandler<GetFolderResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a specified merge commit.
     * </p>
     * 
     * @param getMergeCommitRequest
     * @return getMergeCommitResult The response from the GetMergeCommit service
     *         method, as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws CommitRequiredException
     * @throws InvalidCommitException
     * @throws CommitDoesNotExistException
     * @throws InvalidConflictDetailLevelException
     * @throws InvalidConflictResolutionStrategyException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMergeCommitResult getMergeCommit(GetMergeCommitRequest getMergeCommitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMergeCommitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMergeCommitRequest> request = null;
        Response<GetMergeCommitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMergeCommitRequestMarshaller().marshall(getMergeCommitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMergeCommitResult, JsonUnmarshallerContext> unmarshaller = new GetMergeCommitResultJsonUnmarshaller();
            JsonResponseHandler<GetMergeCommitResult> responseHandler = new JsonResponseHandler<GetMergeCommitResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about merge conflicts between the before and after
     * commit IDs for a pull request in a repository.
     * </p>
     * 
     * @param getMergeConflictsRequest
     * @return getMergeConflictsResult The response from the GetMergeConflicts
     *         service method, as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws MergeOptionRequiredException
     * @throws InvalidMergeOptionException
     * @throws InvalidContinuationTokenException
     * @throws CommitRequiredException
     * @throws CommitDoesNotExistException
     * @throws InvalidCommitException
     * @throws TipsDivergenceExceededException
     * @throws InvalidMaxConflictFilesException
     * @throws InvalidConflictDetailLevelException
     * @throws InvalidDestinationCommitSpecifierException
     * @throws InvalidSourceCommitSpecifierException
     * @throws InvalidConflictResolutionStrategyException
     * @throws MaximumFileContentToLoadExceededException
     * @throws MaximumItemsToCompareExceededException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMergeConflictsResult getMergeConflicts(
            GetMergeConflictsRequest getMergeConflictsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMergeConflictsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMergeConflictsRequest> request = null;
        Response<GetMergeConflictsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMergeConflictsRequestMarshaller()
                        .marshall(getMergeConflictsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMergeConflictsResult, JsonUnmarshallerContext> unmarshaller = new GetMergeConflictsResultJsonUnmarshaller();
            JsonResponseHandler<GetMergeConflictsResult> responseHandler = new JsonResponseHandler<GetMergeConflictsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the merge options available for merging two
     * specified branches. For details about why a merge option is not
     * available, use GetMergeConflicts or DescribeMergeConflicts.
     * </p>
     * 
     * @param getMergeOptionsRequest
     * @return getMergeOptionsResult The response from the GetMergeOptions
     *         service method, as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws CommitRequiredException
     * @throws CommitDoesNotExistException
     * @throws InvalidCommitException
     * @throws TipsDivergenceExceededException
     * @throws InvalidConflictDetailLevelException
     * @throws InvalidConflictResolutionStrategyException
     * @throws MaximumFileContentToLoadExceededException
     * @throws MaximumItemsToCompareExceededException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMergeOptionsResult getMergeOptions(GetMergeOptionsRequest getMergeOptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMergeOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMergeOptionsRequest> request = null;
        Response<GetMergeOptionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMergeOptionsRequestMarshaller().marshall(getMergeOptionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMergeOptionsResult, JsonUnmarshallerContext> unmarshaller = new GetMergeOptionsResultJsonUnmarshaller();
            JsonResponseHandler<GetMergeOptionsResult> responseHandler = new JsonResponseHandler<GetMergeOptionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about a pull request in a specified repository.
     * </p>
     * 
     * @param getPullRequestRequest
     * @return getPullRequestResult The response from the GetPullRequest service
     *         method, as returned by AWS CodeCommit.
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetPullRequestResult getPullRequest(GetPullRequestRequest getPullRequestRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPullRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPullRequestRequest> request = null;
        Response<GetPullRequestResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPullRequestRequestMarshaller().marshall(getPullRequestRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPullRequestResult, JsonUnmarshallerContext> unmarshaller = new GetPullRequestResultJsonUnmarshaller();
            JsonResponseHandler<GetPullRequestResult> responseHandler = new JsonResponseHandler<GetPullRequestResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the approval states for a specified pull request.
     * Approval states only apply to pull requests that have one or more
     * approval rules applied to them.
     * </p>
     * 
     * @param getPullRequestApprovalStatesRequest
     * @return getPullRequestApprovalStatesResult The response from the
     *         GetPullRequestApprovalStates service method, as returned by AWS
     *         CodeCommit.
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws InvalidRevisionIdException
     * @throws RevisionIdRequiredException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetPullRequestApprovalStatesResult getPullRequestApprovalStates(
            GetPullRequestApprovalStatesRequest getPullRequestApprovalStatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPullRequestApprovalStatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPullRequestApprovalStatesRequest> request = null;
        Response<GetPullRequestApprovalStatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPullRequestApprovalStatesRequestMarshaller()
                        .marshall(getPullRequestApprovalStatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPullRequestApprovalStatesResult, JsonUnmarshallerContext> unmarshaller = new GetPullRequestApprovalStatesResultJsonUnmarshaller();
            JsonResponseHandler<GetPullRequestApprovalStatesResult> responseHandler = new JsonResponseHandler<GetPullRequestApprovalStatesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about whether approval rules have been set aside
     * (overridden) for a pull request, and if so, the Amazon Resource Name
     * (ARN) of the user or identity that overrode the rules and their
     * requirements for the pull request.
     * </p>
     * 
     * @param getPullRequestOverrideStateRequest
     * @return getPullRequestOverrideStateResult The response from the
     *         GetPullRequestOverrideState service method, as returned by AWS
     *         CodeCommit.
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws InvalidRevisionIdException
     * @throws RevisionIdRequiredException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetPullRequestOverrideStateResult getPullRequestOverrideState(
            GetPullRequestOverrideStateRequest getPullRequestOverrideStateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPullRequestOverrideStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPullRequestOverrideStateRequest> request = null;
        Response<GetPullRequestOverrideStateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPullRequestOverrideStateRequestMarshaller()
                        .marshall(getPullRequestOverrideStateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPullRequestOverrideStateResult, JsonUnmarshallerContext> unmarshaller = new GetPullRequestOverrideStateResultJsonUnmarshaller();
            JsonResponseHandler<GetPullRequestOverrideStateResult> responseHandler = new JsonResponseHandler<GetPullRequestOverrideStateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and
     * all valid Unicode characters. Applications that do not HTML-encode the
     * description and display it in a webpage can expose users to potentially
     * malicious code. Make sure that you HTML-encode the description field in
     * any application that uses this API to display the repository description
     * on a webpage.
     * </p>
     * </note>
     * 
     * @param getRepositoryRequest <p>
     *            Represents the input of a get repository operation.
     *            </p>
     * @return getRepositoryResult The response from the GetRepository service
     *         method, as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidRepositoryNameException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRepositoryResult getRepository(GetRepositoryRequest getRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryRequest> request = null;
        Response<GetRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryRequestMarshaller().marshall(getRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRepositoryResult, JsonUnmarshallerContext> unmarshaller = new GetRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<GetRepositoryResult> responseHandler = new JsonResponseHandler<GetRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about triggers configured for a repository.
     * </p>
     * 
     * @param getRepositoryTriggersRequest <p>
     *            Represents the input of a get repository triggers operation.
     *            </p>
     * @return getRepositoryTriggersResult The response from the
     *         GetRepositoryTriggers service method, as returned by AWS
     *         CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRepositoryTriggersResult getRepositoryTriggers(
            GetRepositoryTriggersRequest getRepositoryTriggersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRepositoryTriggersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryTriggersRequest> request = null;
        Response<GetRepositoryTriggersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryTriggersRequestMarshaller()
                        .marshall(getRepositoryTriggersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRepositoryTriggersResult, JsonUnmarshallerContext> unmarshaller = new GetRepositoryTriggersResultJsonUnmarshaller();
            JsonResponseHandler<GetRepositoryTriggersResult> responseHandler = new JsonResponseHandler<GetRepositoryTriggersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all approval rule templates in the specified AWS Region in your AWS
     * account. If an AWS Region is not specified, the AWS Region where you are
     * signed in is used.
     * </p>
     * 
     * @param listApprovalRuleTemplatesRequest
     * @return listApprovalRuleTemplatesResult The response from the
     *         ListApprovalRuleTemplates service method, as returned by AWS
     *         CodeCommit.
     * @throws InvalidMaxResultsException
     * @throws InvalidContinuationTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListApprovalRuleTemplatesResult listApprovalRuleTemplates(
            ListApprovalRuleTemplatesRequest listApprovalRuleTemplatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listApprovalRuleTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApprovalRuleTemplatesRequest> request = null;
        Response<ListApprovalRuleTemplatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApprovalRuleTemplatesRequestMarshaller()
                        .marshall(listApprovalRuleTemplatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListApprovalRuleTemplatesResult, JsonUnmarshallerContext> unmarshaller = new ListApprovalRuleTemplatesResultJsonUnmarshaller();
            JsonResponseHandler<ListApprovalRuleTemplatesResult> responseHandler = new JsonResponseHandler<ListApprovalRuleTemplatesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all approval rule templates that are associated with a specified
     * repository.
     * </p>
     * 
     * @param listAssociatedApprovalRuleTemplatesForRepositoryRequest
     * @return listAssociatedApprovalRuleTemplatesForRepositoryResult The
     *         response from the
     *         ListAssociatedApprovalRuleTemplatesForRepository service method,
     *         as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidMaxResultsException
     * @throws InvalidContinuationTokenException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListAssociatedApprovalRuleTemplatesForRepositoryResult listAssociatedApprovalRuleTemplatesForRepository(
            ListAssociatedApprovalRuleTemplatesForRepositoryRequest listAssociatedApprovalRuleTemplatesForRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAssociatedApprovalRuleTemplatesForRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociatedApprovalRuleTemplatesForRepositoryRequest> request = null;
        Response<ListAssociatedApprovalRuleTemplatesForRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociatedApprovalRuleTemplatesForRepositoryRequestMarshaller()
                        .marshall(listAssociatedApprovalRuleTemplatesForRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAssociatedApprovalRuleTemplatesForRepositoryResult, JsonUnmarshallerContext> unmarshaller = new ListAssociatedApprovalRuleTemplatesForRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<ListAssociatedApprovalRuleTemplatesForRepositoryResult> responseHandler = new JsonResponseHandler<ListAssociatedApprovalRuleTemplatesForRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about one or more branches in a repository.
     * </p>
     * 
     * @param listBranchesRequest <p>
     *            Represents the input of a list branches operation.
     *            </p>
     * @return listBranchesResult The response from the ListBranches service
     *         method, as returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidRepositoryNameException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws InvalidContinuationTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListBranchesResult listBranches(ListBranchesRequest listBranchesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBranchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBranchesRequest> request = null;
        Response<ListBranchesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBranchesRequestMarshaller().marshall(listBranchesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBranchesResult, JsonUnmarshallerContext> unmarshaller = new ListBranchesResultJsonUnmarshaller();
            JsonResponseHandler<ListBranchesResult> responseHandler = new JsonResponseHandler<ListBranchesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of pull requests for a specified repository. The return
     * list can be refined by pull request status or pull request author ARN.
     * </p>
     * 
     * @param listPullRequestsRequest
     * @return listPullRequestsResult The response from the ListPullRequests
     *         service method, as returned by AWS CodeCommit.
     * @throws InvalidPullRequestStatusException
     * @throws InvalidAuthorArnException
     * @throws AuthorDoesNotExistException
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidMaxResultsException
     * @throws InvalidContinuationTokenException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListPullRequestsResult listPullRequests(ListPullRequestsRequest listPullRequestsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPullRequestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPullRequestsRequest> request = null;
        Response<ListPullRequestsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPullRequestsRequestMarshaller().marshall(listPullRequestsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPullRequestsResult, JsonUnmarshallerContext> unmarshaller = new ListPullRequestsResultJsonUnmarshaller();
            JsonResponseHandler<ListPullRequestsResult> responseHandler = new JsonResponseHandler<ListPullRequestsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about one or more repositories.
     * </p>
     * 
     * @param listRepositoriesRequest <p>
     *            Represents the input of a list repositories operation.
     *            </p>
     * @return listRepositoriesResult The response from the ListRepositories
     *         service method, as returned by AWS CodeCommit.
     * @throws InvalidSortByException
     * @throws InvalidOrderException
     * @throws InvalidContinuationTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRepositoriesResult listRepositories(ListRepositoriesRequest listRepositoriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRepositoriesRequest> request = null;
        Response<ListRepositoriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRepositoriesRequestMarshaller().marshall(listRepositoriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRepositoriesResult, JsonUnmarshallerContext> unmarshaller = new ListRepositoriesResultJsonUnmarshaller();
            JsonResponseHandler<ListRepositoriesResult> responseHandler = new JsonResponseHandler<ListRepositoriesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all repositories associated with the specified approval rule
     * template.
     * </p>
     * 
     * @param listRepositoriesForApprovalRuleTemplateRequest
     * @return listRepositoriesForApprovalRuleTemplateResult The response from
     *         the ListRepositoriesForApprovalRuleTemplate service method, as
     *         returned by AWS CodeCommit.
     * @throws ApprovalRuleTemplateNameRequiredException
     * @throws InvalidApprovalRuleTemplateNameException
     * @throws ApprovalRuleTemplateDoesNotExistException
     * @throws InvalidMaxResultsException
     * @throws InvalidContinuationTokenException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRepositoriesForApprovalRuleTemplateResult listRepositoriesForApprovalRuleTemplate(
            ListRepositoriesForApprovalRuleTemplateRequest listRepositoriesForApprovalRuleTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRepositoriesForApprovalRuleTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRepositoriesForApprovalRuleTemplateRequest> request = null;
        Response<ListRepositoriesForApprovalRuleTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRepositoriesForApprovalRuleTemplateRequestMarshaller()
                        .marshall(listRepositoriesForApprovalRuleTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRepositoriesForApprovalRuleTemplateResult, JsonUnmarshallerContext> unmarshaller = new ListRepositoriesForApprovalRuleTemplateResultJsonUnmarshaller();
            JsonResponseHandler<ListRepositoriesForApprovalRuleTemplateResult> responseHandler = new JsonResponseHandler<ListRepositoriesForApprovalRuleTemplateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about AWS tags for a specified Amazon Resource Name
     * (ARN) in AWS CodeCommit. For a list of valid resources in AWS CodeCommit,
     * see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the<i> AWS CodeCommit User
     * Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS
     *         CodeCommit.
     * @throws RepositoryDoesNotExistException
     * @throws InvalidRepositoryNameException
     * @throws ResourceArnRequiredException
     * @throws InvalidResourceArnException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller()
                        .marshall(listTagsForResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTagsForResourceResult, JsonUnmarshallerContext> unmarshaller = new ListTagsForResourceResultJsonUnmarshaller();
            JsonResponseHandler<ListTagsForResourceResult> responseHandler = new JsonResponseHandler<ListTagsForResourceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Merges two branches using the fast-forward merge strategy.
     * </p>
     * 
     * @param mergeBranchesByFastForwardRequest
     * @return mergeBranchesByFastForwardResult The response from the
     *         MergeBranchesByFastForward service method, as returned by AWS
     *         CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws TipsDivergenceExceededException
     * @throws CommitRequiredException
     * @throws InvalidCommitException
     * @throws CommitDoesNotExistException
     * @throws InvalidTargetBranchException
     * @throws InvalidBranchNameException
     * @throws BranchNameRequiredException
     * @throws BranchNameIsTagNameException
     * @throws BranchDoesNotExistException
     * @throws ManualMergeRequiredException
     * @throws ConcurrentReferenceUpdateException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public MergeBranchesByFastForwardResult mergeBranchesByFastForward(
            MergeBranchesByFastForwardRequest mergeBranchesByFastForwardRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(mergeBranchesByFastForwardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergeBranchesByFastForwardRequest> request = null;
        Response<MergeBranchesByFastForwardResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergeBranchesByFastForwardRequestMarshaller()
                        .marshall(mergeBranchesByFastForwardRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<MergeBranchesByFastForwardResult, JsonUnmarshallerContext> unmarshaller = new MergeBranchesByFastForwardResultJsonUnmarshaller();
            JsonResponseHandler<MergeBranchesByFastForwardResult> responseHandler = new JsonResponseHandler<MergeBranchesByFastForwardResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Merges two branches using the squash merge strategy.
     * </p>
     * 
     * @param mergeBranchesBySquashRequest
     * @return mergeBranchesBySquashResult The response from the
     *         MergeBranchesBySquash service method, as returned by AWS
     *         CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws TipsDivergenceExceededException
     * @throws CommitRequiredException
     * @throws InvalidCommitException
     * @throws CommitDoesNotExistException
     * @throws InvalidTargetBranchException
     * @throws InvalidBranchNameException
     * @throws BranchNameRequiredException
     * @throws BranchNameIsTagNameException
     * @throws BranchDoesNotExistException
     * @throws ManualMergeRequiredException
     * @throws InvalidConflictDetailLevelException
     * @throws InvalidConflictResolutionStrategyException
     * @throws InvalidConflictResolutionException
     * @throws MaximumConflictResolutionEntriesExceededException
     * @throws MultipleConflictResolutionEntriesException
     * @throws ReplacementTypeRequiredException
     * @throws InvalidReplacementTypeException
     * @throws ReplacementContentRequiredException
     * @throws InvalidReplacementContentException
     * @throws PathRequiredException
     * @throws InvalidPathException
     * @throws FileContentSizeLimitExceededException
     * @throws FolderContentSizeLimitExceededException
     * @throws MaximumFileContentToLoadExceededException
     * @throws MaximumItemsToCompareExceededException
     * @throws FileModeRequiredException
     * @throws InvalidFileModeException
     * @throws NameLengthExceededException
     * @throws InvalidEmailException
     * @throws CommitMessageLengthExceededException
     * @throws ConcurrentReferenceUpdateException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public MergeBranchesBySquashResult mergeBranchesBySquash(
            MergeBranchesBySquashRequest mergeBranchesBySquashRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(mergeBranchesBySquashRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergeBranchesBySquashRequest> request = null;
        Response<MergeBranchesBySquashResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergeBranchesBySquashRequestMarshaller()
                        .marshall(mergeBranchesBySquashRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<MergeBranchesBySquashResult, JsonUnmarshallerContext> unmarshaller = new MergeBranchesBySquashResultJsonUnmarshaller();
            JsonResponseHandler<MergeBranchesBySquashResult> responseHandler = new JsonResponseHandler<MergeBranchesBySquashResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Merges two specified branches using the three-way merge strategy.
     * </p>
     * 
     * @param mergeBranchesByThreeWayRequest
     * @return mergeBranchesByThreeWayResult The response from the
     *         MergeBranchesByThreeWay service method, as returned by AWS
     *         CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws TipsDivergenceExceededException
     * @throws CommitRequiredException
     * @throws InvalidCommitException
     * @throws CommitDoesNotExistException
     * @throws InvalidTargetBranchException
     * @throws InvalidBranchNameException
     * @throws BranchNameRequiredException
     * @throws BranchNameIsTagNameException
     * @throws BranchDoesNotExistException
     * @throws ManualMergeRequiredException
     * @throws ConcurrentReferenceUpdateException
     * @throws InvalidConflictDetailLevelException
     * @throws InvalidConflictResolutionStrategyException
     * @throws InvalidConflictResolutionException
     * @throws MaximumConflictResolutionEntriesExceededException
     * @throws MultipleConflictResolutionEntriesException
     * @throws ReplacementTypeRequiredException
     * @throws InvalidReplacementTypeException
     * @throws ReplacementContentRequiredException
     * @throws InvalidReplacementContentException
     * @throws PathRequiredException
     * @throws InvalidPathException
     * @throws FileContentSizeLimitExceededException
     * @throws FolderContentSizeLimitExceededException
     * @throws MaximumFileContentToLoadExceededException
     * @throws MaximumItemsToCompareExceededException
     * @throws FileModeRequiredException
     * @throws InvalidFileModeException
     * @throws NameLengthExceededException
     * @throws InvalidEmailException
     * @throws CommitMessageLengthExceededException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public MergeBranchesByThreeWayResult mergeBranchesByThreeWay(
            MergeBranchesByThreeWayRequest mergeBranchesByThreeWayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(mergeBranchesByThreeWayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergeBranchesByThreeWayRequest> request = null;
        Response<MergeBranchesByThreeWayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergeBranchesByThreeWayRequestMarshaller()
                        .marshall(mergeBranchesByThreeWayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<MergeBranchesByThreeWayResult, JsonUnmarshallerContext> unmarshaller = new MergeBranchesByThreeWayResultJsonUnmarshaller();
            JsonResponseHandler<MergeBranchesByThreeWayResult> responseHandler = new JsonResponseHandler<MergeBranchesByThreeWayResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attempts to merge the source commit of a pull request into the specified
     * destination branch for that pull request at the specified commit using
     * the fast-forward merge strategy. If the merge is successful, it closes
     * the pull request.
     * </p>
     * 
     * @param mergePullRequestByFastForwardRequest
     * @return mergePullRequestByFastForwardResult The response from the
     *         MergePullRequestByFastForward service method, as returned by AWS
     *         CodeCommit.
     * @throws ManualMergeRequiredException
     * @throws PullRequestAlreadyClosedException
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws TipOfSourceReferenceIsDifferentException
     * @throws ReferenceDoesNotExistException
     * @throws InvalidCommitIdException
     * @throws RepositoryNotAssociatedWithPullRequestException
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws ConcurrentReferenceUpdateException
     * @throws PullRequestApprovalRulesNotSatisfiedException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public MergePullRequestByFastForwardResult mergePullRequestByFastForward(
            MergePullRequestByFastForwardRequest mergePullRequestByFastForwardRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(mergePullRequestByFastForwardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergePullRequestByFastForwardRequest> request = null;
        Response<MergePullRequestByFastForwardResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergePullRequestByFastForwardRequestMarshaller()
                        .marshall(mergePullRequestByFastForwardRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<MergePullRequestByFastForwardResult, JsonUnmarshallerContext> unmarshaller = new MergePullRequestByFastForwardResultJsonUnmarshaller();
            JsonResponseHandler<MergePullRequestByFastForwardResult> responseHandler = new JsonResponseHandler<MergePullRequestByFastForwardResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attempts to merge the source commit of a pull request into the specified
     * destination branch for that pull request at the specified commit using
     * the squash merge strategy. If the merge is successful, it closes the pull
     * request.
     * </p>
     * 
     * @param mergePullRequestBySquashRequest
     * @return mergePullRequestBySquashResult The response from the
     *         MergePullRequestBySquash service method, as returned by AWS
     *         CodeCommit.
     * @throws PullRequestAlreadyClosedException
     * @throws PullRequestDoesNotExistException
     * @throws PullRequestIdRequiredException
     * @throws InvalidPullRequestIdException
     * @throws InvalidCommitIdException
     * @throws ManualMergeRequiredException
     * @throws TipOfSourceReferenceIsDifferentException
     * @throws TipsDivergenceExceededException
     * @throws NameLengthExceededException
     * @throws InvalidEmailException
     * @throws CommitMessageLengthExceededException
     * @throws InvalidConflictDetailLevelException
     * @throws InvalidConflictResolutionStrategyException
     * @throws InvalidConflictResolutionException
     * @throws ReplacementTypeRequiredException
     * @throws InvalidReplacementTypeException
     * @throws MultipleConflictResolutionEntriesException
     * @throws ReplacementContentRequiredException
     * @throws MaximumConflictResolutionEntriesExceededException
     * @throws ConcurrentReferenceUpdateException
     * @throws PathRequiredException
     * @throws InvalidPathException
     * @throws InvalidFileModeException
     * @throws InvalidReplacementContentException
     * @throws FileContentSizeLimitExceededException
     * @throws FolderContentSizeLimitExceededException
     * @throws MaximumFileContentToLoadExceededException
     * @throws MaximumItemsToCompareExceededException
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws RepositoryNotAssociatedWithPullRequestException
     * @throws PullRequestApprovalRulesNotSatisfiedException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public MergePullRequestBySquashResult mergePullRequestBySquash(
            MergePullRequestBySquashRequest mergePullRequestBySquashRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(mergePullRequestBySquashRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergePullRequestBySquashRequest> request = null;
        Response<MergePullRequestBySquashResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergePullRequestBySquashRequestMarshaller()
                        .marshall(mergePullRequestBySquashRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<MergePullRequestBySquashResult, JsonUnmarshallerContext> unmarshaller = new MergePullRequestBySquashResultJsonUnmarshaller();
            JsonResponseHandler<MergePullRequestBySquashResult> responseHandler = new JsonResponseHandler<MergePullRequestBySquashResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attempts to merge the source commit of a pull request into the specified
     * destination branch for that pull request at the specified commit using
     * the three-way merge strategy. If the merge is successful, it closes the
     * pull request.
     * </p>
     * 
     * @param mergePullRequestByThreeWayRequest
     * @return mergePullRequestByThreeWayResult The response from the
     *         MergePullRequestByThreeWay service method, as returned by AWS
     *         CodeCommit.
     * @throws PullRequestAlreadyClosedException
     * @throws PullRequestDoesNotExistException
     * @throws PullRequestIdRequiredException
     * @throws InvalidPullRequestIdException
     * @throws InvalidCommitIdException
     * @throws ManualMergeRequiredException
     * @throws TipOfSourceReferenceIsDifferentException
     * @throws TipsDivergenceExceededException
     * @throws NameLengthExceededException
     * @throws InvalidEmailException
     * @throws CommitMessageLengthExceededException
     * @throws InvalidConflictDetailLevelException
     * @throws InvalidConflictResolutionStrategyException
     * @throws InvalidConflictResolutionException
     * @throws ReplacementTypeRequiredException
     * @throws InvalidReplacementTypeException
     * @throws MultipleConflictResolutionEntriesException
     * @throws ReplacementContentRequiredException
     * @throws MaximumConflictResolutionEntriesExceededException
     * @throws PathRequiredException
     * @throws InvalidPathException
     * @throws InvalidFileModeException
     * @throws InvalidReplacementContentException
     * @throws FileContentSizeLimitExceededException
     * @throws FolderContentSizeLimitExceededException
     * @throws MaximumFileContentToLoadExceededException
     * @throws MaximumItemsToCompareExceededException
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws RepositoryNotAssociatedWithPullRequestException
     * @throws ConcurrentReferenceUpdateException
     * @throws PullRequestApprovalRulesNotSatisfiedException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public MergePullRequestByThreeWayResult mergePullRequestByThreeWay(
            MergePullRequestByThreeWayRequest mergePullRequestByThreeWayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(mergePullRequestByThreeWayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergePullRequestByThreeWayRequest> request = null;
        Response<MergePullRequestByThreeWayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergePullRequestByThreeWayRequestMarshaller()
                        .marshall(mergePullRequestByThreeWayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<MergePullRequestByThreeWayResult, JsonUnmarshallerContext> unmarshaller = new MergePullRequestByThreeWayResultJsonUnmarshaller();
            JsonResponseHandler<MergePullRequestByThreeWayResult> responseHandler = new JsonResponseHandler<MergePullRequestByThreeWayResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets aside (overrides) all approval rule requirements for a specified
     * pull request.
     * </p>
     * 
     * @param overridePullRequestApprovalRulesRequest
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws InvalidRevisionIdException
     * @throws RevisionIdRequiredException
     * @throws InvalidOverrideStatusException
     * @throws OverrideStatusRequiredException
     * @throws OverrideAlreadySetException
     * @throws RevisionNotCurrentException
     * @throws PullRequestAlreadyClosedException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void overridePullRequestApprovalRules(
            OverridePullRequestApprovalRulesRequest overridePullRequestApprovalRulesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(overridePullRequestApprovalRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<OverridePullRequestApprovalRulesRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new OverridePullRequestApprovalRulesRequestMarshaller()
                        .marshall(overridePullRequestApprovalRulesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Posts a comment on the comparison between two commits.
     * </p>
     * 
     * @param postCommentForComparedCommitRequest
     * @return postCommentForComparedCommitResult The response from the
     *         PostCommentForComparedCommit service method, as returned by AWS
     *         CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidRepositoryNameException
     * @throws ClientRequestTokenRequiredException
     * @throws InvalidClientRequestTokenException
     * @throws IdempotencyParameterMismatchException
     * @throws CommentContentRequiredException
     * @throws CommentContentSizeLimitExceededException
     * @throws InvalidFileLocationException
     * @throws InvalidRelativeFileVersionEnumException
     * @throws PathRequiredException
     * @throws InvalidFilePositionException
     * @throws CommitIdRequiredException
     * @throws InvalidCommitIdException
     * @throws BeforeCommitIdAndAfterCommitIdAreSameException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws CommitDoesNotExistException
     * @throws InvalidPathException
     * @throws PathDoesNotExistException
     * @throws PathRequiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PostCommentForComparedCommitResult postCommentForComparedCommit(
            PostCommentForComparedCommitRequest postCommentForComparedCommitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(postCommentForComparedCommitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PostCommentForComparedCommitRequest> request = null;
        Response<PostCommentForComparedCommitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PostCommentForComparedCommitRequestMarshaller()
                        .marshall(postCommentForComparedCommitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PostCommentForComparedCommitResult, JsonUnmarshallerContext> unmarshaller = new PostCommentForComparedCommitResultJsonUnmarshaller();
            JsonResponseHandler<PostCommentForComparedCommitResult> responseHandler = new JsonResponseHandler<PostCommentForComparedCommitResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Posts a comment on a pull request.
     * </p>
     * 
     * @param postCommentForPullRequestRequest
     * @return postCommentForPullRequestResult The response from the
     *         PostCommentForPullRequest service method, as returned by AWS
     *         CodeCommit.
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws RepositoryNotAssociatedWithPullRequestException
     * @throws RepositoryNameRequiredException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidRepositoryNameException
     * @throws ClientRequestTokenRequiredException
     * @throws InvalidClientRequestTokenException
     * @throws IdempotencyParameterMismatchException
     * @throws CommentContentRequiredException
     * @throws CommentContentSizeLimitExceededException
     * @throws InvalidFileLocationException
     * @throws InvalidRelativeFileVersionEnumException
     * @throws PathRequiredException
     * @throws InvalidFilePositionException
     * @throws CommitIdRequiredException
     * @throws InvalidCommitIdException
     * @throws BeforeCommitIdAndAfterCommitIdAreSameException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws CommitDoesNotExistException
     * @throws InvalidPathException
     * @throws PathDoesNotExistException
     * @throws PathRequiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PostCommentForPullRequestResult postCommentForPullRequest(
            PostCommentForPullRequestRequest postCommentForPullRequestRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(postCommentForPullRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PostCommentForPullRequestRequest> request = null;
        Response<PostCommentForPullRequestResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PostCommentForPullRequestRequestMarshaller()
                        .marshall(postCommentForPullRequestRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PostCommentForPullRequestResult, JsonUnmarshallerContext> unmarshaller = new PostCommentForPullRequestResultJsonUnmarshaller();
            JsonResponseHandler<PostCommentForPullRequestResult> responseHandler = new JsonResponseHandler<PostCommentForPullRequestResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Posts a comment in reply to an existing comment on a comparison between
     * commits or a pull request.
     * </p>
     * 
     * @param postCommentReplyRequest
     * @return postCommentReplyResult The response from the PostCommentReply
     *         service method, as returned by AWS CodeCommit.
     * @throws ClientRequestTokenRequiredException
     * @throws InvalidClientRequestTokenException
     * @throws IdempotencyParameterMismatchException
     * @throws CommentContentRequiredException
     * @throws CommentContentSizeLimitExceededException
     * @throws CommentDoesNotExistException
     * @throws CommentIdRequiredException
     * @throws InvalidCommentIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PostCommentReplyResult postCommentReply(PostCommentReplyRequest postCommentReplyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(postCommentReplyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PostCommentReplyRequest> request = null;
        Response<PostCommentReplyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PostCommentReplyRequestMarshaller().marshall(postCommentReplyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PostCommentReplyResult, JsonUnmarshallerContext> unmarshaller = new PostCommentReplyResultJsonUnmarshaller();
            JsonResponseHandler<PostCommentReplyResult> responseHandler = new JsonResponseHandler<PostCommentReplyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds or updates a reaction to a specified comment for the user whose
     * identity is used to make the request. You can only add or update a
     * reaction for yourself. You cannot add, modify, or delete a reaction for
     * another user.
     * </p>
     * 
     * @param putCommentReactionRequest
     * @throws CommentDoesNotExistException
     * @throws CommentIdRequiredException
     * @throws InvalidCommentIdException
     * @throws InvalidReactionValueException
     * @throws ReactionValueRequiredException
     * @throws ReactionLimitExceededException
     * @throws CommentDeletedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void putCommentReaction(PutCommentReactionRequest putCommentReactionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putCommentReactionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutCommentReactionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutCommentReactionRequestMarshaller()
                        .marshall(putCommentReactionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds or updates a file in a branch in an AWS CodeCommit repository, and
     * generates a commit for the addition in the specified branch.
     * </p>
     * 
     * @param putFileRequest
     * @return putFileResult The response from the PutFile service method, as
     *         returned by AWS CodeCommit.
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryDoesNotExistException
     * @throws ParentCommitIdRequiredException
     * @throws InvalidParentCommitIdException
     * @throws ParentCommitDoesNotExistException
     * @throws ParentCommitIdOutdatedException
     * @throws FileContentRequiredException
     * @throws FileContentSizeLimitExceededException
     * @throws FolderContentSizeLimitExceededException
     * @throws PathRequiredException
     * @throws InvalidPathException
     * @throws BranchNameRequiredException
     * @throws InvalidBranchNameException
     * @throws BranchDoesNotExistException
     * @throws BranchNameIsTagNameException
     * @throws InvalidFileModeException
     * @throws NameLengthExceededException
     * @throws InvalidEmailException
     * @throws CommitMessageLengthExceededException
     * @throws InvalidDeletionParameterException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws SameFileContentException
     * @throws FileNameConflictsWithDirectoryNameException
     * @throws DirectoryNameConflictsWithFileNameException
     * @throws FilePathConflictsWithSubmodulePathException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutFileResult putFile(PutFileRequest putFileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putFileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutFileRequest> request = null;
        Response<PutFileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutFileRequestMarshaller().marshall(putFileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutFileResult, JsonUnmarshallerContext> unmarshaller = new PutFileResultJsonUnmarshaller();
            JsonResponseHandler<PutFileResult> responseHandler = new JsonResponseHandler<PutFileResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Replaces all triggers for a repository. Used to create or delete
     * triggers.
     * </p>
     * 
     * @param putRepositoryTriggersRequest <p>
     *            Represents the input of a put repository triggers operation.
     *            </p>
     * @return putRepositoryTriggersResult The response from the
     *         PutRepositoryTriggers service method, as returned by AWS
     *         CodeCommit.
     * @throws RepositoryDoesNotExistException
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryTriggersListRequiredException
     * @throws MaximumRepositoryTriggersExceededException
     * @throws InvalidRepositoryTriggerNameException
     * @throws InvalidRepositoryTriggerDestinationArnException
     * @throws InvalidRepositoryTriggerRegionException
     * @throws InvalidRepositoryTriggerCustomDataException
     * @throws MaximumBranchesExceededException
     * @throws InvalidRepositoryTriggerBranchNameException
     * @throws InvalidRepositoryTriggerEventsException
     * @throws RepositoryTriggerNameRequiredException
     * @throws RepositoryTriggerDestinationArnRequiredException
     * @throws RepositoryTriggerBranchNameListRequiredException
     * @throws RepositoryTriggerEventsListRequiredException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutRepositoryTriggersResult putRepositoryTriggers(
            PutRepositoryTriggersRequest putRepositoryTriggersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putRepositoryTriggersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRepositoryTriggersRequest> request = null;
        Response<PutRepositoryTriggersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRepositoryTriggersRequestMarshaller()
                        .marshall(putRepositoryTriggersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutRepositoryTriggersResult, JsonUnmarshallerContext> unmarshaller = new PutRepositoryTriggersResultJsonUnmarshaller();
            JsonResponseHandler<PutRepositoryTriggersResult> responseHandler = new JsonResponseHandler<PutRepositoryTriggersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds or updates tags for a resource in AWS CodeCommit. For a list of
     * valid resources in AWS CodeCommit, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the <i>AWS CodeCommit User
     * Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws RepositoryDoesNotExistException
     * @throws InvalidRepositoryNameException
     * @throws ResourceArnRequiredException
     * @throws InvalidResourceArnException
     * @throws TagsMapRequiredException
     * @throws InvalidTagsMapException
     * @throws TooManyTagsException
     * @throws InvalidSystemTagUsageException
     * @throws TagPolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestMarshaller().marshall(tagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Tests the functionality of repository triggers by sending information to
     * the trigger target. If real data is available in the repository, the test
     * sends data from the last commit. If no data is available, sample data is
     * generated.
     * </p>
     * 
     * @param testRepositoryTriggersRequest <p>
     *            Represents the input of a test repository triggers operation.
     *            </p>
     * @return testRepositoryTriggersResult The response from the
     *         TestRepositoryTriggers service method, as returned by AWS
     *         CodeCommit.
     * @throws RepositoryDoesNotExistException
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws RepositoryTriggersListRequiredException
     * @throws MaximumRepositoryTriggersExceededException
     * @throws InvalidRepositoryTriggerNameException
     * @throws InvalidRepositoryTriggerDestinationArnException
     * @throws InvalidRepositoryTriggerRegionException
     * @throws InvalidRepositoryTriggerCustomDataException
     * @throws MaximumBranchesExceededException
     * @throws InvalidRepositoryTriggerBranchNameException
     * @throws InvalidRepositoryTriggerEventsException
     * @throws RepositoryTriggerNameRequiredException
     * @throws RepositoryTriggerDestinationArnRequiredException
     * @throws RepositoryTriggerBranchNameListRequiredException
     * @throws RepositoryTriggerEventsListRequiredException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public TestRepositoryTriggersResult testRepositoryTriggers(
            TestRepositoryTriggersRequest testRepositoryTriggersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(testRepositoryTriggersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestRepositoryTriggersRequest> request = null;
        Response<TestRepositoryTriggersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestRepositoryTriggersRequestMarshaller()
                        .marshall(testRepositoryTriggersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TestRepositoryTriggersResult, JsonUnmarshallerContext> unmarshaller = new TestRepositoryTriggersResultJsonUnmarshaller();
            JsonResponseHandler<TestRepositoryTriggersResult> responseHandler = new JsonResponseHandler<TestRepositoryTriggersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes tags for a resource in AWS CodeCommit. For a list of valid
     * resources in AWS CodeCommit, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the <i>AWS CodeCommit User
     * Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws RepositoryDoesNotExistException
     * @throws InvalidRepositoryNameException
     * @throws ResourceArnRequiredException
     * @throws InvalidResourceArnException
     * @throws TagKeysListRequiredException
     * @throws InvalidTagKeysListException
     * @throws TooManyTagsException
     * @throws InvalidSystemTagUsageException
     * @throws TagPolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestMarshaller().marshall(untagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the content of an approval rule template. You can change the
     * number of required approvals, the membership of the approval rule, and
     * whether an approval pool is defined.
     * </p>
     * 
     * @param updateApprovalRuleTemplateContentRequest
     * @return updateApprovalRuleTemplateContentResult The response from the
     *         UpdateApprovalRuleTemplateContent service method, as returned by
     *         AWS CodeCommit.
     * @throws InvalidApprovalRuleTemplateNameException
     * @throws ApprovalRuleTemplateNameRequiredException
     * @throws ApprovalRuleTemplateDoesNotExistException
     * @throws InvalidApprovalRuleTemplateContentException
     * @throws InvalidRuleContentSha256Exception
     * @throws ApprovalRuleTemplateContentRequiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateApprovalRuleTemplateContentResult updateApprovalRuleTemplateContent(
            UpdateApprovalRuleTemplateContentRequest updateApprovalRuleTemplateContentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApprovalRuleTemplateContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApprovalRuleTemplateContentRequest> request = null;
        Response<UpdateApprovalRuleTemplateContentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApprovalRuleTemplateContentRequestMarshaller()
                        .marshall(updateApprovalRuleTemplateContentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateApprovalRuleTemplateContentResult, JsonUnmarshallerContext> unmarshaller = new UpdateApprovalRuleTemplateContentResultJsonUnmarshaller();
            JsonResponseHandler<UpdateApprovalRuleTemplateContentResult> responseHandler = new JsonResponseHandler<UpdateApprovalRuleTemplateContentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the description for a specified approval rule template.
     * </p>
     * 
     * @param updateApprovalRuleTemplateDescriptionRequest
     * @return updateApprovalRuleTemplateDescriptionResult The response from the
     *         UpdateApprovalRuleTemplateDescription service method, as returned
     *         by AWS CodeCommit.
     * @throws InvalidApprovalRuleTemplateNameException
     * @throws ApprovalRuleTemplateNameRequiredException
     * @throws ApprovalRuleTemplateDoesNotExistException
     * @throws InvalidApprovalRuleTemplateDescriptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateApprovalRuleTemplateDescriptionResult updateApprovalRuleTemplateDescription(
            UpdateApprovalRuleTemplateDescriptionRequest updateApprovalRuleTemplateDescriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApprovalRuleTemplateDescriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApprovalRuleTemplateDescriptionRequest> request = null;
        Response<UpdateApprovalRuleTemplateDescriptionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApprovalRuleTemplateDescriptionRequestMarshaller()
                        .marshall(updateApprovalRuleTemplateDescriptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateApprovalRuleTemplateDescriptionResult, JsonUnmarshallerContext> unmarshaller = new UpdateApprovalRuleTemplateDescriptionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateApprovalRuleTemplateDescriptionResult> responseHandler = new JsonResponseHandler<UpdateApprovalRuleTemplateDescriptionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the name of a specified approval rule template.
     * </p>
     * 
     * @param updateApprovalRuleTemplateNameRequest
     * @return updateApprovalRuleTemplateNameResult The response from the
     *         UpdateApprovalRuleTemplateName service method, as returned by AWS
     *         CodeCommit.
     * @throws InvalidApprovalRuleTemplateNameException
     * @throws ApprovalRuleTemplateNameRequiredException
     * @throws ApprovalRuleTemplateDoesNotExistException
     * @throws ApprovalRuleTemplateNameAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateApprovalRuleTemplateNameResult updateApprovalRuleTemplateName(
            UpdateApprovalRuleTemplateNameRequest updateApprovalRuleTemplateNameRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApprovalRuleTemplateNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApprovalRuleTemplateNameRequest> request = null;
        Response<UpdateApprovalRuleTemplateNameResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApprovalRuleTemplateNameRequestMarshaller()
                        .marshall(updateApprovalRuleTemplateNameRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateApprovalRuleTemplateNameResult, JsonUnmarshallerContext> unmarshaller = new UpdateApprovalRuleTemplateNameResultJsonUnmarshaller();
            JsonResponseHandler<UpdateApprovalRuleTemplateNameResult> responseHandler = new JsonResponseHandler<UpdateApprovalRuleTemplateNameResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Replaces the contents of a comment.
     * </p>
     * 
     * @param updateCommentRequest
     * @return updateCommentResult The response from the UpdateComment service
     *         method, as returned by AWS CodeCommit.
     * @throws CommentContentRequiredException
     * @throws CommentContentSizeLimitExceededException
     * @throws CommentDoesNotExistException
     * @throws CommentIdRequiredException
     * @throws InvalidCommentIdException
     * @throws CommentNotCreatedByCallerException
     * @throws CommentDeletedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateCommentResult updateComment(UpdateCommentRequest updateCommentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateCommentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCommentRequest> request = null;
        Response<UpdateCommentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCommentRequestMarshaller().marshall(updateCommentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateCommentResult, JsonUnmarshallerContext> unmarshaller = new UpdateCommentResultJsonUnmarshaller();
            JsonResponseHandler<UpdateCommentResult> responseHandler = new JsonResponseHandler<UpdateCommentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets or changes the default branch name for the specified repository.
     * </p>
     * <note>
     * <p>
     * If you use this operation to change the default branch name to the
     * current default branch name, a success message is returned even though
     * the default branch did not change.
     * </p>
     * </note>
     * 
     * @param updateDefaultBranchRequest <p>
     *            Represents the input of an update default branch operation.
     *            </p>
     * @throws RepositoryNameRequiredException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidRepositoryNameException
     * @throws BranchNameRequiredException
     * @throws InvalidBranchNameException
     * @throws BranchDoesNotExistException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateDefaultBranch(UpdateDefaultBranchRequest updateDefaultBranchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDefaultBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDefaultBranchRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDefaultBranchRequestMarshaller()
                        .marshall(updateDefaultBranchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the structure of an approval rule created specifically for a pull
     * request. For example, you can change the number of required approvers and
     * the approval pool for approvers.
     * </p>
     * 
     * @param updatePullRequestApprovalRuleContentRequest
     * @return updatePullRequestApprovalRuleContentResult The response from the
     *         UpdatePullRequestApprovalRuleContent service method, as returned
     *         by AWS CodeCommit.
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws PullRequestAlreadyClosedException
     * @throws ApprovalRuleNameRequiredException
     * @throws InvalidApprovalRuleNameException
     * @throws ApprovalRuleDoesNotExistException
     * @throws InvalidRuleContentSha256Exception
     * @throws ApprovalRuleContentRequiredException
     * @throws InvalidApprovalRuleContentException
     * @throws CannotModifyApprovalRuleFromTemplateException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdatePullRequestApprovalRuleContentResult updatePullRequestApprovalRuleContent(
            UpdatePullRequestApprovalRuleContentRequest updatePullRequestApprovalRuleContentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePullRequestApprovalRuleContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePullRequestApprovalRuleContentRequest> request = null;
        Response<UpdatePullRequestApprovalRuleContentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePullRequestApprovalRuleContentRequestMarshaller()
                        .marshall(updatePullRequestApprovalRuleContentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdatePullRequestApprovalRuleContentResult, JsonUnmarshallerContext> unmarshaller = new UpdatePullRequestApprovalRuleContentResultJsonUnmarshaller();
            JsonResponseHandler<UpdatePullRequestApprovalRuleContentResult> responseHandler = new JsonResponseHandler<UpdatePullRequestApprovalRuleContentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the state of a user's approval on a pull request. The user is
     * derived from the signed-in account when the request is made.
     * </p>
     * 
     * @param updatePullRequestApprovalStateRequest
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws InvalidRevisionIdException
     * @throws RevisionIdRequiredException
     * @throws InvalidApprovalStateException
     * @throws ApprovalStateRequiredException
     * @throws PullRequestCannotBeApprovedByAuthorException
     * @throws RevisionNotCurrentException
     * @throws PullRequestAlreadyClosedException
     * @throws MaximumNumberOfApprovalsExceededException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updatePullRequestApprovalState(
            UpdatePullRequestApprovalStateRequest updatePullRequestApprovalStateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePullRequestApprovalStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePullRequestApprovalStateRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePullRequestApprovalStateRequestMarshaller()
                        .marshall(updatePullRequestApprovalStateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Replaces the contents of the description of a pull request.
     * </p>
     * 
     * @param updatePullRequestDescriptionRequest
     * @return updatePullRequestDescriptionResult The response from the
     *         UpdatePullRequestDescription service method, as returned by AWS
     *         CodeCommit.
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws InvalidDescriptionException
     * @throws PullRequestAlreadyClosedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdatePullRequestDescriptionResult updatePullRequestDescription(
            UpdatePullRequestDescriptionRequest updatePullRequestDescriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePullRequestDescriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePullRequestDescriptionRequest> request = null;
        Response<UpdatePullRequestDescriptionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePullRequestDescriptionRequestMarshaller()
                        .marshall(updatePullRequestDescriptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdatePullRequestDescriptionResult, JsonUnmarshallerContext> unmarshaller = new UpdatePullRequestDescriptionResultJsonUnmarshaller();
            JsonResponseHandler<UpdatePullRequestDescriptionResult> responseHandler = new JsonResponseHandler<UpdatePullRequestDescriptionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the status of a pull request.
     * </p>
     * 
     * @param updatePullRequestStatusRequest
     * @return updatePullRequestStatusResult The response from the
     *         UpdatePullRequestStatus service method, as returned by AWS
     *         CodeCommit.
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws InvalidPullRequestStatusUpdateException
     * @throws InvalidPullRequestStatusException
     * @throws PullRequestStatusRequiredException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdatePullRequestStatusResult updatePullRequestStatus(
            UpdatePullRequestStatusRequest updatePullRequestStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePullRequestStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePullRequestStatusRequest> request = null;
        Response<UpdatePullRequestStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePullRequestStatusRequestMarshaller()
                        .marshall(updatePullRequestStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdatePullRequestStatusResult, JsonUnmarshallerContext> unmarshaller = new UpdatePullRequestStatusResultJsonUnmarshaller();
            JsonResponseHandler<UpdatePullRequestStatusResult> responseHandler = new JsonResponseHandler<UpdatePullRequestStatusResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Replaces the title of a pull request.
     * </p>
     * 
     * @param updatePullRequestTitleRequest
     * @return updatePullRequestTitleResult The response from the
     *         UpdatePullRequestTitle service method, as returned by AWS
     *         CodeCommit.
     * @throws PullRequestDoesNotExistException
     * @throws InvalidPullRequestIdException
     * @throws PullRequestIdRequiredException
     * @throws TitleRequiredException
     * @throws InvalidTitleException
     * @throws PullRequestAlreadyClosedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdatePullRequestTitleResult updatePullRequestTitle(
            UpdatePullRequestTitleRequest updatePullRequestTitleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePullRequestTitleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePullRequestTitleRequest> request = null;
        Response<UpdatePullRequestTitleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePullRequestTitleRequestMarshaller()
                        .marshall(updatePullRequestTitleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdatePullRequestTitleResult, JsonUnmarshallerContext> unmarshaller = new UpdatePullRequestTitleResultJsonUnmarshaller();
            JsonResponseHandler<UpdatePullRequestTitleResult> responseHandler = new JsonResponseHandler<UpdatePullRequestTitleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets or changes the comment or description for a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and
     * all valid Unicode characters. Applications that do not HTML-encode the
     * description and display it in a webpage can expose users to potentially
     * malicious code. Make sure that you HTML-encode the description field in
     * any application that uses this API to display the repository description
     * on a webpage.
     * </p>
     * </note>
     * 
     * @param updateRepositoryDescriptionRequest <p>
     *            Represents the input of an update repository description
     *            operation.
     *            </p>
     * @throws RepositoryNameRequiredException
     * @throws RepositoryDoesNotExistException
     * @throws InvalidRepositoryNameException
     * @throws InvalidRepositoryDescriptionException
     * @throws EncryptionIntegrityChecksFailedException
     * @throws EncryptionKeyAccessDeniedException
     * @throws EncryptionKeyDisabledException
     * @throws EncryptionKeyNotFoundException
     * @throws EncryptionKeyUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateRepositoryDescription(
            UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRepositoryDescriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRepositoryDescriptionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRepositoryDescriptionRequestMarshaller()
                        .marshall(updateRepositoryDescriptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Renames a repository. The repository name must be unique across the
     * calling AWS account. Repository names are limited to 100 alphanumeric,
     * dash, and underscore characters, and cannot include certain characters.
     * The suffix .git is prohibited. For more information about the limits on
     * repository names, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html"
     * >Limits</a> in the AWS CodeCommit User Guide.
     * </p>
     * 
     * @param updateRepositoryNameRequest <p>
     *            Represents the input of an update repository description
     *            operation.
     *            </p>
     * @throws RepositoryDoesNotExistException
     * @throws RepositoryNameExistsException
     * @throws RepositoryNameRequiredException
     * @throws InvalidRepositoryNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeCommit indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateRepositoryName(UpdateRepositoryNameRequest updateRepositoryNameRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRepositoryNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRepositoryNameRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRepositoryNameRequestMarshaller()
                        .marshall(updateRepositoryNameRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request The originally executed request
     * @return The response metadata for the specified request, or null if none
     *         is available.
     * @deprecated ResponseMetadata cache can hold up to 50 requests and
     *             responses in memory and will cause memory issue. This method
     *             now always returns null.
     */
    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(
                jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
