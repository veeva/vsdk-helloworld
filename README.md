# Vault Java SDK Sample - vsdk-helloworld

**For full reference, please refer to [Getting Started](https://developer.veevavault.com/sdk/#Getting_Started)**.

To make getting started easy, we created a sample vSDK Hello World project that demonstrates the Vault Java SDK. The trigger returns a "Hello, world" error message when you create a vSDK Hello World record in Vault!

## Vault Setup

First, you need to configure your Vault so the sample SDK trigger runs smoothly. You can do this by deploying a prepackaged set of components (`.vpk`). You can also manually create a `vsdk_hello_world__c` object in Vault.

To deploy the vSDK Hello World VPK package:

1. Log in to your Vault and navigate to **Admin > Deployment > Inbound Packages** and click **Import**.
2. Locate and select the `\deploy-vpk\vsdk-helloworld-components\vsdk-helloworld-components.vpk` file in your downloaded or cloned project folder. You will receive an email when Vault finishes importing the package. Refresh the page to find the imported package. You can open it to review the details.
3. From the **Actions** menu, select **Review & Deploy**. Vault displays a list of all components in the package.
4. Click **Next**.
5. On the confirmation page, review and click **Finish**. You will receive an email when Vault completes the deployment.
6. Check that the VPK imported successfully in **Admin > Business Admin**. If the vSDK Hello World object exists here, your Vault setup is complete.

## Import the Maven Project

Import the sample project as a Maven project. This automatically pulls in the required Vault Java SDK dependencies. 

In IntelliJ:
1. Select **File > Open**.
2. Navigate to your downloaded or cloned project directory and locate the `vsdk-helloworld-master` folder.
3. Select the `pom.xml` file and click **OK**.
4. Click **Open as Project** in the dialog.
5. Navigate to **File > Project Structure > Project Settings > Project**, and set the Java SDK Version to 1.8.

In Eclipse:
1. Select **File > Import > Maven > Existing Maven Projects** and click **Next**.
2. Navigate to your downloaded or cloned project directory and locate the `vsdk-helloworld-master` folder.
3. Select the `pom.xml` file and click **Finish**.

In the `pom.xml` file, update `<vault.sdk.version>` to your Vault version. See [POM Setup](https://developer.veevavault.com/sdk#Dev_Setup_POM) for more details.

## Run Code

1.  Set up and run the [Vault Java SDK Debugger](https://developer.veevavault.com/sdk/#Debug_Setup).
3.  Log in to your Vault.
2.  Navigate to  **Admin > Business Admin > vSDK Hello World**.
4.  Click **Create**.
5.  Enter your name in the **Name** field.
6.  Click **Save**. You should see a "Hello, world" error dialog.

That’s your trigger in action! The “Hello, World” code only executes while the debugger is running. Once the debugger is stopped, this trigger will no longer appear in your Vault.

Continue to [Deploying Code](https://developer.veevavault.com/sdk/#Deploy) to learn how to deploy this code and enable it to always run on your Vault.

	    
## License

This code serves as an example and is not meant for production use.

Copyright 2018 Veeva Systems Inc.
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 
