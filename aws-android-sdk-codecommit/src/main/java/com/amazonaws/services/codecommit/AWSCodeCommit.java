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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.codecommit.model.*;

/**
 * Interface for accessing AWS CodeCommit <fullname>AWS CodeCommit</fullname>
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
 **/
public interface AWSCodeCommit {

    /**
     * Overrides the default endpoint for this client
     * ("https://codecommit.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "codecommit.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://codecommit.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "codecommit.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://codecommit.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSCodeCommit#setEndpoint(String)}, sets the
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
    void associateApprovalRuleTemplateWithRepository(
            AssociateApprovalRuleTemplateWithRepositoryRequest associateApprovalRuleTemplateWithRepositoryRequest)
            throws AmazonClientException, AmazonServiceException;

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
    BatchAssociateApprovalRuleTemplateWithRepositoriesResult batchAssociateApprovalRuleTemplateWithRepositories(
            BatchAssociateApprovalRuleTemplateWithRepositoriesRequest batchAssociateApprovalRuleTemplateWithRepositoriesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    BatchDescribeMergeConflictsResult batchDescribeMergeConflicts(
            BatchDescribeMergeConflictsRequest batchDescribeMergeConflictsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    BatchDisassociateApprovalRuleTemplateFromRepositoriesResult batchDisassociateApprovalRuleTemplateFromRepositories(
            BatchDisassociateApprovalRuleTemplateFromRepositoriesRequest batchDisassociateApprovalRuleTemplateFromRepositoriesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    BatchGetCommitsResult batchGetCommits(BatchGetCommitsRequest batchGetCommitsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    BatchGetRepositoriesResult batchGetRepositories(
            BatchGetRepositoriesRequest batchGetRepositoriesRequest) throws AmazonClientException,
            AmazonServiceException;

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
    CreateApprovalRuleTemplateResult createApprovalRuleTemplate(
            CreateApprovalRuleTemplateRequest createApprovalRuleTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void createBranch(CreateBranchRequest createBranchRequest) throws AmazonClientException,
            AmazonServiceException;

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
    CreateCommitResult createCommit(CreateCommitRequest createCommitRequest)
            throws AmazonClientException, AmazonServiceException;

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
    CreatePullRequestResult createPullRequest(CreatePullRequestRequest createPullRequestRequest)
            throws AmazonClientException, AmazonServiceException;

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
    CreatePullRequestApprovalRuleResult createPullRequestApprovalRule(
            CreatePullRequestApprovalRuleRequest createPullRequestApprovalRuleRequest)
            throws AmazonClientException, AmazonServiceException;

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
    CreateRepositoryResult createRepository(CreateRepositoryRequest createRepositoryRequest)
            throws AmazonClientException, AmazonServiceException;

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
    CreateUnreferencedMergeCommitResult createUnreferencedMergeCommit(
            CreateUnreferencedMergeCommitRequest createUnreferencedMergeCommitRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DeleteApprovalRuleTemplateResult deleteApprovalRuleTemplate(
            DeleteApprovalRuleTemplateRequest deleteApprovalRuleTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DeleteBranchResult deleteBranch(DeleteBranchRequest deleteBranchRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DeleteCommentContentResult deleteCommentContent(
            DeleteCommentContentRequest deleteCommentContentRequest) throws AmazonClientException,
            AmazonServiceException;

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
    DeleteFileResult deleteFile(DeleteFileRequest deleteFileRequest) throws AmazonClientException,
            AmazonServiceException;

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
    DeletePullRequestApprovalRuleResult deletePullRequestApprovalRule(
            DeletePullRequestApprovalRuleRequest deletePullRequestApprovalRuleRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest deleteRepositoryRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribeMergeConflictsResult describeMergeConflicts(
            DescribeMergeConflictsRequest describeMergeConflictsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DescribePullRequestEventsResult describePullRequestEvents(
            DescribePullRequestEventsRequest describePullRequestEventsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void disassociateApprovalRuleTemplateFromRepository(
            DisassociateApprovalRuleTemplateFromRepositoryRequest disassociateApprovalRuleTemplateFromRepositoryRequest)
            throws AmazonClientException, AmazonServiceException;

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
    EvaluatePullRequestApprovalRulesResult evaluatePullRequestApprovalRules(
            EvaluatePullRequestApprovalRulesRequest evaluatePullRequestApprovalRulesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    GetApprovalRuleTemplateResult getApprovalRuleTemplate(
            GetApprovalRuleTemplateRequest getApprovalRuleTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

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
    GetBlobResult getBlob(GetBlobRequest getBlobRequest) throws AmazonClientException,
            AmazonServiceException;

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
    GetBranchResult getBranch(GetBranchRequest getBranchRequest) throws AmazonClientException,
            AmazonServiceException;

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
    GetCommentResult getComment(GetCommentRequest getCommentRequest) throws AmazonClientException,
            AmazonServiceException;

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
    GetCommentReactionsResult getCommentReactions(
            GetCommentReactionsRequest getCommentReactionsRequest) throws AmazonClientException,
            AmazonServiceException;

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
    GetCommentsForComparedCommitResult getCommentsForComparedCommit(
            GetCommentsForComparedCommitRequest getCommentsForComparedCommitRequest)
            throws AmazonClientException, AmazonServiceException;

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
    GetCommentsForPullRequestResult getCommentsForPullRequest(
            GetCommentsForPullRequestRequest getCommentsForPullRequestRequest)
            throws AmazonClientException, AmazonServiceException;

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
    GetCommitResult getCommit(GetCommitRequest getCommitRequest) throws AmazonClientException,
            AmazonServiceException;

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
    GetDifferencesResult getDifferences(GetDifferencesRequest getDifferencesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    GetFileResult getFile(GetFileRequest getFileRequest) throws AmazonClientException,
            AmazonServiceException;

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
    GetFolderResult getFolder(GetFolderRequest getFolderRequest) throws AmazonClientException,
            AmazonServiceException;

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
    GetMergeCommitResult getMergeCommit(GetMergeCommitRequest getMergeCommitRequest)
            throws AmazonClientException, AmazonServiceException;

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
    GetMergeConflictsResult getMergeConflicts(GetMergeConflictsRequest getMergeConflictsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    GetMergeOptionsResult getMergeOptions(GetMergeOptionsRequest getMergeOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    GetPullRequestResult getPullRequest(GetPullRequestRequest getPullRequestRequest)
            throws AmazonClientException, AmazonServiceException;

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
    GetPullRequestApprovalStatesResult getPullRequestApprovalStates(
            GetPullRequestApprovalStatesRequest getPullRequestApprovalStatesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    GetPullRequestOverrideStateResult getPullRequestOverrideState(
            GetPullRequestOverrideStateRequest getPullRequestOverrideStateRequest)
            throws AmazonClientException, AmazonServiceException;

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
    GetRepositoryResult getRepository(GetRepositoryRequest getRepositoryRequest)
            throws AmazonClientException, AmazonServiceException;

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
    GetRepositoryTriggersResult getRepositoryTriggers(
            GetRepositoryTriggersRequest getRepositoryTriggersRequest)
            throws AmazonClientException, AmazonServiceException;

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
    ListApprovalRuleTemplatesResult listApprovalRuleTemplates(
            ListApprovalRuleTemplatesRequest listApprovalRuleTemplatesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    ListAssociatedApprovalRuleTemplatesForRepositoryResult listAssociatedApprovalRuleTemplatesForRepository(
            ListAssociatedApprovalRuleTemplatesForRepositoryRequest listAssociatedApprovalRuleTemplatesForRepositoryRequest)
            throws AmazonClientException, AmazonServiceException;

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
    ListBranchesResult listBranches(ListBranchesRequest listBranchesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    ListPullRequestsResult listPullRequests(ListPullRequestsRequest listPullRequestsRequest)
            throws AmazonClientException, AmazonServiceException;

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
    ListRepositoriesResult listRepositories(ListRepositoriesRequest listRepositoriesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    ListRepositoriesForApprovalRuleTemplateResult listRepositoriesForApprovalRuleTemplate(
            ListRepositoriesForApprovalRuleTemplateRequest listRepositoriesForApprovalRuleTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

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
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

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
    MergeBranchesByFastForwardResult mergeBranchesByFastForward(
            MergeBranchesByFastForwardRequest mergeBranchesByFastForwardRequest)
            throws AmazonClientException, AmazonServiceException;

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
    MergeBranchesBySquashResult mergeBranchesBySquash(
            MergeBranchesBySquashRequest mergeBranchesBySquashRequest)
            throws AmazonClientException, AmazonServiceException;

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
    MergeBranchesByThreeWayResult mergeBranchesByThreeWay(
            MergeBranchesByThreeWayRequest mergeBranchesByThreeWayRequest)
            throws AmazonClientException, AmazonServiceException;

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
    MergePullRequestByFastForwardResult mergePullRequestByFastForward(
            MergePullRequestByFastForwardRequest mergePullRequestByFastForwardRequest)
            throws AmazonClientException, AmazonServiceException;

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
    MergePullRequestBySquashResult mergePullRequestBySquash(
            MergePullRequestBySquashRequest mergePullRequestBySquashRequest)
            throws AmazonClientException, AmazonServiceException;

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
    MergePullRequestByThreeWayResult mergePullRequestByThreeWay(
            MergePullRequestByThreeWayRequest mergePullRequestByThreeWayRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void overridePullRequestApprovalRules(
            OverridePullRequestApprovalRulesRequest overridePullRequestApprovalRulesRequest)
            throws AmazonClientException, AmazonServiceException;

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
    PostCommentForComparedCommitResult postCommentForComparedCommit(
            PostCommentForComparedCommitRequest postCommentForComparedCommitRequest)
            throws AmazonClientException, AmazonServiceException;

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
    PostCommentForPullRequestResult postCommentForPullRequest(
            PostCommentForPullRequestRequest postCommentForPullRequestRequest)
            throws AmazonClientException, AmazonServiceException;

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
    PostCommentReplyResult postCommentReply(PostCommentReplyRequest postCommentReplyRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void putCommentReaction(PutCommentReactionRequest putCommentReactionRequest)
            throws AmazonClientException, AmazonServiceException;

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
    PutFileResult putFile(PutFileRequest putFileRequest) throws AmazonClientException,
            AmazonServiceException;

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
    PutRepositoryTriggersResult putRepositoryTriggers(
            PutRepositoryTriggersRequest putRepositoryTriggersRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

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
    TestRepositoryTriggersResult testRepositoryTriggers(
            TestRepositoryTriggersRequest testRepositoryTriggersRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

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
    UpdateApprovalRuleTemplateContentResult updateApprovalRuleTemplateContent(
            UpdateApprovalRuleTemplateContentRequest updateApprovalRuleTemplateContentRequest)
            throws AmazonClientException, AmazonServiceException;

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
    UpdateApprovalRuleTemplateDescriptionResult updateApprovalRuleTemplateDescription(
            UpdateApprovalRuleTemplateDescriptionRequest updateApprovalRuleTemplateDescriptionRequest)
            throws AmazonClientException, AmazonServiceException;

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
    UpdateApprovalRuleTemplateNameResult updateApprovalRuleTemplateName(
            UpdateApprovalRuleTemplateNameRequest updateApprovalRuleTemplateNameRequest)
            throws AmazonClientException, AmazonServiceException;

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
    UpdateCommentResult updateComment(UpdateCommentRequest updateCommentRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void updateDefaultBranch(UpdateDefaultBranchRequest updateDefaultBranchRequest)
            throws AmazonClientException, AmazonServiceException;

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
    UpdatePullRequestApprovalRuleContentResult updatePullRequestApprovalRuleContent(
            UpdatePullRequestApprovalRuleContentRequest updatePullRequestApprovalRuleContentRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void updatePullRequestApprovalState(
            UpdatePullRequestApprovalStateRequest updatePullRequestApprovalStateRequest)
            throws AmazonClientException, AmazonServiceException;

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
    UpdatePullRequestDescriptionResult updatePullRequestDescription(
            UpdatePullRequestDescriptionRequest updatePullRequestDescriptionRequest)
            throws AmazonClientException, AmazonServiceException;

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
    UpdatePullRequestStatusResult updatePullRequestStatus(
            UpdatePullRequestStatusRequest updatePullRequestStatusRequest)
            throws AmazonClientException, AmazonServiceException;

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
    UpdatePullRequestTitleResult updatePullRequestTitle(
            UpdatePullRequestTitleRequest updatePullRequestTitleRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void updateRepositoryDescription(
            UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest)
            throws AmazonClientException, AmazonServiceException;

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
    void updateRepositoryName(UpdateRepositoryNameRequest updateRepositoryNameRequest)
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
