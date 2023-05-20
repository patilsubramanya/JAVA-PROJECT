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
     When the user will run 
