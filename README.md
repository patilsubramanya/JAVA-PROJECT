# JAVA-PROJECT  
## ABOUT  
PROJECT TITLE:- EXPENSE TRACKER.  
This project is developed by @ patilsubramanya and @ Hritsinha8 as a part of our academics MSc in "DATA SCIENCE". This project was started in the month of April 2023 and was finished by first week of May 2023 under the guidance of ALWYN JOSEPH.
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
