#Spring-cloud-security & sso Application

#Single Sign On
An OAuth2 Client can be used to fetch user details from the provider (if such features are available) and then convert them into an Authentication token for Spring Security. The Resource Server above support this via the user-info-uri property This is the basis for a Single Sign On (SSO) protocol based on OAuth2, and Spring Boot makes it easy to participate by providing an annotation @EnableOAuth2Sso. The Google client above can protect all its resources and authenticate using the Google /userinfo/ endpoint, by adding that annotation and declaring where to find the endpoint

#Register the Application in Google
As you can see, the process requires a client identifier and a shared secret. To get them, you need a Google account.

1.When you have one, log into Google API Console. https://console.developers.google.com

2.Choose Credentials on the left menu.

3.If you are there for the first time, you should see the Create a project button. Click it.

4.Create the project.

5.Create credentials for your OAuth client ID by clicking the appropriate button.

6.Choose an application type - in my case it is a web application.

7.Provide URLs to your application that are authorized to request signing in through Google Sign-In. If you want to test it locally, typing http://localhost:8888 should work. Multiple URLs can be provided.

8.In the Client ID section for the web application, you will find a Client ID and Client secret. Copy them and save them in a application.yml file.