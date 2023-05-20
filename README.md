# JAVA-PROJECT  
## ABOUT  
* PROJECT TITLE:- EXPENSE TRACKER.  
This project is developed by [Subramanya Patil](https://github.com/patilsubramanya) as a part of our academics, MSc DATA SCIENCE. This project was started in the month of April 2023 and finished in first week of May 2023 under the guidance of Assistant Professor ALWYN JOSEPH.  
* BRIEF DESCRIPTION:-   
As we all spend money, sometimes without even realising we just run out of the budget which we generally have for a month or for a period of time. That's why application is built to help its users keep a track on how much they are spending and on which category they are spending more. With the help of this application user can create his own account, where the user's data will be hidden from other users wherer only he can add/delete/view an expense.  
## DATABASE INFORMATION  
* The database "expensetracker" mainly have three tables naming:  
* USERS: which stores the user's information such as name, username, password and phone number.  
* CATGORY_INFO: which stores the information about categories available for user to add for the expense.  
* EXPENSES: This table stores all the expenses add by all the users.  
## DESCRIPTION OF TABLES  
* USERS: This table stores the user's personal information such as name, username, password and phone number where phone number is primary key and this field is parent coloumn of phone number coloumn in expense table. 
![image](https://github.com/patilsubramanya/JAVA-PROJECT/assets/118504626/98a43551-60b8-48d6-9a23-2e46edc63415)  
As you can see in the table description where no field in the table can be null which means at the time of registering user can't leave any field empty. While registering user is asked with User's name(uname), username(username), password(password) and users'phone number(phone_number), Here you can see phone number's key as PRI which means primary key, which tells that a field which is set to primary key can't be null, can't be repeated. Making this field as primary key makes sense as phone number can't be repeated i.e one phone number can't be possesed by more than one user.  

* CATEGORY_INFO: This table stores the data of all the categories which will be available for users while adding expense. This table has only one coloum "category" in which 
all the cateogries will be stored.  
![image](https://github.com/patilsubramanya/JAVA-PROJECT/assets/118504626/01f278a3-0c98-4324-9bbf-d8fd0e6e0e70)  
This is not a complicated table as such, because it has only one coulumn in it which will store the categories add by user. Whenever user adds any category, it will be stored in this table.

* EXPENSES: This table has expense_id, expense_date, expense_amount, expense_category as it's fields. After a user logs in, and adds any expense, the expense details will be
stored in this table.
![image](https://github.com/patilsubramanya/JAVA-PROJECT/assets/118504626/a76e6be6-6566-475e-a2a2-68a078cc9cdd)  
In this table you can see five field namely eid(which is an auto incrementing field and user does not have to give any value for it), ecategory(this will store the category of the expense added by the user), edate(this field will store the date of the expense), eamount(this will store the amount which user has spent on a particular category and date), phone_number as you can see MUL in it's key which indicates that it is a foreign key which references to users' table. What is the use of foreign key is this table will add any row to it if the phone number entered is already existing in the user table.  
This was all about the database which is being used in this project.  
Further, let's move to the working of the project.  
* There are some necessary file which I felt are important to run this porject are:  
    * mysql-connector-j-8.0.32 :- This is a jar file which will help to connect the project to your SQL database.  
    * jfreechart-1.0.19 :- This jar file will help to plot you any kind of plots in your project. In my project I have used pie chart for showing expenses.
    * jcalendar-1.4 :- This jar file will help you add additional date/time funcitons like date picker, day chooser and many more. In my porject I have used date picker for        selecting date while adding any expense.  
 ## RUNNING OF APPLICATION  
 * This part includes of how the application works.  
 When the user will run this application, user will be asked for either registration or login.  
 * Login Page  
 ![image](https://github.com/patilsubramanya/JAVA-PROJECT/assets/118504626/854f3152-d619-4cd4-8a91-109a667e39be)  
 In this user can login with the credentials.  
 If the user is new to the application user can register by clicking "new user".  
 * Registration Page  
 ![image](https://github.com/patilsubramanya/JAVA-PROJECT/assets/118504626/60809dc9-fe27-49e7-b48e-6c9b32b9de34)  
Once the user has registered it will ask the user to login with the credentials given at the time of registeration.  
After the user has entered correct login credentials, the user will be logged in and will be entered in the application.  
![image](https://github.com/patilsubramanya/JAVA-PROJECT/assets/118504626/0f59b739-2e41-48ff-b0d0-cba212548349)  
So, this is how the user will be welcomed and the home page looks like.  
As you can see in the above image, it shows recent 28 days transactions. In this page, you can add expenses to your account with appropriate details of the expense. Once you have added the expense it will be displayed in the below table. Now, let's assume while adding any expense, you don't have the category for that expense, you can add expense according to your choice.  
![image](https://github.com/patilsubramanya/JAVA-PROJECT/assets/118504626/406aa487-1286-4ad6-ab5b-fcd43b61806d)  
When you click on the add category button in the home page, it will pop up this window in which you can add new category, or delete any category. But when you add any category, it will not be displayed on it's own, you have to click on the refresh button next to add new category button.  
Now let's say you want to delete some transaction you can just click on that transaction and click remove button which will remove that particular transaction.  
![image](https://github.com/patilsubramanya/JAVA-PROJECT/assets/118504626/4f84c640-f7de-408e-99a1-51fe807cd495)  
for instance, if you want to remove this particular transaction which has been selected, just click on that transaction and then click remove.  
Now let's move to see 
