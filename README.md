# User-Management-Application-Poc-Lintong-Zhong

## POST:

I implement a post operation using spring security, once a user registration in the registration page their information including id, username, password, email will store in sql database, and then you can use login form to login in with your username and password to the main menu.

<img width="741" alt="Screenshot 2023-09-18 at 5 14 53 PM" src="https://github.com/EvaZhong1116/User-Management-Application-Poc-Lintong-Zhong/assets/83436556/75f0cadc-ecb4-497b-951b-8b33dc29aae5">

<img width="264" alt="2" src="https://github.com/EvaZhong1116/User-Management-Application-Poc-Lintong-Zhong/assets/83436556/5ee37247-b7a9-4e83-9fa1-30a337afb91d">

The username Ava password: 123 successfully login to the page
<img width="829" alt="3" src="https://github.com/EvaZhong1116/User-Management-Application-Poc-Lintong-Zhong/assets/83436556/58f55fb9-6810-4b30-9af8-dbeca324dec0">

and using get method shows that the Ava username is store in the db
<img width="904" alt="4" src="https://github.com/EvaZhong1116/User-Management-Application-Poc-Lintong-Zhong/assets/83436556/34a7ab7a-9883-498f-85a7-c89c997ca449">

## PUT: 
I implement put operation to modify the user information, the image shows I made some change the the user 1 Adam, I change username from Adam to adamchanged, the password from 123 to 123changed.

<img width="1313" alt="5" src="https://github.com/EvaZhong1116/User-Management-Application-Poc-Lintong-Zhong/assets/83436556/2a33fed0-d287-4ff1-aa43-91df2babe1ea">

<img width="904" alt="6" src="https://github.com/EvaZhong1116/User-Management-Application-Poc-Lintong-Zhong/assets/83436556/b441955e-9bc8-4f02-b7cb-cec8e27b925a">
## GET: get all user and get user by id

I implement two type of get method, the first one is get all the user and the second one is get the user by id, the first image show the use id 1 information, the second image shows the all the user information.

<img width="1193" alt="7" src="https://github.com/EvaZhong1116/User-Management-Application-Poc-Lintong-Zhong/assets/83436556/bfa4c285-a2be-4234-b726-62e4a2fde2bd">

![Screenshot 2023-09-18 at 2.25.52 AM.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/97f63a6e-2eac-438d-b846-54b6699abe8d/c03359f5-14a6-44b9-9287-008b4ffa3e09/Screenshot_2023-09-18_at_2.25.52_AM.png)

## DELETE: delete a user by id

I implement a delete by id operation, as the image shown below the delete the user id 4, and then I use getAll to get all the user, the user 4 is gone.

![Screenshot 2023-09-18 at 2.27.53 AM.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/97f63a6e-2eac-438d-b846-54b6699abe8d/2da14ffa-7bd8-40ee-b092-3cca53591d71/Screenshot_2023-09-18_at_2.27.53_AM.png)

![Screenshot 2023-09-18 at 5.21.37 PM.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/97f63a6e-2eac-438d-b846-54b6699abe8d/db3a7dcd-e77f-4ebc-b5e1-4c71dd237941/Screenshot_2023-09-18_at_5.21.37_PM.png)

## Security Implementation:

I create a login page with spring security using OAuth2.0. the user can choose to login in with google. Once I enter my google credentials, I am successfully redirect to the welcome page.

![Screenshot 2023-09-19 at 12.06.55 AM.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/97f63a6e-2eac-438d-b846-54b6699abe8d/ed6c8423-ff6b-4b70-97b8-f56caeb9ba7c/Screenshot_2023-09-19_at_12.06.55_AM.png)

![Screenshot 2023-09-19 at 12.07.28 AM.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/97f63a6e-2eac-438d-b846-54b6699abe8d/d1ca51ba-53bf-4006-88ca-41bec9d1e9cc/Screenshot_2023-09-19_at_12.07.28_AM.png)

![Screenshot 2023-09-19 at 12.07.42 AM.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/97f63a6e-2eac-438d-b846-54b6699abe8d/6c0ce72f-e330-4f4b-b00e-f5c74192550e/Screenshot_2023-09-19_at_12.07.42_AM.png)
