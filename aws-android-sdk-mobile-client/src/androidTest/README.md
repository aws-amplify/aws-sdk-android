## Config Setup for AWSMobileClient Integration Tests

### Steps To Generate Config Files

1. Set AWS region in Terminal to `us-west-2`
2. Run `amplify add auth` with the following options and then `amplify push`

```console
Do you want to use the default authentication and security configuration? Default configuration with Social Provider (Federation)
How do you want users to be able to sign in? Username
Do you want to configure advanced settings? Yes, I want to make some additional changes.
What attributes are required for signing up? Email
Do you want to enable any of the following capabilities? Custom Auth Challenge Flow (basic scaffolding - not for production)
What domain name prefix do you want to use? amplifyapi96960fcb-96960fcb
Enter your redirect signin URI: myapp://callback/
Do you want to add another redirect signin URI No
Enter your redirect signout URI: myapp://signout/
Do you want to add another redirect signout URI No
Select the social providers you want to configure for your user pool: 
Succesfully added the Lambda function locally
Do you want to edit your boilerplate-define-challenge function now? Yes
Please edit the file in your editor: /Users/ddaudeli/Documents/AmplifyAPI/amplify/backend/function/amplifyapi96960fcbDefineAuthChallenge/src/boilerplate-define-challenge.js
Press enter to continue 
Enter the answer to your custom auth challenge 1133
Do you want to edit your boilerplate-create-challenge function now? Yes
Please edit the file in your editor: /Users/ddaudeli/Documents/AmplifyAPI/amplify/backend/function/amplifyapi96960fcbCreateAuthChallenge/src/boilerplate-create-challenge.js
Press enter to continue 
Do you want to edit your boilerplate-verify function now? Yes
Please edit the file in your editor: /Users/ddaudeli/Documents/AmplifyAPI/amplify/backend/function/amplifyapi96960fcbVerifyAuthChallengeResponse/src/boilerplate-verify.js
Press enter to continue
```

3. In the lambda creation steps above, use these code snippets:

**boilerplate-define-challenge:**

```javascript
    exports.handler = function(event, context) {
        if (event.request.session.length == 1 && event.request.session[0].challengeName == 'SRP_A') {
            event.response.issueTokens = false;
            event.response.failAuthentication = false;
            event.response.challengeName = 'CUSTOM_CHALLENGE';
        } else if (event.request.session.length == 2 && event.request.session[1].challengeName == 'CUSTOM_CHALLENGE' && event.request.session[1].challengeResult == true) {
            event.response.issueTokens = true;
            event.response.failAuthentication = false;
            event.response.challengeName = 'CUSTOM_CHALLENGE';
        } else {
            event.response.issueTokens = false;
            event.response.failAuthentication = true;
        }
        context.done(null, event);
    }
```

**boilerplate-create-challenge:**

```javascript
    /* tslint:disable */
    /* eslint-disable */
    
    function createAuthChallenge(event) {
        if (event.request.challengeName === 'CUSTOM_CHALLENGE') {
            event.response.publicChallengeParameters = {};
            event.response.privateChallengeParameters = {};
            event.response.privateChallengeParameters.answer = '1133';
        }
    }
    
    exports.handler = (event, context, callback) => {
        console.log(JSON.stringify(event));
        createAuthChallenge(event);
    
        console.log(JSON.stringify(event));
        callback(null, event);
    };
```

**boilerplate-verify-challenge:**

```javascript
    function verifyAuthChallengeResponse(event) {
        if (event.request.privateChallengeParameters.answer === event.request.challengeAnswer) {
            event.response.answerCorrect = true;
        } else {
            event.response.answerCorrect = false;
        }
    }
    
    exports.handler = (event, context, callback) => {
        console.log(JSON.stringify(event));
            verifyAuthChallengeResponse(event);
    
        console.log(JSON.stringify(event));
        callback(null, event);
    };
```

4. Open the user pool in AWS console, click “Devices” on the left, and select “User Opt In“
   
5. Add a user named “somebody” via AWS CLI

```console
    aws cognito-idp sign-up \ 
    --client-id <fill in from awsconfiguration.json> \ 
    --username somebody \ 
    --password 1234Password! \ 
    --user-attributes Name=email,Value=success+user@simulator.amazonses.com \ 
    --region us-west-2 \ 
    --profile amplify
    
    aws cognito-idp admin-confirm-sign-up \ 
    --user-pool-id <fill in from awsconfiguration.json> \ 
    --username somebody \ 
    --region us-west-2 \ 
    --profile amplify
    
    aws cognito-idp admin-update-user-attributes \ 
    --user-pool-id <fill in from awsconfiguration.json> \ 
    --username somebody \ 
    --user-attributes Name=email_verified,Value=true \ 
    --region us-west-2 \ 
    --profile amplify
```

6. Use the same commands above to add a user named “customAuthTestUser” - it doesn’t matter what email or password is given to this user but they are required fields.
   
7. Modify the generated awsconfiguration.json file as follows:
    - For each section which has a “Default” section, duplicate the “Default” block but rename the key from “Default” to “Auth1”
    - For the “Auth1” duplicate under “Auth” remove all content except, "authenticationFlowType": "CUSTOM_AUTH"
    - For the “Default” section under “Auth” change the value of “authenticationFlowType” to “USER_SRP_AUTH”
      
8. Put the awsconfiguration.json file inside aws-android-sdk-mobile-client/src/androidTest/res/raw/
   
9. Add the following section under “packages” in the testconfiguration.json file in aws-android-sdk-testutils:

```json
    "mobile_client": {
      "email": "success+user@simulator.amazonses.com",  
      "username": "somebody",  
      "app_client_id": "<fill in from awsconfiguration.json>",  
      "identity_id": "<retrieve from an API call and fill in here>"
    }
```

### Final Result:

**awsconfiguration.json**

```json
{
    "UserAgent": "aws-amplify-cli/0.1.0",
    "Version": "0.1.0",
    "IdentityManager": {
        "Default": {},
        "Auth1": {}
    },
    "CredentialsProvider": {
        "CognitoIdentity": {
            "Default": {
                "PoolId": "...",
                "Region": "us-west-2"
            },
            "Auth1": {
                "PoolId": "...",
                "Region": "us-west-2"
            }
        }
    },
    "CognitoUserPool": {
        "Default": {
            "PoolId": "...",
            "AppClientId": "...",
            "AppClientSecret": "...",
            "Region": "us-west-2"
        },
        "Auth1": {
            "PoolId": "...",
            "AppClientId": "...",
            "AppClientSecret": "...",
            "Region": "us-west-2"
        }
    },
    "Auth": {
        "Default": {
            "OAuth": {
                "WebDomain": "...",
                "AppClientId": "...",
                "AppClientSecret": "...",
                "SignInRedirectURI": "myapp://callback/",
                "SignOutRedirectURI": "myapp://signout/",
                "Scopes": [
                    "phone",
                    "email",
                    "openid",
                    "profile",
                    "aws.cognito.signin.user.admin"
                ]
            },
            "authenticationFlowType": "USER_SRP_AUTH"
        },
        "Auth1": {
            "authenticationFlowType": "CUSTOM_AUTH"
        }
    }
}
```

**testconfiguration.json**

```json
{
  "credentials": {
    ...
  },
  "packages": {
      "mobile_client": {
        "email": "success+user@simulator.amazonses.com",
        "username": "somebody",
        "app_client_id": "...",
        "identity_id": "..."
      }
  }
}
```
