# Vault Java SDK Sample - vsdk-helloworld

**For full reference, please refer to [Getting Started](https://developer.veevavault.com/sdk/#Getting_Started)**.

To make getting started easy, we created a sample vSDK Hello World project that demonstrates the Vault Java SDK. The trigger returns a "Hello, world" error message when a vSDK Hello World record is created within vault!

## How to import

Import as a Maven project. This will automatically pull in the required Vault Java SDK dependencies. 

For Intellij this is done by:
- File -> Open -> Navigate to project folder -> Select the 'pom.xml' file -> Open as Project

For Eclipse this is done by:
- File -> Import -> Maven -> Existing Maven Projects -> Navigate to project folder -> Select the 'pom.xml' file

## Setup

First, you need to configure your vault so the sample trigger runs smoothly. You can do this by deploying a prepackaged set of components (.vpk), or by manually creating a "vsdk_hello_world__c" object in Vault.

#### Deploying the vSDK Hello World VPK Package

1.  Log in to your vault and navigate to Admin > Deployment > Inbound Packages and click Import.
2.  Locate and select the \deploy-vpk\vsdk-helloworld-components\vsdk-helloworld-components.vpk file on your computer. Vault opens and displays the details for the package.  
3.  From the Actions menu, select Review & Deploy. Vault displays a list of all components in the package.
4.  Click Next.   
5.  On the confirmation page, review and click Finish. You will receive an email when Vault completes the deployment.


## How to run

1.  Log into your Vault: [https://login.veevavault.com/](https://login.veevavault.com/)
2.  Start the [Vault Java SDK Debugger](https://developer.veevavault.com/sdk/#Debug_Setup).
3.  Go to  **Admin -> Business Admin**  tab and click on  **vSDK Hello World**  in the left navigation panel
4.  Click the  **Create**  button in the list page
5.  Enter your name in the  **Name**  field
6.  Click  **Save**  and you should see a "Hello, world." error in a dialog box.  
7.  Stop Running the project.

That’s your trigger in action! 

Changes made to the code can be deployed using the [Vault Java SDK Maven plugin](https://github.com/veeva/vaultjavasdk-maven-plugin). There are sample settings files for the maven plugin in the /src/main/resources/ directory.

Further discussion about Vault Java SDK can be held in our [Vault for Developers community](https://devcommunity.veevavault.com) on Veeva Connect.

	    
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
  
