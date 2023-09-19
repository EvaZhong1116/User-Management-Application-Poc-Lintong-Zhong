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

<img width="960" alt="8" src="https://github.com/EvaZhong1116/User-Management-Application-Poc-Lintong-Zhong/assets/83436556/4820e48a-c307-47b1-a543-a9368e27e4ee">

## DELETE: delete a user by id

I implement a delete by id operation, as the image shown below the delete the user id 4, and then I use getAll to get all the user, the user 4 is gone.

<img width="1193" alt="9" src="https://github.com/EvaZhong1116/User-Management-Application-Poc-Lintong-Zhong/assets/83436556/fbb979dd-b59a-4132-9a26-56266c1c2883">

<img width="832" alt="10" src="https://github.com/EvaZhong1116/User-Management-Application-Poc-Lintong-Zhong/assets/83436556/061085d4-c9fd-4860-a4bf-c0b567d6ccc0">

## Security Implementation:

I create a login page with spring security using OAuth2.0. the user can choose to login in with google. Once I enter my google credentials, I am successfully redirect to the welcome page.

<img width="771" alt="11" src="https://github.com/EvaZhong1116/User-Management-Application-Poc-Lintong-Zhong/assets/83436556/3a4226c5-6716-4f47-82b5-76c137391c04">

<img width="619" alt="12" src="https://github.com/EvaZhong1116/User-Management-Application-Poc-Lintong-Zhong/assets/83436556/d1c63800-bab9-4aa4-923e-9d9a5deb9fb9">

<img width="661" alt="13" src="https://github.com/EvaZhong1116/User-Management-Application-Poc-Lintong-Zhong/assets/83436556/a75e1ba3-2ccc-46b1-b8b6-417badfd7c7c">
