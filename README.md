# JAVA-PROJECT  
## ABOUT  
* PROJECT TITLE:- EXPENSE TRACKER.  
This project is developed as a part of our academics, MSc DATA SCIENCE. This project was started in the month of April 2023 and finished in first week of May 2023 under the guidance of Assistant Professor ALWYN JOSEPH.  
* BRIEF DESCRIPTION:-   
As we all spend money, sometimes without realising we just run out of the budget which we generally have for a month or for a period of time. This application is built to help its users to keep a track on how much they are spending and on which category they are spending more. With the help of this application user can create his own account, where his data from other users will be kept safe and only he can add/delete/view an expense.  
## DATABASE INFORMATION:  
* The database "expensetracker" mainly have three tables naming:  
* USERS: which stores the user's information such as name, username, password and phone number.  
* CATGORY_INFO: which stores the information about categories available for user to add for the expense.  
* EXPENSES: This table stores all the expenses add by all the users.  
## DESCRIPTION OF TABLES:  
* USERS: This table stores the user's personal information such as name, username, password and phone number where phone number is primary key(i.e. this field in the table
can't be left empty) and this field is parent coloumn of phone number coloumn in expense table.  
* CATEGORY_INFO: This table stores the data of all the categories which will be available for users while adding expense. This table has only one coloum "category" in which 
all the cateogries will be stored.  
* EXPENSES: This table has expense_id, expense_date, expense_amount, expense_category as it's fields. After a user logs in, and adds any expense, the expense details will be
stored in this table.
