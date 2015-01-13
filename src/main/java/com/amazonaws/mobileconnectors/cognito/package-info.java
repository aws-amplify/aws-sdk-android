/**
 * Primary classes for interacting with the AmazonCognitoSync mobile connector, 
 * which is a high level client that provides data synchronization across multiple mobile devices and 
 * powered by Amazon Cognito Identity service, Cognito Sync service, and Security Token
 * Service (STS).
 *
 * 
 * Here is a sample usage:
 * 
 * <pre>
 * CognitoCachingCredentialsProvider provider = new CognitoCachingCredentialsProvider(
 *         context, awsAccountId, identityPoolId, unauthRoleArn, authRoleArn, Regions.US_EAST_1);
 * CognitoSyncManager client = new CognitoSyncManager(context, identityPoolId, provider);
 * 
 * Dataset dataset = client.openOrCreateDataset(&quot;default_dataset&quot;);
 * dataset.put(&quot;high_score&quot;, &quot;100&quot;);
 * dataset.synchronize(new SyncCallback() {
 *     // override callbacks
 * });
 * </pre>
 * 
 * Please refer to {@link com.amazonaws.mobileconnectors.cognito.CognitoSyncManager} and
 * {@link com.amazonaws.mobileconnectors.cognito.Dataset} for more details.
 */

package com.amazonaws.mobileconnectors.cognito;
